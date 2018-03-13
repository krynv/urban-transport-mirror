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
        // Generated using JFormDesigner Evaluation license - Sheffield Hallan
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

            pnlGUI.setLayout(new CardLayout());

            //======== pnlSelectOption ========
            {
                pnlSelectOption.setPreferredSize(null);
                pnlSelectOption.setMaximumSize(null);
                pnlSelectOption.setMinimumSize(null);
                pnlSelectOption.setLayout(null);

                //---- btnViewReport ----
                btnViewReport.setText("Admin");
                btnViewReport.setPreferredSize(new Dimension(150, 60));
                btnViewReport.addActionListener(e -> btnViewReportActionPerformed(e));
                pnlSelectOption.add(btnViewReport);
                btnViewReport.setBounds(81, 364, 332, 126);

                //---- btnAddCredit ----
                btnAddCredit.setText("Ticket Machine  (Add Credit)");
                btnAddCredit.setPreferredSize(new Dimension(150, 60));
                btnAddCredit.setActionCommand("Ticket Machine (Add Credit)");
                btnAddCredit.addActionListener(e -> btnAddCreditActionPerformed(e));
                pnlSelectOption.add(btnAddCredit);
                btnAddCredit.setBounds(81, 495, 332, 124);

                //---- btnPayOnExit ----
                btnPayOnExit.setText("Gates");
                btnPayOnExit.setPreferredSize(new Dimension(150, 60));
                btnPayOnExit.addActionListener(e -> btnPayOnExitActionPerformed(e));
                pnlSelectOption.add(btnPayOnExit);
                btnPayOnExit.setBounds(81, 98, 332, 130);

                //---- btnPayForTrip ----
                btnPayForTrip.setText("Ticket Machine");
                btnPayForTrip.setPreferredSize(new Dimension(107, 39));
                btnPayForTrip.setMaximumSize(new Dimension(107, 39));
                btnPayForTrip.setMinimumSize(new Dimension(107, 39));
                btnPayForTrip.addActionListener(e -> btnPayForTripActionPerformed(e));
                pnlSelectOption.add(btnPayForTrip);
                btnPayForTrip.setBounds(81, 234, 332, 124);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < pnlSelectOption.getComponentCount(); i++) {
                        Rectangle bounds = pnlSelectOption.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = pnlSelectOption.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    pnlSelectOption.setMinimumSize(preferredSize);
                    pnlSelectOption.setPreferredSize(preferredSize);
                }
            }
            pnlGUI.add(pnlSelectOption, "card1");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Sheffield Hallan
    private JPanel pnlGUI;
    private JPanel pnlSelectOption;
    private JButton btnViewReport;
    private JButton btnAddCredit;
    private JButton btnPayOnExit;
    private JButton btnPayForTrip;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
