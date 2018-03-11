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

    /**
     *
     * @return the username of the user
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @return the firstname of the user
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return the lastname of the user
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return the password of the user
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return true or false of the admin
     */
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

    /**
     * Checks that the users inputted password matches the encrypted password
     * If it has reset the authentication
     *
     * @param password the password which is inputted by the user
     * @return true if the users inputed password matches else false
     */
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

    /**
     * Resets the authentication if user logs in
     */
    private void resetAuthentication() {
        this.auth = 0;
    }

    /**
     * adds 1 everytime the user enters the wrong password
     * @return true or false depending on how many times the user has tried to log in
     */
    private boolean addAuthenticationAttempt() {
        this.auth += 1;

        if (auth > 3) {
            return false;
        } else {
            return true;
        }
    }

}