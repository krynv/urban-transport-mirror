package logic.token;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class PhysicalTokenTest {
    @Test
    public void checkProduceToken() {
        PhysicalToken token = new PhysicalToken("1", "1");
        if(token.produceToken().equals("token")) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
}
