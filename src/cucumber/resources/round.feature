Feature: A round of rock-paper-scissors

  Scenario Outline: Round outcomes
    Given I throw a <my throw>
    And my opponent throws a <opponent throw>
    Then the result of the round is a <outcome>
    Examples:
      | my throw | opponent throw | outcome |
      | Rock     | Scissors       | Victory |
      | Rock     | Paper          | Defeat  |
      | Rock     | Rock           | Tie     |
      | Scissors | Paper          | Victory |
      | Scissors | Rock           | Defeat  |
      | Scissors | Scissors       | Tie     |
      | Paper    | Rock           | Victory |
      | Paper    | Scissors       | Defeat  |
      | Paper    | Paper          | Tie     |