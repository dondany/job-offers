import { defineStore } from "pinia";
import axios from 'axios'

export const useStore = defineStore('main', {
    state: () => {
        return {
            jobOffers: [],
        }
    },
    actions: {
        async fetchJobOffers() {
                this.jobOffers = await axios.get('localhost:8080/joboffers')
        }
    }
})