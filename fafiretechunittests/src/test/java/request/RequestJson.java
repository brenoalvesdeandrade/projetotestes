package request;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class RequestJson {

    public static ValidatableResponse createUser() {

        ReadJson readJsonRequest = new ReadJson();

       return given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .when()
                .request()
                    .body( readJsonRequest.readJson("jsonRequest.json"))
                    .post("/api/users")
                .then()
                    .log().all();

    }

}
