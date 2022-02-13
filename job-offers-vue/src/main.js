import { createApp } from 'vue'
import App from './App.vue'

import { createPinia } from 'pinia'

var app = createApp(App);

app.use(createPinia()).mount('#app');
