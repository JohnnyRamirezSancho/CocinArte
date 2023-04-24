import { defineStore } from 'pinia'
import { ref } from 'vue';

export const sections = defineStore ('sections', () => {
	const sectionsAll = ref([]);
	return sectionsAll;
})