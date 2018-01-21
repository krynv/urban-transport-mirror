import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jgoodies.forms.layout.*;
public class CardTicketPayment extends JFrame {
    public CardTicketPayment() {
        initComponents();
        this.setContentPane(panel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Pay With Card");
        this.pack();
        paymentValidateLabel.setVisible(false);
        printTicketButton.setVisible(false);
    }

    private void homeActionPerformed(ActionEvent e) {
        new UserBooking().setVisible(true);
        this.dispose();
    }

    private void languageSelectActionPerformed(ActionEvent e) {
        new SelectLanguage().setVisible(true);
        this.dispose();
    }

    private void confirmPaymentActionPerformed(ActionEvent e) {

        paymentInformationLabel.setVisible(false);
        ticketTypeLabel.setVisible(false);
        priceLabel.setVisible(false);
        cardNameLabel.setVisible(false);
        cardNumberLabel.setVisible(false);
        securityCodeLabel.setVisible(false);
        cardNameTextBox.setVisible(false);
        cardNumberTextBox.setVisible(false);
        securityCodeTextBox.setVisible(false);
        confirmPaymentButton.setVisible(false);

        printTicketButton.setVisible(true);
        paymentValidateLabel.setVisible(true);

        paymentValidateLabel.setBackground(new Color(216, 231, 213));
        paymentValidateLabel.setOpaque(true);
        paymentValidateLabel.setText("PAYMENT SUCCESSFUL");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - godieina fire
        panel2 = new JPanel();
        homeButton = new JButton();
        languageSelectButton = new JButton();
        displayTimetableButton = new JButton();
        dateTimeLabel = new JLabel();
        viaLocationsLabel = new JLabel();
        departureDateAndTimeLabel = new JLabel();
        stationLabel = new JLabel();
        destinationLabel = new JLabel();
        returnDateAndTimeLabel = new JLabel();
        paymentInformationLabel = new JLabel();
        ticketTypeLabel = new JLabel();
        priceLabel = new JLabel();
        cardNameLabel = new JLabel();
        cardNumberLabel = new JLabel();
        securityCodeLabel = new JLabel();
        cardNameTextBox = new JTextField();
        cardNumberTextBox = new JTextField();
        securityCodeTextBox = new JTextField();
        confirmPaymentButton = new JButton();
        printTicketButton = new JButton();
        paymentValidateLabel = new JLabel();

        //======== panel2 ========
        {
            panel2.setMinimumSize(new Dimension(580, 385));

            // JFormDesigner evaluation mark
            panel2.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel2.getBorder())); panel2.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- homeButton ----
            homeButton.setText("Home");
            homeButton.addActionListener(e -> homeActionPerformed(e));

            //---- languageSelectButton ----
            languageSelectButton.setText("Select Language");
            languageSelectButton.addActionListener(e -> languageSelectActionPerformed(e));

            //---- displayTimetableButton ----
            displayTimetableButton.setText("Display Timetable");
            displayTimetableButton.setEnabled(false);

            //---- dateTimeLabel ----
            dateTimeLabel.setText("Date/Time");
            dateTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
            dateTimeLabel.setMaximumSize(new Dimension(25, 25));
            dateTimeLabel.setMinimumSize(new Dimension(25, 25));
            dateTimeLabel.setPreferredSize(new Dimension(25, 25));

            //---- viaLocationsLabel ----
            viaLocationsLabel.setText("Via Locations");

            //---- departureDateAndTimeLabel ----
            departureDateAndTimeLabel.setText("Departure Date/Time");

            //---- stationLabel ----
            stationLabel.setText("Station");

            //---- destinationLabel ----
            destinationLabel.setText("Destination");

            //---- returnDateAndTimeLabel ----
            returnDateAndTimeLabel.setText("Return Date/Time");

            //---- paymentInformationLabel ----
            paymentInformationLabel.setText("Payment Information");

            //---- ticketTypeLabel ----
            ticketTypeLabel.setText("Ticket Type");

            //---- priceLabel ----
            priceLabel.setText("PRICE");

            //---- cardNameLabel ----
            cardNameLabel.setText("Card Name");
            cardNameLabel.setLabelFor(cardNameTextBox);

            //---- cardNumberLabel ----
            cardNumberLabel.setText("Card Number");
            cardNumberLabel.setLabelFor(cardNumberTextBox);

            //---- securityCodeLabel ----
            securityCodeLabel.setText("Security Code");
            securityCodeLabel.setLabelFor(securityCodeTextBox);

            //---- confirmPaymentButton ----
            confirmPaymentButton.setText("Confirm Payment");
            confirmPaymentButton.addActionListener(e -> confirmPaymentActionPerformed(e));

            //---- printTicketButton ----
            printTicketButton.setText("PRINT TICKET");

            //---- paymentValidateLabel ----
            paymentValidateLabel.setToolTipText("Coupon Validity Check");
            paymentValidateLabel.setHorizontalAlignment(SwingConstants.CENTER);
            paymentValidateLabel.setHorizontalTextPosition(SwingConstants.CENTER);

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                        .addGap(119, 119, 119)
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(stationLabel)
                                                .addGap(6, 6, 6)
                                                .addComponent(destinationLabel))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(departureDateAndTimeLabel, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(returnDateAndTimeLabel))))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(displayTimetableButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(paymentInformationLabel))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addGroup(panel2Layout.createParallelGroup()
                                                    .addComponent(ticketTypeLabel)
                                                    .addComponent(cardNameLabel)
                                                    .addComponent(securityCodeLabel)
                                                    .addComponent(cardNumberLabel))))
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(panel2Layout.createParallelGroup()
                                                    .addComponent(priceLabel)
                                                    .addComponent(viaLocationsLabel)))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(securityCodeTextBox, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                                    .addComponent(cardNameTextBox, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                                    .addComponent(cardNumberTextBox, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))))
                                .addContainerGap(124, Short.MAX_VALUE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(dateTimeLabel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                                .addComponent(printTicketButton)
                                .addGap(38, 38, 38)
                                .addComponent(confirmPaymentButton)
                                .addGap(48, 48, 48))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(languageSelectButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addComponent(paymentValidateLabel, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))))
            );
            panel2Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {cardNameLabel, cardNumberLabel, securityCodeLabel});
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(stationLabel)
                                    .addComponent(destinationLabel))
                                .addGap(6, 6, 6)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(departureDateAndTimeLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(returnDateAndTimeLabel)))))
                        .addGap(4, 4, 4)
                        .addComponent(viaLocationsLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paymentValidateLabel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(languageSelectButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paymentInformationLabel))
                                .addGap(6, 6, 6)
                                .addComponent(displayTimetableButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(ticketTypeLabel)
                                    .addComponent(priceLabel))
                                .addGap(22, 22, 22)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(cardNameLabel)
                                    .addComponent(cardNameTextBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(cardNumberTextBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cardNumberLabel))))
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(securityCodeTextBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(securityCodeLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(confirmPaymentButton)
                                    .addComponent(printTicketButton))
                                .addContainerGap(62, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(dateTimeLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - godieina fire
    private JPanel panel2;
    private JButton homeButton;
    private JButton languageSelectButton;
    private JButton displayTimetableButton;
    private JLabel dateTimeLabel;
    private JLabel viaLocationsLabel;
    private JLabel departureDateAndTimeLabel;
    private JLabel stationLabel;
    private JLabel destinationLabel;
    private JLabel returnDateAndTimeLabel;
    private JLabel paymentInformationLabel;
    private JLabel ticketTypeLabel;
    private JLabel priceLabel;
    private JLabel cardNameLabel;
    private JLabel cardNumberLabel;
    private JLabel securityCodeLabel;
    private JTextField cardNameTextBox;
    private JTextField cardNumberTextBox;
    private JTextField securityCodeTextBox;
    private JButton confirmPaymentButton;
    private JButton printTicketButton;
    private JLabel paymentValidateLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
