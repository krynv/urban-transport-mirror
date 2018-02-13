package logic.token;

public class Token {

    private String id;
    private String accountId;

    public Token(String id, String accountId) {
        this.id = id;
        this.accountId = accountId;
    }

    public String getId() {
        return id;
    }

    public String getAccountId() {
        return accountId;
    }

}
