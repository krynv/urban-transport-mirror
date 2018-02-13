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
        System.out.println("Pay on exit");

        this.setVisible(false);
        new Gate().setVisible(true);
    }

    private void btnPayForTripActionPerformed(ActionEvent e) {
        System.out.println("Pay for trip");

        new PayForTripGUI().setVisible(true);
        this.setVisible(false);
    }

    private void btnViewReportActionPerformed(ActionEvent e) throws IOException, ParseException {
        new LoginRegisterGUI().setVisible(true);
        this.setVisible(false);
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
                btnViewReport.addActionListener(e -> {
                    try {
                        btnViewReportActionPerformed(e);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } catch (ParseException e1) {
                        e1.printStackTrace();
                    }
                });

                GroupLayout pnlSelectOptionLayout = new GroupLayout(pnlSelectOption);
                pnlSelectOption.setLayout(pnlSelectOptionLayout);
                pnlSelectOptionLayout.setHorizontalGroup(
                    pnlSelectOptionLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, pnlSelectOptionLayout.createSequentialGroup()
                            .addContainerGap(267, Short.MAX_VALUE)
                            .addGroup(pnlSelectOptionLayout.createParallelGroup()
                                .addComponent(btnPayOnExit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPayForTrip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnViewReport, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(263, 263, 263))
                );
                pnlSelectOptionLayout.setVerticalGroup(
                    pnlSelectOptionLayout.createParallelGroup()
                        .addGroup(pnlSelectOptionLayout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(btnPayOnExit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnPayForTrip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnViewReport, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(221, Short.MAX_VALUE))
                );
            }
            pnlGUI.add(pnlSelectOption, "card1");
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
