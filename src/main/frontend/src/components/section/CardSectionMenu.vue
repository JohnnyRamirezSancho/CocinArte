<script setup>
import router from "../../router/index"

const props = defineProps({
  option: {
    type: String,
  },
});

function goSection(section) {
  router.push("/receta/" + section);

}

let options = [
  "starters",
  "first-courses",
  "second-courses",
  "desserts"
]

</script>

<template>
  <section class="d-flex">
    <figure>
      <img :src="`../../src/assets/img/${option}.jpg`" alt="" />
    </figure>
    <div class="info">
      <h3 :class="`color-${option}`">Patata</h3>
      <p>
        Quisque consequat cursus enim eget luctus. Donec porttitor egestas
        ligula venenatis congue. Quisque sed dui eu felis vehicula auctor.
        Phasellus a turpis porttitor, fermentum nulla sed, vestibulum leo. Donec
        varius felis ac enim congue luctus. Interdum et malesuada fames ac ante
        ipsum primis in faucibus.
      </p>
      <button :class="`button btn btn-primary ${option}`" @click="goSection(0)">ver más</button>
    </div>
  </section>
</template>

<style lang="scss" scoped>
@import "../../assets/sass/CardSectionMenu.scss";
</style>
