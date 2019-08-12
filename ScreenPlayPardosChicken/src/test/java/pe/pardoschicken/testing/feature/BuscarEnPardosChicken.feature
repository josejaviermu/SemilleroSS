#Author: your.email@your.domain.com

@tag
Feature: Busqueda en PardosChicken
  Como usuario de pardoschicken quiero ingresar a la página web y ordenar un comida

  @BusquedaEnPardosChicken
  Scenario: Busqueda de comida en PardosChicken
    Given Bot entra a pardoschicken
    When El busca una "pardos brasa" en la pagina 
    Then El verifica el resultado esperado

