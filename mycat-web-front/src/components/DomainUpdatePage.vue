<template>
  <v-row class="justify-center">
    <v-form ref="form" v-model="valid" lazy-validation>
      <slot></slot>
      <v-btn color="error" class="mr-4" @click="reset">重置</v-btn>
      <v-btn color="warning" @click="saveConfirm()">保存</v-btn>
    </v-form>
  </v-row>
</template>
<script>
export default {
  props: ['saveact'],
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
      // 从data获取函数转换Form表单数据用于提交
      console.log('do syn update row ')
      await new Promise(resolve => setTimeout(resolve, 3000))
      // let { data } = await this.axioscall.get('/dsgafasdfaf/dsfasdf', {})
      // console.log('data ' + data)
      this.comutil.MessageBox.show('已经成功保存数据！')
      if (this.saveact === this.comutil.FormInfo.ActRetainInput) {
        console.log(' retain form  ')
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
    }
  }
}
</script>
