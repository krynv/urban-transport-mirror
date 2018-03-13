package gui;

import java.awt.event.*;
import logic.account.Account;
import logic.account.AccountRegistry;
import logic.coupon.Coupon;
import logic.email.SendEmail;
import logic.fare.FareRegistry;
import logic.location.Location;
import logic.purchase.Purchase;
import logic.route.RouteRegistry;
import logic.token.PhysicalToken;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.LocalDateTime;

public class PayForTripGUI extends JFrame {

    private String languageButtonPressed;
    private RouteRegistry routeRegistry = new RouteRegistry();
    private Coupon coupon = new Coupon("0", LocalDateTime.of(2018, 5, 1, 12, 0));
    private String chosenTicketType = "Return ticket";
    private String accID = "";
    private double amount = 0;
    private Account account;
    private AccountRegistry accountRegistry;
    String timeStart;
    String timeReturn;

    public PayForTripGUI() {

        initComponents();

        this.setLocationRelativeTo(null);
        this.setContentPane(pnlMain);
        this.setTitle("Home");
        setAllToFalse();
        accountRegistry = new AccountRegistry();
        pnlHome.setVisible(true);
        label2.setVisible(false);
        label1.setVisible(false);
        progressBar1.setVisible(false);
        this.pack();
    }

    /* ----- Main Menu ----- */
    private void btnDestination1ActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlSelectFares.setVisible(true);

        lblStation.setText("Sheffield");
        lblStationCashPayment.setText("Sheffield");
        lblStationCardPayment.setText("Sheffield");
        lblStationlReceipt.setText("Sheffield");
        lblStationTransAcc.setText("Sheffield");

        lblDestination.setText("London");
        lblDestinationCashPayment.setText("London");
        lblDestinationConfirmBooking.setText("London");
        lblDestinationCardPayment.setText("London");
        lblDestinationlReceipt.setText("London");
        lblDestinationConfirmBookingTransAcc.setText("London");

        label2.setText("You are currently at stage: 1 of 5");
        label2.setVisible(true);
        label1.setVisible(true);
        progressBar1.setVisible(true);
        progressBar1.setValue(20);


        this.setTitle("Select Fares");
    }

    private void btnDestination2ActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlSelectFares.setVisible(true);

        lblStation.setText("Sheffield");
        lblStationCashPayment.setText("Sheffield");
        lblStationCardPayment.setText("Sheffield");
        lblStationlReceipt.setText("Sheffield");
        lblStationTransAcc.setText("Sheffield");

        lblDestination.setText("Sheffield");
        lblDestinationCashPayment.setText("Sheffield");
        lblDestinationConfirmBooking.setText("Sheffield");
        lblDestinationCardPayment.setText("Sheffield");
        lblDestinationConfirmBookingTransAcc.setText("Sheffield");
        lblDestinationlReceipt.setText("Sheffield");

        label2.setText("You are currently at stage: 1 of 5");
        label2.setVisible(true);
        label1.setVisible(true);
        progressBar1.setVisible(true);

        progressBar1.setValue(20);

        this.setTitle("Select Fares");
    }

    private void btnDestination3ActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlSelectFares.setVisible(true);

        lblStation.setText("Sheffield");
        lblStationCashPayment.setText("Sheffield");
        lblStationCardPayment.setText("Sheffield");
        lblStationlReceipt.setText("Sheffield");
        lblStationTransAcc.setText("Sheffield");

        lblDestination.setText("Derby");
        lblDestinationCashPayment.setText("Derby");
        lblDestinationConfirmBooking.setText("Derby");
        lblDestinationCardPayment.setText("Derby");
        lblDestinationlReceipt.setText("Derby");
        lblDestinationConfirmBookingTransAcc.setText("Derby");

        label2.setText("You are currently at stage: 1 of 5");
        label2.setVisible(true);
        label1.setVisible(true);
        progressBar1.setVisible(true);

        progressBar1.setValue(20);

        this.setTitle("Select Fares");
    }

    private void btnDestination4ActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlSelectFares.setVisible(true);

        lblStation.setText("Sheffield");
        lblStationCashPayment.setText("Sheffield");
        lblStationCardPayment.setText("Sheffield");
        lblStationlReceipt.setText("Sheffield");
        lblStationTransAcc.setText("Sheffield");

        lblDestination.setText("Nottingham");
        lblDestinationCashPayment.setText("Nottingham");
        lblDestinationConfirmBooking.setText("Nottingham");
        lblDestinationCardPayment.setText("Nottingham");
        lblDestinationlReceipt.setText("Nottingham");
        lblDestinationConfirmBookingTransAcc.setText("Derby");

        label2.setText("You are currently at stage: 1 of 5");
        label2.setVisible(true);
        label1.setVisible(true);
        progressBar1.setVisible(true);

        progressBar1.setValue(20);

        this.setTitle("Select Fares");
    }

    private void btnDestination5ActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlSelectFares.setVisible(true);

        lblStation.setText("Sheffield");
        lblStationCashPayment.setText("Sheffield");
        lblStationCardPayment.setText("Sheffield");
        lblStationlReceipt.setText("Sheffield");
        lblStationTransAcc.setText("Sheffield");

        lblDestination.setText("Newcastle");
        lblDestinationCashPayment.setText("Newcastle");
        lblDestinationConfirmBooking.setText("Newcastle");
        lblDestinationCardPayment.setText("Newcastle");
        lblDestinationlReceipt.setText("Newcastle");
        lblDestinationConfirmBookingTransAcc.setText("Newcastle");

        label2.setText("You are currently at stage: 1 of 5");
        label2.setVisible(true);
        label1.setVisible(true);
        progressBar1.setVisible(true);

        progressBar1.setValue(20);

        this.setTitle("Select Fares");
    }

    private void btnDestination6ActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlSelectFares.setVisible(true);
        lblStation.setText("Sheffield");
        lblStationCashPayment.setText("Sheffield");
        lblStationCardPayment.setText("Sheffield");
        lblStationlReceipt.setText("Sheffield");
        lblStationTransAcc.setText("Sheffield");

        lblDestination.setText("Leicester");
        lblDestinationCashPayment.setText("Leicester");
        lblDestinationConfirmBooking.setText("Leicester");
        lblDestinationCardPayment.setText("Leicester");
        lblDestinationlReceipt.setText("Leicester");
        lblDestinationConfirmBookingTransAcc.setText("Leicester");

        label2.setText("You are currently at stage: 1 of 5");
        label2.setVisible(true);
        label1.setVisible(true);
        progressBar1.setVisible(true);

        progressBar1.setValue(20);

        this.setTitle("Select Fares");
    }



    public void loadLanguageFile(String language) {
        //load language file
        System.out.println("Loaded the " + language + " language");
    }

    private void btnHomeActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlHome.setVisible(true);

        label2.setVisible(false);
        label1.setVisible(false);
        progressBar1.setVisible(false);

        this.setTitle("Home");
    }

    private void setAllToFalse() { // contains all of the panels set to false
        pnlTimetable.setVisible(false);
        pnlCardTicketPayment.setVisible(false);
        pnlTransportAccountPayment.setVisible(false);
        pnlSearchAccount.setVisible(false);
        pnlCashTicketPayment.setVisible(false);
        pnlConfirmBooking.setVisible(false);
        pnlSearchedFares.setVisible(false);
        pnlSelectFares.setVisible(false);
        pnlSelectLanguage.setVisible(false);
        pnlHome.setVisible(false);
        lblNotification2.setVisible(false);
        lblNotifyLang.setVisible(false);
    }

    /* ----- Select Language ----- */

    private void englishButtonActionPerformed(ActionEvent e) {
        languageButtonPressed = "English";
    }

    private void frenchButtonActionPerformed(ActionEvent e) {
        languageButtonPressed = "French";
    }

    private void germanButtonActionPerformed(ActionEvent e) {
        languageButtonPressed = "German";
    }

    private void btnLoadLanguageActionPerformed(ActionEvent e) {

        String chosenLang = cmbBoxLanguage.getSelectedItem().toString();

        loadLanguageFile(chosenLang);
        pnlSelectLanguage.setVisible(false);
        lblNotifyLang.setText("Language Change to " + chosenLang);
        lblNotifyLang.setVisible(true);
        pnlHome.setVisible(true);
        this.setTitle("Home");
    }

    /* ----- Select Fares ----- */

    private void searchActionPerformed(ActionEvent e) {

        label2.setText("You are currently at stage: 2 of 5");
        label2.setVisible(true);
        label1.setVisible(true);
        progressBar1.setVisible(true);

        progressBar1.setValue(40);

        LocalDateTime departureDateTime = LocalDateTime.of(2018, 2, 4, 12, 0);
        LocalDateTime arrivalDateTime = LocalDateTime.of(2018, 2, 4, 13, 0);
        routeRegistry.getRoutes(new Location("0"), new Location("1"), departureDateTime, arrivalDateTime);
        routeRegistry.setRouteInfo(dpdnReturn.getSelectedItem().toString(), dpdnDeparture.getSelectedItem().toString(), lblDestination.getText());
        FareRegistry fareRegistry = new FareRegistry();
        routeRegistry = fareRegistry.getRoutesCost(routeRegistry, departureDateTime, arrivalDateTime);

        btnFare1.setText(routeRegistry.get(0).toString());
        btnFare2.setText(routeRegistry.get(1).toString());
        btnFare3.setText(routeRegistry.get(2).toString());

        setAllToFalse();
        pnlSearchedFares.setVisible(true);
        lblReturnTimeTransAcc.setText(dpdnReturn.getSelectedItem().toString());
        lblDepartTime2.setText(dpdnDeparture.getSelectedItem().toString());
        lblDepartTime3.setText(dpdnDeparture.getSelectedItem().toString());
        lblReturnTime2.setText(dpdnReturn.getSelectedItem().toString());
        lblDepartTime.setText(dpdnDeparture.getSelectedItem().toString());
        lblReturnTime.setText(dpdnReturn.getSelectedItem().toString());
        lblReturnTime3.setText(dpdnReturn.getSelectedItem().toString());
        lblDepartTime4.setText(dpdnDeparture.getSelectedItem().toString());
        lblReturnTime4.setText(dpdnReturn.getSelectedItem().toString());
        lblDepartTime5.setText(dpdnDeparture.getSelectedItem().toString());
        timeStart = dpdnDeparture.getSelectedItem().toString();
        timeReturn = dpdnReturn.getSelectedItem().toString();
        this.setTitle("Searched Fares");
    }


    /* ----- Searched Fares ----- */

    private void btnFare1ActionPerformed(ActionEvent e) {

        label2.setText("You are currently at stage: 3 of 5");
        label2.setVisible(true);
        label1.setVisible(true);
        progressBar1.setVisible(true);

        progressBar1.setValue(60);

        lblTicketTypeConfirmBooking.setText(chosenTicketType);
        lblPrice.setText(Double.toString(routeRegistry.get(0).getCost()));
        lblPriceCashPayment.setText(Double.toString(routeRegistry.get(0).getCost()));
        lblPriceTransAccPayment.setText(Double.toString(routeRegistry.get(0).getCost()));
        lblPriceCardPayment.setText(Double.toString(routeRegistry.get(0).getCost()));
        this.amount = routeRegistry.get(0).getCost();
        setAllToFalse();
        pnlConfirmBooking.setVisible(true);
        this.setTitle("Confirm Booking");
    }

    private void btnFare2ActionPerformed(ActionEvent e) {

        label2.setText("You are currently at stage: 3 of 5");
        label2.setVisible(true);
        label1.setVisible(true);
        progressBar1.setVisible(true);

        progressBar1.setValue(60);

        lblTicketTypeConfirmBooking.setText(chosenTicketType);
        lblPrice.setText(Double.toString(routeRegistry.get(1).getCost()));
        lblPriceCashPayment.setText(Double.toString(routeRegistry.get(1).getCost()));
        lblPriceTransAccPayment.setText(Double.toString(routeRegistry.get(1).getCost()));
        lblPriceCardPayment.setText(Double.toString(routeRegistry.get(1).getCost()));
        this.amount = routeRegistry.get(1).getCost();
        setAllToFalse();
        pnlConfirmBooking.setVisible(true);
        this.setTitle("Confirm Booking");
    }

    private void btnFare3ActionPerformed(ActionEvent e) {

        label2.setText("You are currently at stage: 3 of 5");
        label2.setVisible(true);
        label1.setVisible(true);
        progressBar1.setVisible(true);

        progressBar1.setValue(60);

        lblTicketTypeConfirmBooking.setText(chosenTicketType);
        lblPrice.setText(Double.toString(routeRegistry.get(2).getCost()));
        lblPriceCashPayment.setText(Double.toString(routeRegistry.get(2).getCost()));
        lblPriceTransAccPayment.setText(Double.toString(routeRegistry.get(2).getCost()));
        lblPriceCardPayment.setText(Double.toString(routeRegistry.get(2).getCost()));
        this.amount = routeRegistry.get(2).getCost();
        setAllToFalse();
        pnlConfirmBooking.setVisible(true);
        this.setTitle("Confirm Booking");
    }

    private boolean hasPromotionalCoupon() {
        return !coupon.equals(null);
    }

    private void checkCoupon() {
        if (txtCouponCode.getText().equals("UrbanTransport")) {
            Double price = Double.parseDouble(lblPriceCardPayment.getText());
            lblPriceCashPayment.setText(Double.toString(price-(price*0.1)));
            lblPriceTransAccPayment.setText(Double.toString(price-(price*0.1)));
            lblPriceCardPayment.setText(Double.toString(price-(price*0.1)));
            coupon.getCoupon(LocalDateTime.now(), "0");
            lblCouponVerification.setText("Code Applied");
            lblCouponVerification.setOpaque(true);
            lblCouponVerification.setBackground(new Color(216, 231, 213));
        }
        else {
            lblCouponVerification.setBackground(new Color(241, 207, 205));
            lblCouponVerification.setOpaque(true);
            lblCouponVerification.setText("Coupon Code Invalid");
        }
    }

    private void btnPrintTicketActionPerformed(ActionEvent e) {
        resetAllInteractiveElements();
        setAllToFalse();
        pnlPrintReceipt.setVisible(true);
        setAllReceiptFalse();
    }

    private void ckbxOneWayActionPerformed(ActionEvent e) {
        chosenTicketType = "One way ticket";
    }

    private void ckbxReturnActionPerformed(ActionEvent e) {
        chosenTicketType = "Return ticket";
    }

    private void ckbxOpenReturnActionPerformed(ActionEvent e) {
        chosenTicketType = "Open ticket";
    }

    private void btnAdvanceActionPerformed(ActionEvent e) {

        if (ckbxCash.isSelected() && ckbxCard.isSelected() && ckbxTransAcc.isSelected()) {
            // if both are selected
            // do nothing
        }
        else if (ckbxCash.isSelected()) {
            checkCoupon();
            setAllToFalse();
            pnlCashTicketPayment.setVisible(true);
            resetAllInteractiveElements();
            this.setTitle("Pay With Cash");
            lblCouponVerification.setText("");
            lblCouponVerification.setOpaque(false);
            ckbxCash.setSelected(false);
            txtCouponCode.setText("");
            lblTicketTypeCashPayment.setText(chosenTicketType);

            label2.setText("You are currently at stage: 4 of 5");
            label2.setVisible(true);
            label1.setVisible(true);
            progressBar1.setVisible(true);

            progressBar1.setValue(80);
        }
        else if (ckbxCard.isSelected()) {
            checkCoupon();
            setAllToFalse();
            pnlCardTicketPayment.setVisible(true);
            btnPrintTicket.setVisible(false);
            lblPaymentValidate.setVisible(false);
            resetAllInteractiveElements();
            this.setTitle("Pay With Card");
            lblCouponVerification.setText("");
            lblCouponVerification.setOpaque(false);
            ckbxCard.setSelected(false);
            txtCouponCode.setText("");
            lblTicketTypeCardPayment.setText(chosenTicketType);


            label2.setText("You are currently at stage: 4 of 5");
            label2.setVisible(true);
            label1.setVisible(true);
            progressBar1.setVisible(true);

            progressBar1.setValue(80);
        }
        else if (ckbxTransAcc.isSelected()) {
            checkCoupon();
            setAllToFalse();
            btnPrintAccTic.setVisible(false);
            pnlSearchAccount.setVisible(true);
            lblTransAccNotification.setVisible(false);
            lblCouponVerification.setText("");
            lblCouponVerification.setOpaque(false);
            lblPaymentValidate.setVisible(false);
            resetAllInteractiveElements();
            this.setTitle("Pay With Travel Account");
            ckbxTransAcc.setSelected(false);
            txtCouponCode.setText("");
            txtFieldAccountID.setText("");
            lblTicketTypeTransAccPayment.setText(chosenTicketType);

            label2.setText("You are currently at stage: 4 of 5");
            label2.setVisible(true);
            label1.setVisible(true);
            progressBar1.setVisible(true);

            progressBar1.setValue(80);
        }
        else {
            // if none are selected
            //do nothing
        }
    }

    private void btnConfirmPaymentActionPerformed(ActionEvent e) {

        if (!txtSecurityCode.getText().isEmpty() && !txtCardNumber.getText().isEmpty() && !txtSortCode.getText().isEmpty() && !txtCardName.getText().isEmpty()) {
            int securityNo = Integer.parseInt(txtSecurityCode.getText());
            int accountNo = Integer.parseInt(txtCardNumber.getText());
            int sortCode = Integer.parseInt(txtSortCode.getText());
            this.amount = Double.parseDouble(lblPriceCardPayment.getText());
            String accName = txtCardName.getText();

            Purchase purchase = new Purchase();
            if (purchase.makePurchase(accName, accountNo, sortCode, securityNo, this.amount)) {
                lblPaymentInformationCardPayment.setVisible(false);
                lblTicketTypeCardPayment.setVisible(false);
                lblPriceCardPayment.setVisible(false);
                lblCardName.setVisible(false);
                lblCardNumber.setVisible(false);
                lblSecurityCode.setVisible(false);
                lblSortCode.setVisible(false);
                txtCardName.setVisible(false);
                txtCardNumber.setVisible(false);
                txtSecurityCode.setVisible(false);
                txtSortCode.setVisible(false);
                btnConfirmPayment.setVisible(false);
                btnPrintTicket.setVisible(true);
                lblPaymentValidate.setVisible(true);
                lblPaymentValidate.setBackground(new Color(216, 231, 213));
                lblPaymentValidate.setOpaque(true);
                lblPaymentValidate.setText("PAYMENT SUCCESSFUL");

                label2.setText("You are currently at stage: 5 of 5");
                label2.setVisible(true);
                label1.setVisible(true);
                progressBar1.setVisible(true);

                progressBar1.setValue(100);

            } else {
                lblPaymentValidate.setText("Transaction canceled. Card refunded");
            }
        } else {
            lblPaymentValidate.setText("Please enter your card information");
        }

    }

    public void resetAllInteractiveElements() {
        lblPaymentInformationCardPayment.setVisible(true);
        lblTicketTypeCardPayment.setVisible(true);
        lblPriceCardPayment.setVisible(true);
        lblCardName.setVisible(true);
        lblCardNumber.setVisible(true);
        lblSecurityCode.setVisible(true);
        lblSortCode.setVisible(true);
        txtCardName.setVisible(true);
        txtCardNumber.setVisible(true);
        txtSecurityCode.setVisible(true);
        txtSortCode.setVisible(true);
        btnConfirmPayment.setVisible(true);
        txtCashValue.setVisible(true);
        btnPayCash.setVisible(true);

        btnPrintTicket.setVisible(false);
        btnPrintAccTic.setVisible(false);
        btnPrintCashTic.setVisible(false);
        lblPaymentValidate.setVisible(false);

        txtSecurityCode.setText("");
        txtSortCode.setText("");
        txtCardNumber.setText("");
        txtCardName.setText("");
        txtCouponCode.setText("");
        lblPrice.setText("");

        ckbxCash.setSelected(false);
        ckbxTransAcc.setSelected(false);
        ckbxCard.setSelected(false);

        dpdnReturn.setEnabled(false);
        cmbBoxTicket.setSelectedIndex(0);

        lblCouponVerification.setText("");
        lblCouponVerification.setOpaque(false);
        lblPaymentValidate.setText("");
        lblPaymentValidate.setOpaque(false);

    }

    private void btnPayCashActionPerformed(ActionEvent e) {
        double valuePayingIn = Double.parseDouble(txtCashValue.getText());
        double valueYetToPay = Double.parseDouble(lblPriceCashPayment.getText());

        lblCashValue.setText(txtCashValue.getText());

        if (getRemainingCost(valuePayingIn, valueYetToPay) > 0) {

            lblPriceCashPayment.setText(Double.toString(getRemainingCost(valuePayingIn, valueYetToPay)));
            txtCashValue.setText("");
        } else if (getRemainingCost(valuePayingIn, valueYetToPay) <= 0) {
            lblNotification.setText("Ticket fully paid");
            if (isCashEnteredSufficient(valueYetToPay, valuePayingIn)) {
                Purchase purchase = new Purchase();
                if (purchase.makePurchase(Double.parseDouble(lblPriceCashPayment.getText()))) {
                    lblNotification.setText("Ticket fully paid");
                    txtCashValue.setText("");
                    btnPrintCashTic.setVisible(true);
                    lblPriceCashPayment.setText("0");
                    txtCashValue.setVisible(false);
                    btnPayCash.setVisible(false);
                    if (valuePayingIn > this.amount) {
                        valuePayingIn = valuePayingIn - this.amount;
                        lblNotification2.setText("Cash Amount Refunded: " + valuePayingIn);
                        lblNotification2.setVisible(true);
                    }
                } else {
                    lblNotification.setText("Transaction canceled. Cash refunded");
                }
            } else {
                lblNotification.setText("Enter more cash. Not enough cash entered");
            }
        }
        if (lblNotification.getText().equals("Ticket fully paid")) {
            // once everything has been paid for
            if (isCashEnteredSufficient(valueYetToPay, valuePayingIn)) {
                Purchase purchase = new Purchase();
                if (purchase.makePurchase(Double.parseDouble(lblPriceCashPayment.getText()))) {
                    lblNotification.setText("Ticket fully paid");
                    txtCashValue.setText("");
                    lblPriceCashPayment.setText("0");
                    btnPrintCashTic.setVisible(true);
                } else {
                    lblNotification.setText("Transaction canceled. Cash refunded");
                }
            }
        }
    }

    private boolean isCashEnteredSufficient(double tally, double cashEntered) {
        return cashEntered >= tally;
    }
    private double getRemainingCost(double valuePayingIn, double totalToPay) {
        return totalToPay-valuePayingIn;
    }

    private void btnPayTransAccActionPerformed(ActionEvent e) {

        System.out.println(lblPriceTransAccPayment.getText());
        this.amount = Double.parseDouble(lblPriceTransAccPayment.getText());
        Double accountCredit = Double.parseDouble(txtFieldCredit.getText());
        if(accountCredit >= this.amount) {
            this.accID = txtFieldAccountID.getText();
            Purchase purchase = new Purchase();
            AccountRegistry accountRegistry = new AccountRegistry();
            Account account = accountRegistry.getAccountById(this.accID);
            if (account != null) {
                String accName = account.getName();
                int accountNo = account.getAccountNum();
                int sortCode = account.getSortCode();
                int securityNo = account.getSecurityNo();

                if (purchase.makePurchase(accName, accountNo, sortCode, securityNo, this.amount)) {
                    txtFieldAccountID.setVisible(false);
                    lblTicketTypeTransAccAccountId.setVisible(false);
                    lblTicketTypeTransAccPayment.setVisible(false);
                    lblPriceTransAccPayment.setVisible(false);
                    lblTransAccPaymentInformation.setVisible(false);
                    btnPayTransAcc.setVisible(false);
                    btnPrintAccTic.setVisible(true);
                    lblTransAccNotification.setVisible(true);
                    lblTransAccNotification.setBackground(new Color(216, 231, 213));
                    lblTransAccNotification.setOpaque(true);
                    lblTransAccNotification.setText("PAYMENT SUCCESSFUL");
                    txtFieldCredit.setText(Double.toString(accountCredit - amount));
                    account.setCredits(accountCredit - amount);
                    accountRegistry.saveAccounts();
                }
            } else {
                lblTransAccNotification.setVisible(true);
                lblTransAccNotification.setBackground(Color.red);
                lblTransAccNotification.setOpaque(true);
                lblTransAccNotification.setText("NO ACCOUNT FOUND");
            }
        } else {
            lblTransAccNotification.setVisible(true);
            lblTransAccNotification.setBackground(Color.red);
            lblTransAccNotification.setOpaque(true);
            lblTransAccNotification.setText("Account doesn't have enough credit");
        }

    }

    private void btnPrintCashTicActionPerformed(ActionEvent e) {

        label2.setText("You are currently at stage: 5 of 5");
        label2.setVisible(true);
        label1.setVisible(true);
        progressBar1.setVisible(true);

        progressBar1.setValue(100);

        resetAllInteractiveElements();
        setAllToFalse();
        pnlPrintReceipt.setVisible(true);
        setAllReceiptFalse();
    }

    private void btnPrintAccTicActionPerformed(ActionEvent e) {
        resetAllInteractiveElements();
        setAllToFalse();
        pnlPrintReceipt.setVisible(true);

        label2.setText("You are currently at stage: 5 of 5");
        label2.setVisible(true);
        label1.setVisible(true);
        progressBar1.setVisible(true);

        progressBar1.setValue(100);

        setAllReceiptFalse();
    }

    private void setAllReceiptFalse () {
        lblReturnTime4.setVisible(false);
        lblDepartTime5.setVisible(false);
        lblViaLocationslReceipt4.setVisible(false);
        lblViaLocationslReceipt3.setVisible(false);
        lblViaLocationslReceipt5.setVisible(false);
        lblViaLocationlReceipt6.setVisible(false);
    }

    private void btnProlReceiptActionPerformed(ActionEvent e) {
        lblReturnTime4.setVisible(true);
        lblDepartTime5.setVisible(true);
        lblViaLocationslReceipt4.setVisible(true);
        lblViaLocationslReceipt3.setVisible(true);
        lblViaLocationslReceipt5.setVisible(true);
        lblViaLocationlReceipt6.setVisible(true);
    }

    private void btnPrintReceiptActionPerformed(ActionEvent e) {

        lblReceiptNotification.setVisible(true);
        lblTransAccNotification.setBackground(new Color(216, 231, 213));
        lblTransAccNotification.setOpaque(true);
        lblReceiptNotification.setText("Receipt Printed");
    }

    private void btnAddCreditActionPerformed(ActionEvent e) {
        AccountRegistry accountRegistry = new AccountRegistry();
        String accountNum = txtAccountID.getText();
        if(accountNum.equals("") && this.accID.equals("")) {
            System.out.println(this.accID);
            lblReceiptNotification.setVisible(true);
            lblTransAccNotification.setBackground(new Color(216, 231, 213));
            lblTransAccNotification.setOpaque(true);
            lblReceiptNotification.setText("Account ID not found. Please Enter.");
            txtAccountID.setVisible(true);
            lblAccount.setVisible(true);
        } else {
            Account account;
            if ( accountNum.equals("")) {
                account = accountRegistry.getAccountById(this.accID);
            } else {
                account = accountRegistry.getAccountById(accountNum);
            }

            if (account.addCredit(this.amount)) {
                lblReceiptNotification.setVisible(true);
                lblTransAccNotification.setBackground(new Color(216, 231, 213));
                lblTransAccNotification.setOpaque(true);
                lblReceiptNotification.setText("Token Added to Account");
                txtAccountID.setVisible(false);
                lblAccount.setVisible(false);
            } else {
                lblReceiptNotification.setVisible(true);
                lblTransAccNotification.setBackground(new Color(216, 231, 213));
                lblTransAccNotification.setOpaque(true);
                lblReceiptNotification.setText("Token Not Added");
            }
        }

    }

    private void btnPrintPhyTicActionPerformed(ActionEvent e) {
        PhysicalToken token = new PhysicalToken("1", "1");
        if(token.produceToken().equals("token")) {
            producePhysicalToken();
        } else {
            lblReceiptNotification.setVisible(true);
            lblTransAccNotification.setBackground(new Color(216, 231, 213));
            lblTransAccNotification.setOpaque(true);
            lblReceiptNotification.setText("Not Printed");
        }

    }

    private void producePhysicalToken() {
        lblReceiptNotification.setVisible(true);
        lblTransAccNotification.setBackground(new Color(216, 231, 213));
        lblTransAccNotification.setOpaque(true);
        lblReceiptNotification.setText("Ticket Printed");
    }

    private void btnSelectLanguageActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlSelectLanguage.setVisible(true);

        label2.setVisible(false);
        label1.setVisible(false);
        progressBar1.setVisible(false);

        this.setTitle("Select Language");
    }

    private void btnGoToMenuActionPerformed(ActionEvent e) {
        this.dispose();
    }

    private void btnDestination2StateChanged(ChangeEvent e) {
        // TODO add your code here
    }

    private void btnSearchAccountActionPerformed(ActionEvent e) {
        String accountId = txtFieldAccountID2.getText();
        if (!accountId.isEmpty()) {
            account = accountRegistry.getAccountById(accountId);
            if (account != null) {
                pnlSearchAccount.setVisible(false);
                pnlTransportAccountPayment.setVisible(true);
                lblTransSearchNot.setVisible(false);
                txtFieldCredit.setText(Double.toString(account.getCredits()));
                txtFieldAccountID.setText(accountId);
            } else {
                System.out.println("Account is null");
                lblTransSearchNot.setVisible(true);
            }
        }
    }

    private void cmbBoxTicketItemStateChanged(ItemEvent e) {
        chosenTicketType = cmbBoxTicket.getSelectedItem().toString();
        if(cmbBoxTicket.getSelectedItem().toString().equals("One Way")) {
            dpdnReturn.setEnabled(false);
        } else {
            dpdnReturn.setEnabled(true);
        }
    }

    private void btnEmailActionPerformed(ActionEvent e) {
        String email = txtEmailField.getText();
        String des =   lblDestination.getText();
        String station = lblStation.getText();

        if(!email.isEmpty()) {
            SendEmail sendEmail = new SendEmail(email, des, station, timeStart, timeReturn);
            lblReceiptNotification.setVisible(true);
            lblTransAccNotification.setBackground(new Color(216, 231, 213));
            lblTransAccNotification.setOpaque(true);
            lblReceiptNotification.setText("Email Sent");
        } else {
            lblReceiptNotification.setVisible(true);
            lblTransAccNotification.setBackground(new Color(216, 231, 213));
            lblTransAccNotification.setOpaque(true);
            lblReceiptNotification.setText("Email cannot be blank");
        }
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Sheffield Hallan
        pnlMain = new JPanel();
        pnlSide = new JPanel();
        btnHome = new JButton();
        btnSelectLanguage = new JButton();
        btnDisplayTimetable = new JButton();
        lblDateTime = new JLabel();
        pnlContent = new JPanel();
        pnlTransportAccountPayment = new JPanel();
        lblPriceTransAccPayment = new JLabel();
        lblTicketTypeTransAccPayment = new JLabel();
        lblTransAccPaymentInformation = new JLabel();
        lblTransAccNotification = new JLabel();
        btnPayTransAcc = new JButton();
        btnPrintAccTic = new JButton();
        lblTicketTypeTransAccAccountId = new JLabel();
        txtFieldAccountID = new JTextField();
        txtFieldCredit = new JTextField();
        lblTicketTypeTransAccAccountId3 = new JLabel();
        lblDestinationConfirmBookingTransAcc = new JLabel();
        lblStationTransAcc = new JLabel();
        lblDepartureDateTimeConfirmBooking2 = new JLabel();
        lblDepartTime2 = new JLabel();
        lblReturnTimeTransAcc = new JLabel();
        lblReturnDateTimeConfirmBooking2 = new JLabel();
        pnlSelectLanguage = new JPanel();
        btnLoadLanguage = new JButton();
        lblLanguageLoaded = new JLabel();
        lblLanguageLoaded2 = new JLabel();
        cmbBoxLanguage = new JComboBox<>();
        pnlHome = new JPanel();
        btnDestination1 = new JButton();
        btnDestination4 = new JButton();
        btnDestination5 = new JButton();
        btnDestination2 = new JButton();
        btnDestination3 = new JButton();
        btnDestination6 = new JButton();
        lblNotifyLang = new JLabel();
        pnlSelectFares = new JPanel();
        btnSearch = new JButton();
        lblTicketType = new JLabel();
        dpdnDeparture = new JComboBox<>();
        dpdnReturn = new JComboBox<>();
        lblDepartureDateTime = new JLabel();
        lblReturnDateTime = new JLabel();
        lblDestination = new JLabel();
        cmbBoxTicket = new JComboBox<>();
        pnlSearchedFares = new JPanel();
        btnFare3 = new JButton();
        btnFare1 = new JButton();
        btnFare2 = new JButton();
        pnlConfirmBooking = new JPanel();
        btnAdvance = new JButton();
        txtCouponCode = new JTextField();
        lblCouponCode = new JLabel();
        ckbxCard = new JCheckBox();
        ckbxCash = new JCheckBox();
        lblPaymentMethod = new JLabel();
        lblTicketTypeConfirmBooking = new JLabel();
        lblPrice = new JLabel();
        lblTicketInformation = new JLabel();
        lblCouponVerification = new JLabel();
        lblDepartureDateTimeConfirmBooking = new JLabel();
        lblReturnDateTimeConfirmBooking = new JLabel();
        lblDestinationConfirmBooking = new JLabel();
        lblStation = new JLabel();
        ckbxTransAcc = new JCheckBox();
        lblDepartTime = new JLabel();
        lblReturnTime = new JLabel();
        pnlCashTicketPayment = new JPanel();
        lblCashInserted = new JLabel();
        lblCashValue = new JLabel();
        lblPriceCashPayment = new JLabel();
        lblTicketTypeCashPayment = new JLabel();
        lblPaymentInformation = new JLabel();
        lblNotification = new JLabel();
        lblDepartureDateTimeCashPayment = new JLabel();
        lblReturnDateTimeCashPayment = new JLabel();
        lblDestinationCashPayment = new JLabel();
        lblStationCashPayment = new JLabel();
        btnPayCash = new JButton();
        txtCashValue = new JTextField();
        btnPrintCashTic = new JButton();
        lblNotification2 = new JLabel();
        lblReturnTime2 = new JLabel();
        lblDepartTime3 = new JLabel();
        pnlCardTicketPayment = new JPanel();
        btnPrintTicket = new JButton();
        btnConfirmPayment = new JButton();
        lblSecurityCode = new JLabel();
        txtSecurityCode = new JTextField();
        lblCardNumber = new JLabel();
        txtCardNumber = new JTextField();
        lblCardName = new JLabel();
        txtCardName = new JTextField();
        lblTicketTypeCardPayment = new JLabel();
        lblPriceCardPayment = new JLabel();
        lblPaymentInformationCardPayment = new JLabel();
        lblPaymentValidate = new JLabel();
        lblDepartureDateTimeCardPayment = new JLabel();
        lblReturnDateTimeCardPayment = new JLabel();
        lblDestinationCardPayment = new JLabel();
        lblStationCardPayment = new JLabel();
        lblSortCode = new JLabel();
        txtSortCode = new JTextField();
        lblReturnTime3 = new JLabel();
        lblDepartTime4 = new JLabel();
        pnlTimetable = new JPanel();
        scrollPane = new JScrollPane();
        tblTicket = new JTable();
        pnlPrintReceipt = new JPanel();
        lblReceiptNotification = new JLabel();
        lbllReceiptLocation = new JLabel();
        lblDepartureDateTimelReceipt = new JLabel();
        lblReturnDateTimelReceipt = new JLabel();
        lblDestinationlReceipt = new JLabel();
        lblStationlReceipt = new JLabel();
        btnProlReceipt = new JButton();
        btnPrintReceipt = new JButton();
        lblViaLocationslReceipt3 = new JLabel();
        lblViaLocationslReceipt4 = new JLabel();
        lblViaLocationslReceipt5 = new JLabel();
        lblViaLocationlReceipt6 = new JLabel();
        btnPrintPhyTic = new JButton();
        btnAddCredit = new JButton();
        txtAccountID = new JTextField();
        lblAccount = new JLabel();
        btnEmail = new JButton();
        txtEmailField = new JTextField();
        lblViaLocationlReceipt7 = new JLabel();
        lblViaLocationlReceipt8 = new JLabel();
        lblViaLocationlReceipt9 = new JLabel();
        lblReturnTime4 = new JLabel();
        lblDepartTime5 = new JLabel();
        pnlSearchAccount = new JPanel();
        lblTicketTypeTransAccPayment2 = new JLabel();
        lblTransAccPaymentInformation2 = new JLabel();
        lblTransSearchNot = new JLabel();
        btnSearchAccount = new JButton();
        lblTicketTypeTransAccAccountId2 = new JLabel();
        txtFieldAccountID2 = new JTextField();
        btnGoToMenu = new JButton();
        progressBar1 = new JProgressBar();
        label1 = new JLabel();
        label2 = new JLabel();

        //======== pnlMain ========
        {
            pnlMain.setPreferredSize(new Dimension(1111, 635));

            pnlMain.setLayout(new CardLayout());

            //======== pnlSide ========
            {
                pnlSide.setLayout(null);

                //---- btnHome ----
                btnHome.setText("Home");
                btnHome.addActionListener(e -> btnHomeActionPerformed(e));
                pnlSide.add(btnHome);
                btnHome.setBounds(0, 0, 143, 60);

                //---- btnSelectLanguage ----
                btnSelectLanguage.setText("Select Language");
                btnSelectLanguage.addActionListener(e -> btnSelectLanguageActionPerformed(e));
                pnlSide.add(btnSelectLanguage);
                btnSelectLanguage.setBounds(0, 184, 143, 60);

                //---- btnDisplayTimetable ----
                btnDisplayTimetable.setText("Display Timetable");
                btnDisplayTimetable.setEnabled(false);
                pnlSide.add(btnDisplayTimetable);
                btnDisplayTimetable.setBounds(0, 262, 143, 60);

                //---- lblDateTime ----
                lblDateTime.setText("Date/Time");
                lblDateTime.setHorizontalAlignment(SwingConstants.CENTER);
                lblDateTime.setMaximumSize(new Dimension(25, 25));
                lblDateTime.setMinimumSize(new Dimension(25, 25));
                lblDateTime.setPreferredSize(new Dimension(25, 25));
                pnlSide.add(lblDateTime);
                lblDateTime.setBounds(0, 465, 143, 60);

                //======== pnlContent ========
                {
                    pnlContent.setLayout(new CardLayout());

                    //======== pnlTransportAccountPayment ========
                    {
                        pnlTransportAccountPayment.setLayout(null);

                        //---- lblPriceTransAccPayment ----
                        lblPriceTransAccPayment.setText("PRICE");
                        pnlTransportAccountPayment.add(lblPriceTransAccPayment);
                        lblPriceTransAccPayment.setBounds(395, 250, 43, lblPriceTransAccPayment.getPreferredSize().height);

                        //---- lblTicketTypeTransAccPayment ----
                        lblTicketTypeTransAccPayment.setText("Ticket Type");
                        pnlTransportAccountPayment.add(lblTicketTypeTransAccPayment);
                        lblTicketTypeTransAccPayment.setBounds(new Rectangle(new Point(285, 250), lblTicketTypeTransAccPayment.getPreferredSize()));

                        //---- lblTransAccPaymentInformation ----
                        lblTransAccPaymentInformation.setText("Transport Account Payment Information");
                        pnlTransportAccountPayment.add(lblTransAccPaymentInformation);
                        lblTransAccPaymentInformation.setBounds(new Rectangle(new Point(285, 220), lblTransAccPaymentInformation.getPreferredSize()));

                        //---- lblTransAccNotification ----
                        lblTransAccNotification.setToolTipText("Information Text");
                        lblTransAccNotification.setBackground(new Color(216, 231, 213));
                        lblTransAccNotification.setOpaque(true);
                        lblTransAccNotification.setForeground(Color.black);
                        lblTransAccNotification.setHorizontalAlignment(SwingConstants.CENTER);
                        lblTransAccNotification.setText("Payment Successfully Made");
                        pnlTransportAccountPayment.add(lblTransAccNotification);
                        lblTransAccNotification.setBounds(360, 145, 204, 18);

                        //---- btnPayTransAcc ----
                        btnPayTransAcc.setText("Pay with Account");
                        btnPayTransAcc.addActionListener(e -> btnPayTransAccActionPerformed(e));
                        pnlTransportAccountPayment.add(btnPayTransAcc);
                        btnPayTransAcc.setBounds(new Rectangle(new Point(280, 355), btnPayTransAcc.getPreferredSize()));

                        //---- btnPrintAccTic ----
                        btnPrintAccTic.setText("Advance");
                        btnPrintAccTic.addActionListener(e -> btnPrintAccTicActionPerformed(e));
                        pnlTransportAccountPayment.add(btnPrintAccTic);
                        btnPrintAccTic.setBounds(new Rectangle(new Point(520, 355), btnPrintAccTic.getPreferredSize()));

                        //---- lblTicketTypeTransAccAccountId ----
                        lblTicketTypeTransAccAccountId.setText("Account ID");
                        pnlTransportAccountPayment.add(lblTicketTypeTransAccAccountId);
                        lblTicketTypeTransAccAccountId.setBounds(new Rectangle(new Point(285, 290), lblTicketTypeTransAccAccountId.getPreferredSize()));

                        //---- txtFieldAccountID ----
                        txtFieldAccountID.setEnabled(false);
                        pnlTransportAccountPayment.add(txtFieldAccountID);
                        txtFieldAccountID.setBounds(395, 285, 212, txtFieldAccountID.getPreferredSize().height);

                        //---- txtFieldCredit ----
                        txtFieldCredit.setEnabled(false);
                        pnlTransportAccountPayment.add(txtFieldCredit);
                        txtFieldCredit.setBounds(395, 315, 212, txtFieldCredit.getPreferredSize().height);

                        //---- lblTicketTypeTransAccAccountId3 ----
                        lblTicketTypeTransAccAccountId3.setText("Credit");
                        pnlTransportAccountPayment.add(lblTicketTypeTransAccAccountId3);
                        lblTicketTypeTransAccAccountId3.setBounds(new Rectangle(new Point(320, 320), lblTicketTypeTransAccAccountId3.getPreferredSize()));

                        //---- lblDestinationConfirmBookingTransAcc ----
                        lblDestinationConfirmBookingTransAcc.setText("Destination");
                        pnlTransportAccountPayment.add(lblDestinationConfirmBookingTransAcc);
                        lblDestinationConfirmBookingTransAcc.setBounds(new Rectangle(new Point(460, 30), lblDestinationConfirmBookingTransAcc.getPreferredSize()));

                        //---- lblStationTransAcc ----
                        lblStationTransAcc.setText("Station");
                        pnlTransportAccountPayment.add(lblStationTransAcc);
                        lblStationTransAcc.setBounds(380, 30, 74, lblStationTransAcc.getPreferredSize().height);

                        //---- lblDepartureDateTimeConfirmBooking2 ----
                        lblDepartureDateTimeConfirmBooking2.setText("Departure Time");
                        pnlTransportAccountPayment.add(lblDepartureDateTimeConfirmBooking2);
                        lblDepartureDateTimeConfirmBooking2.setBounds(315, 55, 135, 24);

                        //---- lblDepartTime2 ----
                        lblDepartTime2.setText("text");
                        pnlTransportAccountPayment.add(lblDepartTime2);
                        lblDepartTime2.setBounds(345, 85, 108, lblDepartTime2.getPreferredSize().height);

                        //---- lblReturnTimeTransAcc ----
                        lblReturnTimeTransAcc.setText("text");
                        pnlTransportAccountPayment.add(lblReturnTimeTransAcc);
                        lblReturnTimeTransAcc.setBounds(560, 85, 74, lblReturnTimeTransAcc.getPreferredSize().height);

                        //---- lblReturnDateTimeConfirmBooking2 ----
                        lblReturnDateTimeConfirmBooking2.setText("Return Time");
                        pnlTransportAccountPayment.add(lblReturnDateTimeConfirmBooking2);
                        lblReturnDateTimeConfirmBooking2.setBounds(new Rectangle(new Point(535, 55), lblReturnDateTimeConfirmBooking2.getPreferredSize()));

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < pnlTransportAccountPayment.getComponentCount(); i++) {
                                Rectangle bounds = pnlTransportAccountPayment.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = pnlTransportAccountPayment.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            pnlTransportAccountPayment.setMinimumSize(preferredSize);
                            pnlTransportAccountPayment.setPreferredSize(preferredSize);
                        }
                    }
                    pnlContent.add(pnlTransportAccountPayment, "card9");

                    //======== pnlSelectLanguage ========
                    {
                        pnlSelectLanguage.setLayout(null);

                        //---- btnLoadLanguage ----
                        btnLoadLanguage.setText("Load Language");
                        btnLoadLanguage.addActionListener(e -> btnLoadLanguageActionPerformed(e));
                        pnlSelectLanguage.add(btnLoadLanguage);
                        btnLoadLanguage.setBounds(new Rectangle(new Point(435, 245), btnLoadLanguage.getPreferredSize()));

                        //---- lblLanguageLoaded ----
                        lblLanguageLoaded.setText("Language Loaded");
                        pnlSelectLanguage.add(lblLanguageLoaded);
                        lblLanguageLoaded.setBounds(new Rectangle(new Point(440, 10), lblLanguageLoaded.getPreferredSize()));

                        //---- lblLanguageLoaded2 ----
                        lblLanguageLoaded2.setText("Please select a language from the dropdown list");
                        pnlSelectLanguage.add(lblLanguageLoaded2);
                        lblLanguageLoaded2.setBounds(new Rectangle(new Point(350, 75), lblLanguageLoaded2.getPreferredSize()));

                        //---- cmbBoxLanguage ----
                        cmbBoxLanguage.setModel(new DefaultComboBoxModel<>(new String[] {
                            "English (UK)",
                            "English (US)",
                            "French",
                            "German",
                            "Spanish",
                            "Welsh"
                        }));
                        pnlSelectLanguage.add(cmbBoxLanguage);
                        cmbBoxLanguage.setBounds(new Rectangle(new Point(440, 125), cmbBoxLanguage.getPreferredSize()));

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < pnlSelectLanguage.getComponentCount(); i++) {
                                Rectangle bounds = pnlSelectLanguage.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = pnlSelectLanguage.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            pnlSelectLanguage.setMinimumSize(preferredSize);
                            pnlSelectLanguage.setPreferredSize(preferredSize);
                        }
                    }
                    pnlContent.add(pnlSelectLanguage, "card2");

                    //======== pnlHome ========
                    {
                        pnlHome.setLayout(null);

                        //---- btnDestination1 ----
                        btnDestination1.setText("London");
                        btnDestination1.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                        btnDestination1.addActionListener(e -> btnDestination1ActionPerformed(e));
                        pnlHome.add(btnDestination1);
                        btnDestination1.setBounds(325, 120, 100, 100);

                        //---- btnDestination4 ----
                        btnDestination4.setText("Nottingham");
                        btnDestination4.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                        btnDestination4.addActionListener(e -> btnDestination4ActionPerformed(e));
                        pnlHome.add(btnDestination4);
                        btnDestination4.setBounds(325, 250, 100, 100);

                        //---- btnDestination5 ----
                        btnDestination5.setText("Newcastle");
                        btnDestination5.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                        btnDestination5.addActionListener(e -> btnDestination5ActionPerformed(e));
                        pnlHome.add(btnDestination5);
                        btnDestination5.setBounds(435, 250, 100, 100);

                        //---- btnDestination2 ----
                        btnDestination2.setText("Sheffield");
                        btnDestination2.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                        btnDestination2.addChangeListener(e -> btnDestination2StateChanged(e));
                        btnDestination2.addActionListener(e -> btnDestination2ActionPerformed(e));
                        pnlHome.add(btnDestination2);
                        btnDestination2.setBounds(435, 120, 100, 100);

                        //---- btnDestination3 ----
                        btnDestination3.setText("Derby");
                        btnDestination3.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                        btnDestination3.addActionListener(e -> btnDestination3ActionPerformed(e));
                        pnlHome.add(btnDestination3);
                        btnDestination3.setBounds(550, 120, 100, 100);

                        //---- btnDestination6 ----
                        btnDestination6.setText("Leicester");
                        btnDestination6.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                        btnDestination6.addActionListener(e -> btnDestination6ActionPerformed(e));
                        pnlHome.add(btnDestination6);
                        btnDestination6.setBounds(550, 250, 100, 100);

                        //---- lblNotifyLang ----
                        lblNotifyLang.setToolTipText("Information Text");
                        lblNotifyLang.setBackground(new Color(216, 231, 213));
                        lblNotifyLang.setOpaque(true);
                        lblNotifyLang.setForeground(Color.black);
                        lblNotifyLang.setHorizontalAlignment(SwingConstants.CENTER);
                        lblNotifyLang.setText("Language Changed");
                        pnlHome.add(lblNotifyLang);
                        lblNotifyLang.setBounds(385, 65, 204, 18);

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < pnlHome.getComponentCount(); i++) {
                                Rectangle bounds = pnlHome.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = pnlHome.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            pnlHome.setMinimumSize(preferredSize);
                            pnlHome.setPreferredSize(preferredSize);
                        }
                    }
                    pnlContent.add(pnlHome, "card1");

                    //======== pnlSelectFares ========
                    {
                        pnlSelectFares.setLayout(null);

                        //---- btnSearch ----
                        btnSearch.setText("Search");
                        btnSearch.addActionListener(e -> searchActionPerformed(e));
                        pnlSelectFares.add(btnSearch);
                        btnSearch.setBounds(525, 215, 125, btnSearch.getPreferredSize().height);

                        //---- lblTicketType ----
                        lblTicketType.setText("Ticket Type");
                        pnlSelectFares.add(lblTicketType);
                        lblTicketType.setBounds(new Rectangle(new Point(335, 195), lblTicketType.getPreferredSize()));

                        //---- dpdnDeparture ----
                        dpdnDeparture.setModel(new DefaultComboBoxModel<>(new String[] {
                            "01:00",
                            "02:00",
                            "03:00",
                            "04:00",
                            "05:00",
                            "06:00",
                            "07:00",
                            "08:00",
                            "09:00",
                            "10:00",
                            "11:00",
                            "12:00",
                            "13:00",
                            "14:00",
                            "15:00",
                            "16:00",
                            "17:00",
                            "18:00",
                            "19:00",
                            "20:00",
                            "21:00",
                            "22:00",
                            "23:00",
                            "00:00"
                        }));
                        pnlSelectFares.add(dpdnDeparture);
                        dpdnDeparture.setBounds(335, 130, 126, dpdnDeparture.getPreferredSize().height);

                        //---- dpdnReturn ----
                        dpdnReturn.setModel(new DefaultComboBoxModel<>(new String[] {
                            "01:00",
                            "02:00",
                            "03:00",
                            "04:00",
                            "05:00",
                            "06:00",
                            "07:00",
                            "08:00",
                            "09:00",
                            "10:00",
                            "11:00",
                            "12:00",
                            "13:00",
                            "14:00",
                            "15:00",
                            "16:00",
                            "17:00",
                            "18:00",
                            "19:00",
                            "20:00",
                            "21:00",
                            "22:00",
                            "23:00",
                            "00:00"
                        }));
                        pnlSelectFares.add(dpdnReturn);
                        dpdnReturn.setBounds(525, 130, 126, dpdnReturn.getPreferredSize().height);

                        //---- lblDepartureDateTime ----
                        lblDepartureDateTime.setText("Departure Date/Time");
                        pnlSelectFares.add(lblDepartureDateTime);
                        lblDepartureDateTime.setBounds(335, 95, lblDepartureDateTime.getPreferredSize().width, 26);

                        //---- lblReturnDateTime ----
                        lblReturnDateTime.setText("Return Date/Time");
                        pnlSelectFares.add(lblReturnDateTime);
                        lblReturnDateTime.setBounds(525, 95, 126, 26);

                        //---- lblDestination ----
                        lblDestination.setText("London");
                        pnlSelectFares.add(lblDestination);
                        lblDestination.setBounds(new Rectangle(new Point(470, 20), lblDestination.getPreferredSize()));

                        //---- cmbBoxTicket ----
                        cmbBoxTicket.setModel(new DefaultComboBoxModel<>(new String[] {
                            "One Way",
                            "Open Return",
                            "Return"
                        }));
                        cmbBoxTicket.addItemListener(e -> cmbBoxTicketItemStateChanged(e));
                        pnlSelectFares.add(cmbBoxTicket);
                        cmbBoxTicket.setBounds(new Rectangle(new Point(335, 220), cmbBoxTicket.getPreferredSize()));

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < pnlSelectFares.getComponentCount(); i++) {
                                Rectangle bounds = pnlSelectFares.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = pnlSelectFares.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            pnlSelectFares.setMinimumSize(preferredSize);
                            pnlSelectFares.setPreferredSize(preferredSize);
                        }
                    }
                    pnlContent.add(pnlSelectFares, "card3");

                    //======== pnlSearchedFares ========
                    {
                        pnlSearchedFares.setLayout(null);

                        //---- btnFare3 ----
                        btnFare3.setText("<html>\nDestination <br>\nDeparture Date/Time <br>\nReturn Date/Time <br>\nPRICE\n</html>");
                        btnFare3.setHorizontalAlignment(SwingConstants.TRAILING);
                        btnFare3.setFont(new Font(".SF NS Text", Font.PLAIN, 11));
                        btnFare3.addActionListener(e -> btnFare3ActionPerformed(e));
                        pnlSearchedFares.add(btnFare3);
                        btnFare3.setBounds(575, 180, 160, 100);

                        //---- btnFare1 ----
                        btnFare1.setText("<html> Destination <br> Departure Date/Time <br> Return Date/Time <br> PRICE </html>");
                        btnFare1.setHorizontalAlignment(SwingConstants.TRAILING);
                        btnFare1.setFont(new Font(".SF NS Text", Font.PLAIN, 11));
                        btnFare1.addActionListener(e -> btnFare1ActionPerformed(e));
                        pnlSearchedFares.add(btnFare1);
                        btnFare1.setBounds(230, 180, 160, 100);

                        //---- btnFare2 ----
                        btnFare2.setText("<html>\nDestination <br>\nDeparture Date/Time <br>\nReturn Date/Time <br>\nPRICE\n</html>");
                        btnFare2.setHorizontalAlignment(SwingConstants.TRAILING);
                        btnFare2.setFont(new Font(".SF NS Text", Font.PLAIN, 11));
                        btnFare2.addActionListener(e -> btnFare2ActionPerformed(e));
                        pnlSearchedFares.add(btnFare2);
                        btnFare2.setBounds(405, 180, 160, 100);

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < pnlSearchedFares.getComponentCount(); i++) {
                                Rectangle bounds = pnlSearchedFares.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = pnlSearchedFares.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            pnlSearchedFares.setMinimumSize(preferredSize);
                            pnlSearchedFares.setPreferredSize(preferredSize);
                        }
                    }
                    pnlContent.add(pnlSearchedFares, "card4");

                    //======== pnlConfirmBooking ========
                    {
                        pnlConfirmBooking.setLayout(null);

                        //---- btnAdvance ----
                        btnAdvance.setText("Advance");
                        btnAdvance.addActionListener(e -> btnAdvanceActionPerformed(e));
                        pnlConfirmBooking.add(btnAdvance);
                        btnAdvance.setBounds(new Rectangle(new Point(575, 340), btnAdvance.getPreferredSize()));
                        pnlConfirmBooking.add(txtCouponCode);
                        txtCouponCode.setBounds(405, 345, 85, txtCouponCode.getPreferredSize().height);

                        //---- lblCouponCode ----
                        lblCouponCode.setText("Coupon Code");
                        lblCouponCode.setLabelFor(txtCouponCode);
                        pnlConfirmBooking.add(lblCouponCode);
                        lblCouponCode.setBounds(new Rectangle(new Point(305, 345), lblCouponCode.getPreferredSize()));

                        //---- ckbxCard ----
                        ckbxCard.setText("CARD");
                        pnlConfirmBooking.add(ckbxCard);
                        ckbxCard.setBounds(new Rectangle(new Point(305, 270), ckbxCard.getPreferredSize()));

                        //---- ckbxCash ----
                        ckbxCash.setText("CASH");
                        pnlConfirmBooking.add(ckbxCash);
                        ckbxCash.setBounds(new Rectangle(new Point(305, 245), ckbxCash.getPreferredSize()));

                        //---- lblPaymentMethod ----
                        lblPaymentMethod.setText("Payment Method");
                        pnlConfirmBooking.add(lblPaymentMethod);
                        lblPaymentMethod.setBounds(305, 220, 112, lblPaymentMethod.getPreferredSize().height);

                        //---- lblTicketTypeConfirmBooking ----
                        lblTicketTypeConfirmBooking.setText("Ticket Type");
                        pnlConfirmBooking.add(lblTicketTypeConfirmBooking);
                        lblTicketTypeConfirmBooking.setBounds(new Rectangle(new Point(305, 190), lblTicketTypeConfirmBooking.getPreferredSize()));

                        //---- lblPrice ----
                        lblPrice.setText("Price");
                        pnlConfirmBooking.add(lblPrice);
                        lblPrice.setBounds(new Rectangle(new Point(415, 190), lblPrice.getPreferredSize()));

                        //---- lblTicketInformation ----
                        lblTicketInformation.setText("Ticket Information");
                        pnlConfirmBooking.add(lblTicketInformation);
                        lblTicketInformation.setBounds(new Rectangle(new Point(305, 155), lblTicketInformation.getPreferredSize()));

                        //---- lblCouponVerification ----
                        lblCouponVerification.setToolTipText("Coupon Validity Check");
                        lblCouponVerification.setHorizontalAlignment(SwingConstants.CENTER);
                        pnlConfirmBooking.add(lblCouponVerification);
                        lblCouponVerification.setBounds(405, 125, 137, 18);

                        //---- lblDepartureDateTimeConfirmBooking ----
                        lblDepartureDateTimeConfirmBooking.setText("Departure Time");
                        pnlConfirmBooking.add(lblDepartureDateTimeConfirmBooking);
                        lblDepartureDateTimeConfirmBooking.setBounds(315, 55, 135, 24);

                        //---- lblReturnDateTimeConfirmBooking ----
                        lblReturnDateTimeConfirmBooking.setText("Return Time");
                        pnlConfirmBooking.add(lblReturnDateTimeConfirmBooking);
                        lblReturnDateTimeConfirmBooking.setBounds(new Rectangle(new Point(535, 55), lblReturnDateTimeConfirmBooking.getPreferredSize()));

                        //---- lblDestinationConfirmBooking ----
                        lblDestinationConfirmBooking.setText("Destination");
                        pnlConfirmBooking.add(lblDestinationConfirmBooking);
                        lblDestinationConfirmBooking.setBounds(new Rectangle(new Point(460, 30), lblDestinationConfirmBooking.getPreferredSize()));

                        //---- lblStation ----
                        lblStation.setText("Station");
                        pnlConfirmBooking.add(lblStation);
                        lblStation.setBounds(380, 30, 74, lblStation.getPreferredSize().height);

                        //---- ckbxTransAcc ----
                        ckbxTransAcc.setText("Transport Account");
                        pnlConfirmBooking.add(ckbxTransAcc);
                        ckbxTransAcc.setBounds(new Rectangle(new Point(305, 295), ckbxTransAcc.getPreferredSize()));

                        //---- lblDepartTime ----
                        lblDepartTime.setText("text");
                        pnlConfirmBooking.add(lblDepartTime);
                        lblDepartTime.setBounds(345, 85, 108, lblDepartTime.getPreferredSize().height);

                        //---- lblReturnTime ----
                        lblReturnTime.setText("text");
                        pnlConfirmBooking.add(lblReturnTime);
                        lblReturnTime.setBounds(560, 85, 74, lblReturnTime.getPreferredSize().height);

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < pnlConfirmBooking.getComponentCount(); i++) {
                                Rectangle bounds = pnlConfirmBooking.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = pnlConfirmBooking.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            pnlConfirmBooking.setMinimumSize(preferredSize);
                            pnlConfirmBooking.setPreferredSize(preferredSize);
                        }
                    }
                    pnlContent.add(pnlConfirmBooking, "card5");

                    //======== pnlCashTicketPayment ========
                    {
                        pnlCashTicketPayment.setLayout(null);

                        //---- lblCashInserted ----
                        lblCashInserted.setText("Cash Inserted");
                        pnlCashTicketPayment.add(lblCashInserted);
                        lblCashInserted.setBounds(new Rectangle(new Point(380, 250), lblCashInserted.getPreferredSize()));

                        //---- lblCashValue ----
                        lblCashValue.setText("VALUE");
                        pnlCashTicketPayment.add(lblCashValue);
                        lblCashValue.setBounds(new Rectangle(new Point(520, 250), lblCashValue.getPreferredSize()));

                        //---- lblPriceCashPayment ----
                        lblPriceCashPayment.setText("PRICE");
                        pnlCashTicketPayment.add(lblPriceCashPayment);
                        lblPriceCashPayment.setBounds(520, 225, 43, lblPriceCashPayment.getPreferredSize().height);

                        //---- lblTicketTypeCashPayment ----
                        lblTicketTypeCashPayment.setText("Ticket Type");
                        pnlCashTicketPayment.add(lblTicketTypeCashPayment);
                        lblTicketTypeCashPayment.setBounds(new Rectangle(new Point(380, 225), lblTicketTypeCashPayment.getPreferredSize()));

                        //---- lblPaymentInformation ----
                        lblPaymentInformation.setText("Payment Information");
                        pnlCashTicketPayment.add(lblPaymentInformation);
                        lblPaymentInformation.setBounds(new Rectangle(new Point(380, 190), lblPaymentInformation.getPreferredSize()));

                        //---- lblNotification ----
                        lblNotification.setToolTipText("Information Text");
                        lblNotification.setBackground(new Color(216, 231, 213));
                        lblNotification.setOpaque(true);
                        lblNotification.setText("Input cash to confirm payment");
                        lblNotification.setForeground(Color.black);
                        lblNotification.setHorizontalAlignment(SwingConstants.CENTER);
                        pnlCashTicketPayment.add(lblNotification);
                        lblNotification.setBounds(365, 125, 204, 18);

                        //---- lblDepartureDateTimeCashPayment ----
                        lblDepartureDateTimeCashPayment.setText("Departure Time");
                        pnlCashTicketPayment.add(lblDepartureDateTimeCashPayment);
                        lblDepartureDateTimeCashPayment.setBounds(315, 55, 135, 24);

                        //---- lblReturnDateTimeCashPayment ----
                        lblReturnDateTimeCashPayment.setText("Return Time");
                        pnlCashTicketPayment.add(lblReturnDateTimeCashPayment);
                        lblReturnDateTimeCashPayment.setBounds(new Rectangle(new Point(535, 55), lblReturnDateTimeCashPayment.getPreferredSize()));

                        //---- lblDestinationCashPayment ----
                        lblDestinationCashPayment.setText("Destination");
                        pnlCashTicketPayment.add(lblDestinationCashPayment);
                        lblDestinationCashPayment.setBounds(new Rectangle(new Point(460, 30), lblDestinationCashPayment.getPreferredSize()));

                        //---- lblStationCashPayment ----
                        lblStationCashPayment.setText("Station");
                        pnlCashTicketPayment.add(lblStationCashPayment);
                        lblStationCashPayment.setBounds(380, 30, 74, lblStationCashPayment.getPreferredSize().height);

                        //---- btnPayCash ----
                        btnPayCash.setText("Pay");
                        btnPayCash.addActionListener(e -> btnPayCashActionPerformed(e));
                        pnlCashTicketPayment.add(btnPayCash);
                        btnPayCash.setBounds(new Rectangle(new Point(460, 280), btnPayCash.getPreferredSize()));
                        pnlCashTicketPayment.add(txtCashValue);
                        txtCashValue.setBounds(380, 280, 67, txtCashValue.getPreferredSize().height);

                        //---- btnPrintCashTic ----
                        btnPrintCashTic.setText("Advance");
                        btnPrintCashTic.addActionListener(e -> btnPrintCashTicActionPerformed(e));
                        pnlCashTicketPayment.add(btnPrintCashTic);
                        btnPrintCashTic.setBounds(new Rectangle(new Point(525, 280), btnPrintCashTic.getPreferredSize()));

                        //---- lblNotification2 ----
                        lblNotification2.setToolTipText("Information Text");
                        lblNotification2.setBackground(new Color(216, 231, 213));
                        lblNotification2.setOpaque(true);
                        lblNotification2.setText("Input cash to confirm payment");
                        lblNotification2.setForeground(Color.black);
                        lblNotification2.setHorizontalAlignment(SwingConstants.CENTER);
                        pnlCashTicketPayment.add(lblNotification2);
                        lblNotification2.setBounds(365, 155, 204, 18);

                        //---- lblReturnTime2 ----
                        lblReturnTime2.setText("text");
                        pnlCashTicketPayment.add(lblReturnTime2);
                        lblReturnTime2.setBounds(560, 85, 74, lblReturnTime2.getPreferredSize().height);

                        //---- lblDepartTime3 ----
                        lblDepartTime3.setText("text");
                        pnlCashTicketPayment.add(lblDepartTime3);
                        lblDepartTime3.setBounds(345, 85, 108, lblDepartTime3.getPreferredSize().height);

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < pnlCashTicketPayment.getComponentCount(); i++) {
                                Rectangle bounds = pnlCashTicketPayment.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = pnlCashTicketPayment.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            pnlCashTicketPayment.setMinimumSize(preferredSize);
                            pnlCashTicketPayment.setPreferredSize(preferredSize);
                        }
                    }
                    pnlContent.add(pnlCashTicketPayment, "card6");

                    //======== pnlCardTicketPayment ========
                    {
                        pnlCardTicketPayment.setLayout(null);

                        //---- btnPrintTicket ----
                        btnPrintTicket.setText("Advance");
                        btnPrintTicket.addActionListener(e -> {
			btnPrintTicketActionPerformed(e);
			btnPrintTicketActionPerformed(e);
		});
                        pnlCardTicketPayment.add(btnPrintTicket);
                        btnPrintTicket.setBounds(new Rectangle(new Point(460, 395), btnPrintTicket.getPreferredSize()));

                        //---- btnConfirmPayment ----
                        btnConfirmPayment.setText("Confirm Payment");
                        btnConfirmPayment.addActionListener(e -> btnConfirmPaymentActionPerformed(e));
                        pnlCardTicketPayment.add(btnConfirmPayment);
                        btnConfirmPayment.setBounds(new Rectangle(new Point(430, 340), btnConfirmPayment.getPreferredSize()));

                        //---- lblSecurityCode ----
                        lblSecurityCode.setText("Security Code");
                        lblSecurityCode.setLabelFor(txtSecurityCode);
                        pnlCardTicketPayment.add(lblSecurityCode);
                        lblSecurityCode.setBounds(new Rectangle(new Point(350, 265), lblSecurityCode.getPreferredSize()));
                        pnlCardTicketPayment.add(txtSecurityCode);
                        txtSecurityCode.setBounds(480, 260, 147, txtSecurityCode.getPreferredSize().height);

                        //---- lblCardNumber ----
                        lblCardNumber.setText("Card Number");
                        lblCardNumber.setLabelFor(txtCardNumber);
                        pnlCardTicketPayment.add(lblCardNumber);
                        lblCardNumber.setBounds(350, 235, 86, lblCardNumber.getPreferredSize().height);
                        pnlCardTicketPayment.add(txtCardNumber);
                        txtCardNumber.setBounds(480, 230, 147, txtCardNumber.getPreferredSize().height);

                        //---- lblCardName ----
                        lblCardName.setText("Card Name");
                        lblCardName.setLabelFor(txtCardName);
                        pnlCardTicketPayment.add(lblCardName);
                        lblCardName.setBounds(350, 205, 86, lblCardName.getPreferredSize().height);
                        pnlCardTicketPayment.add(txtCardName);
                        txtCardName.setBounds(480, 200, 147, txtCardName.getPreferredSize().height);

                        //---- lblTicketTypeCardPayment ----
                        lblTicketTypeCardPayment.setText("Ticket Type");
                        pnlCardTicketPayment.add(lblTicketTypeCardPayment);
                        lblTicketTypeCardPayment.setBounds(new Rectangle(new Point(350, 160), lblTicketTypeCardPayment.getPreferredSize()));

                        //---- lblPriceCardPayment ----
                        lblPriceCardPayment.setText("PRICE");
                        pnlCardTicketPayment.add(lblPriceCardPayment);
                        lblPriceCardPayment.setBounds(new Rectangle(new Point(495, 160), lblPriceCardPayment.getPreferredSize()));

                        //---- lblPaymentInformationCardPayment ----
                        lblPaymentInformationCardPayment.setText("Payment Information");
                        pnlCardTicketPayment.add(lblPaymentInformationCardPayment);
                        lblPaymentInformationCardPayment.setBounds(new Rectangle(new Point(320, 135), lblPaymentInformationCardPayment.getPreferredSize()));

                        //---- lblPaymentValidate ----
                        lblPaymentValidate.setToolTipText("Coupon Validity Check");
                        lblPaymentValidate.setHorizontalAlignment(SwingConstants.CENTER);
                        lblPaymentValidate.setHorizontalTextPosition(SwingConstants.CENTER);
                        pnlCardTicketPayment.add(lblPaymentValidate);
                        lblPaymentValidate.setBounds(305, 115, 312, 18);

                        //---- lblDepartureDateTimeCardPayment ----
                        lblDepartureDateTimeCardPayment.setText("Departure Time");
                        pnlCardTicketPayment.add(lblDepartureDateTimeCardPayment);
                        lblDepartureDateTimeCardPayment.setBounds(315, 55, 135, 24);

                        //---- lblReturnDateTimeCardPayment ----
                        lblReturnDateTimeCardPayment.setText("Return Time");
                        pnlCardTicketPayment.add(lblReturnDateTimeCardPayment);
                        lblReturnDateTimeCardPayment.setBounds(new Rectangle(new Point(535, 55), lblReturnDateTimeCardPayment.getPreferredSize()));

                        //---- lblDestinationCardPayment ----
                        lblDestinationCardPayment.setText("Destination");
                        pnlCardTicketPayment.add(lblDestinationCardPayment);
                        lblDestinationCardPayment.setBounds(new Rectangle(new Point(460, 30), lblDestinationCardPayment.getPreferredSize()));

                        //---- lblStationCardPayment ----
                        lblStationCardPayment.setText("Station");
                        pnlCardTicketPayment.add(lblStationCardPayment);
                        lblStationCardPayment.setBounds(380, 30, 74, lblStationCardPayment.getPreferredSize().height);

                        //---- lblSortCode ----
                        lblSortCode.setText("Sort Code");
                        lblSortCode.setLabelFor(txtSecurityCode);
                        pnlCardTicketPayment.add(lblSortCode);
                        lblSortCode.setBounds(new Rectangle(new Point(350, 300), lblSortCode.getPreferredSize()));
                        pnlCardTicketPayment.add(txtSortCode);
                        txtSortCode.setBounds(480, 295, 147, txtSortCode.getPreferredSize().height);

                        //---- lblReturnTime3 ----
                        lblReturnTime3.setText("text");
                        pnlCardTicketPayment.add(lblReturnTime3);
                        lblReturnTime3.setBounds(560, 85, 74, lblReturnTime3.getPreferredSize().height);

                        //---- lblDepartTime4 ----
                        lblDepartTime4.setText("text");
                        pnlCardTicketPayment.add(lblDepartTime4);
                        lblDepartTime4.setBounds(345, 85, 108, lblDepartTime4.getPreferredSize().height);

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < pnlCardTicketPayment.getComponentCount(); i++) {
                                Rectangle bounds = pnlCardTicketPayment.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = pnlCardTicketPayment.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            pnlCardTicketPayment.setMinimumSize(preferredSize);
                            pnlCardTicketPayment.setPreferredSize(preferredSize);
                        }
                    }
                    pnlContent.add(pnlCardTicketPayment, "card7");

                    //======== pnlTimetable ========
                    {

                        //======== scrollPane ========
                        {
                            scrollPane.setViewportView(tblTicket);
                        }

                        GroupLayout pnlTimetableLayout = new GroupLayout(pnlTimetable);
                        pnlTimetable.setLayout(pnlTimetableLayout);
                        pnlTimetableLayout.setHorizontalGroup(
                            pnlTimetableLayout.createParallelGroup()
                                .addGroup(pnlTimetableLayout.createParallelGroup()
                                    .addGroup(pnlTimetableLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 472, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 787, Short.MAX_VALUE)
                        );
                        pnlTimetableLayout.setVerticalGroup(
                            pnlTimetableLayout.createParallelGroup()
                                .addGroup(pnlTimetableLayout.createParallelGroup()
                                    .addGroup(pnlTimetableLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 492, Short.MAX_VALUE)
                        );
                    }
                    pnlContent.add(pnlTimetable, "card8");

                    //======== pnlPrintReceipt ========
                    {
                        pnlPrintReceipt.setLayout(null);

                        //---- lblReceiptNotification ----
                        lblReceiptNotification.setToolTipText("Information Text");
                        lblReceiptNotification.setBackground(new Color(216, 231, 213));
                        lblReceiptNotification.setOpaque(true);
                        lblReceiptNotification.setForeground(Color.black);
                        lblReceiptNotification.setHorizontalAlignment(SwingConstants.CENTER);
                        lblReceiptNotification.setText("Payment Complete");
                        pnlPrintReceipt.add(lblReceiptNotification);
                        lblReceiptNotification.setBounds(260, 215, 444, 18);

                        //---- lbllReceiptLocation ----
                        lbllReceiptLocation.setText("Via Locations");
                        pnlPrintReceipt.add(lbllReceiptLocation);
                        lbllReceiptLocation.setBounds(new Rectangle(new Point(440, 90), lbllReceiptLocation.getPreferredSize()));

                        //---- lblDepartureDateTimelReceipt ----
                        lblDepartureDateTimelReceipt.setText("Departure Date/Time");
                        pnlPrintReceipt.add(lblDepartureDateTimelReceipt);
                        lblDepartureDateTimelReceipt.setBounds(315, 55, 135, 24);

                        //---- lblReturnDateTimelReceipt ----
                        lblReturnDateTimelReceipt.setText("Return Date/Time");
                        pnlPrintReceipt.add(lblReturnDateTimelReceipt);
                        lblReturnDateTimelReceipt.setBounds(new Rectangle(new Point(535, 55), lblReturnDateTimelReceipt.getPreferredSize()));

                        //---- lblDestinationlReceipt ----
                        lblDestinationlReceipt.setText("Destination");
                        pnlPrintReceipt.add(lblDestinationlReceipt);
                        lblDestinationlReceipt.setBounds(new Rectangle(new Point(460, 30), lblDestinationlReceipt.getPreferredSize()));

                        //---- lblStationlReceipt ----
                        lblStationlReceipt.setText("Station");
                        pnlPrintReceipt.add(lblStationlReceipt);
                        lblStationlReceipt.setBounds(380, 30, 74, lblStationlReceipt.getPreferredSize().height);

                        //---- btnProlReceipt ----
                        btnProlReceipt.setText("PRODUCE RECEIPT");
                        btnProlReceipt.addActionListener(e -> btnProlReceiptActionPerformed(e));
                        pnlPrintReceipt.add(btnProlReceipt);
                        btnProlReceipt.setBounds(new Rectangle(new Point(270, 250), btnProlReceipt.getPreferredSize()));

                        //---- btnPrintReceipt ----
                        btnPrintReceipt.setText("PRINT RECEIPT");
                        btnPrintReceipt.addActionListener(e -> btnPrintReceiptActionPerformed(e));
                        pnlPrintReceipt.add(btnPrintReceipt);
                        btnPrintReceipt.setBounds(270, 285, 145, btnPrintReceipt.getPreferredSize().height);

                        //---- lblViaLocationslReceipt3 ----
                        lblViaLocationslReceipt3.setText("Derby");
                        pnlPrintReceipt.add(lblViaLocationslReceipt3);
                        lblViaLocationslReceipt3.setBounds(440, 155, 96, 20);

                        //---- lblViaLocationslReceipt4 ----
                        lblViaLocationslReceipt4.setText("Sheffield");
                        pnlPrintReceipt.add(lblViaLocationslReceipt4);
                        lblViaLocationslReceipt4.setBounds(440, 110, 96, lblViaLocationslReceipt4.getPreferredSize().height);

                        //---- lblViaLocationslReceipt5 ----
                        lblViaLocationslReceipt5.setText("Nottingham");
                        pnlPrintReceipt.add(lblViaLocationslReceipt5);
                        lblViaLocationslReceipt5.setBounds(440, 135, 96, lblViaLocationslReceipt5.getPreferredSize().height);

                        //---- lblViaLocationlReceipt6 ----
                        lblViaLocationlReceipt6.setText("London");
                        pnlPrintReceipt.add(lblViaLocationlReceipt6);
                        lblViaLocationlReceipt6.setBounds(440, 180, 96, 20);

                        //---- btnPrintPhyTic ----
                        btnPrintPhyTic.setText("PRODUCE TOKEN");
                        btnPrintPhyTic.addActionListener(e -> btnPrintPhyTicActionPerformed(e));
                        pnlPrintReceipt.add(btnPrintPhyTic);
                        btnPrintPhyTic.setBounds(525, 250, 153, btnPrintPhyTic.getPreferredSize().height);

                        //---- btnAddCredit ----
                        btnAddCredit.setText("ACCOUNT TOKEN");
                        btnAddCredit.addActionListener(e -> btnAddCreditActionPerformed(e));
                        pnlPrintReceipt.add(btnAddCredit);
                        btnAddCredit.setBounds(525, 285, 153, btnAddCredit.getPreferredSize().height);

                        //---- txtAccountID ----
                        txtAccountID.setVisible(false);
                        pnlPrintReceipt.add(txtAccountID);
                        txtAccountID.setBounds(494, 297, 0, 0);

                        //---- lblAccount ----
                        lblAccount.setText("Account ID");
                        lblAccount.setVisible(false);
                        pnlPrintReceipt.add(lblAccount);
                        lblAccount.setBounds(126, 297, 0, 0);

                        //---- btnEmail ----
                        btnEmail.setText("SEND TICKET AS EMAIL");
                        btnEmail.addActionListener(e -> btnEmailActionPerformed(e));
                        pnlPrintReceipt.add(btnEmail);
                        btnEmail.setBounds(380, 460, 230, btnEmail.getPreferredSize().height);
                        pnlPrintReceipt.add(txtEmailField);
                        txtEmailField.setBounds(450, 425, 158, txtEmailField.getPreferredSize().height);

                        //---- lblViaLocationlReceipt7 ----
                        lblViaLocationlReceipt7.setText("Please Enter Email");
                        pnlPrintReceipt.add(lblViaLocationlReceipt7);
                        lblViaLocationlReceipt7.setBounds(285, 430, 157, 20);

                        //---- lblViaLocationlReceipt8 ----
                        lblViaLocationlReceipt8.setText("If you would like to send the ticket as an email please fill in the input");
                        lblViaLocationlReceipt8.setHorizontalAlignment(SwingConstants.CENTER);
                        pnlPrintReceipt.add(lblViaLocationlReceipt8);
                        lblViaLocationlReceipt8.setBounds(170, 355, 617, 20);

                        //---- lblViaLocationlReceipt9 ----
                        lblViaLocationlReceipt9.setText("below and then press the button.");
                        lblViaLocationlReceipt9.setHorizontalAlignment(SwingConstants.CENTER);
                        pnlPrintReceipt.add(lblViaLocationlReceipt9);
                        lblViaLocationlReceipt9.setBounds(170, 380, 617, 20);

                        //---- lblReturnTime4 ----
                        lblReturnTime4.setText("text");
                        pnlPrintReceipt.add(lblReturnTime4);
                        lblReturnTime4.setBounds(560, 85, 74, lblReturnTime4.getPreferredSize().height);

                        //---- lblDepartTime5 ----
                        lblDepartTime5.setText("text");
                        pnlPrintReceipt.add(lblDepartTime5);
                        lblDepartTime5.setBounds(345, 85, 108, lblDepartTime5.getPreferredSize().height);

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < pnlPrintReceipt.getComponentCount(); i++) {
                                Rectangle bounds = pnlPrintReceipt.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = pnlPrintReceipt.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            pnlPrintReceipt.setMinimumSize(preferredSize);
                            pnlPrintReceipt.setPreferredSize(preferredSize);
                        }
                    }
                    pnlContent.add(pnlPrintReceipt, "card10");

                    //======== pnlSearchAccount ========
                    {
                        pnlSearchAccount.setLayout(null);

                        //---- lblTicketTypeTransAccPayment2 ----
                        lblTicketTypeTransAccPayment2.setText("Search for account");
                        pnlSearchAccount.add(lblTicketTypeTransAccPayment2);
                        lblTicketTypeTransAccPayment2.setBounds(new Rectangle(new Point(240, 140), lblTicketTypeTransAccPayment2.getPreferredSize()));

                        //---- lblTransAccPaymentInformation2 ----
                        lblTransAccPaymentInformation2.setText("Search for Transport Account");
                        pnlSearchAccount.add(lblTransAccPaymentInformation2);
                        lblTransAccPaymentInformation2.setBounds(new Rectangle(new Point(240, 105), lblTransAccPaymentInformation2.getPreferredSize()));

                        //---- lblTransSearchNot ----
                        lblTransSearchNot.setToolTipText("Information Text");
                        lblTransSearchNot.setBackground(new Color(204, 0, 0));
                        lblTransSearchNot.setOpaque(true);
                        lblTransSearchNot.setForeground(Color.black);
                        lblTransSearchNot.setHorizontalAlignment(SwingConstants.CENTER);
                        lblTransSearchNot.setText("Account cannot be found");
                        lblTransSearchNot.setDoubleBuffered(true);
                        lblTransSearchNot.setVisible(false);
                        pnlSearchAccount.add(lblTransSearchNot);
                        lblTransSearchNot.setBounds(330, 50, 270, 25);

                        //---- btnSearchAccount ----
                        btnSearchAccount.setText("Search for Account");
                        btnSearchAccount.addActionListener(e -> btnSearchAccountActionPerformed(e));
                        pnlSearchAccount.add(btnSearchAccount);
                        btnSearchAccount.setBounds(new Rectangle(new Point(240, 310), btnSearchAccount.getPreferredSize()));

                        //---- lblTicketTypeTransAccAccountId2 ----
                        lblTicketTypeTransAccAccountId2.setText("Account ID");
                        pnlSearchAccount.add(lblTicketTypeTransAccAccountId2);
                        lblTicketTypeTransAccAccountId2.setBounds(new Rectangle(new Point(240, 180), lblTicketTypeTransAccAccountId2.getPreferredSize()));
                        pnlSearchAccount.add(txtFieldAccountID2);
                        txtFieldAccountID2.setBounds(400, 175, 212, txtFieldAccountID2.getPreferredSize().height);

                        { // compute preferred size
                            Dimension preferredSize = new Dimension();
                            for(int i = 0; i < pnlSearchAccount.getComponentCount(); i++) {
                                Rectangle bounds = pnlSearchAccount.getComponent(i).getBounds();
                                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                            }
                            Insets insets = pnlSearchAccount.getInsets();
                            preferredSize.width += insets.right;
                            preferredSize.height += insets.bottom;
                            pnlSearchAccount.setMinimumSize(preferredSize);
                            pnlSearchAccount.setPreferredSize(preferredSize);
                        }
                    }
                    pnlContent.add(pnlSearchAccount, "card11");
                }
                pnlSide.add(pnlContent);
                pnlContent.setBounds(new Rectangle(new Point(155, 80), pnlContent.getPreferredSize()));

                //---- btnGoToMenu ----
                btnGoToMenu.setText("Main Menu");
                btnGoToMenu.addActionListener(e -> btnGoToMenuActionPerformed(e));
                pnlSide.add(btnGoToMenu);
                btnGoToMenu.setBounds(0, 364, 143, 60);
                pnlSide.add(progressBar1);
                progressBar1.setBounds(260, 50, 744, 24);

                //---- label1 ----
                label1.setText("Overall progress");
                pnlSide.add(label1);
                label1.setBounds(555, 30, 146, label1.getPreferredSize().height);

                //---- label2 ----
                label2.setText("You are currently at stage: X of 5");
                pnlSide.add(label2);
                label2.setBounds(new Rectangle(new Point(510, 5), label2.getPreferredSize()));

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < pnlSide.getComponentCount(); i++) {
                        Rectangle bounds = pnlSide.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = pnlSide.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    pnlSide.setMinimumSize(preferredSize);
                    pnlSide.setPreferredSize(preferredSize);
                }
            }
            pnlMain.add(pnlSide, "card2");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Sheffield Hallan
    private JPanel pnlMain;
    private JPanel pnlSide;
    private JButton btnHome;
    private JButton btnSelectLanguage;
    private JButton btnDisplayTimetable;
    private JLabel lblDateTime;
    private JPanel pnlContent;
    private JPanel pnlTransportAccountPayment;
    private JLabel lblPriceTransAccPayment;
    private JLabel lblTicketTypeTransAccPayment;
    private JLabel lblTransAccPaymentInformation;
    private JLabel lblTransAccNotification;
    private JButton btnPayTransAcc;
    private JButton btnPrintAccTic;
    private JLabel lblTicketTypeTransAccAccountId;
    private JTextField txtFieldAccountID;
    private JTextField txtFieldCredit;
    private JLabel lblTicketTypeTransAccAccountId3;
    private JLabel lblDestinationConfirmBookingTransAcc;
    private JLabel lblStationTransAcc;
    private JLabel lblDepartureDateTimeConfirmBooking2;
    private JLabel lblDepartTime2;
    private JLabel lblReturnTimeTransAcc;
    private JLabel lblReturnDateTimeConfirmBooking2;
    private JPanel pnlSelectLanguage;
    private JButton btnLoadLanguage;
    private JLabel lblLanguageLoaded;
    private JLabel lblLanguageLoaded2;
    private JComboBox<String> cmbBoxLanguage;
    private JPanel pnlHome;
    private JButton btnDestination1;
    private JButton btnDestination4;
    private JButton btnDestination5;
    private JButton btnDestination2;
    private JButton btnDestination3;
    private JButton btnDestination6;
    private JLabel lblNotifyLang;
    private JPanel pnlSelectFares;
    private JButton btnSearch;
    private JLabel lblTicketType;
    private JComboBox<String> dpdnDeparture;
    private JComboBox<String> dpdnReturn;
    private JLabel lblDepartureDateTime;
    private JLabel lblReturnDateTime;
    private JLabel lblDestination;
    private JComboBox<String> cmbBoxTicket;
    private JPanel pnlSearchedFares;
    private JButton btnFare3;
    private JButton btnFare1;
    private JButton btnFare2;
    private JPanel pnlConfirmBooking;
    private JButton btnAdvance;
    private JTextField txtCouponCode;
    private JLabel lblCouponCode;
    private JCheckBox ckbxCard;
    private JCheckBox ckbxCash;
    private JLabel lblPaymentMethod;
    private JLabel lblTicketTypeConfirmBooking;
    private JLabel lblPrice;
    private JLabel lblTicketInformation;
    private JLabel lblCouponVerification;
    private JLabel lblDepartureDateTimeConfirmBooking;
    private JLabel lblReturnDateTimeConfirmBooking;
    private JLabel lblDestinationConfirmBooking;
    private JLabel lblStation;
    private JCheckBox ckbxTransAcc;
    private JLabel lblDepartTime;
    private JLabel lblReturnTime;
    private JPanel pnlCashTicketPayment;
    private JLabel lblCashInserted;
    private JLabel lblCashValue;
    private JLabel lblPriceCashPayment;
    private JLabel lblTicketTypeCashPayment;
    private JLabel lblPaymentInformation;
    private JLabel lblNotification;
    private JLabel lblDepartureDateTimeCashPayment;
    private JLabel lblReturnDateTimeCashPayment;
    private JLabel lblDestinationCashPayment;
    private JLabel lblStationCashPayment;
    private JButton btnPayCash;
    private JTextField txtCashValue;
    private JButton btnPrintCashTic;
    private JLabel lblNotification2;
    private JLabel lblReturnTime2;
    private JLabel lblDepartTime3;
    private JPanel pnlCardTicketPayment;
    private JButton btnPrintTicket;
    private JButton btnConfirmPayment;
    private JLabel lblSecurityCode;
    private JTextField txtSecurityCode;
    private JLabel lblCardNumber;
    private JTextField txtCardNumber;
    private JLabel lblCardName;
    private JTextField txtCardName;
    private JLabel lblTicketTypeCardPayment;
    private JLabel lblPriceCardPayment;
    private JLabel lblPaymentInformationCardPayment;
    private JLabel lblPaymentValidate;
    private JLabel lblDepartureDateTimeCardPayment;
    private JLabel lblReturnDateTimeCardPayment;
    private JLabel lblDestinationCardPayment;
    private JLabel lblStationCardPayment;
    private JLabel lblSortCode;
    private JTextField txtSortCode;
    private JLabel lblReturnTime3;
    private JLabel lblDepartTime4;
    private JPanel pnlTimetable;
    private JScrollPane scrollPane;
    private JTable tblTicket;
    private JPanel pnlPrintReceipt;
    private JLabel lblReceiptNotification;
    private JLabel lbllReceiptLocation;
    private JLabel lblDepartureDateTimelReceipt;
    private JLabel lblReturnDateTimelReceipt;
    private JLabel lblDestinationlReceipt;
    private JLabel lblStationlReceipt;
    private JButton btnProlReceipt;
    private JButton btnPrintReceipt;
    private JLabel lblViaLocationslReceipt3;
    private JLabel lblViaLocationslReceipt4;
    private JLabel lblViaLocationslReceipt5;
    private JLabel lblViaLocationlReceipt6;
    private JButton btnPrintPhyTic;
    private JButton btnAddCredit;
    private JTextField txtAccountID;
    private JLabel lblAccount;
    private JButton btnEmail;
    private JTextField txtEmailField;
    private JLabel lblViaLocationlReceipt7;
    private JLabel lblViaLocationlReceipt8;
    private JLabel lblViaLocationlReceipt9;
    private JLabel lblReturnTime4;
    private JLabel lblDepartTime5;
    private JPanel pnlSearchAccount;
    private JLabel lblTicketTypeTransAccPayment2;
    private JLabel lblTransAccPaymentInformation2;
    private JLabel lblTransSearchNot;
    private JButton btnSearchAccount;
    private JLabel lblTicketTypeTransAccAccountId2;
    private JTextField txtFieldAccountID2;
    private JButton btnGoToMenu;
    private JProgressBar progressBar1;
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
