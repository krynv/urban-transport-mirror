package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {

    public GUI() {
        initComponents();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(pnlGUI);
        this.pack();
    }

    private void btnPayOnExitActionPerformed(ActionEvent e) {
        System.out.println("Pay on exit");

        pnlSelectOption.setVisible(false);
        pnlPayOnExit.setVisible(true);
    }

    private void btnPayForTripActionPerformed(ActionEvent e) {
        System.out.println("Pay for trip");

        pnlSelectOption.setVisible(false);
        pnlPayForTrip.setVisible(true);
    }

    private void btnViewReportActionPerformed(ActionEvent e) {
        System.out.println("View report");

        pnlSelectOption.setVisible(false);
        pnlViewReport.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Barry Chuckle
        pnlGUI = new JPanel();
        pnlSelectOption = new JPanel();
        btnPayOnExit = new JButton();
        btnPayForTrip = new JButton();
        btnViewReport = new JButton();
        pnlPayOnExit = new JPanel();
        pnlPayForTrip = new JPanel();
        pnlViewReport = new JPanel();

        //======== pnlGUI ========
        {

            // JFormDesigner evaluation mark
            pnlGUI.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), pnlGUI.getBorder())); pnlGUI.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


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
                                .addComponent(btnPayOnExit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPayForTrip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnViewReport, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
                            .addContainerGap(95, Short.MAX_VALUE))
                );
            }

            //======== pnlPayOnExit ========
            {

                GroupLayout pnlPayOnExitLayout = new GroupLayout(pnlPayOnExit);
                pnlPayOnExit.setLayout(pnlPayOnExitLayout);
                pnlPayOnExitLayout.setHorizontalGroup(
                    pnlPayOnExitLayout.createParallelGroup()
                        .addGap(0, 500, Short.MAX_VALUE)
                );
                pnlPayOnExitLayout.setVerticalGroup(
                    pnlPayOnExitLayout.createParallelGroup()
                        .addGap(0, 400, Short.MAX_VALUE)
                );
            }

            //======== pnlPayForTrip ========
            {

                GroupLayout pnlPayForTripLayout = new GroupLayout(pnlPayForTrip);
                pnlPayForTrip.setLayout(pnlPayForTripLayout);
                pnlPayForTripLayout.setHorizontalGroup(
                    pnlPayForTripLayout.createParallelGroup()
                        .addGap(0, 500, Short.MAX_VALUE)
                );
                pnlPayForTripLayout.setVerticalGroup(
                    pnlPayForTripLayout.createParallelGroup()
                        .addGap(0, 400, Short.MAX_VALUE)
                );
            }

            //======== pnlViewReport ========
            {

                GroupLayout pnlViewReportLayout = new GroupLayout(pnlViewReport);
                pnlViewReport.setLayout(pnlViewReportLayout);
                pnlViewReportLayout.setHorizontalGroup(
                    pnlViewReportLayout.createParallelGroup()
                        .addGap(0, 500, Short.MAX_VALUE)
                );
                pnlViewReportLayout.setVerticalGroup(
                    pnlViewReportLayout.createParallelGroup()
                        .addGap(0, 400, Short.MAX_VALUE)
                );
            }

            GroupLayout pnlGUILayout = new GroupLayout(pnlGUI);
            pnlGUI.setLayout(pnlGUILayout);
            pnlGUILayout.setHorizontalGroup(
                pnlGUILayout.createParallelGroup()
                    .addGroup(pnlGUILayout.createParallelGroup()
                        .addGroup(pnlGUILayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(pnlGUILayout.createParallelGroup()
                                .addComponent(pnlSelectOption, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnlPayOnExit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnlPayForTrip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnlViewReport, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(0, 680, Short.MAX_VALUE)
            );
            pnlGUILayout.setVerticalGroup(
                pnlGUILayout.createParallelGroup()
                    .addGroup(pnlGUILayout.createParallelGroup()
                        .addGroup(pnlGUILayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(pnlGUILayout.createParallelGroup()
                                .addComponent(pnlSelectOption, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnlPayOnExit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnlPayForTrip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnlViewReport, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(0, 580, Short.MAX_VALUE)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Barry Chuckle
    private JPanel pnlGUI;
    private JPanel pnlSelectOption;
    private JButton btnPayOnExit;
    private JButton btnPayForTrip;
    private JButton btnViewReport;
    private JPanel pnlPayOnExit;
    private JPanel pnlPayForTrip;
    private JPanel pnlViewReport;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
