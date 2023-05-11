import { createApp } from 'vue'
import './style.css'
import App from "./App.vue"
import Router from './route/router'
import ElementUI from 'element-plus'
import 'element-plus/dist/index.css'

createApp(App)
.use(Router)
.use(ElementUI)
.mount('#app')
