<template>
  <v-app>
    <v-snackbar
     color="#9370DB"
      top
      multi-line
      v-model="comutil.MessageBox.visible"
      :timeout="comutil.MessageBox.timeout"
      @click.stop="comutil.MessageBox.close"
    >
      <div class="v-menu__content--active" style="display:none; z-index:1000;"></div>
      {{ comutil.MessageBox.content }}
      <v-icon color="primary">mdi-clc ose-box</v-icon>
    </v-snackbar>
    <v-app-bar v-if="comutil.Token.validToken()" app color="primary" dark fluid >
      <main-menu></main-menu>
    </v-app-bar>
    <!-- Sizes your content based upon application components -->
    <v-content class="fill-height" justify="center">
      <!-- Provides the application the proper gutter -->
      <v-container fluid justify="center">
        <router-view :key="comutil.ComInfo.curtime"></router-view>
      </v-container>
    </v-content>
  </v-app>
</template>

<script>
import Vue from 'vue'
import MainMenu from '@/components/MainMenu'
import FullDialog from '@/components/FullDialog'
import Alert from '@/components/Alert'
import AlertDialog from '@/components/AlertDialog'
import DynComp from '@/components/DynaComp'
import DomainListPage from '@/components/DomainListPage'
import DomainUpdatePage from '@/components/DomainUpdatePage'
Vue.component('main-menu', MainMenu)
Vue.component('full-dialog', FullDialog)
Vue.component('my-alert', Alert)
Vue.component('alert-dialog', AlertDialog)
Vue.component('v-component', DynComp)
Vue.component('v-list-page', DomainListPage)
Vue.component('v-update-domain', DomainUpdatePage)

export default {
  data() {
    return { apptitle: '3000' }
  },
  name: 'App'
}
</script>
