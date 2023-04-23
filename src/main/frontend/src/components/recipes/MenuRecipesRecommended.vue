<script setup>
import CardOurRecommendedRecipeHome from "./CardOurRecommendedRecipeHome.vue"

let options = [
  "starters",
  "first-courses",
  "second-courses",
  "desserts"
]

</script>

<template>
  <article>
    <h2>¿Te animas con otras recetas?</h2>
    <div class="ourRecommendedMenu d-flex flex-wrap justify-content-between">
      <CardOurRecommendedRecipeHome :option="options[0]"></CardOurRecommendedRecipeHome>
      <CardOurRecommendedRecipeHome :option="options[1]"></CardOurRecommendedRecipeHome>
      <CardOurRecommendedRecipeHome :option="options[2]"></CardOurRecommendedRecipeHome>
    </div>
  </article>
</template>

<style lang="scss" scoped>
@import "../../assets/sass/menurecipesrecommended.scss";
</style>
