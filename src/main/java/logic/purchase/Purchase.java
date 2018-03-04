package logic.purchase;

import logic.account.Account;
import logic.bank.BankAccountInterface;

public class Purchase {

    private Account consumerAccount;
    private boolean paymentResult;
    private BankAccountInterface bankAccountInterface;

    public Purchase() {}

    public boolean makePurchase(double amount) {
        return true;
    }

    public boolean makePurchase(String name, int accountNo, int sortCode, int securityNo, double amount) {
        bankAccountInterface = new BankAccountInterface();
        return bankAccountInterface.takePayment(name, accountNo, sortCode, securityNo, amount);
    }
}
