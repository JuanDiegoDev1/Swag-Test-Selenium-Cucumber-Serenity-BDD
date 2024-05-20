
@Suite @ShoppingCart
Feature: CP-02 -Validar carrito de compras

  Background: Realizar3 validaciones en el carrito de comrpras
    Given el usuario navega al sitio web
    When  ingresa credenciales validas
    @ShoppingCartList
    Scenario:1 - Listar los producrtos en el carrito
      And  agrega productos al carrito de compras
      And  da Click en icono del carrito
      Then el sistema deberia listar los productos agregados en el carrito de compras

    @ShoopingCartEmpty
    Scenario:2 - Cuando las cesta este vacia de productos, no procesar la compra
      And  da Click en icono del carrito
      Then el sistema deberia mostrar la cesta sin productos

    @ShoopingCartProcess
    Scenario:3 -Cuando se quiera procesar la comprea, se mostrara un mensaje de compra exitosa
      And agrega productos al carrito de compras
      And da Click en icono del carrito
      When completa  todo el registro de la orden
      Then el sistema deberia procesar la compra

