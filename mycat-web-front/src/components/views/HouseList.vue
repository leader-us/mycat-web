<template>
  <v-list-page :meta="this.$data" ref="listpage">
    <template v-slot:searchslot>
      <v-text-field v-model="query.name" label="姓名"></v-text-field>
      <v-text-field v-model="query.age" label="年龄"></v-text-field>
      <v-select v-model="query.select" :items="selectitems" label="分类"></v-select>
    </template>
    <!--<v-btn text slot="btnslot" color="primary">C</v-btn>-->
  </v-list-page>
</template>
<script>
export default {
  data() {
    return {
      selectitems: ['Item 1', 'Item 2', 'Item 3', 'Item 4'],
      query: {
        name: 'aaaa',
        age: 20,
        select: null
      },
      createurl: './views/HouseCreate',
      updateurl: './views/HouseUpdate',
      detailurl: './views/HouseDetail',
      deleteurl: '/house/delete',
      queryurl: '/house/query',
      createtitle: '创建新的房间信息',
      id: function(item) {
        return item.id
      },
      title: function(item) {
        return (
          item.buiding +
          '-' +
          item.houseNo +
          ' ' +
          item.houseType +
          ' ' +
          item.layer +
          '楼 ' +
          item.title
        )
      },
      queryparams() {
        return this.query
      },
      row: function(item) {
        return (
          '<b>' +
          item.buiding +
          '-' +
          item.houseNo +
          '</b> ' +
          item.houseType +
          ' ' +
          item.layer +
          '楼 ' +
          ' 短租' +
          item.priceShort +
          '元/月' +
          ' ' +
          ' 长租' +
          item.pricelong +
          '元/月 ' +
          ' 日租' +
          item.priceday +
          '元/天 ' +
          '<b>正在' +
          item.rentType +
          '</b> ' +
          (item.rentType === '空置'
            ? item.period + '天'
            : item.period + '天后结束') +
          ' 视频' +
          item.video +
          ' 图片' +
          item.pics
        )
      },
      content: function(item) {
        return item.title + '<BR/>' + item.describe
      },
      rows: [
        {
          id: 22,
          title: '新鲜出炉 婚房级配置 居住舒适 环境好',
          tip: '5',
          tipType: 0,
          pics: 5,
          video: 2,
          buiding: 'A114',
          houseNo: '005',
          houseType: '一室一厅',
          layer: 2,
          priceday: 99,
          priceShort: 900,
          pricelong: 800,
          rentType: '短租',
          period: 35,
          describe: '采光好，房间大，可做饭，距离美院近，公交方便'
        },
        {
          id: 33,
          title: '居住舒适 环境好',
          tip: '5',
          tipType: 1,
          pics: 5,
          video: 2,
          buiding: 'A114',
          houseNo: '005',
          houseType: '两室一厅',
          layer: 3,
          priceday: 99,
          priceShort: 700,
          pricelong: 800,
          rentType: '空置',
          period: 45,
          describe: '房间大，采光好，可做饭，距离美院近，公交方便'
        },
        {
          id: 44,
          title: '居住舒适 环境好',
          tip: '2',
          tipType: 2,
          pics: 5,
          video: 2,
          buiding: 'A114',
          houseNo: '005',
          houseType: '两室一厅',
          layer: 3,
          priceday: 99,
          priceShort: 700,
          pricelong: 800,
          rentType: '空置',
          period: 45,
          describe: '房间大，采光好，可做饭，距离美院近，公交方便'
        },
        {
          id: 55,
          title: '居住舒适 环境好',
          tip: '8',
          tipType: 3,
          pics: 5,
          video: 2,
          buiding: 'A114',
          houseNo: '005',
          houseType: '两室一厅',
          layer: 3,
          priceday: 99,
          priceShort: 700,
          pricelong: 800,
          rentType: '空置',
          period: 45,
          describe: '房间大，采光好，可做饭，距离美院近，公交方便'
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
