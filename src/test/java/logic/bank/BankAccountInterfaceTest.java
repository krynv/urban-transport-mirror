package logic.bank;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class BankAccountInterfaceTest {

    private BankAccountInterface bank;
    @Test
    public void checkLastName() {
        this.bank = new BankAccountInterface();
        if(this.bank.takePayment( "name", 123, 123, 123, 12) ) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
}
