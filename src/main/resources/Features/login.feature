Feature: Inicio de sesión
  Como usuario de swaglabs
  Quiero iniciar sesión con usuario y password
  Para ingresar al sitio web.


  Scenario: login exitoso
    Given que el usuario quiere ingresar al sitio web
    When ingresa su usuario "standard_user" y su password "secret_sauce"
    Then puede ver los products disponibles