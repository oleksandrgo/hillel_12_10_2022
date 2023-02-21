package ua.ithillel.automation.api;

import io.restassured.RestAssured;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * <img src="https://yt3.ggpht.com/sfPp150iI6VC5f4laY-osycP6qgKlT0YDXy47aTwG6HQncqecE36Lt7MG4o9h6L3S93tLcUb_6c=s900-c-k-c0x00ffffff-no-rj"
 * alt="" width="150" height="150">
 * <h1>API test</h1>
 * <p style="font-size:12px">Цей клас дає наглядний приклад що як виглядають API тести.
 * Так все вірно API тести можуть бути не тільки в POSTMAN</p>
 */
public class SimpleApiTest {

    @Test
    public void createUser() {
        RestAssured.baseURI = "https://qauto.forstudy.space/api/";

        given().log().all().header("content-type", "application/json")
                .body("{\n" +
                        "  \"name\": \"John\",\n" +
                        "  \"lastName\": \"Dou\",\n" +
                        "  \"email\": \" " + Data.randomEmail() + "\",\n" +
                        "  \"password\": \"Qwerty12345\",\n" +
                        "  \"repeatPassword\": \"Qwerty12345\"\n" +
                        "}").
                when().post("auth/signup").
                then().log().all().assertThat().statusCode(201);
    }
}
