<script setup>
const props = defineProps({
  id: {
    type: String,
  },
});
</script>

<template>
  <article>
    <img src="../../assets/img/bolonesa.webp" alt="" />
    <div class="ingredients">
      <h2>Receta nosequé</h2>
      <h3>Ingredientes</h3>
      <p>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. In a risus non
        erat tincidunt euismod aliquet sit amet eros. Ut posuere aliquam elit,
        id sollicitudin mauris convallis non. Fusce non ligula vitae est
        tristique tempor. Nam at vulputate odio, eget ultrices augue. Morbi nunc
        elit, consectetur ut est sed, accumsan sollicitudin lacus. Sed accumsan
        tellus id nulla malesuada, in dictum augue suscipit. Vivamus nisl
        libero, fermentum in felis sit amet, ullamcorper auctor ipsum.
        Pellentesque feugiat fringilla viverra. Nunc dignissim a elit eu
        bibendum. Aenean dignissim mi eget condimentum fringilla. Curabitur odio
        velit, egestas vitae elit vitae, hendrerit tempus ligula. Vivamus
        scelerisque lacus nisl, sit amet scelerisque felis ornare et. Maecenas
        imperdiet ex ut bibendum lacinia. Maecenas iaculis eget mauris eu
        tincidunt.
      </p>
    </div>
    <div class="steps">
      <h2>Receta</h2>
      <p>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. In a risus non
        erat tincidunt euismod aliquet sit amet eros. Ut posuere aliquam elit,
        id sollicitudin mauris convallis non. Fusce non ligula vitae est
        tristique tempor. Nam at vulputate odio, eget ultrices augue. Morbi nunc
        elit, consectetur ut est sed, accumsan sollicitudin lacus. Sed accumsan
        tellus id nulla malesuada, in dictum augue suscipit. Vivamus nisl
        libero, fermentum in felis sit amet, ullamcorper auctor ipsum.
        Pellentesque feugiat fringilla viverra. Nunc dignissim a elit eu
        bibendum. Aenean dignissim mi eget condimentum fringilla. Curabitur odio
        velit, egestas vitae elit vitae, hendrerit tempus ligula. Vivamus
        scelerisque lacus nisl, sit amet scelerisque felis ornare et. Maecenas
        imperdiet ex ut bibendum lacinia. Maecenas iaculis eget mauris eu
        tincidunt.
      </p>
    </div>
  </article>
</template>

<style lang="scss" scoped>
article {
  display: flex;
  flex-wrap: wrap;
  padding: 20px;
  background-color: white;
  max-width: 1200px;
  margin: 50px auto;
  img {
    width: 33.3%;
    object-fit: cover;
  }
  .ingredients {
    width: 66.6%;
    padding-left: 20px;
  }

  .steps {
    width: 100%;
    padding-top: 20px;
  }
}

@media (max-width: 768px) {
  article {
    flex-direction: column;
    img {
      width: 100%;
      aspect-ratio: 16/5;
      margin-bottom: 20px;
    }
  }
}
</style>
