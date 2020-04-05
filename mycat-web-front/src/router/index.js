
import Router from 'vue-router'
export default new Router({
  routes: [
    {
      path: '/',
      name: '-',
      redirect: '/Login',
      meta: { auth: false, keepAlive: true }
    },
    {
      path: '/Login',
      name: 'Login',
      meta: { auth: false, keepAlive: true },
      component: () => import('@/components/views/LoginPage')
    },
    {
      path: '/MainPage',
      name: 'MainPage',
      meta: { auth: true, keepAlive: true },
      component: () => import('@/components/MainPage')
    },
    {
      path: '/customer',
      name: 'Customer',
      meta: { auth: true, keepAlive: true },
      component: () => import('@/components/Customer')
    },
    {
      path: '/contract',
      name: 'Contract',
      meta: { auth: true, keepAlive: true },
      component: () => import('@/components/Contract')
    },
    {
      path: '/about',
      name: 'HelloWorld',
      meta: { auth: true, keepAlive: true },
      component: () => import('@/components/HelloWorld')
    },
    {
      path: '/test',
      name: 'NewHome',
      component: () => import('@/components/NewHome')
    },
    {
      path: '/houselist',
      name: 'HouseList',
      component: () => import('@/components/views/HouseList')
    }
  ]
})
