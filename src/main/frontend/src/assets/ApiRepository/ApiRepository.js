import RecetasRepository from "./cocinarteApi/RecetasRepository";
import SeccionesRepository from "./cocinarteApi/SeccionesRepository";

export default class ApiRepository {

    api;

    constructor(apiToCharge) {
        this.api = apiToCharge
        this.chooseApi()
    }

    chooseApi() {
        if(this.api === "recetas") return new RecetasRepository;
        if(this.api === "secciones") return new SeccionesRepository;
    }
}