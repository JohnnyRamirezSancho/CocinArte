INSERT INTO users (id_user, username, password) VALUES (default, 'admin@esto.es', '$2a$10$6wDeb3wqewh/nSWKVyIh5.0D4XjqyktJ5afuca0aBXDo1sUUIPDAO')

INSERT INTO roles (id_role, role) VALUES (default, 'ROLE_ADMIN')

INSERT INTO roles_users (user_id, role_id) VALUES (1, 1)

INSERT INTO imagesection (id_imagesection, image) VALUES (default, 'image-01.jpg')
INSERT INTO imagesection (id_imagesection, image) VALUES (default, 'image-02.jpg') 
INSERT INTO imagesection (id_imagesection, image) VALUES (default, 'image-03.jpg') 
INSERT INTO imagesection (id_imagesection, image) VALUES (default, 'image-04.jpg') 

INSERT INTO sections (id_section, name, description, imagesection_id_imagesection) VALUES (default, "Entrantes y ensaladas", "Lorem ipsum", 1)
INSERT INTO sections (id_section, name, description, imagesection_id_imagesection) VALUES (default, "Primeros platos", "Lorem ipsum", 2)
INSERT INTO sections (id_section, name, description, imagesection_id_imagesection) VALUES (default, "Segundos platos", "Lorem ipsum", 3)
INSERT INTO sections (id_section, name, description, imagesection_id_imagesection) VALUES (default, "Postres y dulces", "Lorem ipsum", 4)

INSERT INTO imagerecipe (id_imagerecipe, image) VALUES (default, 'image-01.jpg')
INSERT INTO imagerecipe (id_imagerecipe, image) VALUES (default, 'image-02.jpg') 
INSERT INTO imagerecipe (id_imagerecipe, image) VALUES (default, 'image-03.jpg') 
INSERT INTO imagerecipe (id_imagerecipe, image) VALUES (default, 'image-04.jpg') 
INSERT INTO imagerecipe (id_imagerecipe, image) VALUES (default, 'image-05.jpg') 
INSERT INTO imagerecipe (id_imagerecipe, image) VALUES (default, 'image-06.jpg') 
INSERT INTO imagerecipe (id_imagerecipe, image) VALUES (default, 'image-07.jpg') 
INSERT INTO imagerecipe (id_imagerecipe, image) VALUES (default, 'image-08.jpg')

INSERT INTO recipes (id_recipe, name, ingredients, recipe, imagerecipe_id_imagerecipe, section_id_section) VALUES (default, "Receta Uno", "Ingredientes.", "Receta.", 1, 1)
INSERT INTO recipes (id_recipe, name, ingredients, recipe, imagerecipe_id_imagerecipe, section_id_section) VALUES (default, "Receta Dos", "Ingredientes.", "Receta.", 2, 1)
INSERT INTO recipes (id_recipe, name, ingredients, recipe, imagerecipe_id_imagerecipe, section_id_section) VALUES (default, "Receta Tres", "Ingredientes.", "Receta.", 3, 2)
INSERT INTO recipes (id_recipe, name, ingredients, recipe, imagerecipe_id_imagerecipe, section_id_section) VALUES (default, "Receta Cuatro", "Ingredientes.", "Receta.", 4, 2)
INSERT INTO recipes (id_recipe, name, ingredients, recipe, imagerecipe_id_imagerecipe, section_id_section) VALUES (default, "Receta Cinco", "Ingredientes.", "Receta.", 5, 3)
INSERT INTO recipes (id_recipe, name, ingredients, recipe, imagerecipe_id_imagerecipe, section_id_section) VALUES (default, "Receta Seis", "Ingredientes.", "Receta.", 6, 3)
INSERT INTO recipes (id_recipe, name, ingredients, recipe, imagerecipe_id_imagerecipe, section_id_section) VALUES (default, "Receta Siete", "Ingredientes.", "Receta.", 7, 4)
INSERT INTO recipes (id_recipe, name, ingredients, recipe, imagerecipe_id_imagerecipe, section_id_section) VALUES (default, "Receta Ocho", "Ingredientes.", "Receta.", 8, 4)