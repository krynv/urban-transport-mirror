package logic.bank;

public class BankAccountInterface {

    private int sortCode;
    private int accountNo;
    private int securityNo;
    private String name;


    public BankAccountInterface() {
    }

    public  boolean takePayment(String name, int accntNo, int sortCode,int secNo,double amount) {
        return true;
    }
}
