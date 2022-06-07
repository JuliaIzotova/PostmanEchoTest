package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    void shouldSentRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("приветики на тесте")
                .when()
                .post("/post")
                .then()
                .statusCode(401)
                .body("data", equalTo("приветики на тесте"))
        ;
    }
}
