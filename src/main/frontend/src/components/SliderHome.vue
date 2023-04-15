<template>
  <div id="carouselInterval" class="carousel slide" data-bs-ride="carousel">
    <div class="carousel-inner">
      <div class="carousel-item active" data-bs-interval="5000">
        <img
          src="../../assets/images/xaréu-d’ochobre.jpg"
          class="image-slider-3"
          alt="..."
        />
      </div>
      <div class="carousel-item" data-bs-interval="5000">
        <img
          src="../../assets/images/xaréu-d’ochobre2.jpg"
          class="image-slider"
          alt="..."
        />
      </div>
      <div class="carousel-item" data-bs-interval="5000">
        <img
          src="../../assets/images/xaréu-d’ochobre3.jpg"
          class="image-slider"
          alt="..."
        />
      </div>
    </div>
    <button
      class="carousel-control-prev"
      type="button"
      data-bs-target="#carouselExampleInterval"
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
      data-bs-target="#carouselExampleInterval"
      data-bs-slide="next"
    >
      <div class="control-button">
        <span class="carousel-control-next-icon"></span>
      </div>
      <span class="visually-hidden">Next</span>
    </button>
  </div>
</template>

<style lang="scss" scoped>
@import "../assets/sass/sliderhome.scss";
</style>
