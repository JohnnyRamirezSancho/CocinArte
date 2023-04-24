import { useAuthStore } from "../../../stores/auth-storage";

export default class AuthConnection {
  #baseUrl = "http://localhost:8080";
  #auth = "";

  async login(username, password) {
    this.#auth = this.encodeB64(username, password);

    const myHeaders = new Headers();
    myHeaders.append("Authorization", `Basic ${this.#auth}`);
    myHeaders.append("Content-Type", "text/plain");

    const response = await fetch(this.#baseUrl + "/api/login", {
      method: 'GET',
      headers: myHeaders,
      credentials: 'include',
      redirect: 'follow',
    });

    if (response) {
      if(response.status==401) {
        alert("Por favor, revise su usuario y contraseña.")
        return
      }
      const cosa = await response.json()
      const store = useAuthStore();
      store.isAuthenticate = true;
      store.roles = cosa.role;
      store.username = cosa.username;
      alert("Bienvenido, " + cosa.username + ".");
    } else {
      alert("Ha ocurrido un error.\nPor favor, inténtelo de nuevo pasados unos minutos.");
    }
  }

  encodeB64(username, password) {
    const encodeData = window.btoa(`${username}:${password}`);
    return encodeData;
  }
}
