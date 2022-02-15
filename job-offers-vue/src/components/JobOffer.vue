<template>
    <div class="job-offer-wrap flex flex-column">
        <div class="name">
            <span>{{ jobOffer.name }}</span>
        </div>
        
        <span>{{ jobOffer.description }}</span>

        <div class="bottom flex">
            <span>{{ jobOffer.city }}</span>
        </div>
    </div>
</template>

<script>
import { defineComponent } from 'vue';

export default defineComponent({
    props: ['jobOffer'],
  
});
</script>

<style lang="scss" scoped>
.job-offer-wrap {
    justify-content: flex-start;
    align-items: flex-start;
    border: 1px solid rgba(0,0,0,0.1);
    border-radius: 5px;
    margin: 5px;
    padding: 10px;
    background-color: #FBF8F1;

    .bottom {
        width: 100%;
        justify-content: flex-end;
        align-items: flex-end;
    }

}
</style>