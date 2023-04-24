export default class SeccionesRepository {
  url = "http://localhost:8080/api/sections";

  constructor() {}

  async getAll() {
    const response = await fetch(this.url);
    const json = await response.json();

    let sectionsList = [];

    sectionsList.push(json);

    return json;
  }
}
