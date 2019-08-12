#Author: your.email@your.domain.com

@tag
Feature: Busqueda en Linio
  Yo como un usuario con internet voy a ingresar a la pagina de Linio y voy a buscar un producto

  @BusquedaEnLinio
  Scenario: Tarea exitosa
    Given Bot entro a Linio
    When el busca la palabra "televisor"
    Then el valida que la busqueda contenga la palabra "televisor"

