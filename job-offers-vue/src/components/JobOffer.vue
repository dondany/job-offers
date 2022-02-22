<template>
    <div class="job-offer-wrap panel flex">
        <div class="left">
            COMPANY<br>LOGO
        </div>
        
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

        
    </div>
</template>

<script>
import { defineComponent } from 'vue';

export default defineComponent({
    props: ['offer']
  
});
</script>

<style lang="scss" scoped>
.job-offer-wrap {
    justify-content: flex-start;
    align-items: flex-start;
    cursor: pointer;
    margin: 0 10px 5px 10px;

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