import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class EmployeeRegistery {

    private List<Employee> employees = new ArrayList<Employee>();

    public EmployeeRegistery() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("src\\main\\java\\users.json"));
        JSONArray jsonArray = (JSONArray) obj;
        for(int i = 0; i < jsonArray.size(); i++) {
            String userName = (String) ((JSONObject) jsonArray.get(i)).get("username");
            String firstName = (String) ((JSONObject) jsonArray.get(i)).get("firstName");
            String lastName = (String) ((JSONObject) jsonArray.get(i)).get("lastName");
            String password = (String) ((JSONObject) jsonArray.get(i)).get("password");
            Boolean admin = (Boolean) ((JSONObject) jsonArray.get(i)).get("admin");
             employees.add(new Employee(userName, firstName, lastName, password, admin));
        }
    }

    public Employee getEmployee(String userName) {
        for (Employee employee : employees) {
            if (employee.getUserName().equals(userName)) {
                return employee;
            }
        }
        return null;
    }
}