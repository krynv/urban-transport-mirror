package logic.token;

public class PhysicalToken extends Token {
    public PhysicalToken(String id, String accountId) {
        super(id, accountId);
    }

    public String produceToken() {
        // This would be hardware i believe
        return "token";
    }
}
