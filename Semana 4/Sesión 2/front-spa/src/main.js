import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import bootstrap from '../node_modules/bootswatch/dist/cosmo/bootstrap.css'

createApp(App,bootstrap).use(router).mount('#app')
