package pageObjects;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


public class BasePage {
    public static void checkStatus(String url, String id, String status){
        given().
                when().
                pathParam("id",id).
                get(url+"{id}").
                then().
                assertThat().
                log().ifValidationFails().
                statusCode(Integer.parseInt(status));
    }

    public static  void checkName(String url, String id, String name){
        given().
                when().
                pathParam("id",id).
                get(url+"{id}").
                then().
                body("name",equalTo(name)).
                log().body();
    }
}
