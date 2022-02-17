<template>
  <div class="nav-bar-wrap flex">
      <div class="left">
          <div class="title">
              <a href="#">job-offers</a>
          </div>
      </div>
      <div class="right">

      </div>
  </div>
</template>

<style lang="scss" scoped>
.nav-bar-wrap {
    position: fixed;
    left: 0;
    top:0;
    height: 50px;
    width: 100%;
    padding-left: 25px;
    border-bottom: 1px solid rgba(0,0,0,.2);
    background-color: white;

    align-items: center;

    .title {

        a {
            text-decoration: none;
            color: rgba(80,80,80);
            font-size: 1.3rem;
        }
    }
}
</style>

