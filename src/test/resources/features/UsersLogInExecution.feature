@PROF-241
Feature: Execution of log in Functionality


  @PROF-237 @PROF-240
  Scenario Outline: Librarian log in with valid credentials
    When the user enter valid credentials "<Email>" "<Password>"
    Then the user can log in
    Examples:
      | Email               | Password |
      | librarian26@library | gFOHHm6H |
      | librarian27@library | ZM9JMdIK |
      | librarian28@library | wVFVnaCO |
      | librarian29@library | PZ7IQ8G5 |
      | librarian30@library | e3BxcFKE |
      | librarian31@library | pogXBhac |
      | librarian32@library | sRALQfSE |
      | librarian33@library | df6NfMib |
      | librarian34@library | AN4rrS52 |
      | librarian35@library | qMgZFGfc |


  @PROF-236 @PROF-240
  Scenario Outline: Students log in with valid credentials
    When the user enter valid credentials "<Email>" "<Password>"
    Then the user can log in
    Examples:
      | Email             | Password |
      | student46@library | pOM6YL0B |
      | student47@library | 3lUpdof3 |
      | student48@library | b0zgv1ab |
      | student49@library | npSk3tsr |
      | student50@library | so9lCgZf |
      | student51@library | wFe76AL0 |
      | student52@library | eiJolZ4e |
      | student53@library | BzMxHu3s |
      | student54@library | PTXgKAAR |
      | student55@library | Bn9rNDOI |


  @PROF-238 @PROF-240
  Scenario Outline: Librarian log in with invalid credentials
    When the user cannot enter invalid credentials "<Email>" "<Password>"
    Then the user cannot log in
    Examples:
      | Email               | Password |
      | librarian26@library |          |
      |                     | ZM9JMdIK |
      | librarian28@library | pogXBhac |
      | librarian29@library | qMgZFGfc |
      | librarian30@library | PZ7IQ8G5 |


  @PROF-239 @PROF-240
  Scenario Outline: Students log in with invalid credentials
    When the user enter invalid credentials "<InvalidEmail>" "<InvalidPassword>"
    Then the user cannot log in

    Examples:
      | InvalidEmail      | InvalidPassword |
      | student46@library | Bs1452C         |
      |                   | 3lUpdof3        |
      | student4          | b0zgv1ab        |
      | @library          | npSk3tsr        |
      |                   |                 |

