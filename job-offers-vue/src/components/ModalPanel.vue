<template>
    <div 
        v-if="isOpened"
        class="modal-panel-overlay flex"
        @click.self="close">
        <div class="content flex flex-column panel">
            <button @click="close">x</button>
        </div>
    </div>
</template>

<script>
import { mapStores } from 'pinia';
import { useStore } from '../store/modals.js';

export default {
    props: {
        name: {type: String, required:true }
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

    align-items: center;
    justify-content: center;

    .content {
        width: 400px;
        height: 500px;
    }
}
</style>