import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C02_GetResponse {
     @Test
    public void test02(){
         /*
         //request body and end point
        // expected data hazirla
        //Send request and get response save
        //Assertion
          */
         String url="https://restful-booker.herokuapp.com/booking/10";
         Response response=given().when().get(url);
         System.out.println("\n Get StatusCode:" + response.getStatusCode());
         System.out.println("\n Get ContentType:"+response.getContentType() +"\n Get Header:"+
                 response.getHeader("Server")+
                 "\n Get StatusLine:"+ response.getStatusLine());
     }
}
