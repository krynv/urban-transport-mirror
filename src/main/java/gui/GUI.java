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

    private void btnLanguageSelectActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void destination1ActionPerformed(ActionEvent e) {
        // TODO add your code here
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
        pnlHome = new JPanel();
        btnHome = new JButton();
        lblDateTime = new JLabel();
        btnLanguageSelect = new JButton();
        btnDisplayTimetable = new JButton();
        btnDestination1 = new JButton();
        btnDestination2 = new JButton();
        btnDestination3 = new JButton();
        btnDestination4 = new JButton();
        btnDestination6 = new JButton();
        btnDestination7 = new JButton();
        pnlViewReport = new JPanel();

        //======== pnlGUI ========
        {

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
                                .addComponent(btnPayOnExit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPayForTrip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnViewReport, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(359, Short.MAX_VALUE))
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
                            .addContainerGap(275, Short.MAX_VALUE))
                );
            }
            pnlGUI.add(pnlSelectOption, "card1");

            //======== pnlPayOnExit ========
            {

                GroupLayout pnlPayOnExitLayout = new GroupLayout(pnlPayOnExit);
                pnlPayOnExit.setLayout(pnlPayOnExitLayout);
                pnlPayOnExitLayout.setHorizontalGroup(
                    pnlPayOnExitLayout.createParallelGroup()
                        .addGap(0, 680, Short.MAX_VALUE)
                );
                pnlPayOnExitLayout.setVerticalGroup(
                    pnlPayOnExitLayout.createParallelGroup()
                        .addGap(0, 580, Short.MAX_VALUE)
                );
            }
            pnlGUI.add(pnlPayOnExit, "card2");

            //======== pnlPayForTrip ========
            {
                pnlPayForTrip.setLayout(new CardLayout());

                //======== pnlHome ========
                {

                    //---- btnHome ----
                    btnHome.setText("Home");

                    //---- lblDateTime ----
                    lblDateTime.setText("Date/Time");
                    lblDateTime.setHorizontalAlignment(SwingConstants.CENTER);
                    lblDateTime.setMaximumSize(new Dimension(25, 25));
                    lblDateTime.setMinimumSize(new Dimension(25, 25));
                    lblDateTime.setPreferredSize(new Dimension(25, 25));

                    //---- btnLanguageSelect ----
                    btnLanguageSelect.setText("Select Language");
                    btnLanguageSelect.addActionListener(e -> btnLanguageSelectActionPerformed(e));

                    //---- btnDisplayTimetable ----
                    btnDisplayTimetable.setText("Display Timetable");
                    btnDisplayTimetable.setEnabled(false);

                    //---- btnDestination1 ----
                    btnDestination1.setText("London");
                    btnDestination1.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                    btnDestination1.addActionListener(e -> destination1ActionPerformed(e));

                    //---- btnDestination2 ----
                    btnDestination2.setText("Destination 2");
                    btnDestination2.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                    //---- btnDestination3 ----
                    btnDestination3.setText("Destination 3");
                    btnDestination3.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                    //---- btnDestination4 ----
                    btnDestination4.setText("Destination 4");
                    btnDestination4.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                    //---- btnDestination6 ----
                    btnDestination6.setText("Destination 5");
                    btnDestination6.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                    //---- btnDestination7 ----
                    btnDestination7.setText("Destination 6");
                    btnDestination7.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                    GroupLayout pnlHomeLayout = new GroupLayout(pnlHome);
                    pnlHome.setLayout(pnlHomeLayout);
                    pnlHomeLayout.setHorizontalGroup(
                        pnlHomeLayout.createParallelGroup()
                            .addGroup(pnlHomeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlHomeLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDateTime, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(btnHome, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(btnDisplayTimetable, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(btnLanguageSelect, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(47, 47, 47)
                                .addGroup(pnlHomeLayout.createParallelGroup()
                                    .addGroup(pnlHomeLayout.createSequentialGroup()
                                        .addComponent(btnDestination1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnDestination2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnDestination3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                                        .addComponent(btnDestination4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnDestination6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(btnDestination7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(153, Short.MAX_VALUE))
                    );
                    pnlHomeLayout.setVerticalGroup(
                        pnlHomeLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlHomeLayout.createParallelGroup()
                                    .addGroup(pnlHomeLayout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(btnLanguageSelect, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDisplayTimetable, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlHomeLayout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addGroup(pnlHomeLayout.createParallelGroup()
                                            .addComponent(btnDestination1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDestination2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDestination3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56)
                                        .addGroup(pnlHomeLayout.createParallelGroup()
                                            .addComponent(btnDestination4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDestination6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnDestination7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))))
                                .addGap(112, 112, 112)
                                .addComponent(lblDateTime, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                    );
                }
                pnlPayForTrip.add(pnlHome, "card1");
            }
            pnlGUI.add(pnlPayForTrip, "card3");

            //======== pnlViewReport ========
            {

                GroupLayout pnlViewReportLayout = new GroupLayout(pnlViewReport);
                pnlViewReport.setLayout(pnlViewReportLayout);
                pnlViewReportLayout.setHorizontalGroup(
                    pnlViewReportLayout.createParallelGroup()
                        .addGap(0, 680, Short.MAX_VALUE)
                );
                pnlViewReportLayout.setVerticalGroup(
                    pnlViewReportLayout.createParallelGroup()
                        .addGap(0, 580, Short.MAX_VALUE)
                );
            }
            pnlGUI.add(pnlViewReport, "card4");
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
    private JPanel pnlHome;
    private JButton btnHome;
    private JLabel lblDateTime;
    private JButton btnLanguageSelect;
    private JButton btnDisplayTimetable;
    private JButton btnDestination1;
    private JButton btnDestination2;
    private JButton btnDestination3;
    private JButton btnDestination4;
    private JButton btnDestination6;
    private JButton btnDestination7;
    private JPanel pnlViewReport;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
