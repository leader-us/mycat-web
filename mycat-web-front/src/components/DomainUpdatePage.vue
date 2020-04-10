<template>
<div>
  <v-row class="justify-center" v-if="!comutil.CURDDialog.isprocess">
    <v-form ref="form" v-model="valid" lazy-validation>
      <slot></slot>
      <v-btn color="error" class="mr-4" @click="reset">重置</v-btn>
      <v-btn color="warning" @click="saveConfirm()">保存</v-btn>
    </v-form>
  </v-row>
  <v-row class="text-center" justify="center" v-if="comutil.CURDDialog.isprocess">
    <v-progress-circular :size="50" color="primary" indeterminate></v-progress-circular>
  </v-row>
</div>
</template>
<script>
export default {
  props: ['meta', 'saveact'],
  data: () => ({
    valid: true
  }),

  methods: {
    validate() {
      this.$refs.form.validate()
    },
    reset() {
      this.$refs.form.reset()
      this.$refs.form.resetValidation()
    },
    async updateItem() {
      if (this.saveact === this.comutil.FormInfo.ActRetainInput) {
        let id = this.comutil.CURDDialog.itemId
       console.log('HouseUpdate_methods:fetchFormData_itemId---' + id)
      // 获取表单数据
       let formdata = this.meta.formdata
       formdata.id = id
        console.log('DomainUpdatePage_methods:updateItem_formdata---' + formdata)
      // 从data获取函数转换Form表单数据用于提交

        await new Promise(resolve => setTimeout(resolve, 3000))
        // 更新数据 请求参数示例：{"id":44,"name":"aaaa","email":"aafffff@fff.com","select":"Item 1"}；返回参数示例：{"status":"SUCCESS"}
        let { data } = await this.axioscall.post(this.meta.updateurl, formdata)
        console.log('DomainUpdatePage_methods:updateItem_responsedata---' + JSON.stringify(data))
        // 此处返回值比较判断可用预先定义替换字符串
        if (data.retCode === 0) {
        console.log('DomainUpdatePage_methods:updateItem_data.status---' + data.status)
        this.comutil.ComInfo.updateCurtime()
        this.comutil.MessageBox.show('保存成功')
        this.comutil.Alert.close(false)
        this.comutil.CURDDialog.close(true)
        return true
        } else {
         this.comutil.MessageBox.show('保存失败，请重试')
         this.comutil.Alert.close(false)
         this.comutil.CURDDialog.close(true)
         return false
        }
      } else if (this.saveact === this.comutil.FormInfo.ActRetainInputReset) {
        console.log(' reset form  ')
        this.$refs.form.reset()
      } else if (this.saveact === this.comutil.FormInfo.ActCloseRefresh) {
        console.log(' close refresh ')
        this.comutil.ComInfo.updateCurtime()
        this.comutil.CURDDialog.close(true)
      } else if (this.saveact === this.comutil.FormInfo.ActClose) {
        console.log(' close  ')
        this.comutil.CURDDialog.close(true)
      } else {
        console.log(' action unkown   ' + this.saveact)
      }
      return true

      //
    },
    saveConfirm() {
      this.valid = this.$refs.form.validate()
      if (!this.valid) {
        console.log('not valid ')
        return
      }
      console.log('confirm update row ')
      var alert = {
        title: this.comutil.OptInfo.update.title,
        itemInfo: this.comutil.CURDDialog.title,
        content: this.comutil.OptInfo.update.content,
        alType: this.comutil.AlertType.INFO,
        callBack: this.updateItem,
        callBackParams: {}
      }
      this.comutil.Alert.showAlert(alert)
    },
    async loadformdata() {
      let queryparam = {
        id: this.comutil.CURDDialog.itemId
      }
      await new Promise(resolve => setTimeout(resolve, 3000))
      // 通过id查询预修改数据 请求参数示例：{"id":44}；返回参数示例：{"data":{"select":"Item 1","name":"aaaa","email":"aafffff@fff.com"},"status":"SUCCESS"}
      try {
      let { data } = await this.axioscall.post(this.meta.selectbyidurl, queryparam)
       console.log('HouseUpdate_methods:preloading_data---' + JSON.stringify(data))
      this.comutil.CURDDialog.isprocess = false
        if (data.retCode === 0) {
            // 给表单字段赋值
          this.meta.formdata = data.data
          this.comutil.MessageBox.show('表单数据加载成功')
        } else {
          this.comutil.MessageBox.show(data.data)
          this.comutil.CURDDialog.close(true)
       }
      } catch (e) {
      console.log(' exec call error ' + e)
        this.comutil.CURDDialog.close(true)
        this.comutil.MessageBox.show(e)
      } finally {
        this.comutil.CURDDialog.isprocess = false
        // this.comutil.CURDDialog.close(true)
      }
    }
  },
  mounted: function() {
    if (this.comutil.CURDDialog.isprocess) {
      this.$data.rows = this.meta.rows
      console.log('DomainListPage mounted')
      this.loadformdata()
    }
  }
}
</script>
