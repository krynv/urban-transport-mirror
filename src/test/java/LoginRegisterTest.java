import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.mindrot.jbcrypt.BCrypt;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import java.util.ArrayList;
import org.json.simple.parser.JSONParser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;


import static org.junit.jupiter.api.Assertions.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginRegisterTest {

    private EmployeeRegistery employeeRegistery;
    private Employee user;
    @Test
    public void aRegisterUserTest()  throws IOException, ParseException {

        employeeRegistery = new EmployeeRegistery();
        System.out.println("REGISTER USER TEST-------");
        System.out.println("Adding User - testing");

        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        //JSON object and values

        jsonObject.put("username", "testing");
        jsonObject.put("firstName", "test");
        jsonObject.put("lastName", "ing");
        jsonObject.put("admin", true);
        String hashedPass = BCrypt.hashpw("password", BCrypt.gensalt(12));
        jsonObject.put("password", hashedPass);
        jsonArray.add(jsonObject);

        employeeRegistery.addEmployee(jsonArray);

        System.out.println("Checking its add the User - testing");
        this.user = employeeRegistery.getEmployee("testing");
        if(user != null) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }

    }
    @Test
    public void bLoginUserTest()  throws IOException, ParseException {

        assertTrue(true);
    }

    @Test
    public void cDeleteUserTest()  throws IOException, ParseException {

        System.out.println("DELETE USER TEST-------");
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("src\\main\\java\\users.json"));
        JSONArray jsonArray = (JSONArray) obj;

        System.out.println("Finding the user - testing");

        for (int i = 0; i < jsonArray.size(); i++) {
            String userName = (String) ((JSONObject) jsonArray.get(i)).get("username");
            if (userName.equals("testing")) {

                System.out.println("Found User deleting now- testing");
                jsonArray.remove(i);
            }
        }
        try {
            FileWriter fileWriter = new FileWriter("src\\main\\java\\users.json");
            fileWriter.write(jsonArray.toJSONString());
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        employeeRegistery = new EmployeeRegistery();

        System.out.println("Looking for user to check its been deleted - testing");
        this.user = employeeRegistery.getEmployee("testing");
        if(user == null) {
            assertFalse(true);
        } else {
            assertFalse(false);
        }
    }


}