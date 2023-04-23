<script setup>
import router from '../../router';
import { RouterLink } from 'vue-router';

const props = defineProps({
  option: {
    type: String,
  },
  text: {
    type: String,
  },
});

</script>

<template>
  <section>
    <figure>
      <img :src="`./src/assets/img/${option}.jpg`" alt="" />
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
      <button :class="`button btn btn-primary ${option}`"><RouterLink :to="`/receta/1`">ver más</RouterLink></button>
    </div>
  </section>
</template>

<style lang="scss" scoped>
@import "../../assets/sass/styles.scss";
@import "../../assets/sass/cardsourrecommendedmenuhome.scss";
</style>
