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
     },
     {
       path: '/seccion/:id',
       name: 'section',
       props: true,
       component: () => import('../views/Section.vue')
     },
     {
       path: '/receta/:id',
       name: 'recipe',
       props: true,
       component: () => import('../views/Recipe.vue')
     },
     {
       path: '/acceso',
       name: 'access',
       props: true,
       component: () => import('../views/Access.vue')
     }
  ]
})

// router.beforeEach(async (to, from) => {
//   const auth = useAuthStore();
//   if (to.meta.requiresAuth && !auth.isAuthenticate) {
//     return { name: "home" };
//   }
// });

// meta: { requiresAuth: true },

export default router
