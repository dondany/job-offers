import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

import { createPinia } from 'pinia'

var app = createApp(App);

app
.use(createPinia())
.use(router)
.mount('#app');

