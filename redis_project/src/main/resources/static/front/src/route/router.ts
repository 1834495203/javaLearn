import {createRouter, createWebHashHistory} from 'vue-router'
import register from '../components/regster.vue'
import fill from '../components/fillRegister.vue'

const routes = [
    {
        name: '手机注册', 
        path: '/regster', 
        component: ()=>import('../components/regster.vue'),
        children: [
            {name: '填写信息', path: 'fill', component: ()=>import('../components/fillRegister.vue')}
        ]
    }
]

const router = createRouter({
    history:createWebHashHistory(),
    routes:routes
})

export default router