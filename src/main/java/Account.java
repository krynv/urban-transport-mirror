import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Account extends JFrame {
    private JPanel panel1;

    private String urbanNumber = "123456";
    private int credits = 0;
    private int amount = 0;
    private String cardName = "John Smith";
    private String cardNumber = "0000-1111-2222-3333";
    private String securityCode = "012";
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - godieina fire
    private JTabbedPane tabbedPane1;
    private JPanel pnlHistory;
    private JLabel lblCardNumberHistory;
    private JLabel lblJourneyHistory;
    private JScrollPane scrollPane1;
    private JTextArea txtaHistory;
    private JButton btnExitHistory;
    private JPanel pnlHome;
    private JPanel pnlAccount;
    private JLabel lblCardNumberAccount;
    private JTextField txtCredits;
    private JLabel lblCreditsRemaining;
    private JButton btnAddCredits;
    private JButton btnExitAccount;
    private JPanel pnlAddCredits;
    private JButton btnCard;
    private JButton btnCash;
    private JLabel lblCardNumberAddCredits;
    private JButton btnExitAddCredits;
    private JPanel pnlCash;
    private JLabel lblCardNumberCash;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel lblCashValue;
    private JLabel lblCreditsGained;
    private JButton btnFinish;
    private JButton btnExitCash;
    private JButton btnInsert;
    private JPanel pnlCashConfirmation;
    private JLabel lblCardNumberCashConfirmation;
    private JLabel label6;
    private JButton btnExitCashConfirmation;
    private JPanel pnlCard;
    private JButton btn5Pound;
    private JButton btn10Pound;
    private JButton btn15Pound;
    private JLabel label7;
    private JLabel lblCardNumberCard;
    private JButton btnNext;
    private JButton btnExitCard;
    private JPanel pnlCardDetails;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JTextField txtCardName;
    private JTextField txtCardNumber;
    private JTextField txtSecurityCode;
    private JButton btnCardFinish;
    private JButton btnExitCardDetails;
    private JLabel lblCardDetails;
    private JLabel lblTransactionFailed;
    public Account() {
        initComponents();
        lblCardNumberAccount.setText("Card " + urbanNumber);
        txtCredits.setText(Integer.toString(credits));
        this.setContentPane(panel1);
        this.pack();
    }

    //----- Account Tabbed Screen
    private void tabbedPane1StateChanged(ChangeEvent e) {
        if (tabbedPane1.getSelectedIndex() == 0) {
            txtaHistory.setText("Journey 1\nJourney 2\nJourney 3\nJourney 4\nJourney 5\n");
        }
    }

    //----- Account Information Screen
    private void btnAddCreditsActionPerformed(ActionEvent e) {
        lblCardNumberAddCredits.setText("Card " + urbanNumber);
        pnlAccount.setVisible(false);
        pnlAddCredits.setVisible(true);
    }

    private void btnExitActionPerformed(ActionEvent e) {
        this.dispose();
    }

    //----- Add Credits Screen
    private void btnCardActionPerformed(ActionEvent e) {
        lblCardNumberCard.setText("Card " + urbanNumber);
        pnlAddCredits.setVisible(false);
        pnlCard.setVisible(true);
    }

    private void btnCashActionPerformed(ActionEvent e) {
        lblCardNumberCash.setText("Card " + urbanNumber);
        pnlAddCredits.setVisible(false);
        pnlCash.setVisible(true);
    }

    private void btnExitAddCreditsActionPerformed(ActionEvent e) {
        this.dispose();
    }

    //----- Cash Payment Screen
    private void btnInsertActionPerformed(ActionEvent e) {
        credits = 10;
        lblCashValue.setText("£10.00");
        lblCreditsGained.setText(Integer.toString(credits));
    }

    private void btnFinishActionPerformed(ActionEvent e) {
        if (credits != 0) {
            lblCardNumberCashConfirmation.setText(urbanNumber);
            pnlCash.setVisible(false);
            pnlCashConfirmation.setVisible(true);
        }
    }

    private void btnExitCashActionPerformed(ActionEvent e) {
        this.dispose();
    }

    //----- Cash Confirmation Screen
    private void btnExitCashConfirmationActionPerformed(ActionEvent e) {
        this.dispose();
    }

    //----- Journey History Screen
    private void btnExitHistoryActionPerformed(ActionEvent e) {
        this.dispose();
    }

    //----- Card Payment Screen
    private void btn5PoundActionPerformed(ActionEvent e) {
        amount = 5;
    }

    private void btn10PoundActionPerformed(ActionEvent e) {
        amount = 10;
    }

    private void btn15PoundActionPerformed(ActionEvent e) {
        amount = 15;
    }

    private void btnNextActionPerformed(ActionEvent e) {
        lblCardDetails.setText("£" +
                Integer.toString(amount) +
                " - " +
                Integer.toString(amount) +
                " credits");
        txtCardName.setText(cardName);
        txtCardNumber.setText(cardNumber);
        txtSecurityCode.setText(securityCode);
        pnlCard.setVisible(false);
        pnlCardDetails.setVisible(true);
    }

    private void btnExitCardActionPerformed(ActionEvent e) {
        this.dispose();
    }

    //----- Card Details Screen
    private void btnCardFinishActionPerformed(ActionEvent e) {
        if (!cardName.equals(txtCardName.getText()) ||
                !cardNumber.equals(txtCardNumber.getText()) ||
                !securityCode.equals(txtSecurityCode.getText())) {
            lblTransactionFailed.setVisible(true);
        }
    }

    private void txtCardNameFocusGained(FocusEvent e) {
        lblTransactionFailed.setVisible(false);
    }

    private void txtCardNumberFocusGained(FocusEvent e) {
        lblTransactionFailed.setVisible(false);
    }

    private void txtSecurityCodeFocusGained(FocusEvent e) {
        lblTransactionFailed.setVisible(false);
    }

    private void btnExitCardDetailsActionPerformed(ActionEvent e) {
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - godieina fire
        panel1 = new JPanel();
        tabbedPane1 = new JTabbedPane();
        pnlHistory = new JPanel();
        lblCardNumberHistory = new JLabel();
        lblJourneyHistory = new JLabel();
        scrollPane1 = new JScrollPane();
        txtaHistory = new JTextArea();
        btnExitHistory = new JButton();
        pnlHome = new JPanel();
        pnlAccount = new JPanel();
        lblCardNumberAccount = new JLabel();
        txtCredits = new JTextField();
        lblCreditsRemaining = new JLabel();
        btnAddCredits = new JButton();
        btnExitAccount = new JButton();
        pnlAddCredits = new JPanel();
        btnCard = new JButton();
        btnCash = new JButton();
        lblCardNumberAddCredits = new JLabel();
        btnExitAddCredits = new JButton();
        pnlCash = new JPanel();
        lblCardNumberCash = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        lblCashValue = new JLabel();
        lblCreditsGained = new JLabel();
        btnFinish = new JButton();
        btnExitCash = new JButton();
        btnInsert = new JButton();
        pnlCashConfirmation = new JPanel();
        lblCardNumberCashConfirmation = new JLabel();
        label6 = new JLabel();
        btnExitCashConfirmation = new JButton();
        pnlCard = new JPanel();
        btn5Pound = new JButton();
        btn10Pound = new JButton();
        btn15Pound = new JButton();
        label7 = new JLabel();
        lblCardNumberCard = new JLabel();
        btnNext = new JButton();
        btnExitCard = new JButton();
        pnlCardDetails = new JPanel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        txtCardName = new JTextField();
        txtCardNumber = new JTextField();
        txtSecurityCode = new JTextField();
        btnCardFinish = new JButton();
        btnExitCardDetails = new JButton();
        lblCardDetails = new JLabel();
        lblTransactionFailed = new JLabel();

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                            "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                            javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                            java.awt.Color.red), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("border".equals(e.getPropertyName())) throw new RuntimeException();
                }
            });


            //======== tabbedPane1 ========
            {
                tabbedPane1.addChangeListener(e -> tabbedPane1StateChanged(e));

                //======== pnlHistory ========
                {

                    //---- lblCardNumberHistory ----
                    lblCardNumberHistory.setText("CARD");

                    //---- lblJourneyHistory ----
                    lblJourneyHistory.setText("CARD # JOURNEY HISTORY");

                    //======== scrollPane1 ========
                    {
                        scrollPane1.setViewportView(txtaHistory);
                    }

                    //---- btnExitHistory ----
                    btnExitHistory.setText("EXIT");
                    btnExitHistory.addActionListener(e -> btnExitHistoryActionPerformed(e));

                    GroupLayout pnlHistoryLayout = new GroupLayout(pnlHistory);
                    pnlHistory.setLayout(pnlHistoryLayout);
                    pnlHistoryLayout.setHorizontalGroup(
                            pnlHistoryLayout.createParallelGroup()
                                    .addGroup(pnlHistoryLayout.createSequentialGroup()
                                            .addGroup(pnlHistoryLayout.createParallelGroup()
                                                    .addGroup(pnlHistoryLayout.createSequentialGroup()
                                                            .addGap(292, 292, 292)
                                                            .addComponent(lblCardNumberHistory))
                                                    .addGroup(pnlHistoryLayout.createSequentialGroup()
                                                            .addGap(184, 184, 184)
                                                            .addComponent(lblJourneyHistory))
                                                    .addGroup(pnlHistoryLayout.createSequentialGroup()
                                                            .addGap(107, 107, 107)
                                                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 617, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(pnlHistoryLayout.createSequentialGroup()
                                                            .addGap(334, 334, 334)
                                                            .addComponent(btnExitHistory)))
                                            .addContainerGap(132, Short.MAX_VALUE))
                    );
                    pnlHistoryLayout.setVerticalGroup(
                            pnlHistoryLayout.createParallelGroup()
                                    .addGroup(pnlHistoryLayout.createSequentialGroup()
                                            .addGap(54, 54, 54)
                                            .addComponent(lblCardNumberHistory)
                                            .addGap(44, 44, 44)
                                            .addComponent(lblJourneyHistory)
                                            .addGap(45, 45, 45)
                                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(btnExitHistory)
                                            .addContainerGap(42, Short.MAX_VALUE))
                    );
                }
                tabbedPane1.addTab("JOURNEY HISTORY", pnlHistory);

                //======== pnlHome ========
                {
                    pnlHome.setLayout(new CardLayout());

                    //======== pnlAccount ========
                    {

                        //---- lblCardNumberAccount ----
                        lblCardNumberAccount.setText("Card");

                        //---- lblCreditsRemaining ----
                        lblCreditsRemaining.setText("Credits Remaining");

                        //---- btnAddCredits ----
                        btnAddCredits.setText("ADD CREDITS");
                        btnAddCredits.addActionListener(e -> btnAddCreditsActionPerformed(e));

                        //---- btnExitAccount ----
                        btnExitAccount.setText("EXIT");
                        btnExitAccount.addActionListener(e -> btnExitActionPerformed(e));

                        GroupLayout pnlAccountLayout = new GroupLayout(pnlAccount);
                        pnlAccount.setLayout(pnlAccountLayout);
                        pnlAccountLayout.setHorizontalGroup(
                                pnlAccountLayout.createParallelGroup()
                                        .addGroup(pnlAccountLayout.createSequentialGroup()
                                                .addGroup(pnlAccountLayout.createParallelGroup()
                                                        .addGroup(pnlAccountLayout.createSequentialGroup()
                                                                .addGap(323, 323, 323)
                                                                .addComponent(lblCardNumberAccount))
                                                        .addGroup(pnlAccountLayout.createSequentialGroup()
                                                                .addGap(111, 111, 111)
                                                                .addGroup(pnlAccountLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btnAddCredits, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                                                        .addComponent(txtCredits, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lblCreditsRemaining))
                                                        .addGroup(pnlAccountLayout.createSequentialGroup()
                                                                .addGap(337, 337, 337)
                                                                .addComponent(btnExitAccount)))
                                                .addContainerGap(279, Short.MAX_VALUE))
                        );
                        pnlAccountLayout.setVerticalGroup(
                                pnlAccountLayout.createParallelGroup()
                                        .addGroup(pnlAccountLayout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(lblCardNumberAccount)
                                                .addGap(119, 119, 119)
                                                .addGroup(pnlAccountLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtCredits, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblCreditsRemaining))
                                                .addGap(58, 58, 58)
                                                .addComponent(btnAddCredits)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                                .addComponent(btnExitAccount)
                                                .addGap(53, 53, 53))
                        );
                    }
                    pnlHome.add(pnlAccount, "card1");

                    //======== pnlAddCredits ========
                    {

                        //---- btnCard ----
                        btnCard.setText("CARD");
                        btnCard.addActionListener(e -> btnCardActionPerformed(e));

                        //---- btnCash ----
                        btnCash.setText("CASH");
                        btnCash.addActionListener(e -> btnCashActionPerformed(e));

                        //---- lblCardNumberAddCredits ----
                        lblCardNumberAddCredits.setText("Card");

                        //---- btnExitAddCredits ----
                        btnExitAddCredits.setText("EXIT");
                        btnExitAddCredits.addActionListener(e -> btnExitAddCreditsActionPerformed(e));

                        GroupLayout pnlAddCreditsLayout = new GroupLayout(pnlAddCredits);
                        pnlAddCredits.setLayout(pnlAddCreditsLayout);
                        pnlAddCreditsLayout.setHorizontalGroup(
                                pnlAddCreditsLayout.createParallelGroup()
                                        .addGroup(pnlAddCreditsLayout.createSequentialGroup()
                                                .addGroup(pnlAddCreditsLayout.createParallelGroup()
                                                        .addGroup(pnlAddCreditsLayout.createSequentialGroup()
                                                                .addGap(183, 183, 183)
                                                                .addComponent(btnCard)
                                                                .addGap(132, 132, 132)
                                                                .addComponent(btnCash))
                                                        .addGroup(pnlAddCreditsLayout.createSequentialGroup()
                                                                .addGap(335, 335, 335)
                                                                .addComponent(btnExitAddCredits))
                                                        .addGroup(pnlAddCreditsLayout.createSequentialGroup()
                                                                .addGap(309, 309, 309)
                                                                .addComponent(lblCardNumberAddCredits)))
                                                .addContainerGap(276, Short.MAX_VALUE))
                        );
                        pnlAddCreditsLayout.setVerticalGroup(
                                pnlAddCreditsLayout.createParallelGroup()
                                        .addGroup(pnlAddCreditsLayout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(lblCardNumberAddCredits)
                                                .addGap(99, 99, 99)
                                                .addGroup(pnlAddCreditsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnCard)
                                                        .addComponent(btnCash))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                                                .addComponent(btnExitAddCredits)
                                                .addGap(100, 100, 100))
                        );
                    }
                    pnlHome.add(pnlAddCredits, "card2");

                    //======== pnlCash ========
                    {

                        //---- lblCardNumberCash ----
                        lblCardNumberCash.setText("CARD");

                        //---- label2 ----
                        label2.setText("\u00a31 - 1 credit");

                        //---- label3 ----
                        label3.setText("CASH INSERTED");

                        //---- label4 ----
                        label4.setText("CREDITS GAINED");

                        //---- lblCashValue ----
                        lblCashValue.setText("VALUE");

                        //---- lblCreditsGained ----
                        lblCreditsGained.setText("VALUE");

                        //---- btnFinish ----
                        btnFinish.setText("FINISH");
                        btnFinish.addActionListener(e -> btnFinishActionPerformed(e));

                        //---- btnExitCash ----
                        btnExitCash.setText("EXIT");
                        btnExitCash.addActionListener(e -> btnExitCashActionPerformed(e));

                        //---- btnInsert ----
                        btnInsert.setText("INSERT MONEY");
                        btnInsert.addActionListener(e -> btnInsertActionPerformed(e));

                        GroupLayout pnlCashLayout = new GroupLayout(pnlCash);
                        pnlCash.setLayout(pnlCashLayout);
                        pnlCashLayout.setHorizontalGroup(
                                pnlCashLayout.createParallelGroup()
                                        .addGroup(pnlCashLayout.createSequentialGroup()
                                                .addGroup(pnlCashLayout.createParallelGroup()
                                                        .addGroup(pnlCashLayout.createSequentialGroup()
                                                                .addGap(157, 157, 157)
                                                                .addGroup(pnlCashLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(label4)
                                                                        .addComponent(label3))
                                                                .addGap(68, 68, 68)
                                                                .addGroup(pnlCashLayout.createParallelGroup()
                                                                        .addComponent(lblCashValue)
                                                                        .addComponent(lblCreditsGained)))
                                                        .addGroup(pnlCashLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(btnInsert))
                                                        .addGroup(pnlCashLayout.createSequentialGroup()
                                                                .addGap(361, 361, 361)
                                                                .addGroup(pnlCashLayout.createParallelGroup()
                                                                        .addComponent(btnFinish)
                                                                        .addGroup(pnlCashLayout.createSequentialGroup()
                                                                                .addGap(9, 9, 9)
                                                                                .addComponent(btnExitCash))))
                                                        .addGroup(pnlCashLayout.createSequentialGroup()
                                                                .addGap(337, 337, 337)
                                                                .addComponent(label2))
                                                        .addGroup(pnlCashLayout.createSequentialGroup()
                                                                .addGap(367, 367, 367)
                                                                .addComponent(lblCardNumberCash)))
                                                .addContainerGap(351, Short.MAX_VALUE))
                        );
                        pnlCashLayout.setVerticalGroup(
                                pnlCashLayout.createParallelGroup()
                                        .addGroup(pnlCashLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btnInsert)
                                                .addGap(58, 58, 58)
                                                .addComponent(lblCardNumberCash)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label2)
                                                .addGap(71, 71, 71)
                                                .addGroup(pnlCashLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(label3)
                                                        .addComponent(lblCashValue))
                                                .addGap(36, 36, 36)
                                                .addGroup(pnlCashLayout.createParallelGroup()
                                                        .addComponent(label4)
                                                        .addComponent(lblCreditsGained))
                                                .addGap(74, 74, 74)
                                                .addComponent(btnFinish)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnExitCash)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                    }
                    pnlHome.add(pnlCash, "card3");

                    //======== pnlCashConfirmation ========
                    {

                        //---- lblCardNumberCashConfirmation ----
                        lblCardNumberCashConfirmation.setText("CARD");

                        //---- label6 ----
                        label6.setText("YOUR CREDITS HAVE BEEN APPLIED TO YOU ACCOUNT");

                        //---- btnExitCashConfirmation ----
                        btnExitCashConfirmation.setText("EXIT");
                        btnExitCashConfirmation.addActionListener(e -> btnExitCashConfirmationActionPerformed(e));

                        GroupLayout pnlCashConfirmationLayout = new GroupLayout(pnlCashConfirmation);
                        pnlCashConfirmation.setLayout(pnlCashConfirmationLayout);
                        pnlCashConfirmationLayout.setHorizontalGroup(
                                pnlCashConfirmationLayout.createParallelGroup()
                                        .addGroup(pnlCashConfirmationLayout.createSequentialGroup()
                                                .addGroup(pnlCashConfirmationLayout.createParallelGroup()
                                                        .addGroup(pnlCashConfirmationLayout.createSequentialGroup()
                                                                .addGap(320, 320, 320)
                                                                .addComponent(lblCardNumberCashConfirmation))
                                                        .addGroup(pnlCashConfirmationLayout.createSequentialGroup()
                                                                .addGap(83, 83, 83)
                                                                .addComponent(label6))
                                                        .addGroup(pnlCashConfirmationLayout.createSequentialGroup()
                                                                .addGap(333, 333, 333)
                                                                .addComponent(btnExitCashConfirmation)))
                                                .addContainerGap(183, Short.MAX_VALUE))
                        );
                        pnlCashConfirmationLayout.setVerticalGroup(
                                pnlCashConfirmationLayout.createParallelGroup()
                                        .addGroup(pnlCashConfirmationLayout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(lblCardNumberCashConfirmation)
                                                .addGap(64, 64, 64)
                                                .addComponent(label6)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                                .addComponent(btnExitCashConfirmation)
                                                .addGap(130, 130, 130))
                        );
                    }
                    pnlHome.add(pnlCashConfirmation, "card4");

                    //======== pnlCard ========
                    {

                        //---- btn5Pound ----
                        btn5Pound.setText("\u00a35");
                        btn5Pound.addActionListener(e -> btn5PoundActionPerformed(e));

                        //---- btn10Pound ----
                        btn10Pound.setText("\u00a310");
                        btn10Pound.addActionListener(e -> btn10PoundActionPerformed(e));

                        //---- btn15Pound ----
                        btn15Pound.setText("\u00a315");
                        btn15Pound.addActionListener(e -> btn15PoundActionPerformed(e));

                        //---- label7 ----
                        label7.setText("SELECT DEPOSIT VALUE");

                        //---- lblCardNumberCard ----
                        lblCardNumberCard.setText("CARD");

                        //---- btnNext ----
                        btnNext.setText("NEXT");
                        btnNext.addActionListener(e -> btnNextActionPerformed(e));

                        //---- btnExitCard ----
                        btnExitCard.setText("EXIT");
                        btnExitCard.addActionListener(e -> btnExitCardActionPerformed(e));

                        GroupLayout pnlCardLayout = new GroupLayout(pnlCard);
                        pnlCard.setLayout(pnlCardLayout);
                        pnlCardLayout.setHorizontalGroup(
                                pnlCardLayout.createParallelGroup()
                                        .addGroup(pnlCardLayout.createSequentialGroup()
                                                .addGroup(pnlCardLayout.createParallelGroup()
                                                        .addGroup(pnlCardLayout.createSequentialGroup()
                                                                .addGap(140, 140, 140)
                                                                .addComponent(btn5Pound)
                                                                .addGap(81, 81, 81)
                                                                .addComponent(btn10Pound)
                                                                .addGap(96, 96, 96)
                                                                .addComponent(btn15Pound))
                                                        .addGroup(pnlCardLayout.createSequentialGroup()
                                                                .addGap(261, 261, 261)
                                                                .addComponent(label7))
                                                        .addGroup(pnlCardLayout.createSequentialGroup()
                                                                .addGap(299, 299, 299)
                                                                .addComponent(lblCardNumberCard))
                                                        .addGroup(pnlCardLayout.createSequentialGroup()
                                                                .addGap(297, 297, 297)
                                                                .addGroup(pnlCardLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(btnNext)
                                                                        .addComponent(btnExitCard))))
                                                .addContainerGap(219, Short.MAX_VALUE))
                        );
                        pnlCardLayout.setVerticalGroup(
                                pnlCardLayout.createParallelGroup()
                                        .addGroup(pnlCardLayout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(lblCardNumberCard)
                                                .addGap(41, 41, 41)
                                                .addComponent(label7)
                                                .addGap(30, 30, 30)
                                                .addGroup(pnlCardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btn5Pound)
                                                        .addComponent(btn10Pound)
                                                        .addComponent(btn15Pound))
                                                .addGap(97, 97, 97)
                                                .addComponent(btnNext)
                                                .addGap(109, 109, 109)
                                                .addComponent(btnExitCard)
                                                .addContainerGap(21, Short.MAX_VALUE))
                        );
                    }
                    pnlHome.add(pnlCard, "card5");

                    //======== pnlCardDetails ========
                    {

                        //---- label8 ----
                        label8.setText("Card Name");

                        //---- label9 ----
                        label9.setText("Card Number");

                        //---- label10 ----
                        label10.setText("Security Code");

                        //---- txtCardName ----
                        txtCardName.addFocusListener(new FocusAdapter() {
                            @Override
                            public void focusGained(FocusEvent e) {
                                txtCardNameFocusGained(e);
                            }
                        });

                        //---- txtCardNumber ----
                        txtCardNumber.addFocusListener(new FocusAdapter() {
                            @Override
                            public void focusGained(FocusEvent e) {
                                txtCardNumberFocusGained(e);
                            }
                        });

                        //---- txtSecurityCode ----
                        txtSecurityCode.addFocusListener(new FocusAdapter() {
                            @Override
                            public void focusGained(FocusEvent e) {
                                txtSecurityCodeFocusGained(e);
                            }
                        });

                        //---- btnCardFinish ----
                        btnCardFinish.setText("FINISH");
                        btnCardFinish.addActionListener(e -> btnCardFinishActionPerformed(e));

                        //---- btnExitCardDetails ----
                        btnExitCardDetails.setText("EXIT");
                        btnExitCardDetails.addActionListener(e -> btnExitCardDetailsActionPerformed(e));

                        //---- lblCardDetails ----
                        lblCardDetails.setText("\u00a3 Amount - Amount credits");

                        //---- lblTransactionFailed ----
                        lblTransactionFailed.setText("TRANSACTION FAILED");
                        lblTransactionFailed.setVisible(false);

                        GroupLayout pnlCardDetailsLayout = new GroupLayout(pnlCardDetails);
                        pnlCardDetails.setLayout(pnlCardDetailsLayout);
                        pnlCardDetailsLayout.setHorizontalGroup(
                                pnlCardDetailsLayout.createParallelGroup()
                                        .addGroup(pnlCardDetailsLayout.createSequentialGroup()
                                                .addGroup(pnlCardDetailsLayout.createParallelGroup()
                                                        .addGroup(pnlCardDetailsLayout.createSequentialGroup()
                                                                .addGroup(pnlCardDetailsLayout.createParallelGroup()
                                                                        .addGroup(pnlCardDetailsLayout.createSequentialGroup()
                                                                                .addGap(111, 111, 111)
                                                                                .addComponent(label8)
                                                                                .addGap(4, 4, 4))
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, pnlCardDetailsLayout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addGroup(pnlCardDetailsLayout.createParallelGroup()
                                                                                        .addComponent(label9, GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(label10, GroupLayout.Alignment.TRAILING))))
                                                                .addGap(39, 39, 39)
                                                                .addGroup(pnlCardDetailsLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btnCardFinish, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                                                        .addComponent(txtCardName, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                                                        .addComponent(txtCardNumber, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                                                        .addComponent(txtSecurityCode, GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)))
                                                        .addGroup(pnlCardDetailsLayout.createSequentialGroup()
                                                                .addGap(365, 365, 365)
                                                                .addComponent(btnExitCardDetails))
                                                        .addGroup(pnlCardDetailsLayout.createSequentialGroup()
                                                                .addGap(263, 263, 263)
                                                                .addGroup(pnlCardDetailsLayout.createParallelGroup()
                                                                        .addComponent(lblCardDetails)
                                                                        .addGroup(pnlCardDetailsLayout.createSequentialGroup()
                                                                                .addGap(23, 23, 23)
                                                                                .addComponent(lblTransactionFailed)))))
                                                .addContainerGap(300, Short.MAX_VALUE))
                        );
                        pnlCardDetailsLayout.setVerticalGroup(
                                pnlCardDetailsLayout.createParallelGroup()
                                        .addGroup(pnlCardDetailsLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(lblCardDetails)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblTransactionFailed)
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlCardDetailsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(label8)
                                                        .addComponent(txtCardName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlCardDetailsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(label9)
                                                        .addComponent(txtCardNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlCardDetailsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtSecurityCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label10))
                                                .addGap(18, 18, 18)
                                                .addComponent(btnCardFinish)
                                                .addGap(56, 56, 56)
                                                .addComponent(btnExitCardDetails)
                                                .addContainerGap(76, Short.MAX_VALUE))
                        );
                    }
                    pnlHome.add(pnlCardDetails, "card6");
                }
                tabbedPane1.addTab("HOME", pnlHome);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addComponent(tabbedPane1, GroupLayout.Alignment.TRAILING)
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                                    .addContainerGap())
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
