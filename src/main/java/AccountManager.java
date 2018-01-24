import org.json.simple.parser.ParseException;

import java.io.IOException;

public class AccountManager {
    private String username;
    private String password;
    private Employee activeUser;
    private Employee setActiveUser;
    private EmployeeRegistery employeeRegistery;

    public AccountManager() {

    }

    public boolean login(String username, String password) throws IOException, ParseException {
        this.username = username;
        this.password = password;
        employeeRegistery = new EmployeeRegistery();
        this.activeUser = employeeRegistery.getEmployee(username);
        if (activeUser != null) {
            Boolean passwordMatch = activeUser.passwordMatch(password);
            if (passwordMatch) {
                this.setActiveUser = activeUser;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


}
