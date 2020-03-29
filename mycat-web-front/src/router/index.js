
import Router from 'vue-router'
export default new Router({
  routes: [
    {
      path: '/',
      name: 'MainPage',
      component: () => import('@/components/MainPage')
    },
    {
      path: '/customer',
      name: 'Customer',
      component: () => import('@/components/Customer')
    },
    {
      path: '/contract',
      name: 'Contract',
      component: () => import('@/components/Contract')
    },
    {
      path: '/about',
      name: 'HelloWorld',
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
