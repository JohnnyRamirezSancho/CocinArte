<script setup>
import { RouterLink } from "vue-router";
</script>
<template>
  <article class="d-flex justify-content-between">
    <RouterLink to="/">Entrantes y ensaladas</RouterLink>
    <RouterLink to="/">Primeros platos</RouterLink>
    <RouterLink to="/">Segundos platos</RouterLink>
    <RouterLink to="/">Postres y dulces</RouterLink>
  </article>
</template>

<style lang="scss" scoped>
@import "../../assets/sass/menusectionshome.scss";
</style>
