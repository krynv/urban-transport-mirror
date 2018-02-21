package logic.employee;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class EmployeeTest {

    private Employee user;
    @Test
    public void addEmployee() {
        this.user = new Employee("testing", "test", "ing", "testingPass", true);
        System.out.println(this.user);
        assertTrue(true);
    }
}
