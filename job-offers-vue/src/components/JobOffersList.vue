<template>
    <div class="job-offers-list-wrap">
        <div class="title flex">
            <h1>Job-Offers</h1>
        </div>
        <div class="job-offers-list">
            <div v-for="offer in mainStore.jobOffers" key="offer.id">
                <JobOffer :jobOffer="offer"/>
            </div>
        </div>
    </div>
</template>

<script>
import { mapStores } from 'pinia';
import { useStore } from '../store/store.js';
import JobOffer from './JobOffer.vue';

export default {
    components: {
        JobOffer
    },
    data() {
        return {
            
        }
    },
    computed: {
        ...mapStores(useStore),
        
    },
    mounted() {
        this.mainStore.fetchJobOffers();
    }
}
</script>

<style lang="scss" scoped>

.title {
    justify-content: center;
}
</style>