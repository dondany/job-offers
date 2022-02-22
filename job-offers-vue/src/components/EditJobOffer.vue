<template>
    <ModalPanel name="editJobOffer" title="Edit Offer">
        <div class="edit-offer flex flex-column">
            <form action="" class="flex flex-column">
                <label for="name">Name</label>
                <input type="text" class="name input" id="name" v-model="editOfferStore.offer.name">

                <label for="desc">Description</label>
                <textarea name="desc" id="desc" class="input" v-model="editOfferStore.offer.description"></textarea>
                
                <label for="city">City</label>
                <input type="text" class="city input" id="city" v-model="editOfferStore.offer.city">
            </form>
            <div class="bottom flex">
                <button class="btn btn-green">Save</button>
            </div>
        </div>
    </ModalPanel>   
</template>

<script>
import ModalPanel from '../components/ModalPanel.vue'

import { mapStores } from 'pinia';
import editOfferStore from '../store/editOffer.js';

export default {
    name: "EditJobOffer",
    props: ['offer'],
    components: {
        ModalPanel
    },
    data() {
        return {
        }
    },
    computed: {
        ...mapStores(editOfferStore),
    }
};
</script>

<style lang="scss" scoped>
.edit-offer {
    padding: 20px;
    align-items: flex-start;
    justify-content: space-between;
    height: 100%;

    form {
        width: 100%;
        font-weight: 700;
        align-items: flex-start;

        input[type=text], textarea {
            outline: none;
            padding: 3px 0px 3px 3px;
            margin-bottom: 10px;
            border: 1px solid #DDDDDD;
            border-radius: 4px;
        }       

        textarea {
            width: 100%;
            height: 200px;
            border: 1px solid rgba(0,0,0,0.2);
            border-radius: 4px;
            resize: none;
        }

        input[type=text]:focus, textarea:focus {
            border: 1px solid #5EC393;
            box-shadow: 0 0 3px #5EC393;
        }
    }

    .bottom {
        width: 100%;
        justify-content: flex-end;
    }
}


</style>