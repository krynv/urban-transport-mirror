import java.awt.event.*;
import javax.swing.*;

public class Account extends JFrame {
    private JPanel panel1;

    private String cardNumber = "123456";
    private double credits = 0.0;

    public Account() {
        initComponents();
        lblCardNumber.setText("Card " + cardNumber);
        txtCredits.setText(Double.toString(credits));
        this.setContentPane(panel1);
        this.pack();
    }

    private void btnAddCreditsActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void btnExitActionPerformed(ActionEvent e) {
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - godieina fire
        panel1 = new JPanel();
        tabbedPane1 = new JTabbedPane();
        pnlHistory = new JPanel();
        pnlHome = new JPanel();
        lblCardNumber = new JLabel();
        txtCredits = new JTextField();
        lblCreditsRemaining = new JLabel();
        btnAddCredits = new JButton();
        btnExit = new JButton();

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //======== tabbedPane1 ========
            {

                //======== pnlHistory ========
                {

                    GroupLayout pnlHistoryLayout = new GroupLayout(pnlHistory);
                    pnlHistory.setLayout(pnlHistoryLayout);
                    pnlHistoryLayout.setHorizontalGroup(
                        pnlHistoryLayout.createParallelGroup()
                            .addGap(0, 856, Short.MAX_VALUE)
                    );
                    pnlHistoryLayout.setVerticalGroup(
                        pnlHistoryLayout.createParallelGroup()
                            .addGap(0, 546, Short.MAX_VALUE)
                    );
                }
                tabbedPane1.addTab("JOURNEY HISTORY", pnlHistory);

                //======== pnlHome ========
                {

                    //---- lblCardNumber ----
                    lblCardNumber.setText("Card");

                    //---- txtCredits ----
                    txtCredits.setEditable(false);

                    //---- lblCreditsRemaining ----
                    lblCreditsRemaining.setText("Credits Remaining");

                    //---- btnAddCredits ----
                    btnAddCredits.setText("ADD CREDITS");
                    btnAddCredits.addActionListener(e -> btnAddCreditsActionPerformed(e));

                    //---- btnExit ----
                    btnExit.setText("EXIT");
                    btnExit.addActionListener(e -> btnExitActionPerformed(e));

                    GroupLayout pnlHomeLayout = new GroupLayout(pnlHome);
                    pnlHome.setLayout(pnlHomeLayout);
                    pnlHomeLayout.setHorizontalGroup(
                        pnlHomeLayout.createParallelGroup()
                            .addGroup(pnlHomeLayout.createSequentialGroup()
                                .addGroup(pnlHomeLayout.createParallelGroup()
                                    .addGroup(pnlHomeLayout.createSequentialGroup()
                                        .addGap(308, 308, 308)
                                        .addComponent(lblCardNumber))
                                    .addGroup(pnlHomeLayout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(pnlHomeLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnAddCredits, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                            .addComponent(txtCredits, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                                        .addGap(26, 26, 26)
                                        .addComponent(lblCreditsRemaining))
                                    .addGroup(pnlHomeLayout.createSequentialGroup()
                                        .addGap(350, 350, 350)
                                        .addComponent(btnExit)))
                                .addContainerGap(266, Short.MAX_VALUE))
                    );
                    pnlHomeLayout.setVerticalGroup(
                        pnlHomeLayout.createParallelGroup()
                            .addGroup(pnlHomeLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(lblCardNumber)
                                .addGap(69, 69, 69)
                                .addGroup(pnlHomeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCredits, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCreditsRemaining))
                                .addGap(18, 18, 18)
                                .addComponent(btnAddCredits)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                .addComponent(btnExit)
                                .addGap(97, 97, 97))
                    );
                }
                tabbedPane1.addTab("HOME", pnlHome);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addComponent(tabbedPane1)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addComponent(tabbedPane1)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - godieina fire
    private JTabbedPane tabbedPane1;
    private JPanel pnlHistory;
    private JPanel pnlHome;
    private JLabel lblCardNumber;
    private JTextField txtCredits;
    private JLabel lblCreditsRemaining;
    private JButton btnAddCredits;
    private JButton btnExit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
