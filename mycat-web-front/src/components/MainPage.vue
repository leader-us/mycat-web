<template>
  <v-card>
    <v-list three-line shaped>
      <template v-for="(item,index) in items">
        <v-list-item :key="item.title" @click="$router.push(item.link)">
          <v-badge :color="item.color" :content="item.tip">
            <v-icon color="primary" large>{{item.src}}</v-icon>
          </v-badge>
          <v-list-item-content>
            <v-list-item-subtitle style="margin-left: 10px">
              <b>{{item.title}}:</b>
              {{item.note}}
            </v-list-item-subtitle>
          </v-list-item-content>
        </v-list-item>
        <v-divider :key="index" inset></v-divider>
      </template>
    </v-list>
  </v-card>
</template>
<!--
<template>
  <v-card  class="mx-auto" top="0">
    <v-container top="0" >
      <v-row dense>
        <v-col v-for="(item, i) in items" :key="i" cols="12"  @click="$router.push(item.link)">
          <v-card :color="item.color" dark style="cursor: pointer">
            <div class="d-flex flex-no-wrap " >
              <v-avatar>
                <v-img :src="item.src" wrap></v-img>
              </v-avatar>
              <v-card-subtitle class="text-left" >{{'【'+item.title+'】'+item.note}}</v-card-subtitle>
            </div>
          </v-card>
        </v-col>
      </v-row>
    </v-container>
  </v-card>
</template>
-->
<script>
export default {
  data: () => ({
    items: [
      {
        color: 'cyan',
        tip: '79',
        src: 'mdi-home-account',
        title: '客房信息 ',
        link: '/houselist',
        note:
          '长租客房总共268间，出租率：上月50%，本月55%，空房78间，一周内到期32间，一个月内到期56间'
      },
      {
        color: 'pink',
        tip: '99',
        src: 'mdi-sticker-alert-outline',
        title: '问题汇总 ',
        link: '/House',
        note:
          '3间客房信息没有完善，10个客户资料不全，6个客户服务问题需要处理，10项客房维护问题'
      },
      {
        color: 'orange',
        tip: '+',
        src: 'mdi-account-plus',
        title: '每日营销',
        link: '/Market',
        note:
          '自拓客户：今天2人，发帖3篇，地推1次,微信群推广2次，QQ群推广3次，抖音推广1次，直播1次，'
      },
      {
        color: 'cyan',
        src: 'mdi-hand-heart',
        tip: '399',
        title: '客户关怀',
        link: '/CustomerMainting',
        note: '：今日已沟通3个客户，一周累计沟通30个客户，本月还剩399人次的沟通'
      },
      {
        color: 'orange',
        src: 'mdi-head-lightbulb-outline',
        tip: '6',
        title: '客户服务',
        link: '/CustomeService',
        note:
          '今日新增3个客户服务请求，累计还6次服务请求未完成，一周内收到5个客户的好评，您收到3条好评，加油'
      },
      {
        color: 'pink',
        src: 'mdi-playlist-check',
        tip: '20',
        title: '代办任务',
        link: '/Task',
        note:
          '今日你已完成3个代办任务，还有2个未完成，没有认领和没完成的任务总共还有20个'
      },
      {
        color: 'orange',
        tip: '20',
        src: 'mdi-account-details-outline',
        title: '房租催收',
        note: '当前还有20个账单没有结账，其中10个已经超过最迟付款日期'
      },
      {
        color: 'cyan',
        src: 'mdi-update',
        tip: '8',
        title: '自我改进',
        link: '/SelfPromote',
        note:
          '一周内新增6条自我改进建议，截止目前您已经有5个问题持续1周没有复现了，总计还有8个问题需要继续改进，加油'
      }
    ]
  })
}
</script>
