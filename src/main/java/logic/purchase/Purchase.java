package logic.purchase;

import logic.account.Account;
import logic.bank.BankAccountInterface;

public class Purchase {

    private Account consumerAccount;
    private boolean paymentResult;
    private BankAccountInterface bankAccountInterface;

    public Purchase() {}


    /**
     * Creates bank account interface
     * takePayment from the bank account with the parameters
     *
     * @param name the name of the person of the account
     * @param accountNo the accounts number of the persons bank account
     * @param sortCode the sort code of the persons bank account
     * @param securityNo the security number of the persons bank account
     * @param amount the amount of the cost of the ticket
     * @return true or false depending if the bank account has paid for the ticket
     */
    public boolean makePurchase(String name, int accountNo, int sortCode, int securityNo, double amount) {
        bankAccountInterface = new BankAccountInterface();
        return bankAccountInterface.takePayment(name, accountNo, sortCode, securityNo, amount);
    }

    /**
     *
     * @param amount the amount of the cost of the ticket
     * @return true
     */
    public boolean makePurchase(double amount) {
        return true;
    }
}
