#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: sucess full login

  Scenario Outline: login
    Given abrir el navegador
    When the user fill out user name <userName> and password <pass>

    Examples:
      | userName | pass     |
      | Admin    | admin123 |
