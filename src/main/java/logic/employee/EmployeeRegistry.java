package logic.employee;

import logic.employee.Employee;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRegistry {

    private List<Employee> employees = new ArrayList<Employee>();

    public EmployeeRegistry() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("./src/main/resources/users.json"));
        JSONArray jsonArray = (JSONArray) obj;
        for (int i = 0; i < jsonArray.size(); i++) {
            String userName = (String) ((JSONObject) jsonArray.get(i)).get("username");
            String firstName = (String) ((JSONObject) jsonArray.get(i)).get("firstName");
            String lastName = (String) ((JSONObject) jsonArray.get(i)).get("lastName");
            String password = (String) ((JSONObject) jsonArray.get(i)).get("password");
            Boolean admin = (Boolean) ((JSONObject) jsonArray.get(i)).get("admin");
            employees.add(new Employee(userName, firstName, lastName, password, admin));
        }
    }

    /**
     * Checks the employee exists based on the name of the user
     *
     * @param userName the username which is inputed by the user
     * @return the employee if it exists
     */
    public Employee getEmployee(String userName) {
        for (Employee employee : employees) {
            if (employee.getUserName().equals(userName)) {
                return employee;
            }
        }
        return null;
    }

    /**
     * Adds a user to the file so they can now log into the system.
     *
     * @param user the inputted values that the user has inputted in the UI
     *
     * @throws IOException if the file isn't read or written to then throw the exception
     * @throws ParseException if the parse fails then throw the exception
     */
    public void addEmployee(JSONArray user) throws IOException, ParseException {
        // writing the JSONObject into a file(info.json)
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("./src/main/resources/users.json"));
        JSONArray jsonArray = (JSONArray) obj;
        String userName = (String) ((JSONObject) user.get(0)).get("username");
        String firstName = (String) ((JSONObject) user.get(0)).get("firstName");
        String lastName = (String) ((JSONObject) user.get(0)).get("lastName");
        String password = (String) ((JSONObject) user.get(0)).get("password");
        Boolean admin = (Boolean) ((JSONObject) user.get(0)).get("admin");
        jsonArray.add(user.get(0));


        employees.add(new Employee(userName, firstName, lastName, password, admin));
        try {
            FileWriter fileWriter = new FileWriter("./src/main/resources/users.json");
            fileWriter.write(jsonArray.toJSONString());
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}