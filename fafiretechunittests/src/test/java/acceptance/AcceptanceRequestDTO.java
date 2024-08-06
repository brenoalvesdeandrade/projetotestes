package acceptance;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import request.RequestDTO;


import static io.restassured.RestAssured.given;

public class AcceptanceRequestDTO extends BaseUrl{

RequestDTO user = new RequestDTO();

@Test
public void insertNewUserReturnStatusCode200(){


    given()
            .log().all()
            .contentType(ContentType.JSON)
            .body(user.insertUser())
            .when()
                .post("/api/users")
            .then()
                .log().all()
                .statusCode(201)
                .body("name", Matchers.is("Breno"))
                .body("job", Matchers.is("Analista"))
                .body("id", Matchers.notNullValue())
                .body("createdAt", Matchers.notNullValue())

    ;
}

}
