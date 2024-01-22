import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C03_Get_ResponseWithAutomation {
    @Test
    public void test(){
        //1 end point & body
        String  url="https://restful-booker.herokuapp.com/booking/10";
        //2 Expected result
        //3 request ,response save
        Response response=given().when().get(url);
        //Assertion
        response.then().assertThat().statusCode(200)
                .contentType("application/json;charset=utf-8").
                header("Server","Cowboy").statusLine("HTTP/1.1 200 OK");
    }
}
