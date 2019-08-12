#Author: joselito.and@gmail.com


Feature: Compra en Amazon
 Yo como usuario de Amazon voy a buscar un articulo en Amazon y
 voy a agregarlo a mi carrito de compras


  Scenario: Compra exitosa
    Given pepito entro a amazon
    When el busca un <producto> y lo agrega a su carrito 
   | producto              |                           
   | "peluche de chimuelo" |
   | "playstation 4"       | 
          
    Then el puede ver el un mensaje indicando que el producto se agrego



