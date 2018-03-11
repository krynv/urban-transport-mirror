package logic.purchase;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PurchaseTest {

    private Purchase purchase;

   @Test
    public void addPurchase() {
        this.purchase = new Purchase();

        if (this.purchase != null) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @Test
    public void checkMakePayment() {
        this.purchase = new Purchase();

        if (this.purchase.makePurchase( "name", 123, 123, 123, 12)) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @Test
    public void checkMakePayment2() {
        this.purchase = new Purchase();

        if (this.purchase.makePurchase(12.00)) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
}
