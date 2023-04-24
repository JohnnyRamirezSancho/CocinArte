import AuthConnection from "./authConnection";

export default class AuthService {
	#conn;

	constructor() {
		this.#conn = new AuthConnection();
	}

	async login(username, password) {
		this.#conn.login(username, password);
	}
}