#Author: mateo_gomez82141@elpoli.edu.co


Feature: Carrito de compras
	Como usuario quiero ingresar a la pagina web coppel para agregar un producto al carrito de compras


  Scenario: Entro a la pagina de pantallas de coppel
    Given Mateo abre la pagina web coppel
    When Mateo busca la imagen de pantallas y agrega el producto al carrito de compras
    Then valida que el producto seleccionado este en el carrito de compras  
