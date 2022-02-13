<template>
  <div class="app flex">
    <JobOffersList />
  </div>
</template>

<script>
import JobOffersList from './components/JobOffersList.vue'

export default {
  name: 'App',
  components: {
    JobOffersList
  }
}
</script>

<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.app {
  justify-content: center;  
}

.flex {
  display: flex;
}

.flex-column {
  flex-direction: column;
}
</style>
