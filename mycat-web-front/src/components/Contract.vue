<template>
  <v-card>
    <v-container><v-row>
        <v-col>
          <v-select
            :items="areaList"
            item-text="title"
            item-value="id"
            label="公寓"
            v-model="selected"
          ></v-select>
        </v-col>
        <v-col>
          <v-btn color="primary" @click="searchbtnclick">过滤</v-btn>
          <v-btn color="primary" @click="showdialog">新增</v-btn>
        </v-col>
      </v-row>
      <v-row>
        <v-col v-for="(item, i) in items" :key="i" cols="12">
          <v-card :color="item.color" dark >
            <div class="d-flex flex-wrap justify-space-between">
              <div>
                <v-card-title class="headline" v-text="item.title"></v-card-title>

                <v-card-subtitle v-text="item.note"></v-card-subtitle>
                <v-card-actions>
                  <div>
                    <v-btn>
                      <v-icon>mdi-pencil</v-icon>编辑
                    </v-btn>
                    <v-btn>
                      <v-icon>mdi-update</v-icon>沟通记录
                    </v-btn>
                    <v-btn>
                      <v-icon>mdi-calendar</v-icon>计划退租
                    </v-btn>
                    <v-btn>
                      <v-icon>mdi-update</v-icon>账单记录
                    </v-btn>
                    <v-btn>
                      <v-icon>mdi-update</v-icon>报修记录
                    </v-btn>
                  </div>
                </v-card-actions>
              </div>

              <v-avatar class="ma-3" size="125" tile>
                <v-img :src="item.src"></v-img>
              </v-avatar>
            </div>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </v-card>
</template>
<script>
export default {
  data: () => ({
    selected: '2',
    areaList: [
      { id: '2', title: 'A199' },
      { id: '1', title: 'B123' }
    ],
    items: [
      {
        color: '#1F7087',
        src: 'https://cdn.vuetifyjs.com/images/cards/foster.jpg',
        title: '【日租客户】李xxx 153353243 ，情侣2人',
        note: '入住1天，明天退房'
      },
      {
        color: '#952175',
        src: 'https://cdn.vuetifyjs.com/images/cards/halcyon.png',
        title: '【短租客户】 宋xxx 189335443，男，金融港白领',
        note: '合同开始日期2020-03-01，租期3个月，续签2次，本次到期还有15天'
      },
      {
        color: '#952175',
        src: 'https://cdn.vuetifyjs.com/images/cards/halcyon.png',
        title: '【长租客户】 韦xxx 135335443，男，创业老板',
        note: '合同开始日期2020-03-01，租期8个月，到期还有200天'
      }
    ]
  }),
  methods: {
    searchbtnclick() {
      // this.dialog = true
      console.log('select ' + this.selected)
    },
    showdialog() {
      console.log(' show store before ' + this.$store.state.showfulldialog)
      this.$store.commit('setName', true)
      console.log(' show store after ' + this.$store.state.showfulldialog)
    }
  }
}
</script>
