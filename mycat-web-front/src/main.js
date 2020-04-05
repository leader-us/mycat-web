// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import vuetify from '@/plugins/vuetify'
import Vue from 'vue'
import Router from 'vue-router'
import Vuex from 'vuex'
import App from './App'
import { axios, axioscall } from './axios'
import comutil from './ComFunction'
import router from './router'

Vue.config.productionTip = false
Vue.use(Vuex)
Vue.use(Router)
const store = new Vuex.Store({
  state: comutil.state,
  mutations: {
    setToken(state, value) {
      state.Token.updateData(value)
    },
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

/** 验证用户是否登录 **/
router.beforeEach((to, from, next) => {
  console.log('check login control ,from ' + from.name + ' to ' + to.name)
  if (comutil.Token.validToken()) {
    console.log('已登录')
    if (to.name === 'Login') {
      next('/MainPage')
    } else {
      next()
    }
  } else if (to.name === 'Login') {
    next()
  } else if (to.matched.some(m => m.meta.auth)) {
    console.log('need login control ' + to.name)
    next({
      path: '/login',
      // 将跳转的路由path作为参数，登录成功后跳转到该路由
      query: { redirect: to.fullPath }
    })
  }
})
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
