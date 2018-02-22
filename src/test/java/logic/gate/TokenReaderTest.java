package logic.gate;

import logic.location.Location;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TokenReaderTest {

    private TokenReader token;
    @Test
    public void checkToken() {
        this.token = new TokenReader("1", new Location("1"));
        if(this.token != null) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }

    @Test
    public void checkSetToken() {
        this.token = new TokenReader("1", new Location("1"));
        this.token.setTokenId("2");
        if(this.token.getTokenId().equals("2")) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }


}
