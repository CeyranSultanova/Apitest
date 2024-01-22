import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C1_GetRequest_ResponseBody {
    @Test
    public void get1(){
        //request body and end point
        // expected data hazirla
        //Send request and get response save
        //Assertion
        String url="https://restful-booker.herokuapp.com/booking/10";
        Response response =given().when().get(url);
        response.prettyPrint();
    }
}
