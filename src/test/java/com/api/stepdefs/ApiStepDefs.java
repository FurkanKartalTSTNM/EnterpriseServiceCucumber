package com.api.stepdefs;

import cucumber.api.java.en.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiStepDefs {

    private String endpoint;
    private Response response;

    @Given("the API endpoint is {string}")
    public void the_api_endpoint_is(String url) {
        this.endpoint = url;
    }

    @When("I send a GET request")
    public void i_send_a_get_request() {
        response = given().when().get(endpoint);
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer statusCode) {
        response.then().statusCode(statusCode);
    }

    @Then("the response should contain {string}")
    public void the_response_should_contain(String keyword) {
        response.then().body(containsString(keyword));
    }
}
