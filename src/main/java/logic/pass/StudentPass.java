package logic.pass;

import java.time.LocalDateTime;

public class StudentPass extends Pass {

    public StudentPass(Boolean valid, LocalDateTime dateTimeExpires, double modifier, String name) {
        super(valid, dateTimeExpires, modifier, name);
    }
}
