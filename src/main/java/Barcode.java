import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Barcode extends JFrame {
    private final String validBarcode = "86657673683465826779686123";

    private JPanel panel1;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - godieina fire
    private JLabel lblBarcode;
    private JTextField txtBarcode;
    private JButton btnBarcode;
    private JLabel lblBarcodeError;

    public Barcode() {
        initComponents();
        txtBarcode.setText(validBarcode);
        this.setContentPane(panel1);
        this.pack();
    }

    private void btnBarcodeActionPerformed(ActionEvent e) {
        String barcode = txtBarcode.getText();

        if (barcode.equals(validBarcode)) {
            new Account().setVisible(true);
        } else {
            lblBarcodeError.setVisible(true);
        }
    }

    private void txtBarcodeFocusGained(FocusEvent e) {
        lblBarcodeError.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - godieina fire
        panel1 = new JPanel();
        lblBarcode = new JLabel();
        txtBarcode = new JTextField();
        btnBarcode = new JButton();
        lblBarcodeError = new JLabel();

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                            "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                            javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                            java.awt.Color.red), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("border".equals(e.getPropertyName())) throw new RuntimeException();
                }
            });


            //---- lblBarcode ----
            lblBarcode.setText("INPUT BARCODE TO BEGIN");

            //---- txtBarcode ----
            txtBarcode.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    txtBarcodeFocusGained(e);
                }
            });

            //---- btnBarcode ----
            btnBarcode.setText("BEGIN");
            btnBarcode.addActionListener(e -> btnBarcodeActionPerformed(e));

            //---- lblBarcodeError ----
            lblBarcodeError.setText("INVALID BARCODE TRY AGAIN");
            lblBarcodeError.setVisible(false);

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(154, 154, 154)
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addComponent(lblBarcodeError)
                                                            .addGroup(panel1Layout.createSequentialGroup()
                                                                    .addGap(13, 13, 13)
                                                                    .addComponent(btnBarcode, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(170, 170, 170)
                                                    .addComponent(lblBarcode))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(116, 116, 116)
                                                    .addComponent(txtBarcode, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap(123, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(lblBarcode)
                                    .addGap(29, 29, 29)
                                    .addComponent(lblBarcodeError)
                                    .addGap(43, 43, 43)
                                    .addComponent(txtBarcode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(btnBarcode)
                                    .addContainerGap(64, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
