<script setup>
import CardOurRecommendedMenuHome from "./CardOurRecommendedMenuHome.vue"

let options = [
  "starters",
  "first-courses",
  "second-courses",
  "desserts"
]

</script>

<template>
  <article>
    <h2>Nuestro menú recomendado</h2>
    <div class="ourRecommendedMenu d-flex flex-wrap justify-content-between">
      <CardOurRecommendedMenuHome :option="options[0]"></CardOurRecommendedMenuHome>
      <CardOurRecommendedMenuHome :option="options[1]"></CardOurRecommendedMenuHome>
      <CardOurRecommendedMenuHome :option="options[2]"></CardOurRecommendedMenuHome>
      <CardOurRecommendedMenuHome :option="options[3]"></CardOurRecommendedMenuHome>
    </div>
  </article>
</template>

<style lang="scss" scoped>
@import "../../assets/sass/ourrecommendedmenuhome.scss";
</style>
