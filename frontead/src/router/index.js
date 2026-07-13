import { createRouter, createWebHistory } from 'vue-router'

import Home from '../views/Home.vue'
import Productos from '../views/Productos.vue'

const router = createRouter({
    history : createWebHistory(),
    routes : [
    {
        path : "/",
        name : "home",
        component : Home
    },
    {
        path : "/productos",
        name : "productos",
        component: Productos
    }
]
})

export default router