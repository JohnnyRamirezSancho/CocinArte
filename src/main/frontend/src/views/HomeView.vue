<script setup>
import { onBeforeMount, ref } from "vue";

import NavBar from "../components/NavBar.vue";
import SliderHome from "../components/home/SliderHome.vue"
import SectionsHome from "../components/home/SectionsHome.vue"
import WellcomeHome from "../components/home/WellcomeHome.vue"
import OurRecommendedMenuHome from "../components/home/OurRecommendedMenuHome.vue"
import MenuSectionsGlobal from "../components/MenuSectionsGlobal.vue"
import FooterHome from "../components/home/FooterHome.vue"
import ApiRepository from "../assets/ApiRepository/ApiRepository"

import { sections } from "../stores/sections"

const sectionsRepository = new ApiRepository("secciones");
const apiSections = sectionsRepository.chooseApi();

let sectionsList = ref([]);
onBeforeMount(async () => {
  sectionsList.value = await apiSections.getAll();
});

const allSections = new sections;
allSections.sectionsAll = sectionsList;

</script>

<template>
  <NavBar></NavBar>
  <SliderHome :sectionsPatata="sectionList"></SliderHome>
  <SectionsHome></SectionsHome>
  <WellcomeHome></WellcomeHome>
  <OurRecommendedMenuHome></OurRecommendedMenuHome>
  <MenuSectionsGlobal></MenuSectionsGlobal>
  <FooterHome></FooterHome>
</template>
