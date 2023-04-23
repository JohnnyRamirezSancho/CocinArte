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

</script>

<template>
  <section>
    <figure>
      <img src="../../assets/img/ensalada-marisco.jpg" alt="" />
    </figure>
    <div :class="`info  ${option}`">
      <h3>Pan con chocolate</h3>
      <div :class="`info button ${option}`">ver más</div>
    </div>
  </section>
</template>

<style lang="scss" scoped>
@import "../../assets/sass/cardrecipesrecommended.scss";
</style>
