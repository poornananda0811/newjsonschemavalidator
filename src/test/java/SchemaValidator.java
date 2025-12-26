

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SchemaValidator {
// this is my comment line
        @Test
        public void validateUserSchema() {
            RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

            given()
                    .when()
                    .get("/users/1")
                    .then()
                    .statusCode(200)
                    .body(matchesJsonSchemaInClasspath("myrequiredschema.json"));
        }
//This is my new comment line.Updating my comment line
        @Test
        public void validateIncorrectSchema() {
            RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

            assertThrows(
                    AssertionError.class,
                    () ->
            given()
                    .when()
                    .get("/users/1")
                    .then()
                    .statusCode(200)
                    .body(matchesJsonSchemaInClasspath("myrequiredschema.json")));
        }
    @Test
    public void validateUserSchema1() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
                .when()
                .get("/users/1")
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("myrequiredschema.json"));
    }
    }

//I am writing a comment line in line 50 as a collab user.