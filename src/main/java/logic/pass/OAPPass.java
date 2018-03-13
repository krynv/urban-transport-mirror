package logic.pass;

import java.time.LocalDateTime;

public class OAPPass extends Pass {

    public OAPPass(Boolean valid, LocalDateTime dateTimeExpires, double modifier, String name) {
        super(valid, dateTimeExpires, modifier, name);
    }
}
