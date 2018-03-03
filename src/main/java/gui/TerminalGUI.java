package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TerminalGUI extends JFrame {

    private final String validBarcode = "86657673683465826779686123";
    private Boolean validMagnetic = false;
    private Boolean validContactless = false;
    private int insertedCash = 0;
    private final String cardName = "Test";
    private final String cardNumber = "1234";
    private final String securityCode = "123";
    private String credits = "0";

    public TerminalGUI() {
        initComponents();

        setComponentsDefaultState();
        pnlCardChoice.setVisible(true);

        this.setContentPane(pnlGUI);
        this.pack();
    }

    private void setComponentsDefaultState() {
        pnlCardChoice.setVisible(false);
        pnlMagnetic.setVisible(false);
        pnlBarcode.setVisible(false);
        pnlContactless.setVisible(false);
        pnlAccount.setVisible(false);
        pnlHistory.setVisible(false);
        pnlHome.setVisible(false);
        pnlAddCredits.setVisible(false);
        pnlCardPayment.setVisible(false);
        pnlConfirmation.setVisible(false);
        pnlCashPayment.setVisible(false);
        pnlCardDetails.setVisible(false);
        pnlPaymentChoice.setVisible(false);
    }

    // Terminal
    private void btnMagneticActionPerformed(ActionEvent e) {
        setComponentsDefaultState();
        pnlMagnetic.setVisible(true);
    }

    private void btnContactlessActionPerformed(ActionEvent e) {
        setComponentsDefaultState();
        pnlContactless.setVisible(true);
    }

    private void btnBarcodeActionPerformed(ActionEvent e) {
        setComponentsDefaultState();
        pnlBarcode.setVisible(true);
        txtBarcode.setText(validBarcode);
    }

    // Magnetic Strip Method
    private void btnSwipeActionPerformed(ActionEvent e) {
        if (validMagnetic) {
            setComponentsDefaultState();

            pnlAccount.setVisible(true);
            txtCreditRemaining.setText(credits);
            pnlAddCredits.setVisible(true);
        } else {
            lblMagneticError.setVisible(true);
        }
    }

    private void btnValidMagneticActionPerformed(ActionEvent e) {
        lblMagneticError.setVisible(false);
        validMagnetic = true;
    }

    private void btnInvalidMagneticActionPerformed(ActionEvent e) {
        validMagnetic = false;
    }

    // Barcode Method
    private void btnBarcodeBeginActionPerformed(ActionEvent e) {
        String barcode = txtBarcode.getText();

        if (barcode.equals(validBarcode)) {
            setComponentsDefaultState();

            pnlAccount.setVisible(true);
            txtCreditRemaining.setText(credits);
            pnlAddCredits.setVisible(true);
        } else {
            lblBarcodeError.setVisible(true);
        }
    }

    private void txtBarcodeFocusGained(FocusEvent e) {
        lblBarcodeError.setVisible(false);
    }

    // RFID Method
    private void btnContactlessBeginActionPerformed(ActionEvent e) {
        if (validContactless) {
            setComponentsDefaultState();

            pnlAccount.setVisible(true);
            txtCreditRemaining.setText(credits);
            pnlAddCredits.setVisible(true);
        } else {
            lblContactlessError.setVisible(true);
        }
    }

    private void btnValidContactlessActionPerformed(ActionEvent e) {
        lblContactlessError.setVisible(false);
        validContactless = true;
    }

    private void btnInvalidContactlessActionPerformed(ActionEvent e) {
        validContactless = false;
    }

    // Account Information
    private void btnAddCreditActionPerformed(ActionEvent e) {
        setComponentsDefaultState();

        pnlAccount.setVisible(true);
        pnlPaymentChoice.setVisible(true);
    }

    private void btnAddCreditsExitActionPerformed(ActionEvent e) {
        setComponentsDefaultState();
        pnlCardChoice.setVisible(true);
    }

    // Add Credits
    private void btnPaymentChoiceCardActionPerformed(ActionEvent e) {
        setComponentsDefaultState();

        pnlAccount.setVisible(true);
        pnlCardPayment.setVisible(true);
    }

    private void btnPaymentChoiceCashActionPerformed(ActionEvent e) {
        setComponentsDefaultState();

        pnlAccount.setVisible(true);
        pnlCashPayment.setVisible(true);
    }

    private void btnPaymentChoiceExitActionPerformed(ActionEvent e) {
        setComponentsDefaultState();
        pnlCardChoice.setVisible(true);
    }

    // Cash Payment Method
    private void btnCashPaymentFinishedActionPerformed(ActionEvent e) {
        setComponentsDefaultState();

        pnlAccount.setVisible(true);
        pnlConfirmation.setVisible(true);
    }

    private void btnAddCashActionPerformed(ActionEvent e) {
        insertedCash += 1;

        lblCashInserted.setText("Cash Inserted: " + insertedCash);
        lblCreditGained.setText("Credit Gained: " + insertedCash);
    }

    private void btnCashPaymentExitActionPerformed(ActionEvent e) {
        setComponentsDefaultState();
        pnlCardChoice.setVisible(true);
    }

    // Card Payment Method
    private void btnDeposit5ActionPerformed(ActionEvent e) {
        insertedCash = 5;
    }

    private void btnDeposit10ActionPerformed(ActionEvent e) {
        insertedCash = 10;
    }

    private void btnDeposit15ActionPerformed(ActionEvent e) {
        insertedCash = 15;
    }

    private void btnCardPaymentNextActionPerformed(ActionEvent e) {
        setComponentsDefaultState();

        pnlAccount.setVisible(true);
        pnlCardDetails.setVisible(true);
    }

    private void btnCardPaymentExitActionPerformed(ActionEvent e) {
        setComponentsDefaultState();
        pnlCardChoice.setVisible(true);
    }

    // Card Details Input
    private void btnCardDetailsFinishActionPerformed(ActionEvent e) {
        String name = txtCardName.getText();
        String number = txtCardNumber.getText();
        String code = txtSecurityCode.getText();

        if (name.equals(cardName) &&
                number.equals(cardNumber) &&
                code.equals(securityCode)) {
            setComponentsDefaultState();

            pnlAccount.setVisible(true);
            pnlConfirmation.setVisible(true);
        } else {
            lblTransactionFailed.setVisible(true);
        }
    }

    private void btnCardDetailsExitActionPerformed(ActionEvent e) {
        setComponentsDefaultState();
        pnlCardChoice.setVisible(true);
    }

    // Confirmation Screen
    private void btnConfirmationExitActionPerformed(ActionEvent e) {
        setComponentsDefaultState();
        pnlCardChoice.setVisible(true);
    }

    // History
    private void btnHistoryExitActionPerformed(ActionEvent e) {
        setComponentsDefaultState();
        pnlCardChoice.setVisible(true);
    }

    private void btnMainGUIActionPerformed(ActionEvent e) {
        new GUI().setVisible(true);
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Benjamin Ward
        pnlGUI = new JPanel();
        pnlCardChoice = new JPanel();
        lblCard = new JLabel();
        btnMagnetic = new JButton();
        btnContactless = new JButton();
        btnBarcode = new JButton();
        btnMainGUI = new JButton();
        pnlMagnetic = new JPanel();
        btnSwipe = new JButton();
        lblMagneticError = new JLabel();
        btnValidMagnetic = new JButton();
        btnInvalidMagnetic = new JButton();
        pnlBarcode = new JPanel();
        lblBarcode = new JLabel();
        txtBarcode = new JTextField();
        btnBarcodeBegin = new JButton();
        lblBarcodeError = new JLabel();
        pnlContactless = new JPanel();
        btnContactlessBegin = new JButton();
        lblContactlessError = new JLabel();
        btnValidContactless = new JButton();
        btnInvalidContactless = new JButton();
        pnlAccount = new JTabbedPane();
        pnlHistory = new JPanel();
        lblCardNumberJourneyHistory = new JLabel();
        scrollPane1 = new JScrollPane();
        txtHistory = new JTextArea();
        btnHistoryExit = new JButton();
        pnlHome = new JPanel();
        pnlAddCredits = new JPanel();
        lblCardNumberAddCredits = new JLabel();
        txtCreditRemaining = new JTextField();
        lblCreditRemaining = new JLabel();
        btnAddCredit = new JButton();
        btnAddCreditsExit = new JButton();
        pnlCardPayment = new JPanel();
        lblCardNumberCardPayment = new JLabel();
        lblDepositAmount = new JLabel();
        btnDeposit5 = new JButton();
        btnDeposit10 = new JButton();
        btnDeposit15 = new JButton();
        btnCardPaymentNext = new JButton();
        btnCardPaymentExit = new JButton();
        pnlConfirmation = new JPanel();
        lblCardNumberConfirmation = new JLabel();
        lblCreditsAdded = new JLabel();
        btnConfirmationExit = new JButton();
        pnlCashPayment = new JPanel();
        lblCardNumberCashPayment = new JLabel();
        lblCashInserted = new JLabel();
        lblCreditGained = new JLabel();
        btnCashPaymentFinished = new JButton();
        btnAddCash = new JButton();
        btnCashPaymentExit = new JButton();
        pnlCardDetails = new JPanel();
        lblCardNumberCardDetails = new JLabel();
        lblMoneyCredits = new JLabel();
        lblCardName = new JLabel();
        lblCardNumber = new JLabel();
        lblSecurityCode = new JLabel();
        txtCardName = new JTextField();
        txtCardNumber = new JTextField();
        txtSecurityCode = new JTextField();
        btnCardDetailsFinish = new JButton();
        lblTransactionFailed = new JLabel();
        btnCardDetailsExit = new JButton();
        pnlPaymentChoice = new JPanel();
        lblCardNumberPaymentChoice = new JLabel();
        lblPaymentChoice = new JLabel();
        btnPaymentChoiceCard = new JButton();
        btnPaymentChoiceCash = new JButton();
        btnPaymentChoiceExit = new JButton();

        //======== pnlGUI ========
        {

            // JFormDesigner evaluation mark
            pnlGUI.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), pnlGUI.getBorder())); pnlGUI.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            pnlGUI.setLayout(new CardLayout());

            //======== pnlCardChoice ========
            {

                //---- lblCard ----
                lblCard.setText("WHICH TYPE OF CARD DO YOU HAVE?");

                //---- btnMagnetic ----
                btnMagnetic.setText("MAGNETIC STRIP CARD");
                btnMagnetic.addActionListener(e -> btnMagneticActionPerformed(e));

                //---- btnContactless ----
                btnContactless.setText("CONTACTLESS CARD");
                btnContactless.addActionListener(e -> btnContactlessActionPerformed(e));

                //---- btnBarcode ----
                btnBarcode.setText("BARCODE CARD");
                btnBarcode.addActionListener(e -> btnBarcodeActionPerformed(e));

                //---- btnMainGUI ----
                btnMainGUI.setText("Go Back To Main Page");
                btnMainGUI.addActionListener(e -> btnMainGUIActionPerformed(e));

                GroupLayout pnlCardChoiceLayout = new GroupLayout(pnlCardChoice);
                pnlCardChoice.setLayout(pnlCardChoiceLayout);
                pnlCardChoiceLayout.setHorizontalGroup(
                    pnlCardChoiceLayout.createParallelGroup()
                        .addGroup(pnlCardChoiceLayout.createSequentialGroup()
                            .addGroup(pnlCardChoiceLayout.createParallelGroup()
                                .addGroup(pnlCardChoiceLayout.createSequentialGroup()
                                    .addGap(206, 206, 206)
                                    .addComponent(lblCard))
                                .addGroup(pnlCardChoiceLayout.createSequentialGroup()
                                    .addGap(231, 231, 231)
                                    .addGroup(pnlCardChoiceLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnMagnetic, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnContactless, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBarcode, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(pnlCardChoiceLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnMainGUI, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(214, Short.MAX_VALUE))
                );
                pnlCardChoiceLayout.setVerticalGroup(
                    pnlCardChoiceLayout.createParallelGroup()
                        .addGroup(pnlCardChoiceLayout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(lblCard)
                            .addGap(125, 125, 125)
                            .addComponent(btnMagnetic)
                            .addGap(32, 32, 32)
                            .addComponent(btnContactless)
                            .addGap(29, 29, 29)
                            .addComponent(btnBarcode)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                            .addComponent(btnMainGUI, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                );
            }
            pnlGUI.add(pnlCardChoice, "card1");

            //======== pnlMagnetic ========
            {

                //---- btnSwipe ----
                btnSwipe.setText("SWIPE CARD TO BEGIN");
                btnSwipe.addActionListener(e -> btnSwipeActionPerformed(e));

                //---- lblMagneticError ----
                lblMagneticError.setText("ERROR INVALID CARD TRY AGAIN");
                lblMagneticError.setVisible(false);

                //---- btnValidMagnetic ----
                btnValidMagnetic.setText("Valid Card");
                btnValidMagnetic.addActionListener(e -> btnValidMagneticActionPerformed(e));

                //---- btnInvalidMagnetic ----
                btnInvalidMagnetic.setText("Invalid Card");
                btnInvalidMagnetic.addActionListener(e -> btnInvalidMagneticActionPerformed(e));

                GroupLayout pnlMagneticLayout = new GroupLayout(pnlMagnetic);
                pnlMagnetic.setLayout(pnlMagneticLayout);
                pnlMagneticLayout.setHorizontalGroup(
                    pnlMagneticLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, pnlMagneticLayout.createSequentialGroup()
                            .addContainerGap(406, Short.MAX_VALUE)
                            .addComponent(lblMagneticError)
                            .addGap(259, 259, 259))
                        .addGroup(pnlMagneticLayout.createSequentialGroup()
                            .addGap(287, 287, 287)
                            .addGroup(pnlMagneticLayout.createParallelGroup()
                                .addGroup(pnlMagneticLayout.createSequentialGroup()
                                    .addComponent(btnValidMagnetic)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnInvalidMagnetic))
                                .addComponent(btnSwipe))
                            .addContainerGap(171, Short.MAX_VALUE))
                );
                pnlMagneticLayout.setVerticalGroup(
                    pnlMagneticLayout.createParallelGroup()
                        .addGroup(pnlMagneticLayout.createSequentialGroup()
                            .addGap(261, 261, 261)
                            .addComponent(lblMagneticError)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSwipe)
                            .addGap(37, 37, 37)
                            .addGroup(pnlMagneticLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnValidMagnetic)
                                .addComponent(btnInvalidMagnetic))
                            .addContainerGap(173, Short.MAX_VALUE))
                );
            }
            pnlGUI.add(pnlMagnetic, "card2");

            //======== pnlBarcode ========
            {

                //---- lblBarcode ----
                lblBarcode.setText("INPUT BARCODE TO BEGIN");

                //---- txtBarcode ----
                txtBarcode.addFocusListener(new FocusAdapter() {
                    @Override
                    public void focusGained(FocusEvent e) {
                        txtBarcodeFocusGained(e);
                    }
                });

                //---- btnBarcodeBegin ----
                btnBarcodeBegin.setText("BEGIN");
                btnBarcodeBegin.addActionListener(e -> btnBarcodeBeginActionPerformed(e));

                //---- lblBarcodeError ----
                lblBarcodeError.setText("INVALID BARCODE TRY AGAIN");
                lblBarcodeError.setVisible(false);

                GroupLayout pnlBarcodeLayout = new GroupLayout(pnlBarcode);
                pnlBarcode.setLayout(pnlBarcodeLayout);
                pnlBarcodeLayout.setHorizontalGroup(
                    pnlBarcodeLayout.createParallelGroup()
                        .addGroup(pnlBarcodeLayout.createSequentialGroup()
                            .addGap(264, 264, 264)
                            .addGroup(pnlBarcodeLayout.createParallelGroup()
                                .addComponent(lblBarcodeError)
                                .addGroup(pnlBarcodeLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblBarcode, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBarcode)
                                    .addGroup(GroupLayout.Alignment.TRAILING, pnlBarcodeLayout.createSequentialGroup()
                                        .addComponent(btnBarcodeBegin)
                                        .addGap(69, 69, 69))))
                            .addContainerGap(230, Short.MAX_VALUE))
                );
                pnlBarcodeLayout.setVerticalGroup(
                    pnlBarcodeLayout.createParallelGroup()
                        .addGroup(pnlBarcodeLayout.createSequentialGroup()
                            .addGap(252, 252, 252)
                            .addComponent(lblBarcode)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblBarcodeError)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBarcode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBarcodeBegin)
                            .addContainerGap(187, Short.MAX_VALUE))
                );
            }
            pnlGUI.add(pnlBarcode, "card3");

            //======== pnlContactless ========
            {

                //---- btnContactlessBegin ----
                btnContactlessBegin.setText("TAP CARD TO BEGIN");
                btnContactlessBegin.addActionListener(e -> btnContactlessBeginActionPerformed(e));

                //---- lblContactlessError ----
                lblContactlessError.setText("ERROR INVALID CARD TRY AGAIN");
                lblContactlessError.setVisible(false);

                //---- btnValidContactless ----
                btnValidContactless.setText("Valid Card");
                btnValidContactless.addActionListener(e -> btnValidContactlessActionPerformed(e));

                //---- btnInvalidContactless ----
                btnInvalidContactless.setText("Invalid Card");
                btnInvalidContactless.addActionListener(e -> btnInvalidContactlessActionPerformed(e));

                GroupLayout pnlContactlessLayout = new GroupLayout(pnlContactless);
                pnlContactless.setLayout(pnlContactlessLayout);
                pnlContactlessLayout.setHorizontalGroup(
                    pnlContactlessLayout.createParallelGroup()
                        .addGroup(pnlContactlessLayout.createSequentialGroup()
                            .addGroup(pnlContactlessLayout.createParallelGroup()
                                .addGroup(pnlContactlessLayout.createSequentialGroup()
                                    .addGap(247, 247, 247)
                                    .addComponent(lblContactlessError))
                                .addGroup(pnlContactlessLayout.createSequentialGroup()
                                    .addGap(278, 278, 278)
                                    .addGroup(pnlContactlessLayout.createParallelGroup()
                                        .addGroup(pnlContactlessLayout.createSequentialGroup()
                                            .addComponent(btnValidContactless)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnInvalidContactless))
                                        .addComponent(btnContactlessBegin))))
                            .addContainerGap(180, Short.MAX_VALUE))
                );
                pnlContactlessLayout.setVerticalGroup(
                    pnlContactlessLayout.createParallelGroup()
                        .addGroup(pnlContactlessLayout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addComponent(lblContactlessError)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnContactlessBegin)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnlContactlessLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnValidContactless)
                                .addComponent(btnInvalidContactless))
                            .addContainerGap(239, Short.MAX_VALUE))
                );
            }
            pnlGUI.add(pnlContactless, "card4");

            //======== pnlAccount ========
            {

                //======== pnlHistory ========
                {

                    //---- lblCardNumberJourneyHistory ----
                    lblCardNumberJourneyHistory.setText("CARD #");

                    //======== scrollPane1 ========
                    {
                        scrollPane1.setViewportView(txtHistory);
                    }

                    //---- btnHistoryExit ----
                    btnHistoryExit.setText("EXIT");
                    btnHistoryExit.addActionListener(e -> btnHistoryExitActionPerformed(e));

                    GroupLayout pnlHistoryLayout = new GroupLayout(pnlHistory);
                    pnlHistory.setLayout(pnlHistoryLayout);
                    pnlHistoryLayout.setHorizontalGroup(
                        pnlHistoryLayout.createParallelGroup()
                            .addGroup(pnlHistoryLayout.createSequentialGroup()
                                .addGroup(pnlHistoryLayout.createParallelGroup()
                                    .addGroup(pnlHistoryLayout.createSequentialGroup()
                                        .addGap(293, 293, 293)
                                        .addComponent(lblCardNumberJourneyHistory))
                                    .addGroup(pnlHistoryLayout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 635, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlHistoryLayout.createSequentialGroup()
                                        .addGap(335, 335, 335)
                                        .addComponent(btnHistoryExit)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    pnlHistoryLayout.setVerticalGroup(
                        pnlHistoryLayout.createParallelGroup()
                            .addGroup(pnlHistoryLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(lblCardNumberJourneyHistory)
                                .addGap(87, 87, 87)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnHistoryExit)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }
                pnlAccount.addTab("JOURNEY HISTORY", pnlHistory);

                //======== pnlHome ========
                {
                    pnlHome.setLayout(new CardLayout());

                    //======== pnlAddCredits ========
                    {

                        //---- lblCardNumberAddCredits ----
                        lblCardNumberAddCredits.setText("CARD #");

                        //---- lblCreditRemaining ----
                        lblCreditRemaining.setText("Credits Remaining");

                        //---- btnAddCredit ----
                        btnAddCredit.setText("Add Credits");
                        btnAddCredit.addActionListener(e -> btnAddCreditActionPerformed(e));

                        //---- btnAddCreditsExit ----
                        btnAddCreditsExit.setText("EXIT");
                        btnAddCreditsExit.addActionListener(e -> btnAddCreditsExitActionPerformed(e));

                        GroupLayout pnlAddCreditsLayout = new GroupLayout(pnlAddCredits);
                        pnlAddCredits.setLayout(pnlAddCreditsLayout);
                        pnlAddCreditsLayout.setHorizontalGroup(
                            pnlAddCreditsLayout.createParallelGroup()
                                .addGroup(pnlAddCreditsLayout.createSequentialGroup()
                                    .addGroup(pnlAddCreditsLayout.createParallelGroup()
                                        .addGroup(pnlAddCreditsLayout.createSequentialGroup()
                                            .addGap(325, 325, 325)
                                            .addComponent(lblCardNumberAddCredits))
                                        .addGroup(pnlAddCreditsLayout.createSequentialGroup()
                                            .addGap(110, 110, 110)
                                            .addGroup(pnlAddCreditsLayout.createParallelGroup()
                                                .addComponent(btnAddCredit)
                                                .addGroup(pnlAddCreditsLayout.createSequentialGroup()
                                                    .addComponent(txtCreditRemaining, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(lblCreditRemaining))))
                                        .addGroup(pnlAddCreditsLayout.createSequentialGroup()
                                            .addGap(325, 325, 325)
                                            .addComponent(btnAddCreditsExit)))
                                    .addContainerGap(189, Short.MAX_VALUE))
                        );
                        pnlAddCreditsLayout.setVerticalGroup(
                            pnlAddCreditsLayout.createParallelGroup()
                                .addGroup(pnlAddCreditsLayout.createSequentialGroup()
                                    .addGap(79, 79, 79)
                                    .addComponent(lblCardNumberAddCredits)
                                    .addGap(54, 54, 54)
                                    .addGroup(pnlAddCreditsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCreditRemaining, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCreditRemaining))
                                    .addGap(34, 34, 34)
                                    .addComponent(btnAddCredit)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddCreditsExit)
                                    .addGap(193, 193, 193))
                        );
                    }
                    pnlHome.add(pnlAddCredits, "card1");

                    //======== pnlCardPayment ========
                    {

                        //---- lblCardNumberCardPayment ----
                        lblCardNumberCardPayment.setText("CARD #");

                        //---- lblDepositAmount ----
                        lblDepositAmount.setText("SELECT DEPOSIT AMOUNT");

                        //---- btnDeposit5 ----
                        btnDeposit5.setText("\u00a35");
                        btnDeposit5.addActionListener(e -> btnDeposit5ActionPerformed(e));

                        //---- btnDeposit10 ----
                        btnDeposit10.setText("\u00a310");
                        btnDeposit10.addActionListener(e -> btnDeposit10ActionPerformed(e));

                        //---- btnDeposit15 ----
                        btnDeposit15.setText("\u00a315");
                        btnDeposit15.addActionListener(e -> btnDeposit15ActionPerformed(e));

                        //---- btnCardPaymentNext ----
                        btnCardPaymentNext.setText("NEXT");
                        btnCardPaymentNext.addActionListener(e -> btnCardPaymentNextActionPerformed(e));

                        //---- btnCardPaymentExit ----
                        btnCardPaymentExit.setText("EXIT");
                        btnCardPaymentExit.addActionListener(e -> btnCardPaymentExitActionPerformed(e));

                        GroupLayout pnlCardPaymentLayout = new GroupLayout(pnlCardPayment);
                        pnlCardPayment.setLayout(pnlCardPaymentLayout);
                        pnlCardPaymentLayout.setHorizontalGroup(
                            pnlCardPaymentLayout.createParallelGroup()
                                .addGroup(pnlCardPaymentLayout.createSequentialGroup()
                                    .addGroup(pnlCardPaymentLayout.createParallelGroup()
                                        .addGroup(pnlCardPaymentLayout.createSequentialGroup()
                                            .addGap(242, 242, 242)
                                            .addComponent(lblDepositAmount))
                                        .addGroup(pnlCardPaymentLayout.createSequentialGroup()
                                            .addGap(347, 347, 347)
                                            .addComponent(lblCardNumberCardPayment))
                                        .addGroup(pnlCardPaymentLayout.createSequentialGroup()
                                            .addGap(81, 81, 81)
                                            .addGroup(pnlCardPaymentLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(pnlCardPaymentLayout.createSequentialGroup()
                                                    .addComponent(btnDeposit5)
                                                    .addGap(176, 176, 176)
                                                    .addComponent(btnDeposit10))
                                                .addGroup(pnlCardPaymentLayout.createParallelGroup()
                                                    .addComponent(btnCardPaymentExit)
                                                    .addComponent(btnCardPaymentNext)))
                                            .addGap(157, 157, 157)
                                            .addComponent(btnDeposit15)))
                                    .addContainerGap(99, Short.MAX_VALUE))
                        );
                        pnlCardPaymentLayout.setVerticalGroup(
                            pnlCardPaymentLayout.createParallelGroup()
                                .addGroup(pnlCardPaymentLayout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addComponent(lblCardNumberCardPayment)
                                    .addGap(64, 64, 64)
                                    .addComponent(lblDepositAmount)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(pnlCardPaymentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnDeposit5)
                                        .addComponent(btnDeposit10)
                                        .addComponent(btnDeposit15))
                                    .addGap(132, 132, 132)
                                    .addComponent(btnCardPaymentNext)
                                    .addGap(50, 50, 50)
                                    .addComponent(btnCardPaymentExit)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                    }
                    pnlHome.add(pnlCardPayment, "card2");

                    //======== pnlConfirmation ========
                    {

                        //---- lblCardNumberConfirmation ----
                        lblCardNumberConfirmation.setText("CARD #");

                        //---- lblCreditsAdded ----
                        lblCreditsAdded.setText("YOUR CREDITS HAVE BEEN ADDED TO YOUR ACCOUNT");

                        //---- btnConfirmationExit ----
                        btnConfirmationExit.setText("EXIT");
                        btnConfirmationExit.addActionListener(e -> btnConfirmationExitActionPerformed(e));

                        GroupLayout pnlConfirmationLayout = new GroupLayout(pnlConfirmation);
                        pnlConfirmation.setLayout(pnlConfirmationLayout);
                        pnlConfirmationLayout.setHorizontalGroup(
                            pnlConfirmationLayout.createParallelGroup()
                                .addGroup(pnlConfirmationLayout.createSequentialGroup()
                                    .addGroup(pnlConfirmationLayout.createParallelGroup()
                                        .addGroup(pnlConfirmationLayout.createSequentialGroup()
                                            .addGap(318, 318, 318)
                                            .addComponent(lblCardNumberConfirmation))
                                        .addGroup(pnlConfirmationLayout.createSequentialGroup()
                                            .addGap(129, 129, 129)
                                            .addComponent(lblCreditsAdded))
                                        .addGroup(pnlConfirmationLayout.createSequentialGroup()
                                            .addGap(296, 296, 296)
                                            .addComponent(btnConfirmationExit)))
                                    .addContainerGap(181, Short.MAX_VALUE))
                        );
                        pnlConfirmationLayout.setVerticalGroup(
                            pnlConfirmationLayout.createParallelGroup()
                                .addGroup(pnlConfirmationLayout.createSequentialGroup()
                                    .addGap(112, 112, 112)
                                    .addComponent(lblCardNumberConfirmation)
                                    .addGap(89, 89, 89)
                                    .addComponent(lblCreditsAdded)
                                    .addGap(86, 86, 86)
                                    .addComponent(btnConfirmationExit)
                                    .addContainerGap(160, Short.MAX_VALUE))
                        );
                    }
                    pnlHome.add(pnlConfirmation, "card3");

                    //======== pnlCashPayment ========
                    {

                        //---- lblCardNumberCashPayment ----
                        lblCardNumberCashPayment.setText("CARD #");

                        //---- lblCashInserted ----
                        lblCashInserted.setText("Cash Inserted");

                        //---- lblCreditGained ----
                        lblCreditGained.setText("Credit Gained");

                        //---- btnCashPaymentFinished ----
                        btnCashPaymentFinished.setText("FINISH");
                        btnCashPaymentFinished.addActionListener(e -> btnCashPaymentFinishedActionPerformed(e));

                        //---- btnAddCash ----
                        btnAddCash.setText("Add Cash");
                        btnAddCash.addActionListener(e -> btnAddCashActionPerformed(e));

                        //---- btnCashPaymentExit ----
                        btnCashPaymentExit.setText("EXIT");
                        btnCashPaymentExit.addActionListener(e -> btnCashPaymentExitActionPerformed(e));

                        GroupLayout pnlCashPaymentLayout = new GroupLayout(pnlCashPayment);
                        pnlCashPayment.setLayout(pnlCashPaymentLayout);
                        pnlCashPaymentLayout.setHorizontalGroup(
                            pnlCashPaymentLayout.createParallelGroup()
                                .addGroup(pnlCashPaymentLayout.createSequentialGroup()
                                    .addGroup(pnlCashPaymentLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnlCashPaymentLayout.createParallelGroup()
                                            .addGroup(pnlCashPaymentLayout.createSequentialGroup()
                                                .addGap(311, 311, 311)
                                                .addComponent(lblCardNumberCashPayment))
                                            .addGroup(pnlCashPaymentLayout.createSequentialGroup()
                                                .addGap(194, 194, 194)
                                                .addGroup(pnlCashPaymentLayout.createParallelGroup()
                                                    .addComponent(lblCreditGained)
                                                    .addComponent(lblCashInserted))))
                                        .addGroup(pnlCashPaymentLayout.createParallelGroup()
                                            .addComponent(btnCashPaymentExit)
                                            .addComponent(btnCashPaymentFinished)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                    .addComponent(btnAddCash)
                                    .addGap(145, 145, 145))
                        );
                        pnlCashPaymentLayout.setVerticalGroup(
                            pnlCashPaymentLayout.createParallelGroup()
                                .addGroup(pnlCashPaymentLayout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addComponent(lblCardNumberCashPayment)
                                    .addGap(60, 60, 60)
                                    .addGroup(pnlCashPaymentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblCashInserted)
                                        .addComponent(btnAddCash))
                                    .addGap(30, 30, 30)
                                    .addComponent(lblCreditGained)
                                    .addGap(94, 94, 94)
                                    .addComponent(btnCashPaymentFinished)
                                    .addGap(57, 57, 57)
                                    .addComponent(btnCashPaymentExit)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                    }
                    pnlHome.add(pnlCashPayment, "card4");

                    //======== pnlCardDetails ========
                    {

                        //---- lblCardNumberCardDetails ----
                        lblCardNumberCardDetails.setText("CARD #");

                        //---- lblMoneyCredits ----
                        lblMoneyCredits.setText("\u00a3 Amount - Amount Credits");

                        //---- lblCardName ----
                        lblCardName.setText("Card Name");

                        //---- lblCardNumber ----
                        lblCardNumber.setText("Card Number");

                        //---- lblSecurityCode ----
                        lblSecurityCode.setText("Security Code");

                        //---- btnCardDetailsFinish ----
                        btnCardDetailsFinish.setText("Finish");
                        btnCardDetailsFinish.addActionListener(e -> btnCardDetailsFinishActionPerformed(e));

                        //---- lblTransactionFailed ----
                        lblTransactionFailed.setText("TRANSACTION FAILED");
                        lblTransactionFailed.setVisible(false);

                        //---- btnCardDetailsExit ----
                        btnCardDetailsExit.setText("EXIT");
                        btnCardDetailsExit.addActionListener(e -> btnCardDetailsExitActionPerformed(e));

                        GroupLayout pnlCardDetailsLayout = new GroupLayout(pnlCardDetails);
                        pnlCardDetails.setLayout(pnlCardDetailsLayout);
                        pnlCardDetailsLayout.setHorizontalGroup(
                            pnlCardDetailsLayout.createParallelGroup()
                                .addGroup(pnlCardDetailsLayout.createSequentialGroup()
                                    .addGroup(pnlCardDetailsLayout.createParallelGroup()
                                        .addGroup(pnlCardDetailsLayout.createSequentialGroup()
                                            .addGap(288, 288, 288)
                                            .addComponent(lblCardNumberCardDetails))
                                        .addGroup(pnlCardDetailsLayout.createSequentialGroup()
                                            .addGap(184, 184, 184)
                                            .addComponent(lblMoneyCredits))
                                        .addGroup(pnlCardDetailsLayout.createSequentialGroup()
                                            .addGap(273, 273, 273)
                                            .addComponent(lblTransactionFailed))
                                        .addGroup(pnlCardDetailsLayout.createSequentialGroup()
                                            .addGap(98, 98, 98)
                                            .addGroup(pnlCardDetailsLayout.createParallelGroup()
                                                .addComponent(lblCardName)
                                                .addComponent(lblCardNumber)
                                                .addComponent(lblSecurityCode))
                                            .addGap(37, 37, 37)
                                            .addGroup(pnlCardDetailsLayout.createParallelGroup()
                                                .addComponent(btnCardDetailsExit)
                                                .addGroup(pnlCardDetailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btnCardDetailsFinish, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                                    .addComponent(txtCardName, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                                    .addComponent(txtCardNumber, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                                    .addComponent(txtSecurityCode, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))))
                                    .addContainerGap(213, Short.MAX_VALUE))
                        );
                        pnlCardDetailsLayout.setVerticalGroup(
                            pnlCardDetailsLayout.createParallelGroup()
                                .addGroup(pnlCardDetailsLayout.createSequentialGroup()
                                    .addGap(100, 100, 100)
                                    .addComponent(lblCardNumberCardDetails)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblMoneyCredits)
                                    .addGap(16, 16, 16)
                                    .addComponent(lblTransactionFailed)
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlCardDetailsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblCardName)
                                        .addComponent(txtCardName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(pnlCardDetailsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblCardNumber)
                                        .addComponent(txtCardNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(pnlCardDetailsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblSecurityCode)
                                        .addComponent(txtSecurityCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCardDetailsFinish)
                                    .addGap(57, 57, 57)
                                    .addComponent(btnCardDetailsExit)
                                    .addContainerGap(110, Short.MAX_VALUE))
                        );
                    }
                    pnlHome.add(pnlCardDetails, "card5");

                    //======== pnlPaymentChoice ========
                    {

                        //---- lblCardNumberPaymentChoice ----
                        lblCardNumberPaymentChoice.setText("CARD #");

                        //---- lblPaymentChoice ----
                        lblPaymentChoice.setText("PLEASE SELECT PAYMENT METHOD");

                        //---- btnPaymentChoiceCard ----
                        btnPaymentChoiceCard.setText("CARD");
                        btnPaymentChoiceCard.addActionListener(e -> btnPaymentChoiceCardActionPerformed(e));

                        //---- btnPaymentChoiceCash ----
                        btnPaymentChoiceCash.setText("CASH");
                        btnPaymentChoiceCash.addActionListener(e -> btnPaymentChoiceCashActionPerformed(e));

                        //---- btnPaymentChoiceExit ----
                        btnPaymentChoiceExit.setText("EXIT");
                        btnPaymentChoiceExit.addActionListener(e -> btnPaymentChoiceExitActionPerformed(e));

                        GroupLayout pnlPaymentChoiceLayout = new GroupLayout(pnlPaymentChoice);
                        pnlPaymentChoice.setLayout(pnlPaymentChoiceLayout);
                        pnlPaymentChoiceLayout.setHorizontalGroup(
                            pnlPaymentChoiceLayout.createParallelGroup()
                                .addGroup(pnlPaymentChoiceLayout.createSequentialGroup()
                                    .addGroup(pnlPaymentChoiceLayout.createParallelGroup()
                                        .addGroup(pnlPaymentChoiceLayout.createSequentialGroup()
                                            .addGap(304, 304, 304)
                                            .addComponent(lblCardNumberPaymentChoice))
                                        .addGroup(pnlPaymentChoiceLayout.createSequentialGroup()
                                            .addGap(216, 216, 216)
                                            .addComponent(lblPaymentChoice))
                                        .addGroup(pnlPaymentChoiceLayout.createSequentialGroup()
                                            .addGap(152, 152, 152)
                                            .addComponent(btnPaymentChoiceCard)
                                            .addGap(123, 123, 123)
                                            .addComponent(btnPaymentChoiceCash))
                                        .addGroup(pnlPaymentChoiceLayout.createSequentialGroup()
                                            .addGap(294, 294, 294)
                                            .addComponent(btnPaymentChoiceExit)))
                                    .addContainerGap(220, Short.MAX_VALUE))
                        );
                        pnlPaymentChoiceLayout.setVerticalGroup(
                            pnlPaymentChoiceLayout.createParallelGroup()
                                .addGroup(pnlPaymentChoiceLayout.createSequentialGroup()
                                    .addGap(114, 114, 114)
                                    .addComponent(lblCardNumberPaymentChoice)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblPaymentChoice)
                                    .addGap(92, 92, 92)
                                    .addGroup(pnlPaymentChoiceLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPaymentChoiceCard)
                                        .addComponent(btnPaymentChoiceCash))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPaymentChoiceExit)
                                    .addGap(210, 210, 210))
                        );
                    }
                    pnlHome.add(pnlPaymentChoice, "card6");
                }
                pnlAccount.addTab("HOME", pnlHome);
            }
            pnlGUI.add(pnlAccount, "card6");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Benjamin Ward
    private JPanel pnlGUI;
    private JPanel pnlCardChoice;
    private JLabel lblCard;
    private JButton btnMagnetic;
    private JButton btnContactless;
    private JButton btnBarcode;
    private JButton btnMainGUI;
    private JPanel pnlMagnetic;
    private JButton btnSwipe;
    private JLabel lblMagneticError;
    private JButton btnValidMagnetic;
    private JButton btnInvalidMagnetic;
    private JPanel pnlBarcode;
    private JLabel lblBarcode;
    private JTextField txtBarcode;
    private JButton btnBarcodeBegin;
    private JLabel lblBarcodeError;
    private JPanel pnlContactless;
    private JButton btnContactlessBegin;
    private JLabel lblContactlessError;
    private JButton btnValidContactless;
    private JButton btnInvalidContactless;
    private JTabbedPane pnlAccount;
    private JPanel pnlHistory;
    private JLabel lblCardNumberJourneyHistory;
    private JScrollPane scrollPane1;
    private JTextArea txtHistory;
    private JButton btnHistoryExit;
    private JPanel pnlHome;
    private JPanel pnlAddCredits;
    private JLabel lblCardNumberAddCredits;
    private JTextField txtCreditRemaining;
    private JLabel lblCreditRemaining;
    private JButton btnAddCredit;
    private JButton btnAddCreditsExit;
    private JPanel pnlCardPayment;
    private JLabel lblCardNumberCardPayment;
    private JLabel lblDepositAmount;
    private JButton btnDeposit5;
    private JButton btnDeposit10;
    private JButton btnDeposit15;
    private JButton btnCardPaymentNext;
    private JButton btnCardPaymentExit;
    private JPanel pnlConfirmation;
    private JLabel lblCardNumberConfirmation;
    private JLabel lblCreditsAdded;
    private JButton btnConfirmationExit;
    private JPanel pnlCashPayment;
    private JLabel lblCardNumberCashPayment;
    private JLabel lblCashInserted;
    private JLabel lblCreditGained;
    private JButton btnCashPaymentFinished;
    private JButton btnAddCash;
    private JButton btnCashPaymentExit;
    private JPanel pnlCardDetails;
    private JLabel lblCardNumberCardDetails;
    private JLabel lblMoneyCredits;
    private JLabel lblCardName;
    private JLabel lblCardNumber;
    private JLabel lblSecurityCode;
    private JTextField txtCardName;
    private JTextField txtCardNumber;
    private JTextField txtSecurityCode;
    private JButton btnCardDetailsFinish;
    private JLabel lblTransactionFailed;
    private JButton btnCardDetailsExit;
    private JPanel pnlPaymentChoice;
    private JLabel lblCardNumberPaymentChoice;
    private JLabel lblPaymentChoice;
    private JButton btnPaymentChoiceCard;
    private JButton btnPaymentChoiceCash;
    private JButton btnPaymentChoiceExit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
