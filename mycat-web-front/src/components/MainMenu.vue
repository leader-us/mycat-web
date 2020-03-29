<template>
  <v-row align="start" justify="space-around">
    <v-menu offset-y>
      <template v-slot:activator="{ on }">
        <v-app-bar-nav-icon v-on="on"></v-app-bar-nav-icon>
      </template>
      <v-list>
        <v-list-item
          color="red"
          v-for="(item, index) in items"
          :key="index"
          @click="$router.push(item.link)"
        >
          <div>{{ item.title }}</div>
        </v-list-item>
      </v-list>
    </v-menu>
    <v-btn color="pink"  @click="$router.push('/')" fab small dark>
      <v-icon color="primary" large>mdi-home</v-icon>
    </v-btn>
    <v-btn color="pink"  fab small dark>
      <v-badge color="blue" content="6">待办</v-badge>
    </v-btn>
    <v-btn dark color="pink"  fab small >
      <v-badge color="yellow" dot>汇报</v-badge>
    </v-btn>
    <v-btn color="pink"  fab small dark>
      <v-badge color="deep-purple accent-4" content="?">当日</v-badge>
    </v-btn>
    <v-toolbar-title class="d-none d-sm-flex" justify="right">{{apptitle}}</v-toolbar-title>
  </v-row>
</template>
<script>
export default {
  name: 'MainMenu',
  data: () => ({
    tab: null,
    apptitle: 'Imking公寓宝',
    text: 'dddddddddddddddddddddddddddddd',
    items: [
      { title: '合同', link: '/contract' },
      { title: '客户', link: '/customer' },
      { title: '任务', link: '/test' },
      { title: '关于', link: '/about' }
    ]
  })
}
</script>
