<template>
  <v-card>
     <v-container>
      <v-row>
        <v-col
          v-for="(item, i) in items"
          :key="i"
          cols="12"
        >
          <v-card
            :color="item.color"
            dark
          >
            <div class="d-flex flex-wrap justify-space-between">
                <v-card-title
                  class="headline"
                  v-text="item.title"
                ></v-card-title>

                <v-card-subtitle v-text="item.note"></v-card-subtitle>
                 <v-card-actions>
              <v-btn> <v-icon>mdi-pencil</v-icon>编辑</v-btn>
              <v-btn> <v-icon>mdi-update</v-icon>沟通记录</v-btn>
            </v-card-actions>
              <v-avatar
                class="ma-3"
                size="125"
                tile
              >
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
    items: [
      {
        color: '#1F7087',
        src: 'https://cdn.vuetifyjs.com/images/cards/foster.jpg',
        title: '【在租客户】李xxx 153353243 ，男 ，美院学生',
        note: '【客户推荐】租客XX推荐，大二'
      },
      {
        color: '#952175',
        src: 'https://cdn.vuetifyjs.com/images/cards/halcyon.png',
        title: '【洽谈中客户】 宋xxx 14335443，男，金融港白领',
        note: '【小广告客户】，发现时间：3天钱，最后一次联系1天前'
      }
    ]
  })
}
</script>
