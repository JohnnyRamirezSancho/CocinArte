<script setup>
import CardSectionsHome from "./CardSectionsHome.vue";

let texts = [
  "Entrantes y ensaladas",
  "Primeros platos",
  "Segundos platos",
  "Postres y dulces"
]

let options = [
  "starters",
  "first-courses",
  "second-courses",
  "desserts"
]
</script>

<template>
  <article class="d-flex justify-content-between flex-wrap">
    <CardSectionsHome :option="options[0]" :text="texts[0]"></CardSectionsHome>
    <CardSectionsHome :option="options[1]" :text="texts[2]"></CardSectionsHome>
    <CardSectionsHome :option="options[3]" :text="texts[3]"></CardSectionsHome>
  </article>
</template>

<style lang="scss" scoped>
article {
  max-width: 1200px;
  margin: auto;
}
</style>