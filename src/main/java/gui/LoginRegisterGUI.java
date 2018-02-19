package gui;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

import logic.account.AccountManager;
import logic.employee.EmployeeRegistry;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.mindrot.jbcrypt.BCrypt;

public class LoginRegisterGUI  extends JFrame {


    private EmployeeRegistry employeeRegistry;
    private AccountManager accountManager;
    private int counter;

    public LoginRegisterGUI() throws IOException, ParseException {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(pnlLogin);
        this.pack();
        pnlLogin.setVisible(true);
        employeeRegistry = new EmployeeRegistry();
        this.counter = 0;
        accountManager = new AccountManager();
    }


    private void cancelRegButActionPerformed(ActionEvent e) {
        regUserNameField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        regPasswordField.setText("");
        adminCheckBox.setSelected(false);
        pnlLogin.setVisible(true);
        pnlRegister.setVisible(false);
    }

    private void submitRegButActionPerformed(ActionEvent e) throws IOException, ParseException {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        String password = new String(regPasswordField.getPassword());
        //JSON object and values

        jsonObject.put("username", regUserNameField.getText());
        jsonObject.put("firstName", firstNameField.getText());
        jsonObject.put("lastName", lastNameField.getText());
        jsonObject.put("admin", adminCheckBox.isSelected());
        String hashedPass = BCrypt.hashpw(password, BCrypt.gensalt(12));
        jsonObject.put("password", hashedPass);
        jsonArray.add(jsonObject);
        employeeRegistry.addEmployee(jsonArray);

        pnlLogin.setVisible(true);
        pnlRegister.setVisible(false);
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

    private void loginButActionPerformed(ActionEvent e) throws IOException, ParseException {
        String userName = userField.getText();

        String password = new String(passField.getPassword());

        boolean loginSuccess = accountManager.login(userName, password);
        if (loginSuccess) {
            new EmployeeGUI(userName).setVisible(true);
            this.setVisible(false);
            this.counter = 0;
        }

        if (!loginSuccess) {
            this.counter++;
            if (this.counter > 3) {
                invalidCred.setVisible(false);
                tooManyRetries.setVisible(true);
            } else {
                invalidCred.setVisible(true);
            }
        }

    }

    private void regOpenButActionPerformed(ActionEvent e) {
        pnlLogin.setVisible(false);
        pnlRegister.setVisible(true);
    }

    private void btnMainGUIActionPerformed(ActionEvent e) {
        pnlLogin.setVisible(false);
        new GUI().setVisible(true);
    }




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Benjamin Ward
        pnlMain = new JPanel();
        pnlLogin = new JPanel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        passField = new JPasswordField();
        userField = new JTextField();
        loginBut = new JButton();
        cancelBut2 = new JButton();
        successUserLogin = new JButton();
        successLoginAdmin = new JButton();
        unsuccessfulLogin = new JButton();
        regOpenBut = new JButton();
        tooManyRetries = new JLabel();
        invalidCred = new JLabel();
        btnMainGUI = new JButton();
        pnlRegister = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        adminCheckBox = new JCheckBox();
        submitRegBut = new JButton();
        cancelRegBut = new JButton();
        regUserNameField = new JTextField();
        firstNameField = new JTextField();
        lastNameField = new JTextField();
        regPasswordField = new JPasswordField();

        //======== pnlMain ========
        {
            pnlMain.setMinimumSize(new Dimension(627, 413));
            pnlMain.setPreferredSize(new Dimension(700, 478));

            // JFormDesigner evaluation mark
            pnlMain.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), pnlMain.getBorder())); pnlMain.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            pnlMain.setLayout(new CardLayout());

            //======== pnlLogin ========
            {
                pnlLogin.setPreferredSize(new Dimension(700, 478));
                pnlLogin.setVisible(false);
                pnlLogin.setMinimumSize(new Dimension(627, 413));

                //---- label6 ----
                label6.setText("Enter Your Login Credentials");

                //---- label7 ----
                label7.setText("Username");

                //---- label8 ----
                label8.setText("Password");

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

                //---- cancelBut2 ----
                cancelBut2.setText("Cancel");
                cancelBut2.addActionListener(e -> cancelButActionPerformed(e));

                //---- successUserLogin ----
                successUserLogin.setText("Successful Login - User");
                successUserLogin.addActionListener(e -> successUserLoginActionPerformed(e));

                //---- successLoginAdmin ----
                successLoginAdmin.setText("Successful Login - Admin");
                successLoginAdmin.addActionListener(e -> successLoginAdminActionPerformed(e));

                //---- unsuccessfulLogin ----
                unsuccessfulLogin.setText("Unsuccessful Login ");
                unsuccessfulLogin.addActionListener(e -> unsuccessfulLoginActionPerformed(e));

                //---- regOpenBut ----
                regOpenBut.setText("Register");
                regOpenBut.setBackground(Color.black);
                regOpenBut.setForeground(Color.blue);
                regOpenBut.setOpaque(false);
                regOpenBut.addActionListener(e -> regOpenButActionPerformed(e));

                //---- tooManyRetries ----
                tooManyRetries.setText("Too Many Retries. Please wait");
                tooManyRetries.setForeground(Color.red);
                tooManyRetries.setVisible(false);

                //---- invalidCred ----
                invalidCred.setText("Invalid Credentials");
                invalidCred.setForeground(Color.red);
                invalidCred.setVisible(false);

                //---- btnMainGUI ----
                btnMainGUI.setText("Go Back To Main Page");
                btnMainGUI.addActionListener(e -> btnMainGUIActionPerformed(e));

                GroupLayout pnlLoginLayout = new GroupLayout(pnlLogin);
                pnlLogin.setLayout(pnlLoginLayout);
                pnlLoginLayout.setHorizontalGroup(
                    pnlLoginLayout.createParallelGroup()
                        .addGroup(pnlLoginLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(pnlLoginLayout.createParallelGroup()
                                .addComponent(successUserLogin)
                                .addComponent(btnMainGUI, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
                            .addGap(85, 85, 85)
                            .addGroup(pnlLoginLayout.createParallelGroup()
                                .addGroup(pnlLoginLayout.createSequentialGroup()
                                    .addComponent(label7)
                                    .addContainerGap(384, Short.MAX_VALUE))
                                .addGroup(pnlLoginLayout.createSequentialGroup()
                                    .addComponent(successLoginAdmin)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                    .addComponent(unsuccessfulLogin)
                                    .addGap(35, 35, 35))
                                .addGroup(pnlLoginLayout.createSequentialGroup()
                                    .addGroup(pnlLoginLayout.createParallelGroup()
                                        .addComponent(tooManyRetries)
                                        .addComponent(regOpenBut, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancelBut2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loginBut, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label8)
                                        .addComponent(userField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label6))
                                    .addGap(0, 287, Short.MAX_VALUE))))
                        .addGroup(pnlLoginLayout.createSequentialGroup()
                            .addGap(276, 276, 276)
                            .addComponent(invalidCred)
                            .addGap(0, 404, Short.MAX_VALUE))
                );
                pnlLoginLayout.setVerticalGroup(
                    pnlLoginLayout.createParallelGroup()
                        .addGroup(pnlLoginLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(pnlLoginLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(successUserLogin)
                                .addComponent(unsuccessfulLogin)
                                .addComponent(successLoginAdmin))
                            .addGap(91, 91, 91)
                            .addGroup(pnlLoginLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlLoginLayout.createSequentialGroup()
                                    .addComponent(label6)
                                    .addGap(26, 26, 26)
                                    .addComponent(invalidCred)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label7)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(userField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(label8)
                                    .addGap(18, 18, 18)
                                    .addComponent(passField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)
                                    .addComponent(tooManyRetries)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(loginBut)
                                    .addGap(18, 18, 18)
                                    .addComponent(cancelBut2)
                                    .addGap(18, 18, 18)
                                    .addComponent(regOpenBut))
                                .addComponent(btnMainGUI, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(101, Short.MAX_VALUE))
                );
            }
            pnlMain.add(pnlLogin, "card2");

            //======== pnlRegister ========
            {
                pnlRegister.setMinimumSize(new Dimension(627, 413));
                pnlRegister.setPreferredSize(new Dimension(700, 478));

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

                //---- submitRegBut ----
                submitRegBut.setText("Submit");
                submitRegBut.addActionListener(e -> {
                    try {
                        submitRegButActionPerformed(e);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } catch (ParseException e1) {
                        e1.printStackTrace();
                    }
                });

                //---- cancelRegBut ----
                cancelRegBut.setText("Cancel");
                cancelRegBut.addActionListener(e -> {
			cancelButActionPerformed(e);
			cancelRegButActionPerformed(e);
		});

                GroupLayout pnlRegisterLayout = new GroupLayout(pnlRegister);
                pnlRegister.setLayout(pnlRegisterLayout);
                pnlRegisterLayout.setHorizontalGroup(
                    pnlRegisterLayout.createParallelGroup()
                        .addGroup(pnlRegisterLayout.createParallelGroup()
                            .addGroup(pnlRegisterLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlRegisterLayout.createParallelGroup()
                                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(label1))
                                    .addComponent(label2)
                                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(regUserNameField, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(label3))
                                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(firstNameField, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(label4))
                                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lastNameField, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(label5))
                                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(regPasswordField, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(adminCheckBox))
                                    .addGroup(pnlRegisterLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(submitRegBut, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cancelRegBut, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 680, Short.MAX_VALUE)
                );
                pnlRegisterLayout.setVerticalGroup(
                    pnlRegisterLayout.createParallelGroup()
                        .addGroup(pnlRegisterLayout.createParallelGroup()
                            .addGroup(pnlRegisterLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(label1)
                                .addGap(18, 18, 18)
                                .addComponent(label2)
                                .addGap(12, 12, 12)
                                .addComponent(regUserNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(label3)
                                .addGap(12, 12, 12)
                                .addComponent(firstNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(label4)
                                .addGap(18, 18, 18)
                                .addComponent(lastNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(label5)
                                .addGap(6, 6, 6)
                                .addComponent(regPasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(adminCheckBox)
                                .addGap(18, 18, 18)
                                .addGroup(pnlRegisterLayout.createParallelGroup()
                                    .addComponent(submitRegBut)
                                    .addComponent(cancelRegBut))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 580, Short.MAX_VALUE)
                );
            }
            pnlMain.add(pnlRegister, "card3");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Benjamin Ward
    private JPanel pnlMain;
    private JPanel pnlLogin;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JPasswordField passField;
    private JTextField userField;
    private JButton loginBut;
    private JButton cancelBut2;
    private JButton successUserLogin;
    private JButton successLoginAdmin;
    private JButton unsuccessfulLogin;
    private JButton regOpenBut;
    private JLabel tooManyRetries;
    private JLabel invalidCred;
    private JButton btnMainGUI;
    private JPanel pnlRegister;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JCheckBox adminCheckBox;
    private JButton submitRegBut;
    private JButton cancelRegBut;
    private JTextField regUserNameField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JPasswordField regPasswordField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
