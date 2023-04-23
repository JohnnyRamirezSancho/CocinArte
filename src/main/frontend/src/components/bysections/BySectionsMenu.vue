<script setup>
import CardBySectionsMenu from "./CardBySectionsMenu.vue"

let options = [
  "starters",
  "first-courses",
  "second-courses",
  "desserts"
]

</script>

<template>
    <article>
        <div class="bysectionmenu Menu d-flex flex-wrap justify-content-between">
            <CardBySectionsMenu :id="0" :option="options[0]"></CardBySectionsMenu>
            <CardBySectionsMenu :id="1" :option="options[1]"></CardBySectionsMenu>
            <CardBySectionsMenu :id="2" :option="options[2]"></CardBySectionsMenu>
            <CardBySectionsMenu :id="3" :option="options[3]"></CardBySectionsMenu>
        </div>
  </article>
</template>

<style lang="scss" scoped>
article {
    max-width: 1200px;
    margin: 50px auto;
}
</style>