
export default class RecetasRepository {
  url = "http://localhost:8080/api/recipes";

  constructor() {}

  async getAll() {
    const response = await fetch(this.url);
    const json = await response.json();

    let recipesList = [];

    recipesList.push(json);

    return json;
  }
}
