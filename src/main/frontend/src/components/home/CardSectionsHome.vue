<script setup>
import { computed } from '@vue/reactivity';

const props = defineProps({
  option: {
    type: String,
  },
  text: {
    type: String,
  },
})


</script>

<template>
  <section class="d-flex">
    <figure>
      <img :src="`./src/assets/img/${option}.jpg`" alt="" />
    </figure>
    <div :class="`info  ${option}`">
      <h3>{{ text }}</h3>
      <div :class="`info button ${option}`">&gt;</div>
    </div>
  </section>
</template>

<style lang="scss" scoped>
@import "../../assets/sass/cardsectionshome.scss";
</style>
