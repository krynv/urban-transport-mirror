import java.awt.event.*;
import javax.swing.*;

public class RFID extends JFrame {
    private Boolean valid = false;

    private JPanel panel1;

    public RFID() {
        initComponents();
        this.setContentPane(panel1);
        this.pack();
    }

    private void btnRFIDActionPerformed(ActionEvent e) {
        if (valid) {
            System.out.println("valid contactless card");
        } else {
            lblRFIDError.setVisible(true);
        }
    }

    private void btnValidCardActionPerformed(ActionEvent e) {
        lblRFIDError.setVisible(false);
        valid = true;
    }

    private void btnInvalidCardActionPerformed(ActionEvent e) {
        lblRFIDError.setVisible(false);
        valid = false;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - godieina fire
        panel1 = new JPanel();
        lblRFIDError = new JLabel();
        btnRFID = new JButton();
        btnValidCard = new JButton();
        btnInvalidCard = new JButton();

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- lblRFIDError ----
            lblRFIDError.setText("ERROR INVALID CARD TRY AGAIN");
            lblRFIDError.setVisible(false);

            //---- btnRFID ----
            btnRFID.setText("TAP CARD TO BEGIN");
            btnRFID.addActionListener(e -> btnRFIDActionPerformed(e));

            //---- btnValidCard ----
            btnValidCard.setText("valid card");
            btnValidCard.addActionListener(e -> btnValidCardActionPerformed(e));

            //---- btnInvalidCard ----
            btnInvalidCard.setText("invalid card");
            btnInvalidCard.addActionListener(e -> btnInvalidCardActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(lblRFIDError))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(btnRFID, GroupLayout.PREFERRED_SIZE, 418, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(btnValidCard)
                                .addGap(43, 43, 43)
                                .addComponent(btnInvalidCard)))
                        .addContainerGap(346, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lblRFIDError)
                        .addGap(58, 58, 58)
                        .addComponent(btnRFID, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnValidCard)
                            .addComponent(btnInvalidCard))
                        .addContainerGap(312, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - godieina fire
    private JLabel lblRFIDError;
    private JButton btnRFID;
    private JButton btnValidCard;
    private JButton btnInvalidCard;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
