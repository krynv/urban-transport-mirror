package gui;

import logic.gate.GateController;

import java.awt.event.*;
import javax.swing.*;

public class Gate extends JFrame {

    private GateController gateController;

    public Gate() {
        gateController = new GateController();

        initComponents();

        this.setContentPane(pnlMain);
        this.pack();
    }

    private void btnScanTokenActionPerformed(ActionEvent e) {
        System.out.println("Scan Token");   // TODO: Change to Logger

        gateController.presentToken("1");

        if (gateController.canOpen()) {
            System.out.println("Open");     // TODO: Add UI aid to showcase this.
        } else {
            System.out.println("Close");    // TODO: Add UI aid to showcase this.
        }
    }

    private void btnMainGUIActionPerformed(ActionEvent e) {
        new GUI().setVisible(true);
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Benjamin Ward
        pnlMain = new JPanel();
        btnScanToken = new JButton();
        btnMainGUI = new JButton();

        //======== pnlMain ========
        {

            // JFormDesigner evaluation mark
            pnlMain.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), pnlMain.getBorder())); pnlMain.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- btnScanToken ----
            btnScanToken.setText("Scan token");
            btnScanToken.addActionListener(e -> btnScanTokenActionPerformed(e));

            //---- btnMainGUI ----
            btnMainGUI.setText("Go Back To Main Page");
            btnMainGUI.addActionListener(e -> btnMainGUIActionPerformed(e));

            GroupLayout pnlMainLayout = new GroupLayout(pnlMain);
            pnlMain.setLayout(pnlMainLayout);
            pnlMainLayout.setHorizontalGroup(
                pnlMainLayout.createParallelGroup()
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup()
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(358, 358, 358)
                                .addComponent(btnScanToken))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnMainGUI, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(343, Short.MAX_VALUE))
            );
            pnlMainLayout.setVerticalGroup(
                pnlMainLayout.createParallelGroup()
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnScanToken)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addComponent(btnMainGUI, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Benjamin Ward
    private JPanel pnlMain;
    private JButton btnScanToken;
    private JButton btnMainGUI;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
