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

        if (cashCheckBox.isSelected()) {
            new CashTicketPayment().setVisible(true);
            this.dispose();
        }
        else if (cardCheckBox.isSelected()) {
                new CardTicketPayment().setVisible(true);
                this.dispose();
        }
        else if (cashCheckBox.isSelected() && cardCheckBox.isSelected()) {
            //do nothing
        }
        else {
            //do nothing
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - godieina fire
        panel2 = new JPanel();
        home = new JButton();
        languageSelect = new JButton();
        displayTimetable = new JButton();
        dateTime = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        cashCheckBox = new JCheckBox();
        cardCheckBox = new JCheckBox();
        label8 = new JLabel();
        button1 = new JButton();
        label9 = new JLabel();
        label10 = new JLabel();
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


            //---- home ----
            home.setText("Home");
            home.addActionListener(e -> homeActionPerformed(e));

            //---- languageSelect ----
            languageSelect.setText("languageSelect");
            languageSelect.addActionListener(e -> languageSelectActionPerformed(e));

            //---- displayTimetable ----
            displayTimetable.setText("displayTimetable");
            displayTimetable.setEnabled(false);

            //---- dateTime ----
            dateTime.setText("dateTime");
            dateTime.setHorizontalAlignment(SwingConstants.CENTER);
            dateTime.setMaximumSize(new Dimension(25, 25));
            dateTime.setMinimumSize(new Dimension(25, 25));
            dateTime.setPreferredSize(new Dimension(25, 25));

            //---- label1 ----
            label1.setText("Destination");

            //---- label2 ----
            label2.setText("Station");

            //---- label3 ----
            label3.setText("Departure Date/Time");

            //---- label4 ----
            label4.setText("Ticket Information");

            //---- label5 ----
            label5.setText("Ticket Type");

            //---- label6 ----
            label6.setText("Price");

            //---- label7 ----
            label7.setText("Payment Method");

            //---- cashCheckBox ----
            cashCheckBox.setText("CASH");

            //---- cardCheckBox ----
            cardCheckBox.setText("CARD");

            //---- label8 ----
            label8.setText("Coupon Code");

            //---- button1 ----
            button1.setText("Advance");
            button1.addActionListener(e -> button1ActionPerformed(e));

            //---- label9 ----
            label9.setText("Return Date/Time");

            //---- label10 ----
            label10.setText("Via Locations");

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
                                    .addComponent(languageSelect, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(displayTimetable, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(home, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
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
                                                                .addComponent(label5)
                                                                .addGap(60, 60, 60)
                                                                .addComponent(label6))
                                                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                            .addGroup(panel2Layout.createParallelGroup()
                                                                .addComponent(cashCheckBox)
                                                                .addComponent(cardCheckBox))
                                                            .addComponent(label8)
                                                            .addComponent(couponTextField, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                                        .addGap(283, 283, 283)
                                                        .addComponent(button1))))
                                            .addComponent(label4)))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(label9))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(label2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label1))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(87, 87, 87)
                                                .addComponent(label10))))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(couponVerificationLabel, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))))
                            .addComponent(dateTime, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(home, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(languageSelect, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(displayTimetable, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1)
                                    .addComponent(label2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label9))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label10)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(couponVerificationLabel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(label6))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label7)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cashCheckBox)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cardCheckBox)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label8)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button1)
                                    .addComponent(couponTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateTime, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - godieina fire
    private JPanel panel2;
    private JButton home;
    private JButton languageSelect;
    private JButton displayTimetable;
    private JLabel dateTime;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JCheckBox cashCheckBox;
    private JCheckBox cardCheckBox;
    private JLabel label8;
    private JButton button1;
    private JLabel label9;
    private JLabel label10;
    private JLabel couponVerificationLabel;
    private JTextField couponTextField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
