import { defineStore } from 'pinia'
import { ref } from 'vue';

export const recipes = recipes ('recipes', () => {

	const recipes = ref([]);
	return recipes;
})