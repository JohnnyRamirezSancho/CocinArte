<script setup>
import CardSectionMenu from "./CardSectionMenu.vue"

const props = defineProps({
  option: {
    type: String,
  },
  id: {
    type: String,
  },
});

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
            <CardSectionMenu :option="options[id]"></CardSectionMenu>
            <CardSectionMenu :option="options[id]"></CardSectionMenu>
            <CardSectionMenu :option="options[id]"></CardSectionMenu>
            <CardSectionMenu :option="options[id]"></CardSectionMenu>
        </div>
  </article>
</template>

<style lang="scss" scoped>
article {
    max-width: 1200px;
    margin: 50px auto;
}
</style>