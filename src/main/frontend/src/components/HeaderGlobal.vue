<script setup>
const props = defineProps({
  option: {
    type: String,
    default: "global",
  },
  text: {
    type: String,
    default: "Por secciones",
  },
});
</script>

<template>
  <header :class="option">
    <h2>{{ text }}</h2>
  </header>
</template>

<style lang="scss" scoped>
@import "../assets/sass/variables.scss";

header {
  padding: 20px;
  h2 {
    font-size: 3rem;
    color: white;
    text-align: center;
  }
}

.global {
  background: $background-slider;
}
.starters {
  background: $background-one;
}
.first-courses {
  background: $background-two;
}
.second-courses {
  background: $background-three;
}
.desserts {
  background: $background-four;
}
</style>
