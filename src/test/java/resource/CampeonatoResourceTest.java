package resource;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import dto.CampeonatoDTO;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CampeonatoResourceTest {

    @Test
    public void criarCampeonatoTest() {
        CampeonatoDTO campeonatoDTO = new CampeonatoDTO("nome", "tipo", "data");

        given()
                .contentType("application/json")
                .body(campeonatoDTO)
                .when()
                .post("/campeonato/criar")
                .then()
                .statusCode(201);
    }

}
