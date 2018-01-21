import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;
import com.jgoodies.forms.layout.*;
public class ConfirmBooking extends JFrame {
    public ConfirmBooking() {
        initComponents();
        this.setContentPane(panel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Confirm Booking");
        this.pack();
    }

    private void homeActionPerformed(ActionEvent e) {
        new UserBooking().setVisible(true);
        this.dispose();
    }

    private void languageSelectActionPerformed(ActionEvent e) {
        new SelectLanguage().setVisible(true);
        this.dispose();
    }

    public void changed() {
        if (couponTextField.getText().equals("killyourself")) {
            couponVerificationLabel.setText("KYS");
            couponVerificationLabel.setOpaque(true);
            couponVerificationLabel.setBackground(new Color(216, 231, 213));
        }
        else {
            couponVerificationLabel.setBackground(new Color(241, 207, 205));
            couponVerificationLabel.setOpaque(true);
            couponVerificationLabel.setText("Coupon Code Invalid");
        }
    }

    private void couponTextFieldKeyTyped(KeyEvent e) {
        changed();
    }

    private void button1ActionPerformed(ActionEvent e) {

        if (cashCheckBox.isSelected() && cardCheckBox.isSelected()) {
            // if both are selected
            //do nothing
        }
        else if (cashCheckBox.isSelected()) {
                new CashTicketPayment().setVisible(true);
                this.dispose();
            }

            else if (cardCheckBox.isSelected()) {
                new CardTicketPayment().setVisible(true);
                this.dispose();
        }
        else {
            // if none are selected
            //do nothing
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - godieina fire
        panel2 = new JPanel();
        homeButton = new JButton();
        languageSelectButton = new JButton();
        displayTimetableButton = new JButton();
        dateTimeLabel = new JLabel();
        destinationLabel = new JLabel();
        stationLabel = new JLabel();
        departureDateAndTimeLabel = new JLabel();
        ticketInformationLabel = new JLabel();
        ticketTypeLabel = new JLabel();
        priceLabel = new JLabel();
        paymentMethodLabel = new JLabel();
        cashCheckBox = new JCheckBox();
        cardCheckBox = new JCheckBox();
        couponCodeLabel = new JLabel();
        advanceButton = new JButton();
        returnDateAndTimeLabel = new JLabel();
        viaLocationsLabel = new JLabel();
        couponVerificationLabel = new JLabel();
        couponTextField = new JTextField();

        //======== panel2 ========
        {

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
            languageSelectButton.setText("languageSelect");
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

            //---- destinationLabel ----
            destinationLabel.setText("Destination");

            //---- stationLabel ----
            stationLabel.setText("Station");

            //---- departureDateAndTimeLabel ----
            departureDateAndTimeLabel.setText("Departure Date/Time");

            //---- ticketInformationLabel ----
            ticketInformationLabel.setText("Ticket Information");

            //---- ticketTypeLabel ----
            ticketTypeLabel.setText("Ticket Type");

            //---- priceLabel ----
            priceLabel.setText("Price");

            //---- paymentMethodLabel ----
            paymentMethodLabel.setText("Payment Method");

            //---- cashCheckBox ----
            cashCheckBox.setText("CASH");

            //---- cardCheckBox ----
            cardCheckBox.setText("CARD");

            //---- couponCodeLabel ----
            couponCodeLabel.setText("Coupon Code");
            couponCodeLabel.setLabelFor(couponTextField);

            //---- advanceButton ----
            advanceButton.setText("Advance");
            advanceButton.addActionListener(e -> button1ActionPerformed(e));

            //---- returnDateAndTimeLabel ----
            returnDateAndTimeLabel.setText("Return Date/Time");

            //---- viaLocationsLabel ----
            viaLocationsLabel.setText("Via Locations");

            //---- couponVerificationLabel ----
            couponVerificationLabel.setToolTipText("Coupon Validity Check");
            couponVerificationLabel.setHorizontalAlignment(SwingConstants.CENTER);

            //---- couponTextField ----
            couponTextField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    couponTextFieldKeyTyped(e);
                }
            });

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(languageSelectButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(displayTimetableButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(panel2Layout.createParallelGroup()
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                        .addGap(2, 2, 2)
                                                        .addGroup(panel2Layout.createParallelGroup()
                                                            .addGroup(panel2Layout.createSequentialGroup()
                                                                .addComponent(ticketTypeLabel)
                                                                .addGap(60, 60, 60)
                                                                .addComponent(priceLabel))
                                                            .addComponent(paymentMethodLabel, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                            .addGroup(panel2Layout.createParallelGroup()
                                                                .addComponent(cashCheckBox)
                                                                .addComponent(cardCheckBox))
                                                            .addComponent(couponCodeLabel)
                                                            .addComponent(couponTextField, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                                        .addGap(283, 283, 283)
                                                        .addComponent(advanceButton))))
                                            .addComponent(ticketInformationLabel)))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(departureDateAndTimeLabel, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(returnDateAndTimeLabel))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(stationLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(destinationLabel))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(87, 87, 87)
                                                .addComponent(viaLocationsLabel))))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(couponVerificationLabel, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))))
                            .addComponent(dateTimeLabel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(languageSelectButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(displayTimetableButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(destinationLabel)
                                    .addComponent(stationLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(departureDateAndTimeLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(returnDateAndTimeLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viaLocationsLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(couponVerificationLabel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(ticketInformationLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(ticketTypeLabel)
                                    .addComponent(priceLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paymentMethodLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cashCheckBox)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardCheckBox)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(couponCodeLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(advanceButton)
                                    .addComponent(couponTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateTimeLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
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
    private JLabel destinationLabel;
    private JLabel stationLabel;
    private JLabel departureDateAndTimeLabel;
    private JLabel ticketInformationLabel;
    private JLabel ticketTypeLabel;
    private JLabel priceLabel;
    private JLabel paymentMethodLabel;
    private JCheckBox cashCheckBox;
    private JCheckBox cardCheckBox;
    private JLabel couponCodeLabel;
    private JButton advanceButton;
    private JLabel returnDateAndTimeLabel;
    private JLabel viaLocationsLabel;
    private JLabel couponVerificationLabel;
    private JTextField couponTextField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
