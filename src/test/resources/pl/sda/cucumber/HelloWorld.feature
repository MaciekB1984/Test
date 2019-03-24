Feature: Powitania w roznych jezykach

  Scenario Outline: Tresc powitania
    Given stworz instancje klasy HelloWorld zostala stworzona
    When  jako jezyk wybrano <jezyk>
    Then  wyswietlil sie komunikat <komunikat>


    Examples:

      | jezyk  | komunikat         |
      | "pl"   | "Witaj świecie"    |
      | "en"   | "Hello world"     |
      | "cs"   | "cos"             |
      | ""     | "Język nieznany"  |
      | "sada" | "Język nieznany" |

