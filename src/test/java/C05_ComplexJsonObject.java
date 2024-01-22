import org.json.JSONObject;
import org.junit.Test;

import java.sql.SQLOutput;

public class C05_ComplexJsonObject {
    @Test
    public  void test05(){
       //inner object
        JSONObject bookingdates =new JSONObject();
        bookingdates.put("checkin","2018-01-01");
        bookingdates.put("checkout","2019-01-01");


        //outer object
        JSONObject requestBody=new JSONObject();
        requestBody.put("firstname","Ahmed");
        requestBody.put("additionalneeds","Breakfast");
        requestBody.put("bookingdates",bookingdates);  //inner json istifade edildi
        requestBody.put("totalprice",111);
        requestBody.put("depositpaid",true);
        requestBody.put("lastname","Aliyev");
        System.out.println(requestBody);

    }
}
