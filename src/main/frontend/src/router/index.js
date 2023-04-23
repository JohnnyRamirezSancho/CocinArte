import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
     },
    {
      path: '/porsecciones',
      name: 'bysections',
      component: () => import('../views/BySections.vue')
    }
  ]
})

export default router
