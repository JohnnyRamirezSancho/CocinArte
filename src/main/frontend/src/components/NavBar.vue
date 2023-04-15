<script setup>
import { RouterLink } from "vue-router";
</script>

<template>
  <nav class="navbar navbar-expand-lg navbar-dark">
    <div class="container">
      <a href="/" class="navbar-brand"
        ><img
          src="../assets/img/cocinarte-logo.png"
          alt="CocinArte"
          class="logo"
      /></a>
      <i class="bi bi-wechat"></i>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <RouterLink class="nav-link" to="/">Inicio</RouterLink>
          </li>

          <li class="nav-item">
            <RouterLink to="/porcategorias" class="nav-link"
              >Por categorías</RouterLink
            >
          </li>
          <li class="nav-item">
            <RouterLink to="/porproducto" class="nav-link"
              >Por producto</RouterLink
            >
          </li>
          <li class="nav-item">
            <RouterLink class="nav-link" to="/registrarse"
              >Registrarse</RouterLink
            >
          </li>
          <li class="nav-item">
            <RouterLink class="nav-link" to="/acceso">Acceso</RouterLink>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>
<style lang="scss" scoped>
@import "../assets/sass/variables";
nav {
  background: $background-nav;
  padding: 2.1vw 0;
  .container {
    max-width: 1200px;
    margin: auto;
    align-items: end;
    img.logo {
      width: 42.5vw;
      max-width: 510px;
      min-width: 220px;
      margin-bottom: 4px;
    }
    .navbar-toggler {
      border-color: $color-white;
      &:focus {
        box-shadow: 0 0 0 2px;
      }
    }
    a {
      color: $color-white;
      padding-bottom: 0;
      &:hover {
        color: $color-button-special;
      }
    }
  }
}
</style>
