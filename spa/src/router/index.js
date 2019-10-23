import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Login from '@/views/Login'
import Reg from '@/views/Reg'
import AppMain from '@/components/AppMain'
import LeftNav from '@/components/LeftNav'
import TopNav from '@/components/TopNav'
import Articles from '@/views/sys/Articles'
import VuexPage1 from '@/views/sys/VuexPage1'
import VuexPage2 from '@/views/sys/VuexPage2'
Vue.use(Router)

export const constantRouterMap = [
  {
    path: '/',
    redirect: '/login',
    hidden: true
  },
  {
    path: '/login',
    name: '登录页面',
    hidden: true,
    component: resolve => require(['../views/Login.vue'], resolve)
  },
  {
    path: '/Readme',
    // name: 'Readmehome',
    index: 'Readme',
    meta: {
      title: 'Readme',
      icon: 'el-icon-menu'
    },
    component: resolve => require(['../components/AppMain.vue'], resolve),
    children: [
      {
        name: 'Readme',
        path: '/',
        meta: { title: 'Readme', icon: 'el-icon-menu' },
        component: resolve => require(['../components/AppMain.vue'], resolve)
      }
    ]
  }
]


export default new Router({
	routes: constantRouterMap
})
// 异步挂载的路由
// 动态需要根据权限加载的路由表
export const asyncRouterMap = [
  {
    path: '/permission',
    // name: 'permissionhome',
    meta: {
      title: 'permission',
      icon: 'el-icon-setting',
      roles: ['admin']
    },
    component: resolve => require(['../components/AppMain.vue'], resolve),
    children: [
      {
        name: 'permission',
        path: '/permission',
        meta: {
          title: 'permission', icon: 'el-icon-menu', roles: ['admin']
        },
        component: resolve => require(['../components/AppMain.vue'], resolve)
      }
    ]
  },
  { path: '*', redirect: '/404', hidden: true }
]