<template>
  <v-update-domain :meta="this.$data" :saveact="comutil.FormInfo.ActRetainInput">
    <v-text-field v-model="formdata.taskName" :counter="20" :rules="taskNameRules" label="taskName" required></v-text-field>
    <v-select v-model="formdata.responsibleUserId" :items="responsibleUserIdItems" item-text="name" item-value="id" label="responsibleUserId" :rules="responsibleUserIdRules" required ></v-select>
    <v-text-field v-model="formdata.taskDescribe" :counter="20" :rules="taskDescribeRules" label="taskDescribe" required></v-text-field>
    <v-date-picker v-model="formdata.planDateStart" type="date"  placeholder="开始时间" value-format="yyyy-MM-dd" label="actualDateEnd">planDateStart </v-date-picker>
    <br>
    <v-date-picker v-model="formdata.planDateEnd" type="date"  placeholder="开始时间" value-format="yyyy-MM-dd" label="actualDateEnd">planDateEnd </v-date-picker>
    <br>
    <v-date-picker v-model="formdata.actualDateStart" type="date"  placeholder="开始时间" value-format="yyyy-MM-dd" label="actualDateEnd">actualDateStart </v-date-picker>
    <br>
    <v-date-picker v-model="formdata.actualDateEnd" type="date"  placeholder="开始时间" value-format="yyyy-MM-dd" label="actualDateEnd">actualDateEnd </v-date-picker>
    <v-text-field v-model="formdata.taskContent" :counter="200" :rules="taskContentRules" label="taskContent" required></v-text-field>
    <v-text-field v-model="formdata.taskTitle" :counter="200" :rules="taskTitleRules" label="taskTitle" required></v-text-field>
    <v-select v-model="formdata.priorityLevel" :items="priorityLevelItems" label="priorityLevel" required ></v-select>
    <v-select v-model="formdata.taskStatus" :items="taskStatusItems" label="taskStatus" required ></v-select>
    <v-checkbox
      v-model="checkbox"
      :rules="[v => !!v || 'You must agree to continue!']"
      label="Do you agree?"
      required
    ></v-checkbox>
  </v-update-domain>
</template>
<script>
export default {
  data: () => ({
    selectbyidurl: '/myTask/selectbyid',
    updateurl: '/myTask/update',
    formdata: {
      taskId: '',
      taskName: '',
      responsibleUserId: '',
      taskDescribe: '',
      planDateStart: '',
      planDateEnd: '',
      actualDateStart: '',
      actualDateEnd: '',
      taskContent: '',
      priorityLevel: '',
      taskStatus: '',
      taskTitle: ''
    },
    taskNameRules: [v => !!v || 'taskName is required'],
    responsibleUserIdRules: [v => !!v || 'responsibleUserName is required'],
    taskDescribeRules: [v => !!v || 'taskDescribe is required'],
    planDateStartRules: [v => !!v || 'planDateStart is required'],
    planDateEndRules: [v => !!v || 'planDateEnd is required'],
    actualDateStartRules: [v => !!v || 'actualDateStart is required'],
    actualDateEndRules: [v => !!v || 'actualDateEnd is required'],
    taskContentRules: [v => !!v || 'taskContent is required'],
    priorityLevelRules: [v => !!v || 'priorityLevel is required'],
    taskStatusRules: [v => !!v || 'taskStatus is required'],
    taskTitleRules: [v => !!v || 'taskTitle is required'],

    taskStatusItems: ['正常', '暂停'],
    priorityLevelItems: ['低', '中', '高'],
    responsibleUserIdItems: [{name: '张三', id: 1}],
    checkbox: true,
    lazy: false
  }),

  methods: {
     async loadforuserlist() {
      // let queryparam = {
      //   id: this.comutil.CURDDialog.itemId
      // }
        // await new Promise(resolve => setTimeout(resolve, 3000))
      // 通过id查询预修改数据 请求参数示例：{"id":44}；返回参数示例：{"data":{"select":"Item 1","name":"aaaa","email":"aafffff@fff.com"},"status":"SUCCESS"}
      try {
      let { data } = await this.axioscall.post('/myTask/userlist', {})
       console.log('HouseUpdate_methods:preloading_data---' + JSON.stringify(data))
        if (data.retCode === 0) {
            // 给表单字段赋值
          this.$data.responsibleUserIdItems = data.data
        } else {
          this.comutil.MessageBox.show(data.data)
       }
      } catch (e) {
      console.log(' exec call error ' + e)
        this.comutil.MessageBox.show(e)
      } finally {
      }
    }
  },
  mounted: function() {
    this.$data.formdata.taskId = this.comutil.CURDDialog.itemId
   this.loadforuserlist()
  }
}
</script>
