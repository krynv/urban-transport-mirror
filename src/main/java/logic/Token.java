package logic;

public class Token {

    private int id;
    private int type;
    private String accountId;

    public Token(int id, int type, String accountId) {
        this.id = id;
        this.type = type;
        this.accountId = accountId;
    }

    public int getId() {
        return id;
    }

    public String getAccountId() {
        return accountId;
    }
}
