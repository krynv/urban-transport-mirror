package gui;

import logic.*;

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

    public PayForTripGUI() {

        initComponents();

        this.setLocationRelativeTo(null);
        this.setContentPane(pnlMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // TODO: revert back to initial 'GUI'
        this.setTitle("Home");
        setAllToFalse();
        pnlHome.setVisible(true);
        this.pack();
    }

    /* ----- Main Menu ----- */

    private void btnSelectLanguageActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlSelectLanguage.setVisible(true);
        this.setTitle("Select Language");
    }

    private void btnDestination1ActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlSelectFares.setVisible(true);
        this.setTitle("Select Fares");
    }

    //TODO: class diagram says it doesn't accept parameters??
    public void loadLanguageFile(String language) {
        //load language file
        System.out.println("Loaded the " + language + " language");
    }

    private void btnHomeActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlHome.setVisible(true);
        this.setTitle("Home");
    }

    private void setAllToFalse() { // contains all of the panels set to false
        pnlTimetable.setVisible(false);
        pnlCardTicketPayment.setVisible(false);
        pnlCashTicketPayment.setVisible(false);
        pnlConfirmBooking.setVisible(false);
        pnlSearchedFares.setVisible(false);
        pnlSelectFares.setVisible(false);
        pnlSelectLanguage.setVisible(false);
        pnlHome.setVisible(false);
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
        if (languageButtonPressed == null) { // default to english
            languageButtonPressed = "English";
        }

        loadLanguageFile(languageButtonPressed);
        pnlSelectLanguage.setVisible(false);
        pnlHome.setVisible(true);
        this.setTitle("Home");
    }

    /* ----- Select Fares ----- */

    private void searchActionPerformed(ActionEvent e) {

        LocalDateTime departureDateTime = LocalDateTime.of(2018, 2, 4, 12, 0);
        LocalDateTime arrivalDateTime = LocalDateTime.of(2018, 2, 4, 13, 0);

        routeRegistry.getRoutes(new Location("0"), new Location("1"), departureDateTime, arrivalDateTime);

        FareRegistry fareRegistry = new FareRegistry();
        routeRegistry = fareRegistry.getRoutesCost(routeRegistry, departureDateTime, arrivalDateTime);

        btnFare1.setText(routeRegistry.get(0).toString());
        btnFare2.setText(routeRegistry.get(1).toString());
        btnFare3.setText(routeRegistry.get(2).toString());

        setAllToFalse();
        pnlSearchedFares.setVisible(true);
        this.setTitle("Searched Fares");
    }

    private void ckbxOneWayStateChanged(ChangeEvent e) {
        if (ckbxOneWay.isSelected()) {
            dpdnReturn.setEnabled(false);
        }
        else {
            dpdnReturn.setEnabled(true);
        }
    }

    /* ----- Searched Fares ----- */

    private void btnFare1ActionPerformed(ActionEvent e) {
        lblTicketTypeConfirmBooking.setText(chosenTicketType);
        lblPrice.setText(Double.toString(routeRegistry.get(0).getCost()));
        setAllToFalse();
        pnlConfirmBooking.setVisible(true);
        this.setTitle("Confirm Booking");
    }

    private boolean hasPromotionalCoupon() {
        return !coupon.equals(null);
    }

    private void checkCoupon() {
        if (txtCouponCode.getText().equals("UrbanTransport")) {
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

    /* ----- Confirm Booking ----- */

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Benjamin Ward
    private JPanel pnlMain;

    /* ----- Card Payment ----- */
    private JLabel lblSortCode;
    private JTextField txtSortCode;

    private void btnPrintTicketActionPerformed(ActionEvent e) {
        resetAllInteractiveElements();
        setAllToFalse();
        pnlHome.setVisible(true);
        this.setTitle("Home");
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

        if (ckbxCash.isSelected() && ckbxCard.isSelected()) {
            // if both are selected
            // do nothing
        }
        else if (ckbxCash.isSelected()) {
            checkCoupon();
            setAllToFalse();
            pnlCashTicketPayment.setVisible(true);
            this.setTitle("Pay With Cash");
            lblCouponVerification.setText("");
            lblCouponVerification.setOpaque(false);
            ckbxCash.setSelected(false);
            txtCouponCode.setText("");
            lblPriceCashPayment.setText(Double.toString(routeRegistry.get(0).getCost()));
            lblTicketTypeCashPayment.setText(chosenTicketType);
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
            lblPriceCardPayment.setText(Double.toString(routeRegistry.get(0).getCost()));
            lblTicketTypeCardPayment.setText(chosenTicketType);
        }
        else {
            // if none are selected
            //do nothing
        }
    }

    private void btnConfirmPaymentActionPerformed(ActionEvent e) {

        int securityNo = Integer.parseInt(txtSecurityCode.getText());
        int accountNo = Integer.parseInt(txtCardNumber.getText());
        int sortCode = Integer.parseInt(txtSortCode.getText());
        double amount = Double.parseDouble(lblPriceCardPayment.getText());
        String accName = txtCardName.getText();

        Purchase purchase = new Purchase();
        if (purchase.makePurchase(accName, accountNo, sortCode, securityNo, amount)) {
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

        } else {
            lblPaymentValidate.setText("Transaction canceled. Card refunded");
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

        btnPrintTicket.setVisible(false);
        lblPaymentValidate.setVisible(false);

        txtSecurityCode.setText("");
        txtSortCode.setText("");
        txtCardNumber.setText("");
        txtCardName.setText("");
        txtCouponCode.setText("");
        lblPrice.setText("");

        ckbxCash.setSelected(false);
        ckbxOneWay.setSelected(false);
        ckbxCard.setSelected(false);
        ckbxOpenReturn.setSelected(false);
        ckbxReturn.setSelected(false);

        lblCouponVerification.setText("");
        lblCouponVerification.setOpaque(false);
        lblPaymentValidate.setText("");
        lblPaymentValidate.setOpaque(false);

    }

    private void btnPayCashActionPerformed(ActionEvent e) {

        double valuePayingIn = Double.parseDouble(txtCashValue.getText());
        double valueYetToPay = Double.parseDouble(lblPriceCashPayment.getText());

        lblCashValue.setText(txtCashValue.getText());

        if (isCashEnteredSufficient(valueYetToPay, valuePayingIn)) {
            Purchase purchase = new Purchase();
            if (purchase.makePurchase(Double.parseDouble(lblPriceCashPayment.getText()))) {
                lblNotification.setText("Ticket fully paid");
                txtCashValue.setText("");
                lblPriceCashPayment.setText(Double.toString(getRemainingCost(valuePayingIn, valueYetToPay)));
            } else {
                lblNotification.setText("Transaction canceled. Cash refunded");
            }
        } else {
            lblNotification.setText("Enter more cash. Not enough cash entered");
        }

//        if (getRemainingCost(valuePayingIn, valueYetToPay) > 0) {
//            lblPriceCashPayment.setText(Double.toString(getRemainingCost(valuePayingIn, valueYetToPay)));
//            txtCashValue.setText("");
//        } else if (getRemainingCost(valuePayingIn, valueYetToPay) < 0) {
//            lblNotification.setText("Ticket fully paid");
//            txtCashValue.setText("");
//            lblPriceCashPayment.setText("");
//        }
//        if (lblNotification.getText().equals("Ticket fully paid")) {
//            // once everything has been paid for
//            resetAllInteractiveElements();
//        }
    }

    private boolean isCashEnteredSufficient(double tally, double cashEntered) {
        return cashEntered >= tally;
    }

    private JPanel pnlSide;
    private JButton btnHome;
    private JButton btnSelectLanguage;
    private JButton btnDisplayTimetable;
    private JLabel lblDateTime;
    private JPanel pnlContent;
    private JPanel pnlSelectLanguage;
    private JLabel lblEnglish;
    private JButton btnEnglish;
    private JLabel lblFrench;
    private JButton btnFrench;
    private JLabel lblGerman;
    private JButton btnGerman;
    private JButton btnLoadLanguage;
    private JPanel pnlHome;
    private JButton btnDestination1;
    private JButton btnDestination4;
    private JButton btnDestination5;
    private JButton btnDestination2;
    private JButton btnDestination3;
    private JButton btnDestination6;
    private JPanel pnlSelectFares;
    private JButton btnSearch;
    private JCheckBox ckbxOpenReturn;
    private JCheckBox ckbxReturn;
    private JCheckBox ckbxOneWay;
    private JLabel lblTicketType;
    private JComboBox<String> dpdnDeparture;
    private JComboBox<String> dpdnReturn;
    private JLabel lblDepartureDateTime;
    private JLabel lblReturnDateTime;
    private JLabel lblDestination;
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
    private JLabel lblViaLocations;
    private JLabel lblDepartureDateTimeConfirmBooking;
    private JLabel lblReturnDateTimeConfirmBooking;
    private JLabel lblDestinationConfirmBooking;
    private JLabel lblStation;
    private JPanel pnlCashTicketPayment;
    private JLabel lblCashInserted;
    private JLabel lblCashValue;
    private JLabel lblPriceCashPayment;
    private JLabel lblTicketTypeCashPayment;
    private JLabel lblPaymentInformation;
    private JLabel lblNotification;
    private JLabel lblViaLocationsCashPayment;
    private JLabel lblDepartureDateTimeCashPayment;
    private JLabel lblReturnDateTimeCashPayment;
    private JLabel lblDestinationCashPayment;
    private JLabel lblStationCashPayment;
    private JButton btnPayCash;
    private JTextField txtCashValue;
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
    private JLabel lblViaLocationsCardPayment;
    private JLabel lblDepartureDateTimeCardPayment;
    private JLabel lblReturnDateTimeCardPayment;
    private JLabel lblDestinationCardPayment;
    private JLabel lblStationCardPayment;

    private double getRemainingCost(double valuePayingIn, double totalToPay) {
        return totalToPay-valuePayingIn;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Benjamin Ward
        pnlMain = new JPanel();
        pnlSide = new JPanel();
        btnHome = new JButton();
        btnSelectLanguage = new JButton();
        btnDisplayTimetable = new JButton();
        lblDateTime = new JLabel();
        pnlContent = new JPanel();
        pnlSelectLanguage = new JPanel();
        lblEnglish = new JLabel();
        btnEnglish = new JButton();
        lblFrench = new JLabel();
        btnFrench = new JButton();
        lblGerman = new JLabel();
        btnGerman = new JButton();
        btnLoadLanguage = new JButton();
        pnlHome = new JPanel();
        btnDestination1 = new JButton();
        btnDestination4 = new JButton();
        btnDestination5 = new JButton();
        btnDestination2 = new JButton();
        btnDestination3 = new JButton();
        btnDestination6 = new JButton();
        pnlSelectFares = new JPanel();
        btnSearch = new JButton();
        ckbxOpenReturn = new JCheckBox();
        ckbxReturn = new JCheckBox();
        ckbxOneWay = new JCheckBox();
        lblTicketType = new JLabel();
        dpdnDeparture = new JComboBox<>();
        dpdnReturn = new JComboBox<>();
        lblDepartureDateTime = new JLabel();
        lblReturnDateTime = new JLabel();
        lblDestination = new JLabel();
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
        lblViaLocations = new JLabel();
        lblDepartureDateTimeConfirmBooking = new JLabel();
        lblReturnDateTimeConfirmBooking = new JLabel();
        lblDestinationConfirmBooking = new JLabel();
        lblStation = new JLabel();
        pnlCashTicketPayment = new JPanel();
        lblCashInserted = new JLabel();
        lblCashValue = new JLabel();
        lblPriceCashPayment = new JLabel();
        lblTicketTypeCashPayment = new JLabel();
        lblPaymentInformation = new JLabel();
        lblNotification = new JLabel();
        lblViaLocationsCashPayment = new JLabel();
        lblDepartureDateTimeCashPayment = new JLabel();
        lblReturnDateTimeCashPayment = new JLabel();
        lblDestinationCashPayment = new JLabel();
        lblStationCashPayment = new JLabel();
        btnPayCash = new JButton();
        txtCashValue = new JTextField();
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
        lblViaLocationsCardPayment = new JLabel();
        lblDepartureDateTimeCardPayment = new JLabel();
        lblReturnDateTimeCardPayment = new JLabel();
        lblDestinationCardPayment = new JLabel();
        lblStationCardPayment = new JLabel();
        lblSortCode = new JLabel();
        txtSortCode = new JTextField();
        pnlTimetable = new JPanel();
        scrollPane = new JScrollPane();
        tblTicket = new JTable();

        //======== pnlMain ========
        {

            // JFormDesigner evaluation mark
            pnlMain.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), pnlMain.getBorder())); pnlMain.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            pnlMain.setLayout(new CardLayout());

            //======== pnlSide ========
            {

                //---- btnHome ----
                btnHome.setText("Home");
                btnHome.addActionListener(e -> btnHomeActionPerformed(e));

                //---- btnSelectLanguage ----
                btnSelectLanguage.setText("Select Language");
                btnSelectLanguage.addActionListener(e -> btnSelectLanguageActionPerformed(e));

                //---- btnDisplayTimetable ----
                btnDisplayTimetable.setText("Display Timetable");
                btnDisplayTimetable.setEnabled(false);

                //---- lblDateTime ----
                lblDateTime.setText("Date/Time");
                lblDateTime.setHorizontalAlignment(SwingConstants.CENTER);
                lblDateTime.setMaximumSize(new Dimension(25, 25));
                lblDateTime.setMinimumSize(new Dimension(25, 25));
                lblDateTime.setPreferredSize(new Dimension(25, 25));

                //======== pnlContent ========
                {
                    pnlContent.setLayout(new CardLayout());

                    //======== pnlSelectLanguage ========
                    {

                        //---- lblEnglish ----
                        lblEnglish.setText("English");

                        //---- btnEnglish ----
                        btnEnglish.addActionListener(e -> englishButtonActionPerformed(e));

                        //---- lblFrench ----
                        lblFrench.setText("French");

                        //---- btnFrench ----
                        btnFrench.addActionListener(e -> frenchButtonActionPerformed(e));

                        //---- lblGerman ----
                        lblGerman.setText("German");

                        //---- btnGerman ----
                        btnGerman.addActionListener(e -> germanButtonActionPerformed(e));

                        //---- btnLoadLanguage ----
                        btnLoadLanguage.setText("Load Language");
                        btnLoadLanguage.addActionListener(e -> btnLoadLanguageActionPerformed(e));

                        GroupLayout pnlSelectLanguageLayout = new GroupLayout(pnlSelectLanguage);
                        pnlSelectLanguage.setLayout(pnlSelectLanguageLayout);
                        pnlSelectLanguageLayout.setHorizontalGroup(
                            pnlSelectLanguageLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, pnlSelectLanguageLayout.createSequentialGroup()
                                        .addContainerGap(128, Short.MAX_VALUE)
                                    .addGroup(pnlSelectLanguageLayout.createParallelGroup()
                                        .addGroup(pnlSelectLanguageLayout.createSequentialGroup()
                                            .addComponent(lblEnglish, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(btnEnglish, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlSelectLanguageLayout.createSequentialGroup()
                                            .addComponent(lblFrench, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(btnFrench, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlSelectLanguageLayout.createSequentialGroup()
                                            .addComponent(lblGerman, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(btnGerman, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlSelectLanguageLayout.createSequentialGroup()
                                            .addGap(212, 212, 212)
                                            .addComponent(btnLoadLanguage)))
                                    .addGap(94, 94, 94))
                        );
                        pnlSelectLanguageLayout.setVerticalGroup(
                            pnlSelectLanguageLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, pnlSelectLanguageLayout.createSequentialGroup()
                                    .addContainerGap(138, Short.MAX_VALUE)
                                    .addGroup(pnlSelectLanguageLayout.createParallelGroup()
                                        .addComponent(lblEnglish, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEnglish, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addGroup(pnlSelectLanguageLayout.createParallelGroup()
                                        .addComponent(lblFrench, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnFrench, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addGroup(pnlSelectLanguageLayout.createParallelGroup()
                                        .addComponent(lblGerman, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGerman, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                    .addGap(61, 61, 61)
                                    .addComponent(btnLoadLanguage)
                                    .addGap(128, 128, 128))
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
                        btnDestination4.setText("Destination 4");
                        btnDestination4.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                        //---- btnDestination5 ----
                        btnDestination5.setText("Destination 5");
                        btnDestination5.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                        //---- btnDestination2 ----
                        btnDestination2.setText("Destination 2");
                        btnDestination2.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                        //---- btnDestination3 ----
                        btnDestination3.setText("Destination 3");
                        btnDestination3.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                        //---- btnDestination6 ----
                        btnDestination6.setText("Destination 6");
                        btnDestination6.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                        GroupLayout pnlHomeLayout = new GroupLayout(pnlHome);
                        pnlHome.setLayout(pnlHomeLayout);
                        pnlHomeLayout.setHorizontalGroup(
                            pnlHomeLayout.createParallelGroup()
                                .addGroup(pnlHomeLayout.createSequentialGroup()
                                    .addGap(0, 110, Short.MAX_VALUE)
                                    .addGroup(pnlHomeLayout.createParallelGroup()
                                        .addGroup(pnlHomeLayout.createSequentialGroup()
                                            .addComponent(btnDestination1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(btnDestination2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(btnDestination3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlHomeLayout.createSequentialGroup()
                                            .addComponent(btnDestination4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(btnDestination5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(btnDestination6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 111, Short.MAX_VALUE))
                        );
                        pnlHomeLayout.setVerticalGroup(
                            pnlHomeLayout.createParallelGroup()
                                .addGroup(pnlHomeLayout.createSequentialGroup()
                                    .addGap(0, 112, Short.MAX_VALUE)
                                    .addGroup(pnlHomeLayout.createParallelGroup()
                                        .addComponent(btnDestination1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDestination2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDestination3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                    .addGap(33, 33, 33)
                                    .addGroup(pnlHomeLayout.createParallelGroup()
                                        .addComponent(btnDestination4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDestination5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDestination6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 113, Short.MAX_VALUE))
                        );
                    }
                    pnlContent.add(pnlHome, "card1");

                    //======== pnlSelectFares ========
                    {

                        //---- btnSearch ----
                        btnSearch.setText("Search");
                        btnSearch.addActionListener(e -> searchActionPerformed(e));

                        //---- ckbxOpenReturn ----
                        ckbxOpenReturn.setText("Open Return");
                        ckbxOpenReturn.addActionListener(e -> ckbxOpenReturnActionPerformed(e));

                        //---- ckbxReturn ----
                        ckbxReturn.setText("Return");
                        ckbxReturn.addActionListener(e -> ckbxReturnActionPerformed(e));

                        //---- ckbxOneWay ----
                        ckbxOneWay.setText("One Way");
                        ckbxOneWay.addChangeListener(e -> ckbxOneWayStateChanged(e));
                        ckbxOneWay.addActionListener(e -> ckbxOneWayActionPerformed(e));

                        //---- lblTicketType ----
                        lblTicketType.setText("Ticket Type");

                        //---- dpdnDeparture ----
                        dpdnDeparture.setModel(new DefaultComboBoxModel<>(new String[] {
                            "12:00"
                        }));

                        //---- dpdnReturn ----
                        dpdnReturn.setModel(new DefaultComboBoxModel<>(new String[] {
                            "13:00"
                        }));

                        //---- lblDepartureDateTime ----
                        lblDepartureDateTime.setText("Departure Date/Time");

                        //---- lblReturnDateTime ----
                        lblReturnDateTime.setText("Return Date/Time");

                        //---- lblDestination ----
                        lblDestination.setText("London");

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
                                            .addComponent(lblTicketType)
                                            .addComponent(ckbxOneWay, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ckbxReturn, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                                .addComponent(ckbxOpenReturn)
                                                .addGap(191, 191, 191)
                                                .addComponent(btnSearch)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 545, Short.MAX_VALUE)
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
                                        .addGap(17, 17, 17)
                                        .addComponent(lblTicketType)
                                        .addGap(6, 6, 6)
                                        .addComponent(ckbxOneWay)
                                        .addGap(6, 6, 6)
                                        .addComponent(ckbxReturn)
                                        .addGap(6, 6, 6)
                                        .addGroup(pnlSelectFaresLayout.createParallelGroup()
                                            .addComponent(ckbxOpenReturn)
                                            .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(btnSearch)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 458, Short.MAX_VALUE)
                        );
                    }
                    pnlContent.add(pnlSelectFares, "card3");

                    //======== pnlSearchedFares ========
                    {

                        //---- btnFare3 ----
                        btnFare3.setText("<html>\nDestination <br>\nDeparture Date/Time <br>\nReturn Date/Time <br>\nPRICE\n</html>");
                        btnFare3.setHorizontalAlignment(SwingConstants.TRAILING);
                        btnFare3.setFont(new Font(".SF NS Text", Font.PLAIN, 11));

                        //---- btnFare1 ----
                        btnFare1.setText("<html> Destination <br> Departure Date/Time <br> Return Date/Time <br> PRICE </html>");
                        btnFare1.setHorizontalAlignment(SwingConstants.TRAILING);
                        btnFare1.setFont(new Font(".SF NS Text", Font.PLAIN, 11));
                        btnFare1.addActionListener(e -> btnFare1ActionPerformed(e));

                        //---- btnFare2 ----
                        btnFare2.setText("<html>\nDestination <br>\nDeparture Date/Time <br>\nReturn Date/Time <br>\nPRICE\n</html>");
                        btnFare2.setHorizontalAlignment(SwingConstants.TRAILING);
                        btnFare2.setFont(new Font(".SF NS Text", Font.PLAIN, 11));

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
                                        .addContainerGap(143, Short.MAX_VALUE))
                        );
                        pnlSearchedFaresLayout.setVerticalGroup(
                            pnlSearchedFaresLayout.createParallelGroup()
                                .addGroup(pnlSearchedFaresLayout.createSequentialGroup()
                                    .addGap(141, 141, 141)
                                    .addGroup(pnlSearchedFaresLayout.createParallelGroup()
                                        .addComponent(btnFare1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnFare2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addComponent(btnFare3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(159, Short.MAX_VALUE))
                        );
                    }
                    pnlContent.add(pnlSearchedFares, "card4");

                    //======== pnlConfirmBooking ========
                    {

                        //---- btnAdvance ----
                        btnAdvance.setText("Advance");
                        btnAdvance.addActionListener(e -> btnAdvanceActionPerformed(e));

                        //---- lblCouponCode ----
                        lblCouponCode.setText("Coupon Code");
                        lblCouponCode.setLabelFor(txtCouponCode);

                        //---- ckbxCard ----
                        ckbxCard.setText("CARD");

                        //---- ckbxCash ----
                        ckbxCash.setText("CASH");

                        //---- lblPaymentMethod ----
                        lblPaymentMethod.setText("Payment Method");

                        //---- lblTicketTypeConfirmBooking ----
                        lblTicketTypeConfirmBooking.setText("Ticket Type");

                        //---- lblPrice ----
                        lblPrice.setText("Price");

                        //---- lblTicketInformation ----
                        lblTicketInformation.setText("Ticket Information");

                        //---- lblCouponVerification ----
                        lblCouponVerification.setToolTipText("Coupon Validity Check");
                        lblCouponVerification.setHorizontalAlignment(SwingConstants.CENTER);

                        //---- lblViaLocations ----
                        lblViaLocations.setText("Via Locations");

                        //---- lblDepartureDateTimeConfirmBooking ----
                        lblDepartureDateTimeConfirmBooking.setText("Departure Date/Time");

                        //---- lblReturnDateTimeConfirmBooking ----
                        lblReturnDateTimeConfirmBooking.setText("Return Date/Time");

                        //---- lblDestinationConfirmBooking ----
                        lblDestinationConfirmBooking.setText("Destination");

                        //---- lblStation ----
                        lblStation.setText("Station");

                        GroupLayout pnlConfirmBookingLayout = new GroupLayout(pnlConfirmBooking);
                        pnlConfirmBooking.setLayout(pnlConfirmBookingLayout);
                        pnlConfirmBookingLayout.setHorizontalGroup(
                            pnlConfirmBookingLayout.createParallelGroup()
                                .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                    .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(160, 160, 160)
                                                .addComponent(lblStation)
                                                .addGap(6, 6, 6)
                                                .addComponent(lblDestinationConfirmBooking))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(lblDepartureDateTimeConfirmBooking, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(lblReturnDateTimeConfirmBooking))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(179, 179, 179)
                                                .addComponent(lblViaLocations))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(153, 153, 153)
                                                .addComponent(lblCouponVerification, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblTicketInformation)
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(lblTicketTypeConfirmBooking)
                                                .addGap(60, 60, 60)
                                                .addComponent(lblPrice))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(lblPaymentMethod, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(ckbxCash))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(ckbxCard))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lblCouponCode))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(txtCouponCode, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addGap(256, 256, 256)
                                                .addComponent(btnAdvance)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 545, Short.MAX_VALUE)
                        );
                        pnlConfirmBookingLayout.setVerticalGroup(
                            pnlConfirmBookingLayout.createParallelGroup()
                                .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                    .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                            .addComponent(lblStation)
                                            .addComponent(lblDestinationConfirmBooking))
                                        .addGap(6, 6, 6)
                                        .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                            .addComponent(lblDepartureDateTimeConfirmBooking, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(lblReturnDateTimeConfirmBooking)))
                                        .addGap(6, 6, 6)
                                        .addComponent(lblViaLocations)
                                        .addGap(6, 6, 6)
                                        .addComponent(lblCouponVerification, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(lblTicketInformation)
                                        .addGap(12, 12, 12)
                                        .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                            .addComponent(lblTicketTypeConfirmBooking)
                                            .addComponent(lblPrice))
                                        .addGap(6, 6, 6)
                                        .addComponent(lblPaymentMethod)
                                        .addGap(6, 6, 6)
                                        .addComponent(ckbxCash)
                                        .addGap(6, 6, 6)
                                        .addComponent(ckbxCard)
                                        .addGap(6, 6, 6)
                                        .addComponent(lblCouponCode)
                                        .addGap(6, 6, 6)
                                        .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(txtCouponCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnAdvance))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 458, Short.MAX_VALUE)
                        );
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

                        //---- lblViaLocationsCashPayment ----
                        lblViaLocationsCashPayment.setText("Via Locations");

                        //---- lblDepartureDateTimeCashPayment ----
                        lblDepartureDateTimeCashPayment.setText("Departure Date/Time");

                        //---- lblReturnDateTimeCashPayment ----
                        lblReturnDateTimeCashPayment.setText("Return Date/Time");

                        //---- lblDestinationCashPayment ----
                        lblDestinationCashPayment.setText("Destination");

                        //---- lblStationCashPayment ----
                        lblStationCashPayment.setText("Station");

                        //---- btnPayCash ----
                        btnPayCash.setText("Pay");
                        btnPayCash.addActionListener(e -> btnPayCashActionPerformed(e));

                        GroupLayout pnlCashTicketPaymentLayout = new GroupLayout(pnlCashTicketPayment);
                        pnlCashTicketPayment.setLayout(pnlCashTicketPaymentLayout);
                        pnlCashTicketPaymentLayout.setHorizontalGroup(
                            pnlCashTicketPaymentLayout.createParallelGroup()
                                .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addGroup(pnlCashTicketPaymentLayout.createParallelGroup()
                                        .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                            .addComponent(txtCashValue, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnPayCash))
                                        .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                            .addGap(152, 152, 152)
                                            .addComponent(lblStationCashPayment)
                                            .addGap(6, 6, 6)
                                            .addComponent(lblDestinationCashPayment))
                                        .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                            .addGap(84, 84, 84)
                                            .addComponent(lblDepartureDateTimeCashPayment, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(lblReturnDateTimeCashPayment))
                                        .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                            .addGap(168, 168, 168)
                                            .addComponent(lblViaLocationsCashPayment))
                                        .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                            .addGap(106, 106, 106)
                                            .addComponent(lblNotification, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblPaymentInformation)
                                        .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                            .addComponent(lblTicketTypeCashPayment)
                                            .addGap(69, 69, 69)
                                            .addComponent(lblPriceCashPayment, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlCashTicketPaymentLayout.createSequentialGroup()
                                            .addComponent(lblCashInserted)
                                            .addGap(55, 55, 55)
                                            .addComponent(lblCashValue)))
                                        .addContainerGap(164, Short.MAX_VALUE))
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
                                    .addGap(8, 8, 8)
                                    .addComponent(lblViaLocationsCashPayment)
                                    .addGap(6, 6, 6)
                                    .addComponent(lblNotification, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(lblPaymentInformation)
                                    .addGap(28, 28, 28)
                                    .addGroup(pnlCashTicketPaymentLayout.createParallelGroup()
                                        .addComponent(lblTicketTypeCashPayment)
                                        .addComponent(lblPriceCashPayment))
                                    .addGap(12, 12, 12)
                                    .addGroup(pnlCashTicketPaymentLayout.createParallelGroup()
                                        .addComponent(lblCashInserted)
                                        .addComponent(lblCashValue))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                    .addGroup(pnlCashTicketPaymentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPayCash)
                                        .addComponent(txtCashValue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(79, 79, 79))
                        );
                    }
                    pnlContent.add(pnlCashTicketPayment, "card6");

                    //======== pnlCardTicketPayment ========
                    {

                        //---- btnPrintTicket ----
                        btnPrintTicket.setText("PRINT TICKET");
                        btnPrintTicket.addActionListener(e -> btnPrintTicketActionPerformed(e));

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

                        //---- lblViaLocationsCardPayment ----
                        lblViaLocationsCardPayment.setText("Via Locations");

                        //---- lblDepartureDateTimeCardPayment ----
                        lblDepartureDateTimeCardPayment.setText("Departure Date/Time");

                        //---- lblReturnDateTimeCardPayment ----
                        lblReturnDateTimeCardPayment.setText("Return Date/Time");

                        //---- lblDestinationCardPayment ----
                        lblDestinationCardPayment.setText("Destination");

                        //---- lblStationCardPayment ----
                        lblStationCardPayment.setText("Station");

                        //---- lblSortCode ----
                        lblSortCode.setText("Sort Code");
                        lblSortCode.setLabelFor(txtSecurityCode);

                        GroupLayout pnlCardTicketPaymentLayout = new GroupLayout(pnlCardTicketPayment);
                        pnlCardTicketPayment.setLayout(pnlCardTicketPaymentLayout);
                        pnlCardTicketPaymentLayout.setHorizontalGroup(
                            pnlCardTicketPaymentLayout.createParallelGroup()
                                .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                        .addGroup(pnlCardTicketPaymentLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                                        .addGap(58, 58, 58)
                                                        .addGroup(pnlCardTicketPaymentLayout.createParallelGroup()
                                                                .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                                                        .addGap(157, 157, 157)
                                                                        .addComponent(lblStationCardPayment)
                                                                        .addGap(6, 6, 6)
                                                                        .addComponent(lblDestinationCardPayment))
                                                                .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                                                        .addGap(89, 89, 89)
                                                                        .addComponent(lblDepartureDateTimeCardPayment, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(0, 0, 0)
                                                                        .addComponent(lblReturnDateTimeCardPayment))
                                                                .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                                                        .addGap(176, 176, 176)
                                                                        .addComponent(lblViaLocationsCardPayment))
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
                                                                                        .addComponent(txtCardNumber, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))))))
                                                .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                                        .addGap(174, 174, 174)
                                            .addComponent(btnPrintTicket)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnConfirmPayment)))
                                        .addContainerGap(104, Short.MAX_VALUE))
                        );
                        pnlCardTicketPaymentLayout.setVerticalGroup(
                            pnlCardTicketPaymentLayout.createParallelGroup()
                                .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addGroup(pnlCardTicketPaymentLayout.createParallelGroup()
                                        .addComponent(lblStationCardPayment)
                                        .addComponent(lblDestinationCardPayment))
                                    .addGap(6, 6, 6)
                                    .addGroup(pnlCardTicketPaymentLayout.createParallelGroup()
                                        .addComponent(lblDepartureDateTimeCardPayment, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(lblReturnDateTimeCardPayment)))
                                    .addGap(6, 6, 6)
                                    .addComponent(lblViaLocationsCardPayment)
                                    .addGap(6, 6, 6)
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
                                                .addContainerGap(114, Short.MAX_VALUE))
                                            .addGroup(pnlCardTicketPaymentLayout.createSequentialGroup()
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtSecurityCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtSortCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                                    .addGroup(pnlCardTicketPaymentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                            .addComponent(btnPrintTicket)
                                                            .addComponent(btnConfirmPayment))
                                                    .addGap(42, 42, 42))))
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
                                .addGap(0, 545, Short.MAX_VALUE)
                        );
                        pnlTimetableLayout.setVerticalGroup(
                            pnlTimetableLayout.createParallelGroup()
                                .addGroup(pnlTimetableLayout.createParallelGroup()
                                    .addGroup(pnlTimetableLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 458, Short.MAX_VALUE)
                        );
                    }
                    pnlContent.add(pnlTimetable, "card8");
                }

                GroupLayout pnlSideLayout = new GroupLayout(pnlSide);
                pnlSide.setLayout(pnlSideLayout);
                pnlSideLayout.setHorizontalGroup(
                    pnlSideLayout.createParallelGroup()
                        .addGroup(pnlSideLayout.createSequentialGroup()
                            .addGroup(pnlSideLayout.createParallelGroup()
                                .addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSelectLanguage, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDisplayTimetable, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDateTime, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pnlContent, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                );
                pnlSideLayout.setVerticalGroup(
                    pnlSideLayout.createParallelGroup()
                        .addGroup(pnlSideLayout.createSequentialGroup()
                            .addGroup(pnlSideLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, pnlSideLayout.createSequentialGroup()
                                    .addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSelectLanguage, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDisplayTimetable, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addGap(143, 143, 143)
                                    .addComponent(lblDateTime, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlSideLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(pnlContent, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addContainerGap())
                );
            }
            pnlMain.add(pnlSide, "card2");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    private JPanel pnlTimetable;
    private JScrollPane scrollPane;
    private JTable tblTicket;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
