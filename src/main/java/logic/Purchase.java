package logic;

public class Purchase {

    private Account consumerAccount;
    private boolean paymentResult;

    public Purchase() {

    }

    public boolean makePurchase(double amount) {
        return true;
    }

    public boolean makePurchase(String name, int accountNo, int sortCode, int securityNo, double amount) {
        // take payment - bankaccountinterface
        // return payment result in take payment
        // take return purchase to gui true or false
        return true;
    }
}
