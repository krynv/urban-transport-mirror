import org.json.simple.parser.ParseException;

import java.io.IOException;

public class AccountManager {
    private String username;
    private String password;
    private Employee activeUser;
    private Employee setActiveUser;
    private int counter;
    private EmployeeRegistery employeeRegistery;

    public AccountManager() throws IOException, ParseException {
        employeeRegistery = new EmployeeRegistery();
        counter = 0;
    }

    public boolean login(String username, String password) throws IOException, ParseException {
        this.username = username;
        this.password = password;
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
