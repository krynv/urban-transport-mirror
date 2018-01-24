import javax.print.DocFlavor;

public class Employee {

    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private Boolean admin;

    public Employee(String userName, String firstName, String lastName, String password, Boolean admin) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.admin = admin;
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

    public Boolean getAdmin() {
        return admin;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}