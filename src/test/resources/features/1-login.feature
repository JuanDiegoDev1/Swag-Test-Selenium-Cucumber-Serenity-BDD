
@Suite @Login
Feature: CP01 - Validar Inicio de Sesión

  Background: Validar el inicio de sesión con credenciales validas e invalidas

    Given el usuario navega al sitio web

    @ValidCredentials
    Scenario: 1 - Validar con credenciales correctas
      When ingresa credenciales validas
      Then la apliación deberia mostrar el modulo principal de productos

    @InvalidCredentials
    Scenario: 2 - Validar con credenciales incorrectas
      When ingresa credenciales invalidads
      Then la aplicacón deberia mostrar un mensaje error
