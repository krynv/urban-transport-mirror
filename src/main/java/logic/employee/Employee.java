package logic.employee;

import org.mindrot.jbcrypt.BCrypt;

public class Employee {

    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private Boolean admin;

    private int auth;

    public Employee(String userName, String firstName, String lastName, String password, Boolean admin) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.admin = admin;
        this.auth = 0;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public Boolean isAdmin() {
        return admin;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username:'" + userName + '\'' +
                ",firstName:'" + firstName + '\'' +
                ",lastName:'" + lastName + '\'' +
                ",password:'" + password + '\'' +
                ",admin:'" + admin + '\'' +
                '}';
    }

    public boolean passwordMatch(String password) {
        if (this.addAuthenticationAttempt()) {
            if (BCrypt.checkpw(password, this.getPassword())) {
                this.resetAuthentication();
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private void resetAuthentication() {
        this.auth = 0;
    }

    private boolean addAuthenticationAttempt() {
        this.auth += 1;

        if (auth > 3) {
            return false;
        } else {
            return true;
        }
    }

}