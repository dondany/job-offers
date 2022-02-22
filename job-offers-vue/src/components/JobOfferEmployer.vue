<template>
    <div class="job-offer-wrap panel flex">
        
        <div class="mid flex flex-column">
            <div class="name">
                <span>{{ offer.name }}</span>
            </div>
            <div class="company-details flex">
                <span>{{ offer.companyName }}</span>
                <span>{{ offer.city }}</span>
            </div>
        </div>

        <div class="right">
        </div>

        <div class="actions flex">
            <div @click="open('editJobOffer')" class="btn btn-green action flex">
                X
            </div>
            <div class="btn btn-red action flex">
                Y
            </div>
        </div> 

        <EditJobOffer :offer="offer"/>
    </div>
</template>

<script>
import { defineComponent } from 'vue';
import { mapStores } from 'pinia';
import { useStore } from '../store/modals.js';
import editOfferStore from '../store/editOffer.js';

import EditJobOffer from '../components/EditJobOffer.vue'


export default defineComponent({
    name: "JobOfferEmployer",
    props: ['offer'],
    components: {
        EditJobOffer
    },
    computed: {
        ...mapStores(useStore, editOfferStore),
    },
    methods: {
        open(name) {
            this.modalsStore.open(name);
            this.editOfferStore.offer = this.offer;
        }
    }
});
</script>

<style lang="scss" scoped>
.job-offer-wrap {
    justify-content: space-between;
    align-items: flex-start;
    margin: 0 0 5px 10px;

    &:hover {
        box-shadow: 0px 13px 20px -15px rgba(66, 68, 90, 0.4);
    }

    .left {
        width: 130px;
        text-align: center;
    }

    .mid {
        text-align: left;

        .name {
            font-weight: 700;
        }

        .company-details {
            margin-top: 5px;
            font-size: 0.8rem;

            span {
                margin-right: 15px;
            }
        }
    }

    .actions {
        gap: 5px;

        .action {
            width: 2rem;
            height: 2rem;
            border-radius: 50%;
            align-items: center;
            justify-content: center;
            display: none;

            :hover > & {
                display: block;
            }

        }
    }

}
</style>