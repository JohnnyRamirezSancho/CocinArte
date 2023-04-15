<template>
  <header>
    <div id="carouselInterval" class="carousel slide" data-bs-ride="carousel">
      <div class="carousel-inner">
        <div class="carousel-item active" data-bs-interval="5000">
          <img
            src="../assets/img/gazpacho.jpg"
            class="image-slider-3"
            alt="..."
          />
        </div>
        <div class="carousel-item" data-bs-interval="5000">
          <div style="display: flex;">
            <img
              src="../assets/img/bolonesa.webp"
              class="image-slider"
              alt="..."
            />
            <div>
              <h2>Patata</h2>
            </div>
          </div>
        </div>
        <div class="carousel-item" data-bs-interval="5000">
          <img
            src="../assets/img/ensalada-marisco.jpg"
            class="image-slider"
            alt="..."
          />
        </div>
      </div>
      <button
        class="carousel-control-prev"
        type="button"
        data-bs-target="#carouselInterval"
        data-bs-slide="prev"
      >
        <div class="control-button">
          <span class="carousel-control-prev-icon"></span>
        </div>
        <span class="visually-hidden">Previous</span>
      </button>
      <button
        class="carousel-control-next"
        type="button"
        data-bs-target="#carouselInterval"
        data-bs-slide="next"
      >
        <div class="control-button">
          <span class="carousel-control-next-icon"></span>
        </div>
        <span class="visually-hidden">Next</span>
      </button>
    </div>
  </header>
</template>

<style lang="scss" scoped>
@import "../assets/sass/sliderhome.scss";

header {
    background: $background-slider;
}
</style>
