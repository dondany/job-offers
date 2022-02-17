<template>
    <div class="job-offer-wrap flex">
        <div class="left">
            COMPANY<br>LOGO
        </div>
        
        <div class="mid flex flex-column">
            <div class="name">
                <span>{{ jobOffer.name }}</span>
            </div>
            <div class="company-details flex">
            <span>{{ jobOffer.companyName }}</span>
            <span>{{ jobOffer.city }}</span>
        </div>
        </div>

        <div class="right">

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
    border-radius: 6px;
    margin: 0 10px 5px 10px;
    padding: 15px 10px 15px 10px;
    background-color: #fff;
    box-shadow: 0px 10px 25px -22px rgba(66, 68, 90, 0.3);
    cursor: pointer;

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

}
</style>