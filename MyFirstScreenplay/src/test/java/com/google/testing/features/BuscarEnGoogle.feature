#Author: nairdacool@hotmail.com

@tag
Feature: Busqueda en Google
 Yo como un usuario con internet voy a ingresar a la pagina de google
 y voy a buscar una palabra

  @smoketest
  Scenario: Busqueda en Google exitosa
    Given Adrian entro a Google
    When Adrian busca la palabra "Quesito"
    Then Adrian valida que el titulo de la ventana contenga la palabra "Quesito"