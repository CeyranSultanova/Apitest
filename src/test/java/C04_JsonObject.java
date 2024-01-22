import org.json.JSONObject;
import org.junit.Test;

public class C04_JsonObject {
    @Test
 public  void test04 (){
        JSONObject object= new JSONObject();
        object.put( "title","Ali");
        object.put("body" ,"test");
        object.put("userId",1);
    }
}
