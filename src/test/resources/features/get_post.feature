Feature: Get post by ID

  Scenario: Get post with ID 1
    Given the API endpoint is "https://jsonplaceholder.typicode.com/posts/1"
    When I send a GET request
    Then the response status code should be 200
    And the response should contain "userId"


  Scenario: Get post with ID 2
    Given the API endpoint is "https://jsonplaceholder.typicode.com/posts/1"
    When I send a GET request
    Then the response status code should be 200
    And the response should contain "userId"
