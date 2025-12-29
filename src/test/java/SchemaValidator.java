

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

    //I am writing a comment line in line 50 as an admin user.

    //I am adding this line to create a scenario



//Some unknown code is getting added
//this is to learn git fetch

//This is to learn git rebase


//Rebase scenario is important


//Learning to going back in commits

//Adding another commit
//Trying to add something
//Adding a feature called first feature
//Adding second feature in line 70

