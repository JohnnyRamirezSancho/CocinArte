package com.personal.cocinarte.utils;

public class RouteFileUploadImage {
    private static String pathImageRecipe = "src/main/resources/static/images/recipe-images/";

    public static String pathToSaveImage(String typeOfImage) {
        if (typeOfImage == "imageRecipe") {
            return pathImageRecipe;
        }

        return null;
    }
}
