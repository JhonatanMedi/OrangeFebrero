@Allpim
Feature: all pim

  @Addemployed
  Scenario Outline: add employee
    Given abrir el navegador
    And the user fill out user name <userName> and password <pass>
    When the user access to the add employee
    And the user fill out field first <firstName> midlle <middle> last name <lastName>


    Examples:
      | userName | pass     | firstName | middle | lastName |
      | Admin    | admin123 | jeannnete | jane   | medina   |
