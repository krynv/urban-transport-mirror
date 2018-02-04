import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.time.LocalDateTime;

public class AccountManager {
    private String username;
    private String password;
    private Employee activeUser;
    private int counter;
    private EmployeeRegistery employeeRegistery;
    private ReportRegistery reportRegistery;

    public AccountManager() throws IOException, ParseException {
        employeeRegistery = new EmployeeRegistery();
        reportRegistery = new ReportRegistery();

        counter = 0;
    }

    public boolean login(String username, String password) throws IOException, ParseException {
        this.username = username;
        this.password = password;
        Employee employee = employeeRegistery.getEmployee(username);

        if (employee != null) {
            Boolean passwordMatch = employee.passwordMatch(password);

            if (passwordMatch) {
                setActiveUser(employee);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Report viewReport(String name, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        if (activeUser.isAdmin()) {
            Report report = reportRegistery.getReport(name, startDateTime, endDateTime);


            return report;
        }

        return null;
    }

    public void setActiveUser(String username) { activeUser = employeeRegistery.getEmployee(username); }

    private void setActiveUser(Employee employee) {
        activeUser = employee;
    }
}
