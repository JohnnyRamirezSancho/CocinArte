<script setup>
import router from "../../router/index"

const props = defineProps({
  option: {
    type: String,
  },
  text: {
    type: String,
  },
  id: {
    type: Number,
  },
})

function goSection(section) {
  router.push("/seccion/" + section);
}
</script>

<template>
  <section class="d-flex">
    <figure>
      <img :src="`./src/assets/img/${option}.jpg`" alt="" />
    </figure>
    <div :class="`info  ${option}`">
      <h3>{{ text }}</h3>
      <div :class="`info button ${option}`" @click="goSection(id)">&gt;</div>
    </div>
  </section>
</template>

<style lang="scss" scoped>
@import "../../assets/sass/cardsectionshome.scss";
</style>
