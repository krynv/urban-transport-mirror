import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.mindrot.jbcrypt.BCrypt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class registerForm extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Benjamin Ward
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JPanel panel1;
    private JCheckBox adminCheckBox;
    private JButton submitBut;
    private JButton cancelBut;
    private JTextField userNameField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JPasswordField passwordField;
    private EmployeeRegistery employeeRegistery;

    public registerForm() throws IOException, ParseException {
        initComponents();
        employeeRegistery = new EmployeeRegistery();
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

    private void submitButActionPerformed(ActionEvent d) throws IOException, ParseException {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        String password = new String(passwordField.getPassword());
        //JSON object and values

        jsonObject.put("username", userNameField.getText());
        jsonObject.put("firstName", firstNameField.getText());
        jsonObject.put("lastName", lastNameField.getText());
        jsonObject.put("admin", adminCheckBox.isSelected());
        String hashedPass = BCrypt.hashpw(password, BCrypt.gensalt(12));
        jsonObject.put("password", hashedPass);
        jsonArray.add(jsonObject);
        employeeRegistery.addEmployee(jsonArray);


    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Benjamin Ward
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        adminCheckBox = new JCheckBox();
        submitBut = new JButton();
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
                            java.awt.Color.red), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("border".equals(e.getPropertyName())) throw new RuntimeException();
                }
            });


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

            //---- submitBut ----
            submitBut.setText("Submit");
            submitBut.addActionListener(e -> {
                try {
                    submitButActionPerformed(e);
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (ParseException e1) {
                    e1.printStackTrace();
                }
            });

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
                                                    .addGroup(panel1Layout.createParallelGroup()
                                                            .addComponent(adminCheckBox)
                                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(label4)
                                                                    .addComponent(label5)
                                                                    .addComponent(label2)
                                                                    .addComponent(userNameField)
                                                                    .addComponent(label3)
                                                                    .addComponent(lastNameField)
                                                                    .addComponent(firstNameField)
                                                                    .addGroup(panel1Layout.createSequentialGroup()
                                                                            .addComponent(submitBut, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                                                            .addGap(18, 18, 18)
                                                                            .addComponent(cancelBut, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
                                                                    .addComponent(passwordField)))))
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
                                    .addGap(18, 18, 18)
                                    .addComponent(adminCheckBox)
                                    .addGap(32, 32, 32)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(cancelBut)
                                            .addComponent(submitBut))
                                    .addContainerGap(26, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
