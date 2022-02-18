<template>
  <div class="nav-bar-wrap flex">
      <div class="left">
          <div class="title">
              <a href="#">job-offers</a>
          </div>
      </div>
      <div class="right">
          <button class="btn btn-blue">
              Employer panel
          </button>
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
    padding: 25px;
    border-bottom: 1px solid rgba(0,0,0,.2);
    background-color: white;

    align-items: center;
    justify-content: space-between;

    .title {

        a {
            text-decoration: none;
            color: rgba(80,80,80);
            font-size: 1.3rem;
        }
    }
}

</style>

