import { createRouter, createWebHistory } from 'vue-router'
import JobOffersList from '../views/JobOffersList.vue';
import EmployerPanel from '../views/EmployerPanel.vue';

const routes = [
    {
        path: '/',
        component: JobOffersList
    },
    {
        path: '/employerPanel',
        component: EmployerPanel
    }
];

const router = createRouter({
    history: createWebHistory("/"),
    routes
})

export default router;