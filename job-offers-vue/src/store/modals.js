import { defineStore } from "pinia";

export const useStore = defineStore('modals', {
    state: () => {
        return {
            opened: [],
        }
    },
    actions: {
        open(name) {
            if (!this.opened.includes(name)) {
                this.opened.unshift(name);
            }
        },
        close(name) {
            this.opened = this.opened.filter((e) => e !== name);
        }
    },
    getters: {
        active: (state) => (state.opened.length > 0 ? state.opened[0] : null),
        allOpened: (state) => state.opened,
    }
})