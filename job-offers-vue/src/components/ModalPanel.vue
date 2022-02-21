<template>
    <div 
        v-if="isOpened"
        class="modal-panel-overlay flex"
        @click.self="close">
        <div class="content flex flex-column panel">
            <div class="header flex">
                <span class="title">{{ title }}</span>
                <button @click="close" class="btn btn-neutral flex">x</button>
            </div>
            <div class="main">
                <slot></slot>
            </div>
        </div>
    </div>
</template>

<script>
import { mapStores } from 'pinia';
import { useStore } from '../store/modals.js';

export default {
    props: {
        name: {type: String, required:true },
        title: {tpe: String, required:true },
    },
    computed: {
        ...mapStores(useStore),
        isOpened() {
            return this.modalsStore.allOpened.includes(this.name);
        },
    },
    methods: {
        close() {
            this.modalsStore.close(this.name);
        }
    }
};
</script>

<style lang="scss" scoped>
.modal-panel-overlay {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-color: rgba(0,0,0,0.3);

    //align-items: center;
    justify-content: center;

    .content {
        width: 400px;
        height: 500px;
        padding: 0;
        margin-top: 100px;

        .header {
            padding: 15px 10px 15px 25px;
            justify-content: space-between;
            border-bottom: 1px solid rgba(0,0,0,0.1);

            .title {
                font-size: 1.3rem;
                font-weight: 700;
            }

            button {
                right: 0;
                width: 22px;
                height: 22px;
                font-size: 0.9rem;
                font-weight: 700;
                border-radius: 50%;

                align-items: center;
                justify-content: center;
            }
        }

        .main {
            height: 100%;
        }
    }
}
</style>