<script setup>
import { RouterLink } from "vue-router";
</script>
<template>
  <article class="d-flex justify-content-between">
    <RouterLink to="/seccion/0">Entrantes y ensaladas</RouterLink>
    <RouterLink to="/seccion/1">Primeros platos</RouterLink>
    <RouterLink to="/seccion/2">Segundos platos</RouterLink>
    <RouterLink to="/seccion/3">Postres y dulces</RouterLink>
  </article>
</template>

<style lang="scss" scoped>
@import "../assets/sass/menusectionshome.scss";
</style>
