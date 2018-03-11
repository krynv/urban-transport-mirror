package logic.account;

import logic.employee.Employee;
import logic.employee.EmployeeRegistry;
import logic.report.Report;
import logic.report.ReportRegistry;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.time.LocalDateTime;

public class AccountManager {

    private String username;
    private String password;
    private Employee activeUser;
    private int counter;
    private EmployeeRegistry employeeRegistry;
    private ReportRegistry reportRegistry;

    public AccountManager() throws IOException, ParseException {
        employeeRegistry = new EmployeeRegistry();
        reportRegistry = new ReportRegistry();
        counter = 0;
    }

    /**
     * Takes username and password to find an Employee instance
     * Matches the passwords
     * Sets the active user of the system from the Employee instance
     *
     * @param username entered username from UI
     * @param password entered password from UI
     * @return true if match found, else false
     * @throws IOException
     * @throws ParseException
     */
    public boolean login(String username, String password) throws IOException, ParseException {
        this.username = username;
        this.password = password;

        Employee employee = employeeRegistry.getEmployee(username);

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

    /**
     * Check to see if active user is an admin
     * Find a report based on parameters
     *
     * @param name report name
     * @param startDateTime start date for report
     * @param endDateTime end data for report
     * @return an instance of the Report
     */
    public Report viewReport(String name, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        if (activeUser.isAdmin()) {
            Report report = reportRegistry.getReport(name, startDateTime, endDateTime);
            return report;
        }

        return null;
    }

    public void setActiveUser(String username) {
        activeUser = employeeRegistry.getEmployee(username);
    }

    private void setActiveUser(Employee employee) {
        activeUser = employee;
    }

    public void logout() {
        activeUser = null;
    }

}
