import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;

public class loginForm extends JFrame {
    public loginForm() {
        initComponents();
        this.setContentPane(panel1);
        this.pack();
    }

    private void cancelButActionPerformed(ActionEvent e) {
        passField.setText("");
        userField.setText("");
    }

    private void successUserLoginActionPerformed(ActionEvent e) {
        passField.setText("password");
        userField.setText("randThor");
    }

    private void successLoginAdminActionPerformed(ActionEvent e) {
        passField.setText("password");
        userField.setText("roseBush");
    }

    private void unsuccessfulLoginActionPerformed(ActionEvent e) {
        passField.setText("password");
        userField.setText("willSparks");
    }

    public void tooManyRetries() {
        tooManyRetries.setVisible(true);
    }

    private void loginButActionPerformed(ActionEvent e) throws IOException, ParseException {
        String userName = userField.getText();

        String password = new String(passField.getPassword());
        AccountManager accountManager = new AccountManager();

        boolean loginSuccess = accountManager.login(userName, password);
        if (loginSuccess) {
            new adminHome().setVisible(true);
            this.setVisible(false);
        }

        if(!loginSuccess) {
            invalidCred.setVisible(true);
        }

    }

    private void regButActionPerformed(ActionEvent e) {
        new registerForm().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Benjamin Ward
        panel1 = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        passField = new JPasswordField();
        userField = new JTextField();
        loginBut = new JButton();
        cancelBut = new JButton();
        successUserLogin = new JButton();
        successLoginAdmin = new JButton();
        unsuccessfulLogin = new JButton();
        invalidCred = new JLabel();
        regBut = new JButton();
        tooManyRetries = new JLabel();

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

            //======== panel2 ========
            {
                panel2.setPreferredSize(new Dimension(500, 500));

                //---- label1 ----
                label1.setText("Enter Your Login Credentials");

                //---- label2 ----
                label2.setText("Username");

                //---- label3 ----
                label3.setText("Password");

                //---- loginBut ----
                loginBut.setText("Login");
                loginBut.addActionListener(e -> {
                    try {
                        loginButActionPerformed(e);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } catch (ParseException e1) {
                        e1.printStackTrace();
                    }
                });

                //---- cancelBut ----
                cancelBut.setText("Cancel");
                cancelBut.addActionListener(e -> cancelButActionPerformed(e));

                //---- successUserLogin ----
                successUserLogin.setText("Successful Login - User");
                successUserLogin.addActionListener(e -> successUserLoginActionPerformed(e));

                //---- successLoginAdmin ----
                successLoginAdmin.setText("Successful Login - Admin");
                successLoginAdmin.addActionListener(e -> successLoginAdminActionPerformed(e));

                //---- unsuccessfulLogin ----
                unsuccessfulLogin.setText("Unsuccessful Login ");
                unsuccessfulLogin.addActionListener(e -> unsuccessfulLoginActionPerformed(e));

                //---- invalidCred ----
                invalidCred.setText("Invalid Credentials");
                invalidCred.setForeground(Color.red);
                invalidCred.setFont(new Font("Segoe UI", Font.BOLD, 12));
                invalidCred.setHorizontalAlignment(SwingConstants.CENTER);
                invalidCred.setBackground(Color.black);
                invalidCred.setVisible(false);

                //---- regBut ----
                regBut.setText("Register");
                regBut.setBackground(Color.black);
                regBut.setForeground(Color.blue);
                regBut.setOpaque(false);
                regBut.addActionListener(e -> regButActionPerformed(e));

                //---- tooManyRetries ----
                tooManyRetries.setText("Too Many Retries. Please wait");
                tooManyRetries.setForeground(Color.red);
                tooManyRetries.setVisible(false);

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(successUserLogin)
                                    .addGap(18, 18, 18)
                                    .addComponent(successLoginAdmin)
                                    .addGap(16, 16, 16)
                                    .addComponent(unsuccessfulLogin))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(162, 162, 162)
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(tooManyRetries)
                                        .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cancelBut, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(loginBut, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(passField)
                                            .addComponent(label3)
                                            .addComponent(userField)
                                            .addComponent(label2)
                                            .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(invalidCred, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(regBut, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addContainerGap(8, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(unsuccessfulLogin)
                                .addComponent(successUserLogin)
                                .addComponent(successLoginAdmin))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(label1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(invalidCred, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(loginBut)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cancelBut)
                            .addGap(31, 31, 31)
                            .addComponent(regBut)
                            .addGap(27, 27, 27)
                            .addComponent(tooManyRetries)
                            .addContainerGap(32, Short.MAX_VALUE))
                );
            }
            panel1.add(panel2, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                null, null, null));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Benjamin Ward
    private JPanel panel2;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JPasswordField passField;
    private JTextField userField;
    private JButton loginBut;
    private JButton cancelBut;
    private JButton successUserLogin;
    private JButton successLoginAdmin;
    private JButton unsuccessfulLogin;
    private JLabel invalidCred;
    private JButton regBut;
    private JLabel tooManyRetries;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
