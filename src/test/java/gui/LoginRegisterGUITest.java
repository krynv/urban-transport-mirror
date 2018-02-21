package gui;

import logic.employee.Employee;
import logic.employee.EmployeeRegistry;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mindrot.jbcrypt.BCrypt;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginRegisterGUITest {

    private EmployeeRegistry employeeRegistry;
    private Employee user;

    @Test
    public void aRegisterUserTest()  throws IOException, ParseException {

        employeeRegistry = new EmployeeRegistry();
        System.out.println("REGISTER USER TEST-------");
        System.out.println("Adding User - testing");

        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        //JSON object and values

        jsonObject.put("username", "testing");
        jsonObject.put("firstName", "EmployeeGUI");
        jsonObject.put("lastName", "ing");
        jsonObject.put("admin", true);
        String hashedPass = BCrypt.hashpw("password", BCrypt.gensalt(12));
        jsonObject.put("password", hashedPass);
        jsonArray.add(jsonObject);

        employeeRegistry.addEmployee(jsonArray);

        System.out.println("Checking its add the User - testing");
        this.user = employeeRegistry.getEmployee("testing");
        if(user != null) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }

    }
    @Test
    public void bLoginUserTest()  throws IOException, ParseException {

        employeeRegistry = new EmployeeRegistry();
        System.out.println("CHECK USER LOGIN TEST-------");

        System.out.println("Getting User details - testing");

        this.user = employeeRegistry.getEmployee("testing");
        if(user != null) {
            Boolean passwordMatch = user.passwordMatch("password");
            System.out.println("Got User now testing password - testing");
            if (passwordMatch) {
                assertTrue(true);
            } else {
                assertTrue(false);
            }
        } else {
            assertTrue(false);
        }
    }

    @Test
    public void cDeleteUserTest()  throws IOException, ParseException {

        System.out.println("DELETE USER TEST-------");
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("./src/main/resources/users.json"));
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
            FileWriter fileWriter = new FileWriter("./src/main/resources/users.json");
            fileWriter.write(jsonArray.toJSONString());
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        employeeRegistry = new EmployeeRegistry();

        System.out.println("Looking for user to check its been deleted - testing");
        this.user = employeeRegistry.getEmployee("testing");
        if(user != null) {
            assertTrue(false);
        } else {
            assertTrue(true);
        }
    }


}
