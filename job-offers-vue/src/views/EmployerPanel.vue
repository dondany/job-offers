<template>
    <div class="employer-panel-wrap flex">
        <div class="left flex panel flex-column">
            <div class="title">
                Employer Panel
            </div>
            <div class="menu flex flex-column">
                <div class="btn-menu">
                    Add new offer
                </div>
                <div class="btn-menu">
                    Show applications
                </div>
                <div class="btn-menu">
                    Settings
                </div>
            </div>
        </div>
        <div class="right flex flex-column">
            <JobOffersList/>
        </div>
        
    </div>
</template>

<script>
import JobOffersList from '../components/JobOffersListEmployer.vue'

export default {
    components: {
        JobOffersList
    },
    data() {
        return {
        }
    },
};
</script>

<style lang="scss" scoped>
.employer-panel-wrap {
    width: 100%;
    margin: 0 10px 5px 10px;

    .left {
        max-width: 250px;
        flex-basis: 25%;
        gap: 5px;
        //background-color: #4287f5;
        color: #919191;
        align-items: center;
        padding: 0;

        .title {
            color: #454545;
            width: 100%;
            font-size: 1.2rem;
            font-weight: 700;
            padding: 20px 0 15px 0;
            margin-bottom: 0px;
            border-bottom: 1px solid rgba(255,255,255,0.3);
        }

        .menu {
            //padding-left: 30px;
            
            .btn-menu {
                padding: 10px;
                border-radius: 5px;
                cursor: pointer;
                text-align: left;

                &:hover {
                    color: #fff;
                    background-color: #5EC393;
                }
            }
        }

        
    }

    .right {
        flex-basis: 75%;
    }
}
</style>