import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;

public class registerForm extends JFrame{
    private JPanel panel1;

    public registerForm() {
        initComponents();
        this.setContentPane(panel1);
        this.pack();
    }

    private void cancelButActionPerformed(ActionEvent e) {
        userNameField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        passwordField.setText("");
        adminCheckBox.setSelected(false);
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Benjamin Ward
        JPanel panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        adminCheckBox = new JCheckBox();
        button1 = new JButton();
        cancelBut = new JButton();
        userNameField = new JTextField();
        firstNameField = new JTextField();
        lastNameField = new JTextField();
        passwordField = new JPasswordField();

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- label1 ----
            label1.setText("Register");
            label1.setFont(new Font("Segoe UI", Font.BOLD, 18));

            //---- label2 ----
            label2.setText("Username");

            //---- label3 ----
            label3.setText("First Name");

            //---- label4 ----
            label4.setText("Last Name");

            //---- label5 ----
            label5.setText("Password");

            //---- adminCheckBox ----
            adminCheckBox.setText("Admin");

            //---- button1 ----
            button1.setText("Submit");

            //---- cancelBut ----
            cancelBut.setText("Cancel");
            cancelBut.addActionListener(e -> cancelButActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(label1))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label4)
                                    .addComponent(label5)
                                    .addComponent(label2)
                                    .addComponent(userNameField)
                                    .addComponent(label3)
                                    .addComponent(lastNameField)
                                    .addComponent(firstNameField)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cancelBut, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(adminCheckBox))
                                    .addComponent(passwordField))))
                        .addContainerGap(184, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1)
                        .addGap(33, 33, 33)
                        .addComponent(label2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(label5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(adminCheckBox)
                        .addGap(26, 26, 26)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelBut)
                            .addComponent(button1))
                        .addContainerGap(26, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Benjamin Ward
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JCheckBox adminCheckBox;
    private JButton button1;
    private JButton cancelBut;
    private JTextField userNameField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JPasswordField passwordField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
