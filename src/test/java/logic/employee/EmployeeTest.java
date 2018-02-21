package logic.employee;

        import org.junit.Test;
        import org.junit.jupiter.api.Assertions;

        import static junit.framework.TestCase.assertTrue;

public class EmployeeTest {

    private Employee user;

    @Test
    public void addEmployee() {
        this.user = new Employee("testing", "test", "ing", "testingPass", true);
        System.out.println(this.user);
        if (this.user != null) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }

    @Test
    public void checkPass() {
        this.user = new Employee("testing", "test", "ing", "testingPass", true);
        if(this.user.getPassword() == "testingPass" ) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }

    @Test
    public void checkAdmin() {
        this.user = new Employee("testing", "test", "ing", "testingPass", true);
            assertTrue(this.user.isAdmin());
    }

    @Test
    public void checkLastName() {
        this.user = new Employee("testing", "test", "ing", "testingPass", true);
        if(this.user.getLastName() == "ing" ) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @Test
    public void checkFirstName() {
        this.user = new Employee("testing", "test", "ing", "testingPass", true);
        if(this.user.getFirstName() == "test" ) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @Test
    public void checkUserName() {
        this.user = new Employee("testing", "test", "ing", "testingPass", true);
        if(this.user.getUserName() == "testing" ) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }


}
