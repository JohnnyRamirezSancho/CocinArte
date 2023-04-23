<template>
  <header>
    <div id="carouselInterval" class="carousel slide" data-bs-ride="carousel">
      <div class="carousel-inner">
        <div class="carousel-item active" data-bs-interval="50000">
          <div class="d-flex">
            <img
              src="../../assets/img/gazpacho.jpg"
              class="image-slider-3"
              alt="..."
            />
            <div class="carousel-item-text">
              <h2>Patata</h2>
              <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                Curabitur maximus, sem eu vestibulum sodales, tortor enim
                elementum ligula, eu semper ipsum nisl vel orci. Donec sed
                volutpat eros. Vivamus non fermentum metus. Nullam placerat
                risus ut ultricies vestibulum. Phasellus bibendum erat ante, sed
                feugiat nunc hendrerit ut. Proin dictum magna eget mauris
                luctus, sit amet maximus elit ultricies. Vivamus gravida eget
                leo sed rhoncus. Integer felis eros, eleifend in dui non,
                pharetra interdum urna. Ut nisl neque, porttitor vel sapien sed,
                bibendum suscipit neque.
              </p>
              <button class="btn btn-primary">ver más</button>
            </div>
          </div>
        </div>
        <div class="carousel-item" data-bs-interval="50000">
          <div class="d-flex">
            <img
              src="../../assets/img/bolonesa.webp"
              class="image-slider"
              alt="..."
            />
            <div class="carousel-item-text">
              <h2>Patata</h2>
              <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                Curabitur maximus, sem eu vestibulum sodales, tortor enim
                elementum ligula, eu semper ipsum nisl vel orci. Donec sed
                volutpat eros. Vivamus non fermentum metus. Nullam placerat
                risus ut ultricies vestibulum. Phasellus bibendum erat ante, sed
                feugiat nunc hendrerit ut. Proin dictum magna eget mauris
                luctus, sit amet maximus elit ultricies. Vivamus gravida eget
                leo sed rhoncus. Integer felis eros, eleifend in dui non,
                pharetra interdum urna. Ut nisl neque, porttitor vel sapien sed,
                bibendum suscipit neque.
              </p>
              <button class="btn btn-primary">ver más</button>
            </div>
          </div>
        </div>
        <div class="carousel-item" data-bs-interval="50000">
          <div class="d-flex">
            <img
              src="../../assets/img/ensalada-marisco.jpg"
              class="image-slider"
              alt="..."
            />
            <div class="carousel-item-text">
              <h2>Patata</h2>
              <p>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                Curabitur maximus, sem eu vestibulum sodales, tortor enim
                elementum ligula, eu semper ipsum nisl vel orci. Donec sed
                volutpat eros. Vivamus non fermentum metus. Nullam placerat
                risus ut ultricies vestibulum. Phasellus bibendum erat ante, sed
                feugiat nunc hendrerit ut. Proin dictum magna eget mauris
                luctus, sit amet maximus elit ultricies. Vivamus gravida eget
                leo sed rhoncus. Integer felis eros, eleifend in dui non,
                pharetra interdum urna. Ut nisl neque, porttitor vel sapien sed,
                bibendum suscipit neque.
              </p>
              <button class="btn btn-primary">ver más</button>
            </div>
          </div>
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
@import "../../assets/sass/sliderhome.scss";

header {
  background: $background-slider;
  padding-bottom: 120px;
}
</style>
