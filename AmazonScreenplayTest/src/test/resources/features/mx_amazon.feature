#Author: joselito.and@gmail.com


Feature: Compra en Amazon
 Yo como usuario de Amazon voy a buscar un articulo en Amazon y
 voy a agregarlo a mi carrito de compras


  Scenario: Compra exitosa
    Given pepito entro a amazon
    When pepito busca un "Unicornio de peluche" y lo agrega a su carrito
    Then pepito puede ver el "Unicornio de peluche" en la lista de compra


