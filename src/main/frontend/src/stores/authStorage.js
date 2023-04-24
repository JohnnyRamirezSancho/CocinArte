import { defineStore } from 'pinia'
import { ref } from 'vue';

export const useAuthStore = defineStore ('auth', () => {

	const isAuthenticate = ref(false);
	const username = ref("");
	const roles = ref([]);

	return { isAuthenticate, username, roles }
})