package gui;

import logic.*;

import java.awt.event.*;
import javax.swing.*;

public class PayOnExitGUI extends JFrame {

    private TokenReader tokenReader;
    private GateController gateController;

    public PayOnExitGUI() {
        tokenReader = new TokenReader(0);
        gateController = new GateController();

        initComponents();

        this.setContentPane(pnlMain);
        this.pack();
    }

    private void btnScanTokenActionPerformed(ActionEvent e) {
        System.out.println("Scan token");

        tokenReader.extractTokenId();
        gateController.passTokenId(tokenReader.getTokenId());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Barry Chuckle
        pnlMain = new JPanel();
        btnScanToken = new JButton();

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

            GroupLayout pnlMainLayout = new GroupLayout(pnlMain);
            pnlMain.setLayout(pnlMainLayout);
            pnlMainLayout.setHorizontalGroup(
                pnlMainLayout.createParallelGroup()
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(btnScanToken)
                        .addContainerGap(482, Short.MAX_VALUE))
            );
            pnlMainLayout.setVerticalGroup(
                pnlMainLayout.createParallelGroup()
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnScanToken)
                        .addContainerGap(317, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Barry Chuckle
    private JPanel pnlMain;
    private JButton btnScanToken;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
