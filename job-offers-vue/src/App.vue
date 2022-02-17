<template>
  <div class="app flex">
    <NavBar/>
    <JobOffersList />
  </div>
</template>

<script>
import NavBar from './components/NavBar.vue'
import JobOffersList from './components/JobOffersList.vue'

export default {
  name: 'App',
  components: {
    NavBar,
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

body {
  background-color: rgb(235,235,235);
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.flex {
  display: flex;
}

.flex-column {
  flex-direction: column;
}
</style>
