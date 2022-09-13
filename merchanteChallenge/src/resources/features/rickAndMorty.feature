Feature: Verify API
  Este feature permite validar la api de r&m

  @r&m
  Scenario Outline: check characters info
    When check character status code "<id>" "<status>"
    Then check character name "<id>" "<name>"

    Examples:
      | id    | status | name                    |
      | 559   | 200    | Gramuflackian Anchorman |
      | 476   | 200    | Flower Morty            |
      | 819   | 200    | Redhead Rick            |
      | 50    | 200    | Blim Blam               |
