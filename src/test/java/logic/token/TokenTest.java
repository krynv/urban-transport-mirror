package logic.token;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TokenTest {
    private Token token;
    @Test
    public void addToken() {
        this.token = new Token("1", "123");
        if (this.token != null) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @Test
    public void checkID() {
        this.token = new Token("1", "123");
        if (this.token.getId().equals("1")) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    @Test
    public void checkAccountID() {
        this.token = new Token("1", "123");
        if (this.token.getAccountId().equals("123")) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
}
