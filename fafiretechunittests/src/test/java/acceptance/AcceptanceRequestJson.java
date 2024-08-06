package acceptance;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import request.ReadJson;

import static org.hamcrest.Matchers.notNullValue;
import static request.RequestJson.*;
public class AcceptanceRequestJson extends BaseUrl {

    private ValidatableResponse response;

    @Test
    public void validateRequestWithStatusCode201AndResponseAttributes() {

        response = createUser();
        response.statusCode(HttpStatus.SC_CREATED);
        response.body(notNullValue());
        response.body("name", Matchers.is("Breno"))
                .body("job", Matchers.is("analista"))
                .body("id", Matchers.notNullValue())
                .body("createdAt", Matchers.notNullValue());

    }

    @Test
    public void validateRequestWithStatusCode201AndResponseAttributesAndValidateSchemaOk() {

        ReadJson readJsonSchema = new ReadJson();
        readJsonSchema.readJson("jsonRequest.json");

        response = createUser();
        response.statusCode(HttpStatus.SC_CREATED);
        response.body(notNullValue());
        response.body("name", Matchers.is("Breno"))
                .body("job", Matchers.is("analista"))
                .body("id", Matchers.notNullValue())
                .body("createdAt", Matchers.notNullValue())
                .body(JsonSchemaValidator.matchesJsonSchema(readJsonSchema.readJson("schemateste.json"))).log().all();
    }
}
