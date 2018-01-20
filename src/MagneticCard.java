import java.awt.event.*;
import javax.swing.*;

public class MagneticCard extends JFrame {
    private Boolean valid = false;

    private JPanel panel1;

    public MagneticCard() {
        initComponents();
        this.setContentPane(panel1);
        this.pack();
    }

    private void btnSwipeCareActionPerformed(ActionEvent e) {
        if (valid) {
            System.out.println("valid magnetic card");
        } else {
            lblMagneticCardError.setVisible(true);
        }
    }

    private void btnValidCardActionPerformed(ActionEvent e) {
        lblMagneticCardError.setVisible(false);
        valid = true;
    }

    private void btnInvalidCardActionPerformed(ActionEvent e) {
        lblMagneticCardError.setVisible(false);
        valid = false;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - godieina fire
        panel1 = new JPanel();
        lblMagneticCardError = new JLabel();
        btnSwipeCare = new JButton();
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


            //---- lblMagneticCardError ----
            lblMagneticCardError.setText("ERROR INVALID CARD TRY AGAIN");
            lblMagneticCardError.setVisible(false);

            //---- btnSwipeCare ----
            btnSwipeCare.setText("SWIPE CARD TO BEGIN");
            btnSwipeCare.addActionListener(e -> btnSwipeCareActionPerformed(e));

            //---- btnValidCard ----
            btnValidCard.setText("VALID CARD");
            btnValidCard.addActionListener(e -> btnValidCardActionPerformed(e));

            //---- btnInvalidCard ----
            btnInvalidCard.setText("INVALID CARD");
            btnInvalidCard.addActionListener(e -> btnInvalidCardActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(313, 313, 313)
                                .addComponent(lblMagneticCardError))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(btnSwipeCare, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(btnValidCard)
                                .addGap(60, 60, 60)
                                .addComponent(btnInvalidCard)))
                        .addContainerGap(285, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lblMagneticCardError)
                        .addGap(77, 77, 77)
                        .addComponent(btnSwipeCare, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnValidCard)
                            .addComponent(btnInvalidCard))
                        .addContainerGap(330, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - godieina fire
    private JLabel lblMagneticCardError;
    private JButton btnSwipeCare;
    private JButton btnValidCard;
    private JButton btnInvalidCard;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
