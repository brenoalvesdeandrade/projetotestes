package acceptance;

import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;

public class BaseUrl {

    @BeforeAll
    public static void setup() {
        baseURI = "https://reqres.in";
    }
}

