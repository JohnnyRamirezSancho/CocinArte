<script setup>
import NavBar from "../components/NavBar.vue";
import HeaderGlobal from "../components/HeaderGlobal.vue";
import RecipeDetail from "../components/recipes/RecipeDetail.vue";
import MenuRecipesRecommended from "../components/recipes/MenuRecipesRecommended.vue"
import MenuSectionsGlobal from "../components/MenuSectionsGlobal.vue"
import FooterGlobal from "../components/FooterGlobal.vue";

const props = defineProps({
  id: {
    type: String,
  },
});

let options = [
  "starters",
  "first-courses",
  "second-courses",
  "desserts"
]

let msg = [
  "Entrantes y ensaladas",
  "Primeros platos",
  "Segundos platos",
  "Postres y dulces"
]
</script>

<template>
  <NavBar></NavBar>
  <HeaderGlobal :option="options[id]" :text="msg[id]"></HeaderGlobal>
  <RecipeDetail></RecipeDetail>
  <MenuRecipesRecommended></MenuRecipesRecommended>
  <MenuSectionsGlobal></MenuSectionsGlobal>
  <FooterGlobal></FooterGlobal>
</template>
