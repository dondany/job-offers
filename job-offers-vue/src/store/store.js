import { defineStore } from "pinia";

export const useStore = defineStore('main', {
    state: () => {
        return {
            jobOffers: [
                {
                    "id": 1,
                    "name": "Junior Java Developer",
                    "description": "We're hiring a Junior Java Developer. Join us now!",
                    "city": "Lodz"
                },
                {
                    "id": 2,
                    "name": "Senior Java Developer",
                    "description": "We're hiring a Senior Java Developer. Join us now!",
                    "city": "Lodz"
                },
                {
                    "id": 3,
                    "name": "QA Specialist",
                    "description": "We're hiring a QA Specialist. Join us now!",
                    "city": "Wroclaw"
                }
            ],
        }
    },
    actions() {
        
    }
})