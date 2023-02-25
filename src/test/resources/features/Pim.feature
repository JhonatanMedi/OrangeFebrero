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

  @ListEmployee
  Scenario Outline: list employee
    Given abrir el navegador
    And the user fill out user name <userName> and password <pass>
    When the user access to the list employee
    And the user search job <jobTitle>

    Examples:
      | userName | pass     | jobTitle |
      | Admin    | admin123 | QA Lead  |

  @searchEmployee
  Scenario Outline: search employee
    Given abrir el navegador
    And the user fill out user name <userName> and password <pass>
    When the user access to the list employee
    Then the user search employee <employee>

    Examples:
      | userName | pass     |employee|
      | Admin    | admin123 |David   |