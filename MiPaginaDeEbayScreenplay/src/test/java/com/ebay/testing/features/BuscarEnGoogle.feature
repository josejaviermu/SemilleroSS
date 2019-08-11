#Author: nairdacool@hotmail.com

@tag
Feature: Busqueda de producto en Ebay
Yo como ususario con internet voy a entrar a la pagina de
 ebay y voy a buscar un producto y comprarlo

  @smoketest
  Scenario: Busqueda de producto en Ebay exitosa
    Given Jose entro a Ebay
    When Jose busca el producto "Camara"
    When Jose selecciona la "Camara"
    Then Jose agrega la "camara" al carrito de compras 
    