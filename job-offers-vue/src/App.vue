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

<style lang="scss" >
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}

body {
  background-color: rgb(240,240,248);
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 55px;
}

.flex {
  display: flex;
}

.flex-column {
  flex-direction: column;
}

.btn {
    border: none;
    padding: 10px;
    border-radius: 20px;
    font-weight: 700;
    cursor: pointer;


}

.btn-blue {
    color: #fff;
    background-color: #549eff;
    font-size: 1rem;

    &:hover {
        background-color: #426fc9;
    }
}
</style>
