// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import vuetify from '@/plugins/vuetify'
import Router from 'vue-router'
import Vuex from 'vuex'
import comutil from './ComFunction'
import { axios, axioscall } from './axios'

Vue.config.productionTip = false
Vue.use(Vuex)
const store = new Vuex.Store({
  state: comutil.state,
  mutations: {
    updateAlert(state, value) {
      state.alert.updateAlert(value.alert)
      state.alert.show = value.show
    },
    updateCURDDialog(state, value) {
      state.CURDDialog.updateData(value.dialog)
      state.CURDDialog.show = value.show
    },
    updateMessageBox(state, value) {
      state.MessageBox.updateData(value)
    },

    updateComInfo(state, value) {
      state.ComInfo.updateData(value)
    }
  }
})
comutil.state.store = store
Vue.prototype.comutil = comutil
Vue.prototype.axios = axios
Vue.prototype.axioscall = axioscall
Vue.use(Router)
// eslint-disable-next-line no-new
new Vue({
  el: '#app',
  vuetify,
  router,
  store,
  components: { App },
  template: '<App/>',
  data:
  {
    mydata: false
  },
  methods:
  {
  }
})
