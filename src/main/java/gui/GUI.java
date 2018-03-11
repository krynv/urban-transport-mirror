package gui;

import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class GUI extends JFrame {

    public GUI() {
        initComponents();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlGUI);
        this.pack();
    }

    private void btnPayOnExitActionPerformed(ActionEvent e) {
        new GateGUI().setVisible(true);
    }

    private void btnPayForTripActionPerformed(ActionEvent e) {
        System.out.println("Pay for trip");

        new PayForTripGUI().setVisible(true);
    }

    private void btnViewReportActionPerformed(ActionEvent e) {
        try {
            new LoginRegisterGUI().setVisible(true);
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
    }

    private void btnAddCreditActionPerformed(ActionEvent e) {
        new TerminalGUI().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Benjamin Ward
        pnlGUI = new JPanel();
        pnlSelectOption = new JPanel();
        btnViewReport = new JButton();
        btnAddCredit = new JButton();
        btnPayOnExit = new JButton();
        btnPayForTrip = new JButton();

        //======== pnlGUI ========
        {
            pnlGUI.setMaximumSize(new Dimension(500, 700));
            pnlGUI.setMinimumSize(new Dimension(500, 700));
            pnlGUI.setPreferredSize(new Dimension(500, 700));

            // JFormDesigner evaluation mark
            pnlGUI.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), pnlGUI.getBorder())); pnlGUI.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            pnlGUI.setLayout(new CardLayout());

            //======== pnlSelectOption ========
            {
                pnlSelectOption.setPreferredSize(null);
                pnlSelectOption.setMaximumSize(null);
                pnlSelectOption.setMinimumSize(null);

                //---- btnViewReport ----
                btnViewReport.setText("Admin");
                btnViewReport.setPreferredSize(new Dimension(150, 60));
                btnViewReport.addActionListener(e -> btnViewReportActionPerformed(e));

                //---- btnAddCredit ----
                btnAddCredit.setText("Ticket Machine  (Add Credit)");
                btnAddCredit.setPreferredSize(new Dimension(150, 60));
                btnAddCredit.setActionCommand("Ticket Machine (Add Credit)");
                btnAddCredit.addActionListener(e -> btnAddCreditActionPerformed(e));

                //---- btnPayOnExit ----
                btnPayOnExit.setText("Gates");
                btnPayOnExit.setPreferredSize(new Dimension(150, 60));
                btnPayOnExit.addActionListener(e -> btnPayOnExitActionPerformed(e));

                //---- btnPayForTrip ----
                btnPayForTrip.setText("Ticket Machine");
                btnPayForTrip.setPreferredSize(new Dimension(107, 39));
                btnPayForTrip.setMaximumSize(new Dimension(107, 39));
                btnPayForTrip.setMinimumSize(new Dimension(107, 39));
                btnPayForTrip.addActionListener(e -> btnPayForTripActionPerformed(e));

                GroupLayout pnlSelectOptionLayout = new GroupLayout(pnlSelectOption);
                pnlSelectOption.setLayout(pnlSelectOptionLayout);
                pnlSelectOptionLayout.setHorizontalGroup(
                    pnlSelectOptionLayout.createParallelGroup()
                        .addGroup(pnlSelectOptionLayout.createSequentialGroup()
                            .addGroup(pnlSelectOptionLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlSelectOptionLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnAddCredit, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE))
                                .addGroup(GroupLayout.Alignment.LEADING, pnlSelectOptionLayout.createSequentialGroup()
                                    .addGap(81, 81, 81)
                                    .addGroup(pnlSelectOptionLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnViewReport, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                        .addComponent(btnPayForTrip, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                                        .addComponent(btnPayOnExit, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                pnlSelectOptionLayout.setVerticalGroup(
                    pnlSelectOptionLayout.createParallelGroup()
                        .addGroup(pnlSelectOptionLayout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(btnPayOnExit, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPayForTrip, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnViewReport, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddCredit, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                            .addGap(62, 62, 62))
                );
            }
            pnlGUI.add(pnlSelectOption, "card1");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Benjamin Ward
    private JPanel pnlGUI;
    private JPanel pnlSelectOption;
    private JButton btnViewReport;
    private JButton btnAddCredit;
    private JButton btnPayOnExit;
    private JButton btnPayForTrip;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
