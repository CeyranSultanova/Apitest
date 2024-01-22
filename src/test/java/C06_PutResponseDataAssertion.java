import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C06_PutResponseDataAssertion {
    @Test
    public void test06(){

       // endpoint and body
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        JSONObject RequestBody= new JSONObject();
        RequestBody.put("title","Ceyhun");
        RequestBody.put("body","test");
        RequestBody.put("userId",1);
        RequestBody.put("id",10);
       // 2 expected body yarat
       // 3 request gonder ,responsu g[ster
        Response response =given().
                contentType(ContentType.JSON)
                .when().
                body(RequestBody.toString())
                .put(url);
        response.prettyPrint();

        //assertion
        response
                .then()
                .assertThat().statusCode(200).contentType("application/json; charset=utf-8").header("Server","cloudflare");

    }
}
