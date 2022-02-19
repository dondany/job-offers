<template>
  <div class="app flex">
    <NavBar/>
    <router-view/>
    <!-- <JobOffersList /> -->
  </div>
</template>

<script>
import NavBar from './components/NavBar.vue'

export default {
  name: 'App',
  components: {
    NavBar
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

.btn-green {
    color: #fff;
    background-color: #2dbd54;
    font-size: 1rem;

    &:hover {
        background-color: #218f3f;
    }
}

.btn-red {
    color: #fff;
    background-color: #fa3939;
    font-size: 1rem;

    &:hover {
        background-color: #b82727;
    }
}

.panel {
  border: 1px solid rgba(0,0,0,0.1);
  border-radius: 6px;
  padding: 15px 10px 15px 10px;
  background-color: #fff;
  box-shadow: 0px 10px 25px -22px rgba(66, 68, 90, 0.3);
}
</style>
