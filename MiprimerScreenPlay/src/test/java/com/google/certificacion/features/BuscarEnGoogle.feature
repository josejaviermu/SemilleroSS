#Author: your.email@your.domain.com

@tag
Feature: buscar "queso" en google
  Yo como un usuario con internet voy a ingresar a la pagina de Google y voy a buscar una palabra

  @tag1
  Scenario: Tarea exitosa
    Given Robot entra a Google
    When Robot busca la palabra "queso"
    Then Robot valida que el titulo de la ventana contenga la palabra “queso”

 