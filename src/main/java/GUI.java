import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private JPanel panel1;

    public GUI() {
        initComponents();
        this.setContentPane(panel1);
        this.pack();
    }
    private void btnBarcodeActionPerformed(ActionEvent e) {
        new Barcode().setVisible(true);
    }

    private void btnMagneticActionPerformed(ActionEvent e) {
        new MagneticCard().setVisible(true);
    }

    private void btnContactlessActionPerformed(ActionEvent e) {
        new RFID().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - godieina fire
        panel1 = new JPanel();
        btnMagnetic = new JButton();
        btnContactless = new JButton();
        btnBarcode = new JButton();
        lblCard = new JLabel();

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- btnMagnetic ----
            btnMagnetic.setText("MAGNETIC STRIP CARD");
            btnMagnetic.addActionListener(e -> btnMagneticActionPerformed(e));

            //---- btnContactless ----
            btnContactless.setText("CONTACTLESS CARD");
            btnContactless.addActionListener(e -> btnContactlessActionPerformed(e));

            //---- btnBarcode ----
            btnBarcode.setText("BARCODE CARD");
            btnBarcode.addActionListener(e -> btnBarcodeActionPerformed(e));

            //---- lblCard ----
            lblCard.setText("WHICH TYPE OF CARD DO YOU HAVE?");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(btnContactless, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBarcode, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMagnetic)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(lblCard)))
                        .addContainerGap(160, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblCard)
                        .addGap(50, 50, 50)
                        .addComponent(btnMagnetic)
                        .addGap(31, 31, 31)
                        .addComponent(btnContactless)
                        .addGap(34, 34, 34)
                        .addComponent(btnBarcode)
                        .addContainerGap(89, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - godieina fire
    private JButton btnMagnetic;
    private JButton btnContactless;
    private JButton btnBarcode;
    private JLabel lblCard;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
