<script setup>
import NavBar from "../components/NavBar.vue";
import HeaderGlobal from "../components/HeaderGlobal.vue";
import SectionMenu from "../components/section/SectionMenu.vue"
import MenuSectionsGlobal from "../components/MenuSectionsGlobal.vue"
import FooterGlobal from "../components/FooterGlobal.vue";

const props = defineProps({
  option: {
    type: String,
  },
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
  <SectionMenu :option="options[id]" :id ="id"></SectionMenu>
  <MenuSectionsGlobal></MenuSectionsGlobal>
  <FooterGlobal></FooterGlobal>
</template>
