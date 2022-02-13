<template>
    <div class="job-offers-list-wrap">
        <div class="title flex">
            <h1>Job-Offers</h1>
        </div>
        <div class="job-offers-list">
            <div v-for="offer in mainStore.jobOffers" key="offer.id">
                <div class="offer flex">
                    <span>{{ offer.name }}</span>
                    <span>{{ offer.description }}</span>
                    <span>{{ offer.city }}</span>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import { mapStores } from 'pinia';
import { useStore } from '../store/store.js';

export default {
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