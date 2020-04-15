<template>
  <v-list-page :meta="this.$data" ref="listpage">
    <template v-slot:searchslot>
       <v-select v-model="query.taskStatus" :items="taskStatusitems" label="状态"></v-select>
       <v-text-field v-model="query.responsibleUserId" label="责任人"></v-text-field>
       <v-text-field v-model="query.taskTitle" label="标题"></v-text-field>
    </template>
    <!--<v-btn text slot="btnslot" color="primary">C</v-btn>-->
  </v-list-page>
</template>
<script>
export default {
  data() {
    return {
      taskStatusitems: ['正常', '暂停'],
      query: {
        taskStatus: '正常',
        responsibleUserId: null,
        taskTitle: null
      },
      createurl: './views/MyTaskCreate',
      updateurl: './views/MyTaskUpdate',
      // detailurl: './views/HouseDetail',
      deleteurl: '/myTask/delete',
      queryurl: '/myTask/query',
      createtitle: '创建新的房间信息',
      id: function(item) {
        return item.taskId
      },
      title: function(item) {
        return (
          item.taskName +
          '-' +
          item.responsibleUserName +
          ':' +
          item.taskContent
        )
      },
      queryparams() {
        return this.query
      },
      row: function(item) {
        return (
          item.taskName +
          '-' +
          item.responsibleUserName +
          ':' +
          item.taskContent
        )
      },
      content: function(item) {
        return item.taskTitle + '<BR/>' + item.taskDescribe
      },
      rows: [
        {
          taskId: 1,
          taskName: '任务名称',
          responsibleUserName: '责任人',
          responsibleUserId: null,
          taskDescribe: '任务描述',
          planStart: '任务计划开始时间',
          planEnd: '任务计划结束时间',
          actualStart: '任务实际开始时间',
          actualEnd: '任务实际结束时间',
          taskContent: '任务内容',
          priorityLevel: '优先级',
          taskStatus: '任务状态',
          taskTitle: '任务标题'
        },
        {
          taskId: 1,
          taskName: '任务名称',
          responsibleUserName: '责任人',
          responsibleUserId: null,
          taskDescribe: '任务描述',
          planStart: '任务计划开始时间',
          planEnd: '任务计划结束时间',
          actualStart: '任务实际开始时间',
          actualEnd: '任务实际结束时间',
          taskContent: '任务内容',
          priorityLevel: '优先级',
          taskStatus: '任务状态',
          taskTitle: '任务标题'
        },
        {
          taskId: 1,
          taskName: '任务名称',
          responsibleUserName: '责任人',
          responsibleUserId: null,
          taskDescribe: '任务描述',
          planStart: '任务计划开始时间',
          planEnd: '任务计划结束时间',
          actualStart: '任务实际开始时间',
          actualEnd: '任务实际结束时间',
          taskContent: '任务内容',
          priorityLevel: '优先级',
          taskStatus: '任务状态',
          taskTitle: '任务标题'
        },
         {
          taskId: 1,
          taskName: '任务名称',
          responsibleUserName: '责任人',
          responsibleUserId: null,
          taskDescribe: '任务描述',
          planStart: '任务计划开始时间',
          planEnd: '任务计划结束时间',
          actualStart: '任务实际开始时间',
          actualEnd: '任务实际结束时间',
          taskContent: '任务内容',
          priorityLevel: '优先级',
          taskStatus: '任务状态',
          taskTitle: '任务标题'
        }
      ],
      callbackDeleteRow: this.doDeleteRow
    }
  },
  methods: {
    async dosearch() {
      console.log('do search ' + JSON.stringify(this.query))
      let { data } = await this.$refs.listpage.onSearch()
      console.log('query data ' + JSON.stringify(data))
      this.$data.rows = data
    }
  }
}
</script>
