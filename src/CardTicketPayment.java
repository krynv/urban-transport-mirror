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
    }

    private void homeActionPerformed(ActionEvent e) {
        new UserBooking().setVisible(true);
        this.dispose();
    }

    private void languageSelectActionPerformed(ActionEvent e) {
        new SelectLanguage().setVisible(true);
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - godieina fire
        panel2 = new JPanel();
        home = new JButton();
        languageSelect = new JButton();
        displayTimetable = new JButton();
        dateTime = new JLabel();
        label10 = new JLabel();
        label3 = new JLabel();
        label2 = new JLabel();
        label1 = new JLabel();
        label9 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label11 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        button1 = new JButton();

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

            //---- label10 ----
            label10.setText("Via Locations");

            //---- label3 ----
            label3.setText("Departure Date/Time");

            //---- label2 ----
            label2.setText("Station");

            //---- label1 ----
            label1.setText("Destination");

            //---- label9 ----
            label9.setText("Return Date/Time");

            //---- label4 ----
            label4.setText("Payment Information");

            //---- label5 ----
            label5.setText("Ticket Type");

            //---- label6 ----
            label6.setText("PRICE");

            //---- label7 ----
            label7.setText("Card Name");

            //---- label8 ----
            label8.setText("Card Number");

            //---- label11 ----
            label11.setText("Security Code");

            //---- button1 ----
            button1.setText("Confirm Payment");

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
                                        .addComponent(home, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                        .addGap(119, 119, 119)
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(label2)
                                                .addGap(6, 6, 6)
                                                .addComponent(label1))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(label9))))
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addComponent(languageSelect, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(displayTimetable, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(label4))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addGroup(panel2Layout.createParallelGroup()
                                                    .addComponent(label5)
                                                    .addComponent(label7)
                                                    .addComponent(label11)
                                                    .addComponent(label8))))
                                        .addGroup(panel2Layout.createParallelGroup()
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(panel2Layout.createParallelGroup()
                                                    .addComponent(label6)
                                                    .addComponent(label10)))
                                            .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                                    .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                                    .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))))
                                .addContainerGap(114, Short.MAX_VALUE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(dateTime, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                                .addComponent(button1)
                                .addGap(48, 48, 48))))
            );
            panel2Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {label11, label7, label8});
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(home, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(label2)
                                    .addComponent(label1))
                                .addGap(6, 6, 6)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(label9)))))
                        .addGap(4, 4, 4)
                        .addComponent(label10)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(languageSelect, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4))
                                .addGap(6, 6, 6)
                                .addComponent(displayTimetable, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(label6))
                                .addGap(22, 22, 22)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label7)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8))))
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label11))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button1)
                                .addContainerGap(62, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(dateTime, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
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
    private JLabel label10;
    private JLabel label3;
    private JLabel label2;
    private JLabel label1;
    private JLabel label9;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label11;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
