package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private JPanel pnlGUI;

    public GUI() {
        initComponents();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(pnlGUI);
        this.pack();
    }

    private void btnPayOnExitActionPerformed(ActionEvent e) {
        System.out.println("Pay on exit");
    }

    private void btnPayForTripActionPerformed(ActionEvent e) {
        System.out.println("Pay for trip");
    }

    private void btnViewReportActionPerformed(ActionEvent e) {
        System.out.println("View report");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Barry Chuckle
        pnlGUI = new JPanel();
        pnlSelectOption = new JPanel();
        btnPayOnExit = new JButton();
        btnPayForTrip = new JButton();
        btnViewReport = new JButton();

        //======== pnlGUI ========
        {
            pnlGUI.setPreferredSize(new Dimension(800, 700));

            // JFormDesigner evaluation mark
            pnlGUI.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), pnlGUI.getBorder())); pnlGUI.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            pnlGUI.setLayout(new CardLayout());

            //======== pnlSelectOption ========
            {

                //---- btnPayOnExit ----
                btnPayOnExit.setText("Pay on exit");
                btnPayOnExit.setPreferredSize(new Dimension(150, 60));
                btnPayOnExit.addActionListener(e -> btnPayOnExitActionPerformed(e));

                //---- btnPayForTrip ----
                btnPayForTrip.setText("Pay for trip");
                btnPayForTrip.setPreferredSize(new Dimension(150, 60));
                btnPayForTrip.addActionListener(e -> btnPayForTripActionPerformed(e));

                //---- btnViewReport ----
                btnViewReport.setText("View report");
                btnViewReport.setPreferredSize(new Dimension(150, 60));
                btnViewReport.addActionListener(e -> btnViewReportActionPerformed(e));

                GroupLayout pnlSelectOptionLayout = new GroupLayout(pnlSelectOption);
                pnlSelectOption.setLayout(pnlSelectOptionLayout);
                pnlSelectOptionLayout.setHorizontalGroup(
                    pnlSelectOptionLayout.createParallelGroup()
                        .addGroup(pnlSelectOptionLayout.createSequentialGroup()
                            .addGap(171, 171, 171)
                            .addGroup(pnlSelectOptionLayout.createParallelGroup()
                                .addComponent(btnViewReport, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPayOnExit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPayForTrip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(179, Short.MAX_VALUE))
                );
                pnlSelectOptionLayout.setVerticalGroup(
                    pnlSelectOptionLayout.createParallelGroup()
                        .addGroup(pnlSelectOptionLayout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(btnPayOnExit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnPayForTrip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnViewReport, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(123, Short.MAX_VALUE))
                );
            }
            pnlGUI.add(pnlSelectOption, "card1");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Barry Chuckle
    private JPanel pnlSelectOption;
    private JButton btnPayOnExit;
    private JButton btnPayForTrip;
    private JButton btnViewReport;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
