import Vue from 'vue'
import Router from 'vue-router'
import Home from './container/Home.vue'
import Login from './container/Login.vue'
import UserCreate from './container/UserCreate.vue'
import UserDetail from './container/UserDetail.vue'
import UserList from './container/UserList.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    { path: '/sample', name: 'home', component: Home },
    { path: '/', name: 'userList', component: UserList },
    { path: '/login', name: 'login', component: Login },
    { path: '/user-create', name: 'userCreate', component: UserCreate },
    { path: '/user-detail', name: 'userDetail', component: UserDetail }
  ]
})
