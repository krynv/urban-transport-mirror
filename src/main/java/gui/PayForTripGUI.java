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

            // JFormDesigner evaluation mark
            pnlMain.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), pnlMain.getBorder())); pnlMain.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

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

                        //---- lblPriceTransAccPayment ----
                        lblPriceTransAccPayment.setText("PRICE");

                        //---- lblTicketTypeTransAccPayment ----
                        lblTicketTypeTransAccPayment.setText("Ticket Type");

                        //---- lblTransAccPaymentInformation ----
                        lblTransAccPaymentInformation.setText("Transport Account Payment Information");

                        //---- lblTransAccNotification ----
                        lblTransAccNotification.setToolTipText("Information Text");
                        lblTransAccNotification.setBackground(new Color(216, 231, 213));
                        lblTransAccNotification.setOpaque(true);
                        lblTransAccNotification.setForeground(Color.black);
                        lblTransAccNotification.setHorizontalAlignment(SwingConstants.CENTER);
                        lblTransAccNotification.setText("Payment Successfully Made");

                        //---- btnPayTransAcc ----
                        btnPayTransAcc.setText("Pay with Account");
                        btnPayTransAcc.addActionListener(e -> btnPayTransAccActionPerformed(e));

                        //---- btnPrintAccTic ----
                        btnPrintAccTic.setText("Advance");
                        btnPrintAccTic.addActionListener(e -> btnPrintAccTicActionPerformed(e));

                        //---- lblTicketTypeTransAccAccountId ----
                        lblTicketTypeTransAccAccountId.setText("Account ID");

                        //---- txtFieldAccountID ----
                        txtFieldAccountID.setEnabled(false);

                        //---- txtFieldCredit ----
                        txtFieldCredit.setEnabled(false);

                        //---- lblTicketTypeTransAccAccountId3 ----
                        lblTicketTypeTransAccAccountId3.setText("Credit");

                        //---- lblDestinationConfirmBookingTransAcc ----
                        lblDestinationConfirmBookingTransAcc.setText("Destination");

                        //---- lblStationTransAcc ----
                        lblStationTransAcc.setText("Station");

                        //---- lblDepartureDateTimeConfirmBooking2 ----
                        lblDepartureDateTimeConfirmBooking2.setText("Departure Time");

                        //---- lblDepartTime2 ----
                        lblDepartTime2.setText("text");

                        //---- lblReturnTimeTransAcc ----
                        lblReturnTimeTransAcc.setText("text");

                        //---- lblReturnDateTimeConfirmBooking2 ----
                        lblReturnDateTimeConfirmBooking2.setText("Return Time");

                        GroupLayout pnlTransportAccountPaymentLayout = new GroupLayout(pnlTransportAccountPayment);
                        pnlTransportAccountPayment.setLayout(pnlTransportAccountPaymentLayout);
                        pnlTransportAccountPaymentLayout.setHorizontalGroup(
                            pnlTransportAccountPaymentLayout.createParallelGroup()
                                .addGroup(pnlTransportAccountPaymentLayout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addGroup(pnlTransportAccountPaymentLayout.createParallelGroup()
                                        .addGroup(pnlTransportAccountPaymentLayout.createSequentialGroup()
                                            .addGroup(pnlTransportAccountPaymentLayout.createParallelGroup()
                                                .addGroup(pnlTransportAccountPaymentLayout.createSequentialGroup()
                                                    .addGap(229, 229, 229)
                                                    .addComponent(btnPrintAccTic))
                                                .addGroup(pnlTransportAccountPaymentLayout.createParallelGroup()
                                                    .addGroup(pnlTransportAccountPaymentLayout.createSequentialGroup()
                                                        .addGap(106, 106, 106)
                                                        .addComponent(lblTransAccNotification, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(lblTransAccPaymentInformation)
                                                    .addGroup(GroupLayout.Alignment.TRAILING, pnlTransportAccountPaymentLayout.createSequentialGroup()
                                                        .addComponent(btnPayTransAcc)
                                                        .addGap(177, 177, 177))
                                                    .addGroup(pnlTransportAccountPaymentLayout.createSequentialGroup()
                                                        .addGroup(pnlTransportAccountPaymentLayout.createParallelGroup()
                                                            .addComponent(lblTicketTypeTransAccPayment)
                                                            .addComponent(lblTicketTypeTransAccAccountId))
                                                        .addGap(40, 40, 40)
                                                        .addGroup(pnlTransportAccountPaymentLayout.createParallelGroup()
                                                            .addComponent(lblPriceTransAccPayment, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtFieldAccountID, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(GroupLayout.Alignment.TRAILING, pnlTransportAccountPaymentLayout.createSequentialGroup()
                                                        .addComponent(lblTicketTypeTransAccAccountId3)
                                                        .addGap(42, 42, 42)
                                                        .addComponent(txtFieldCredit, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE))))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 153, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, pnlTransportAccountPaymentLayout.createSequentialGroup()
                                            .addGap(149, 149, 149)
                                            .addGroup(pnlTransportAccountPaymentLayout.createParallelGroup()
                                                .addGroup(pnlTransportAccountPaymentLayout.createSequentialGroup()
                                                    .addGap(118, 118, 118)
                                                    .addComponent(lblStationTransAcc)
                                                    .addGap(6, 6, 6)
                                                    .addComponent(lblDestinationConfirmBookingTransAcc))
                                                .addGroup(pnlTransportAccountPaymentLayout.createSequentialGroup()
                                                    .addComponent(lblDepartureDateTimeConfirmBooking2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(82, 82, 82)
                                                    .addComponent(lblReturnDateTimeConfirmBooking2))
                                                .addGroup(pnlTransportAccountPaymentLayout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(lblDepartTime2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(103, 103, 103)
                                                    .addComponent(lblReturnTimeTransAcc, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))))
                                    .addContainerGap(115, Short.MAX_VALUE))
                        );
                        pnlTransportAccountPaymentLayout.setVerticalGroup(
                            pnlTransportAccountPaymentLayout.createParallelGroup()
                                .addGroup(pnlTransportAccountPaymentLayout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(pnlTransportAccountPaymentLayout.createParallelGroup()
                                        .addComponent(lblStationTransAcc)
                                        .addComponent(lblDestinationConfirmBookingTransAcc))
                                    .addGap(6, 6, 6)
                                    .addGroup(pnlTransportAccountPaymentLayout.createParallelGroup()
                                        .addComponent(lblDepartureDateTimeConfirmBooking2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlTransportAccountPaymentLayout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(lblReturnDateTimeConfirmBooking2)))
                                    .addGap(6, 6, 6)
                                    .addGroup(pnlTransportAccountPaymentLayout.createParallelGroup()
                                        .addComponent(lblDepartTime2)
                                        .addComponent(lblReturnTimeTransAcc))
                                    .addGap(18, 18, 18)
                                    .addComponent(lblTransAccNotification, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblTransAccPaymentInformation)
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlTransportAccountPaymentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTicketTypeTransAccPayment)
                                        .addComponent(lblPriceTransAccPayment))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlTransportAccountPaymentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTicketTypeTransAccAccountId)
                                        .addComponent(txtFieldAccountID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlTransportAccountPaymentLayout.createParallelGroup()
                                        .addGroup(pnlTransportAccountPaymentLayout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(lblTicketTypeTransAccAccountId3))
                                        .addComponent(txtFieldCredit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                    .addGroup(pnlTransportAccountPaymentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPrintAccTic)
                                        .addComponent(btnPayTransAcc))
                                    .addGap(134, 134, 134))
                        );
                    }
                    pnlContent.add(pnlTransportAccountPayment, "card9");

                    //======== pnlSelectLanguage ========
                    {

                        //---- btnLoadLanguage ----
                        btnLoadLanguage.setText("Load Language");
                        btnLoadLanguage.addActionListener(e -> btnLoadLanguageActionPerformed(e));

                        //---- lblLanguageLoaded ----
                        lblLanguageLoaded.setText("Language Loaded");

                        //---- lblLanguageLoaded2 ----
                        lblLanguageLoaded2.setText("Please select a language from the dropdown list");

                        //---- cmbBoxLanguage ----
                        cmbBoxLanguage.setModel(new DefaultComboBoxModel<>(new String[] {
                            "English (UK)",
                            "English (US)",
                            "French",
                            "German",
                            "Spanish",
                            "Welsh"
                        }));

                        GroupLayout pnlSelectLanguageLayout = new GroupLayout(pnlSelectLanguage);
                        pnlSelectLanguage.setLayout(pnlSelectLanguageLayout);
                        pnlSelectLanguageLayout.setHorizontalGroup(
                            pnlSelectLanguageLayout.createParallelGroup()
                                .addGroup(pnlSelectLanguageLayout.createSequentialGroup()
                                    .addContainerGap(201, Short.MAX_VALUE)
                                    .addGroup(pnlSelectLanguageLayout.createParallelGroup()
                                        .addGroup(GroupLayout.Alignment.TRAILING, pnlSelectLanguageLayout.createSequentialGroup()
                                            .addGroup(pnlSelectLanguageLayout.createParallelGroup()
                                                .addComponent(lblLanguageLoaded2, GroupLayout.Alignment.TRAILING)
                                                .addGroup(GroupLayout.Alignment.TRAILING, pnlSelectLanguageLayout.createSequentialGroup()
                                                    .addGroup(pnlSelectLanguageLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnLoadLanguage)
                                                        .addComponent(cmbBoxLanguage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                    .addGap(71, 71, 71)))
                                            .addGap(161, 161, 161))
                                        .addGroup(GroupLayout.Alignment.TRAILING, pnlSelectLanguageLayout.createSequentialGroup()
                                            .addComponent(lblLanguageLoaded)
                                            .addGap(213, 213, 213))))
                        );
                        pnlSelectLanguageLayout.setVerticalGroup(
                            pnlSelectLanguageLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, pnlSelectLanguageLayout.createSequentialGroup()
                                    .addContainerGap(72, Short.MAX_VALUE)
                                    .addComponent(lblLanguageLoaded)
                                    .addGap(43, 43, 43)
                                    .addComponent(lblLanguageLoaded2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbBoxLanguage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(139, 139, 139)
                                    .addComponent(btnLoadLanguage)
                                    .addGap(95, 95, 95))
                        );
                    }
                    pnlContent.add(pnlSelectLanguage, "card2");

                    //======== pnlHome ========
                    {

                        //---- btnDestination1 ----
                        btnDestination1.setText("London");
                        btnDestination1.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                        btnDestination1.addActionListener(e -> btnDestination1ActionPerformed(e));

                        //---- btnDestination4 ----
                        btnDestination4.setText("Nottingham");
                        btnDestination4.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                        btnDestination4.addActionListener(e -> btnDestination4ActionPerformed(e));

                        //---- btnDestination5 ----
                        btnDestination5.setText("Newcastle");
                        btnDestination5.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                        btnDestination5.addActionListener(e -> btnDestination5ActionPerformed(e));

                        //---- btnDestination2 ----
                        btnDestination2.setText("Sheffield");
                        btnDestination2.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                        btnDestination2.addChangeListener(e -> btnDestination2StateChanged(e));
                        btnDestination2.addActionListener(e -> btnDestination2ActionPerformed(e));

                        //---- btnDestination3 ----
                        btnDestination3.setText("Derby");
                        btnDestination3.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                        btnDestination3.addActionListener(e -> btnDestination3ActionPerformed(e));

                        //---- btnDestination6 ----
                        btnDestination6.setText("Leicester");
                        btnDestination6.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                        btnDestination6.addActionListener(e -> btnDestination6ActionPerformed(e));

                        //---- lblNotifyLang ----
                        lblNotifyLang.setToolTipText("Information Text");
                        lblNotifyLang.setBackground(new Color(216, 231, 213));
                        lblNotifyLang.setOpaque(true);
                        lblNotifyLang.setForeground(Color.black);
                        lblNotifyLang.setHorizontalAlignment(SwingConstants.CENTER);
                        lblNotifyLang.setText("Language Changed");

                        GroupLayout pnlHomeLayout = new GroupLayout(pnlHome);
                        pnlHome.setLayout(pnlHomeLayout);
                        pnlHomeLayout.setHorizontalGroup(
                            pnlHomeLayout.createParallelGroup()
                                .addGroup(pnlHomeLayout.createSequentialGroup()
                                    .addGap(0, 167, Short.MAX_VALUE)
                                    .addGroup(pnlHomeLayout.createParallelGroup()
                                        .addGroup(pnlHomeLayout.createSequentialGroup()
                                            .addComponent(btnDestination1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(btnDestination2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnDestination3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlHomeLayout.createSequentialGroup()
                                            .addComponent(btnDestination4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnDestination5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(btnDestination6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 167, Short.MAX_VALUE))
                                .addGroup(pnlHomeLayout.createSequentialGroup()
                                    .addGap(171, 171, 171)
                                    .addComponent(lblNotifyLang, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(283, Short.MAX_VALUE))
                        );
                        pnlHomeLayout.setVerticalGroup(
                            pnlHomeLayout.createParallelGroup()
                                .addGroup(pnlHomeLayout.createSequentialGroup()
                                    .addGap(0, 52, Short.MAX_VALUE)
                                    .addComponent(lblNotifyLang, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addGroup(pnlHomeLayout.createParallelGroup()
                                        .addComponent(btnDestination1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlHomeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnDestination3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDestination2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(33, 33, 33)
                                    .addGroup(pnlHomeLayout.createParallelGroup()
                                        .addGroup(pnlHomeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnDestination5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDestination4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnDestination6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 105, Short.MAX_VALUE))
                        );
                    }
                    pnlContent.add(pnlHome, "card1");

                    //======== pnlSelectFares ========
                    {

                        //---- btnSearch ----
                        btnSearch.setText("Search");
                        btnSearch.addActionListener(e -> searchActionPerformed(e));

                        //---- lblTicketType ----
                        lblTicketType.setText("Ticket Type");

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

                        //---- lblDepartureDateTime ----
                        lblDepartureDateTime.setText("Departure Date/Time");

                        //---- lblReturnDateTime ----
                        lblReturnDateTime.setText("Return Date/Time");

                        //---- lblDestination ----
                        lblDestination.setText("London");

                        //---- cmbBoxTicket ----
                        cmbBoxTicket.setModel(new DefaultComboBoxModel<>(new String[] {
                            "One Way",
                            "Open Return",
                            "Return"
                        }));
                        cmbBoxTicket.addItemListener(e -> cmbBoxTicketItemStateChanged(e));

                        GroupLayout pnlSelectFaresLayout = new GroupLayout(pnlSelectFares);
                        pnlSelectFares.setLayout(pnlSelectFaresLayout);
                        pnlSelectFaresLayout.setHorizontalGroup(
                            pnlSelectFaresLayout.createParallelGroup()
                                .addGroup(pnlSelectFaresLayout.createParallelGroup()
                                    .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(pnlSelectFaresLayout.createParallelGroup()
                                            .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                                .addGap(112, 112, 112)
                                                .addComponent(lblDestination))
                                            .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                                .addComponent(lblDepartureDateTime)
                                                .addGap(63, 63, 63)
                                                .addComponent(lblReturnDateTime, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                                .addComponent(dpdnDeparture, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(dpdnReturn, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                                .addGap(286, 286, 286)
                                                .addComponent(btnSearch)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                    .addGap(294, 294, 294)
                                    .addGroup(pnlSelectFaresLayout.createParallelGroup()
                                        .addComponent(cmbBoxTicket, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTicketType))
                                    .addContainerGap(254, Short.MAX_VALUE))
                        );
                        pnlSelectFaresLayout.setVerticalGroup(
                            pnlSelectFaresLayout.createParallelGroup()
                                .addGroup(pnlSelectFaresLayout.createParallelGroup()
                                    .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblDestination)
                                        .addGap(28, 28, 28)
                                        .addGroup(pnlSelectFaresLayout.createParallelGroup()
                                            .addComponent(lblDepartureDateTime, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblReturnDateTime, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(pnlSelectFaresLayout.createParallelGroup()
                                            .addComponent(dpdnDeparture, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dpdnReturn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGap(105, 105, 105)
                                        .addComponent(btnSearch)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(GroupLayout.Alignment.TRAILING, pnlSelectFaresLayout.createSequentialGroup()
                                    .addContainerGap(220, Short.MAX_VALUE)
                                    .addComponent(lblTicketType)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbBoxTicket, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(171, 171, 171))
                        );
                    }
                    pnlContent.add(pnlSelectFares, "card3");

                    //======== pnlSearchedFares ========
                    {

                        //---- btnFare3 ----
                        btnFare3.setText("<html>\nDestination <br>\nDeparture Date/Time <br>\nReturn Date/Time <br>\nPRICE\n</html>");
                        btnFare3.setHorizontalAlignment(SwingConstants.TRAILING);
                        btnFare3.setFont(new Font(".SF NS Text", Font.PLAIN, 11));
                        btnFare3.addActionListener(e -> btnFare3ActionPerformed(e));

                        //---- btnFare1 ----
                        btnFare1.setText("<html> Destination <br> Departure Date/Time <br> Return Date/Time <br> PRICE </html>");
                        btnFare1.setHorizontalAlignment(SwingConstants.TRAILING);
                        btnFare1.setFont(new Font(".SF NS Text", Font.PLAIN, 11));
                        btnFare1.addActionListener(e -> btnFare1ActionPerformed(e));

                        //---- btnFare2 ----
                        btnFare2.setText("<html>\nDestination <br>\nDeparture Date/Time <br>\nReturn Date/Time <br>\nPRICE\n</html>");
                        btnFare2.setHorizontalAlignment(SwingConstants.TRAILING);
                        btnFare2.setFont(new Font(".SF NS Text", Font.PLAIN, 11));
                        btnFare2.addActionListener(e -> btnFare2ActionPerformed(e));

                        GroupLayout pnlSearchedFaresLayout = new GroupLayout(pnlSearchedFares);
                        pnlSearchedFares.setLayout(pnlSearchedFaresLayout);
                        pnlSearchedFaresLayout.setHorizontalGroup(
                            pnlSearchedFaresLayout.createParallelGroup()
                                .addGroup(pnlSearchedFaresLayout.createSequentialGroup()
                                    .addGap(116, 116, 116)
                                    .addGroup(pnlSearchedFaresLayout.createParallelGroup()
                                        .addGroup(pnlSearchedFaresLayout.createSequentialGroup()
                                            .addComponent(btnFare1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(btnFare2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnFare3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(236, Short.MAX_VALUE))
                        );
                        pnlSearchedFaresLayout.setVerticalGroup(
                            pnlSearchedFaresLayout.createParallelGroup()
                                .addGroup(pnlSearchedFaresLayout.createSequentialGroup()
                                    .addGap(141, 141, 141)
                                    .addGroup(pnlSearchedFaresLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnFare2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnFare1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addComponent(btnFare3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(154, Short.MAX_VALUE))
                        );
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

                        //---- lblCashInserted ----
                        lblCashInserted.setText("Cash Inserted");

                        //---- lblCashValue ----
                        lblCashValue.setText("VALUE");

                        //---- lblPriceCashPayment ----
                        lblPriceCashPayment.setText("PRICE");

                        //---- lblTicketTypeCashPayment ----
                        lblTicketTypeCashPayment.setText("Ticket Type");

                        //---- lblPaymentInformation ----
                        lblPaymentInformation.setText("Payment Information");

                        //---- lblNotification ----
                        lblNotification.setToolTipText("Information Text");
                        lblNotification.setBackground(new Color(216, 231, 213));
                        lblNotification.setOpaque(true);
                        lblNotification.setText("Input cash to confirm payment");
                        lblNotification.setForeground(Color.black);
                        lblNotification.setHorizontalAlignment(SwingConstants.CENTER);

                        //---- lblDepartureDateTimeCashPayment ----
                        lblDepartureDateTimeCashPayment.setText("Departure Time");

                        //---- lblReturnDateTimeCashPayment ----
                        lblReturnDateTimeCashPayment.setText("Return Time");

                        //---- lblDestinationCashPayment ----
                        lblDestinationCashPayment.setText("Destination");

                        //---- lblStationCashPayment ----
                        lblStationCashPayment.setText("Station");

                        //---- btnPayCash ----
                        btnPayCash.setText("Pay");
                        btnPayCash.addActionListener(e -> btnPayCashActionPerformed(e));

                        //---- btnPrintCashTic ----
                        btnPrintCashTic.setText("Advance");
                        btnPrintCashTic.addActionListener(e -> btnPrintCashTicActionPerformed(e));

                        //---- lblNotification2 ----
                        lblNotification2.setToolTipText("Information Text");
                        lblNotification2.setBackground(new Color(216, 231, 213));
                        lblNotification2.setOpaque(true);
                        lblNotification2.setText("Input cash to confirm payment");
                        lblNotification2.setForeground(Color.black);
                        lblNotification2.setHorizontalAlignment(SwingConstants.CENTER);

                        //---- lblReturnTime2 ----
                        lblReturnTime2.setText("text");

                        //---- lblDepartTime3 ----
                        lblDepartTime3.setText("text");

                        GroupLayout pnlCashTicketPaymentLayout = new GroupLayout(pnlCashTicketPayment);
                        pnlCashTicketPayment.setLayout(pnlCashTicketPaymentLayout);
                        pnlCashTicketPaymentLayout.setHorizontalGroup(
                            pnlCashTicketPaymentLayout.createParallelGroup()
                                .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addGroup(pnlCashTicketPaymentLayout.createParallelGroup()
                                        .addComponent(lblPaymentInformation)
                                        .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                            .addComponent(txtCashValue, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(btnPayCash)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnPrintCashTic))
                                        .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                            .addGap(152, 152, 152)
                                            .addComponent(lblStationCashPayment)
                                            .addGap(6, 6, 6)
                                            .addComponent(lblDestinationCashPayment))
                                        .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                            .addGroup(pnlCashTicketPaymentLayout.createParallelGroup()
                                                .addComponent(lblCashInserted)
                                                .addComponent(lblTicketTypeCashPayment))
                                            .addGap(55, 55, 55)
                                            .addGroup(pnlCashTicketPaymentLayout.createParallelGroup()
                                                .addComponent(lblPriceCashPayment, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblCashValue)))
                                        .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                            .addGap(84, 84, 84)
                                            .addGroup(pnlCashTicketPaymentLayout.createParallelGroup()
                                                .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                                    .addGroup(pnlCashTicketPaymentLayout.createParallelGroup()
                                                        .addComponent(lblDepartureDateTimeCashPayment, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblDepartTime3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(pnlCashTicketPaymentLayout.createParallelGroup()
                                                        .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                                            .addGap(6, 6, 6)
                                                            .addComponent(lblReturnTime2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(lblReturnDateTimeCashPayment)))
                                                .addComponent(lblNotification, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblNotification2, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))))
                                    .addContainerGap(274, Short.MAX_VALUE))
                        );
                        pnlCashTicketPaymentLayout.setVerticalGroup(
                            pnlCashTicketPaymentLayout.createParallelGroup()
                                .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                    .addGap(106, 106, 106)
                                    .addGroup(pnlCashTicketPaymentLayout.createParallelGroup()
                                        .addComponent(lblStationCashPayment)
                                        .addComponent(lblDestinationCashPayment))
                                    .addGap(6, 6, 6)
                                    .addGroup(pnlCashTicketPaymentLayout.createParallelGroup()
                                        .addComponent(lblDepartureDateTimeCashPayment, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(lblReturnDateTimeCashPayment)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(pnlCashTicketPaymentLayout.createParallelGroup()
                                        .addComponent(lblDepartTime3)
                                        .addComponent(lblReturnTime2))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblNotification, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblNotification2, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(lblPaymentInformation)
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlCashTicketPaymentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTicketTypeCashPayment)
                                        .addComponent(lblPriceCashPayment))
                                    .addGap(12, 12, 12)
                                    .addGroup(pnlCashTicketPaymentLayout.createParallelGroup()
                                        .addComponent(lblCashInserted)
                                        .addComponent(lblCashValue))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                    .addGroup(pnlCashTicketPaymentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCashValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPrintCashTic)
                                        .addComponent(btnPayCash))
                                    .addGap(79, 79, 79))
                        );
                    }
                    pnlContent.add(pnlCashTicketPayment, "card6");

                    //======== pnlCardTicketPayment ========
                    {

                        //---- btnPrintTicket ----
                        btnPrintTicket.setText("Advance");
                        btnPrintTicket.addActionListener(e -> {
			btnPrintTicketActionPerformed(e);
			btnPrintTicketActionPerformed(e);
		});

                        //---- btnConfirmPayment ----
                        btnConfirmPayment.setText("Confirm Payment");
                        btnConfirmPayment.addActionListener(e -> btnConfirmPaymentActionPerformed(e));

                        //---- lblSecurityCode ----
                        lblSecurityCode.setText("Security Code");
                        lblSecurityCode.setLabelFor(txtSecurityCode);

                        //---- lblCardNumber ----
                        lblCardNumber.setText("Card Number");
                        lblCardNumber.setLabelFor(txtCardNumber);

                        //---- lblCardName ----
                        lblCardName.setText("Card Name");
                        lblCardName.setLabelFor(txtCardName);

                        //---- lblTicketTypeCardPayment ----
                        lblTicketTypeCardPayment.setText("Ticket Type");

                        //---- lblPriceCardPayment ----
                        lblPriceCardPayment.setText("PRICE");

                        //---- lblPaymentInformationCardPayment ----
                        lblPaymentInformationCardPayment.setText("Payment Information");

                        //---- lblPaymentValidate ----
                        lblPaymentValidate.setToolTipText("Coupon Validity Check");
                        lblPaymentValidate.setHorizontalAlignment(SwingConstants.CENTER);
                        lblPaymentValidate.setHorizontalTextPosition(SwingConstants.CENTER);

                        //---- lblDepartureDateTimeCardPayment ----
                        lblDepartureDateTimeCardPayment.setText("Departure Time");

                        //---- lblReturnDateTimeCardPayment ----
                        lblReturnDateTimeCardPayment.setText("Return Time");

                        //---- lblDestinationCardPayment ----
                        lblDestinationCardPayment.setText("Destination");

                        //---- lblStationCardPayment ----
                        lblStationCardPayment.setText("Station");

                        //---- lblSortCode ----
                        lblSortCode.setText("Sort Code");
                        lblSortCode.setLabelFor(txtSecurityCode);

                        //---- lblReturnTime3 ----
                        lblReturnTime3.setText("text");

                        //---- lblDepartTime4 ----
                        lblDepartTime4.setText("text");

                        GroupLayout pnlCardTicketPaymentLayout = new GroupLayout(pnlCardTicketPayment);
                        pnlCardTicketPayment.setLayout(pnlCardTicketPaymentLayout);
                        pnlCardTicketPaymentLayout.setHorizontalGroup(
                            pnlCardTicketPaymentLayout.createParallelGroup()
                                .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addGroup(pnlCardTicketPaymentLayout.createParallelGroup()
                                        .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                            .addGap(157, 157, 157)
                                            .addComponent(lblStationCardPayment)
                                            .addGap(6, 6, 6)
                                            .addComponent(lblDestinationCardPayment))
                                        .addComponent(lblPaymentInformationCardPayment)
                                        .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addComponent(lblTicketTypeCardPayment)
                                            .addGap(73, 73, 73)
                                            .addComponent(lblPriceCardPayment))
                                        .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addComponent(lblCardName, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                            .addGap(42, 42, 42)
                                            .addComponent(txtCardName, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                            .addGap(71, 71, 71)
                                            .addComponent(lblPaymentValidate, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addGroup(pnlCardTicketPaymentLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                                    .addComponent(lblSortCode)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtSortCode, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                                    .addComponent(lblSecurityCode)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtSecurityCode, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                                    .addComponent(lblCardNumber, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(42, 42, 42)
                                                    .addComponent(txtCardNumber, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                            .addGap(59, 59, 59)
                                            .addGroup(pnlCardTicketPaymentLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblDepartureDateTimeCardPayment, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblDepartTime4, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
                                            .addGap(33, 33, 33)
                                            .addGroup(pnlCardTicketPaymentLayout.createParallelGroup()
                                                .addComponent(lblReturnDateTimeCardPayment)
                                                .addComponent(lblReturnTime3, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, pnlCardTicketPaymentLayout.createSequentialGroup()
                                            .addComponent(btnPrintTicket)
                                            .addGap(66, 66, 66)
                                            .addComponent(btnConfirmPayment)))
                                    .addContainerGap(214, Short.MAX_VALUE))
                        );
                        pnlCardTicketPaymentLayout.setVerticalGroup(
                            pnlCardTicketPaymentLayout.createParallelGroup()
                                .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(pnlCardTicketPaymentLayout.createParallelGroup()
                                        .addComponent(lblStationCardPayment)
                                        .addComponent(lblDestinationCardPayment))
                                    .addGap(6, 6, 6)
                                    .addGroup(pnlCardTicketPaymentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDepartureDateTimeCardPayment, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblReturnDateTimeCardPayment))
                                    .addGap(6, 6, 6)
                                    .addGroup(pnlCardTicketPaymentLayout.createParallelGroup()
                                        .addComponent(lblDepartTime4)
                                        .addComponent(lblReturnTime3))
                                    .addGap(10, 10, 10)
                                    .addComponent(lblPaymentValidate, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22)
                                    .addComponent(lblPaymentInformationCardPayment)
                                    .addGap(9, 9, 9)
                                    .addGroup(pnlCardTicketPaymentLayout.createParallelGroup()
                                        .addComponent(lblTicketTypeCardPayment)
                                        .addComponent(lblPriceCardPayment))
                                    .addGap(22, 22, 22)
                                    .addGroup(pnlCardTicketPaymentLayout.createParallelGroup()
                                        .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(lblCardName))
                                        .addComponent(txtCardName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addGroup(pnlCardTicketPaymentLayout.createParallelGroup()
                                        .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(lblCardNumber))
                                        .addComponent(txtCardNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCardTicketPaymentLayout.createParallelGroup()
                                        .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(lblSecurityCode)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblSortCode)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 55, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtSecurityCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtSortCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(pnlCardTicketPaymentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnConfirmPayment)
                                                .addComponent(btnPrintTicket))))
                                    .addGap(89, 89, 89))
                        );
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
                                .addGap(0, 658, Short.MAX_VALUE)
                        );
                        pnlTimetableLayout.setVerticalGroup(
                            pnlTimetableLayout.createParallelGroup()
                                .addGroup(pnlTimetableLayout.createParallelGroup()
                                    .addGroup(pnlTimetableLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 445, Short.MAX_VALUE)
                        );
                    }
                    pnlContent.add(pnlTimetable, "card8");

                    //======== pnlPrintReceipt ========
                    {

                        //---- lblReceiptNotification ----
                        lblReceiptNotification.setToolTipText("Information Text");
                        lblReceiptNotification.setBackground(new Color(216, 231, 213));
                        lblReceiptNotification.setOpaque(true);
                        lblReceiptNotification.setForeground(Color.black);
                        lblReceiptNotification.setHorizontalAlignment(SwingConstants.CENTER);
                        lblReceiptNotification.setText("Payment Complete");

                        //---- lbllReceiptLocation ----
                        lbllReceiptLocation.setText("Via Locations");

                        //---- lblDepartureDateTimelReceipt ----
                        lblDepartureDateTimelReceipt.setText("Departure Date/Time");

                        //---- lblReturnDateTimelReceipt ----
                        lblReturnDateTimelReceipt.setText("Return Date/Time");

                        //---- lblDestinationlReceipt ----
                        lblDestinationlReceipt.setText("Destination");

                        //---- lblStationlReceipt ----
                        lblStationlReceipt.setText("Station");

                        //---- btnProlReceipt ----
                        btnProlReceipt.setText("PRODUCE RECEIPT");
                        btnProlReceipt.addActionListener(e -> btnProlReceiptActionPerformed(e));

                        //---- btnPrintReceipt ----
                        btnPrintReceipt.setText("PRINT RECEIPT");
                        btnPrintReceipt.addActionListener(e -> btnPrintReceiptActionPerformed(e));

                        //---- lblViaLocationslReceipt3 ----
                        lblViaLocationslReceipt3.setText("Derby");

                        //---- lblViaLocationslReceipt4 ----
                        lblViaLocationslReceipt4.setText("Sheffield");

                        //---- lblViaLocationslReceipt5 ----
                        lblViaLocationslReceipt5.setText("Nottingham");

                        //---- lblViaLocationlReceipt6 ----
                        lblViaLocationlReceipt6.setText("London");

                        //---- btnPrintPhyTic ----
                        btnPrintPhyTic.setText("PRODUCE TOKEN");
                        btnPrintPhyTic.addActionListener(e -> btnPrintPhyTicActionPerformed(e));

                        //---- btnAddCredit ----
                        btnAddCredit.setText("ACCOUNT TOKEN");
                        btnAddCredit.addActionListener(e -> btnAddCreditActionPerformed(e));

                        //---- txtAccountID ----
                        txtAccountID.setVisible(false);

                        //---- lblAccount ----
                        lblAccount.setText("Account ID");
                        lblAccount.setVisible(false);

                        //---- btnEmail ----
                        btnEmail.setText("SEND TICKET AS EMAIL");
                        btnEmail.addActionListener(e -> btnEmailActionPerformed(e));

                        //---- lblViaLocationlReceipt7 ----
                        lblViaLocationlReceipt7.setText("Please Enter Email");

                        //---- lblViaLocationlReceipt8 ----
                        lblViaLocationlReceipt8.setText("If you would like to send the ticket as an email please fill in the input");
                        lblViaLocationlReceipt8.setHorizontalAlignment(SwingConstants.CENTER);

                        //---- lblViaLocationlReceipt9 ----
                        lblViaLocationlReceipt9.setText("below and then press the button.");
                        lblViaLocationlReceipt9.setHorizontalAlignment(SwingConstants.CENTER);

                        //---- lblReturnTime4 ----
                        lblReturnTime4.setText("text");

                        //---- lblDepartTime5 ----
                        lblDepartTime5.setText("text");

                        GroupLayout pnlPrintReceiptLayout = new GroupLayout(pnlPrintReceipt);
                        pnlPrintReceipt.setLayout(pnlPrintReceiptLayout);
                        pnlPrintReceiptLayout.setHorizontalGroup(
                            pnlPrintReceiptLayout.createParallelGroup()
                                .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addGroup(pnlPrintReceiptLayout.createParallelGroup()
                                        .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                            .addGroup(pnlPrintReceiptLayout.createParallelGroup()
                                                .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                                    .addGap(157, 157, 157)
                                                    .addComponent(lblStationlReceipt)
                                                    .addGap(26, 26, 26)
                                                    .addComponent(lblDestinationlReceipt))
                                                .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                                    .addGap(179, 179, 179)
                                                    .addGroup(pnlPrintReceiptLayout.createParallelGroup()
                                                        .addComponent(lblViaLocationslReceipt5, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblViaLocationslReceipt3, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblViaLocationlReceipt6, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblViaLocationslReceipt4, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbllReceiptLocation)))
                                                .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                                    .addGap(29, 29, 29)
                                                    .addGroup(pnlPrintReceiptLayout.createParallelGroup()
                                                        .addComponent(btnPrintReceipt, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                                            .addComponent(lblAccount, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(pnlPrintReceiptLayout.createParallelGroup()
                                                                .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                                                    .addGap(368, 368, 368)
                                                                    .addComponent(txtAccountID, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                                                    .addGroup(pnlPrintReceiptLayout.createParallelGroup()
                                                                        .addComponent(lblDepartureDateTimelReceipt, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                                                            .addGap(6, 6, 6)
                                                                            .addComponent(lblDepartTime5, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
                                                                    .addGap(133, 133, 133)
                                                                    .addGroup(pnlPrintReceiptLayout.createParallelGroup()
                                                                        .addComponent(lblReturnTime4, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lblReturnDateTimelReceipt)))
                                                                .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                                                    .addComponent(btnProlReceipt)
                                                                    .addGap(108, 108, 108)
                                                                    .addGroup(pnlPrintReceiptLayout.createParallelGroup()
                                                                        .addComponent(btnPrintPhyTic, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnAddCredit, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))))))
                                                .addComponent(lblReceiptNotification, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE))
                                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                            .addGroup(pnlPrintReceiptLayout.createParallelGroup()
                                                .addComponent(lblViaLocationlReceipt9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblViaLocationlReceipt8, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(14, 14, 14))
                                        .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(pnlPrintReceiptLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnEmail, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                                    .addComponent(lblViaLocationlReceipt7, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtEmailField, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                        );
                        pnlPrintReceiptLayout.setVerticalGroup(
                            pnlPrintReceiptLayout.createParallelGroup()
                                .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(pnlPrintReceiptLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblStationlReceipt)
                                        .addComponent(lblDestinationlReceipt))
                                    .addGroup(pnlPrintReceiptLayout.createParallelGroup()
                                        .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblDepartureDateTimelReceipt, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                            .addGap(5, 5, 5)
                                            .addComponent(lblDepartTime5))
                                        .addGroup(pnlPrintReceiptLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(lblReturnDateTimelReceipt)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblReturnTime4)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbllReceiptLocation)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblViaLocationslReceipt4)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblViaLocationslReceipt5)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblViaLocationslReceipt3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblViaLocationlReceipt6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblReceiptNotification, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlPrintReceiptLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnProlReceipt)
                                        .addComponent(btnPrintPhyTic))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlPrintReceiptLayout.createParallelGroup()
                                        .addComponent(btnPrintReceipt)
                                        .addComponent(btnAddCredit))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblAccount, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(txtAccountID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblViaLocationlReceipt8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblViaLocationlReceipt9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(pnlPrintReceiptLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblViaLocationlReceipt7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnEmail)
                                    .addGap(22, 22, 22))
                        );
                    }
                    pnlContent.add(pnlPrintReceipt, "card10");

                    //======== pnlSearchAccount ========
                    {

                        //---- lblTicketTypeTransAccPayment2 ----
                        lblTicketTypeTransAccPayment2.setText("Search for account");

                        //---- lblTransAccPaymentInformation2 ----
                        lblTransAccPaymentInformation2.setText("Search for Transport Account");

                        //---- lblTransSearchNot ----
                        lblTransSearchNot.setToolTipText("Information Text");
                        lblTransSearchNot.setBackground(new Color(204, 0, 0));
                        lblTransSearchNot.setOpaque(true);
                        lblTransSearchNot.setForeground(Color.black);
                        lblTransSearchNot.setHorizontalAlignment(SwingConstants.CENTER);
                        lblTransSearchNot.setText("Account cannot be found");
                        lblTransSearchNot.setDoubleBuffered(true);
                        lblTransSearchNot.setVisible(false);

                        //---- btnSearchAccount ----
                        btnSearchAccount.setText("Search for Account");
                        btnSearchAccount.addActionListener(e -> btnSearchAccountActionPerformed(e));

                        //---- lblTicketTypeTransAccAccountId2 ----
                        lblTicketTypeTransAccAccountId2.setText("Account ID");

                        GroupLayout pnlSearchAccountLayout = new GroupLayout(pnlSearchAccount);
                        pnlSearchAccount.setLayout(pnlSearchAccountLayout);
                        pnlSearchAccountLayout.setHorizontalGroup(
                            pnlSearchAccountLayout.createParallelGroup()
                                .addGroup(pnlSearchAccountLayout.createSequentialGroup()
                                    .addGap(112, 112, 112)
                                    .addGroup(pnlSearchAccountLayout.createParallelGroup()
                                        .addComponent(btnSearchAccount)
                                        .addGroup(pnlSearchAccountLayout.createSequentialGroup()
                                            .addGap(106, 106, 106)
                                            .addComponent(lblTransSearchNot, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblTransAccPaymentInformation2)
                                        .addGroup(pnlSearchAccountLayout.createSequentialGroup()
                                            .addGroup(pnlSearchAccountLayout.createParallelGroup()
                                                .addComponent(lblTicketTypeTransAccPayment2)
                                                .addComponent(lblTicketTypeTransAccAccountId2))
                                            .addGap(40, 40, 40)
                                            .addComponent(txtFieldAccountID2, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(176, Short.MAX_VALUE))
                        );
                        pnlSearchAccountLayout.setVerticalGroup(
                            pnlSearchAccountLayout.createParallelGroup()
                                .addGroup(pnlSearchAccountLayout.createSequentialGroup()
                                    .addGap(82, 82, 82)
                                    .addComponent(lblTransSearchNot, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblTransAccPaymentInformation2)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblTicketTypeTransAccPayment2)
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlSearchAccountLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTicketTypeTransAccAccountId2)
                                        .addComponent(txtFieldAccountID2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                    .addComponent(btnSearchAccount)
                                    .addGap(157, 157, 157))
                        );
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
                label1.setBounds(590, 30, 146, label1.getPreferredSize().height);

                //---- label2 ----
                label2.setText("You are currently at stage: X of 5");
                pnlSide.add(label2);
                label2.setBounds(new Rectangle(new Point(545, 5), label2.getPreferredSize()));

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
