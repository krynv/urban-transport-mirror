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
        this.setLocationRelativeTo(null);
        this.setContentPane(pnlMain);
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


        employeeRegistry = new EmployeeRegistry();
        pnlLogin.setVisible(true);
        pnlRegister.setVisible(false);
        submitRegBut.setEnabled(false);
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
        employeeRegistry = new EmployeeRegistry();

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
        submitRegBut.setEnabled(false);
    }

    private void btnMainGUIActionPerformed(ActionEvent e) {
        pnlLogin.setVisible(false);
        this.dispose();
    }

    private void regPasswordFieldKeyTyped(KeyEvent e) {
        String password = new String(regPasswordField.getPassword());
        passStrength.setOpaque(true);
        passStrengthMess.setOpaque(true);

        if(password.length() < 6) {
            submitRegBut.setEnabled(false);
            passStrength.setVisible(true);
            passStrength.setText("Password Strength - TOO SHORT");
            passStrength.setBackground(Color.gray);
            passStrengthMess.setBackground(Color.gray);
            passStrengthMess.setVisible(true);
            passStrengthMess.setText("Password needs to be 6 or more characters");
        } else if(password.length() <= 8){
            submitRegBut.setEnabled(true);
            passStrength.setVisible(true);
            passStrength.setBackground(Color.red);
            passStrengthMess.setBackground(Color.red);
            passStrength.setText("Password Strength - VERY WEAK");
            passStrengthMess.setVisible(true);
            passStrengthMess.setText("Recommend password to be more than 8 at least");

        }else if(password.length() <= 10){
            submitRegBut.setEnabled(true);
            passStrength.setVisible(true);
            passStrength.setText("Password Strength - FAIR");
            passStrength.setBackground(Color.yellow);
            passStrengthMess.setBackground(Color.yellow);
            passStrengthMess.setVisible(true);
            passStrengthMess.setText("Getting there try to some more characters");
        } else if(password.length() <= 12){
            submitRegBut.setEnabled(true);
            passStrength.setVisible(true);
            passStrength.setBackground(Color.cyan);
            passStrengthMess.setBackground(Color.cyan);
            passStrength.setText("Password Strength - GOOD");
            passStrengthMess.setVisible(true);
            passStrengthMess.setText("Brilliant. Want to be more secure? Add more characters or numbers");
        } else if(password.length() > 14){
            submitRegBut.setEnabled(true);
            passStrength.setVisible(true);
            passStrength.setText("Password Strength - STRONG");
            passStrength.setBackground(Color.GREEN);
            passStrengthMess.setBackground(Color.green);
            passStrengthMess.setVisible(true);
            passStrengthMess.setText("Brilliant. Press that submit button");
        }
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Sheffield Hallan
        pnlMain = new JPanel();
        pnlLogin = new JPanel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        passField = new JPasswordField();
        userField = new JTextField();
        loginBut = new JButton();
        cancelBut2 = new JButton();
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
        passStrengthMess = new JLabel();
        passStrength = new JLabel();

        //======== pnlMain ========
        {
            pnlMain.setMinimumSize(new Dimension(627, 413));
            pnlMain.setPreferredSize(new Dimension(1111, 635));

            pnlMain.setLayout(new CardLayout());

            //======== pnlLogin ========
            {
                pnlLogin.setPreferredSize(new Dimension(700, 478));
                pnlLogin.setMinimumSize(new Dimension(627, 413));
                pnlLogin.setVisible(false);
                pnlLogin.setLayout(null);

                //---- label6 ----
                label6.setText("Enter Your Login Credentials");
                pnlLogin.add(label6);
                label6.setBounds(new Rectangle(new Point(525, 140), label6.getPreferredSize()));

                //---- label7 ----
                label7.setText("Username");
                pnlLogin.add(label7);
                label7.setBounds(new Rectangle(new Point(525, 185), label7.getPreferredSize()));

                //---- label8 ----
                label8.setText("Password");
                pnlLogin.add(label8);
                label8.setBounds(new Rectangle(new Point(525, 245), label8.getPreferredSize()));
                pnlLogin.add(passField);
                passField.setBounds(525, 280, 150, passField.getPreferredSize().height);
                pnlLogin.add(userField);
                userField.setBounds(525, 205, 150, userField.getPreferredSize().height);

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
                pnlLogin.add(loginBut);
                loginBut.setBounds(525, 350, 150, loginBut.getPreferredSize().height);

                //---- cancelBut2 ----
                cancelBut2.setText("Cancel");
                cancelBut2.addActionListener(e -> cancelButActionPerformed(e));
                pnlLogin.add(cancelBut2);
                cancelBut2.setBounds(525, 400, 150, cancelBut2.getPreferredSize().height);

                //---- successLoginAdmin ----
                successLoginAdmin.setText("Successful Login - Admin");
                successLoginAdmin.addActionListener(e -> successLoginAdminActionPerformed(e));
                pnlLogin.add(successLoginAdmin);
                successLoginAdmin.setBounds(new Rectangle(new Point(305, 25), successLoginAdmin.getPreferredSize()));

                //---- unsuccessfulLogin ----
                unsuccessfulLogin.setText("Unsuccessful Login ");
                unsuccessfulLogin.addActionListener(e -> unsuccessfulLoginActionPerformed(e));
                pnlLogin.add(unsuccessfulLogin);
                unsuccessfulLogin.setBounds(new Rectangle(new Point(735, 25), unsuccessfulLogin.getPreferredSize()));

                //---- regOpenBut ----
                regOpenBut.setText("Register");
                regOpenBut.setBackground(Color.black);
                regOpenBut.setForeground(Color.blue);
                regOpenBut.setOpaque(false);
                regOpenBut.addActionListener(e -> regOpenButActionPerformed(e));
                pnlLogin.add(regOpenBut);
                regOpenBut.setBounds(525, 450, 150, regOpenBut.getPreferredSize().height);

                //---- tooManyRetries ----
                tooManyRetries.setText("Too Many Retries. Please wait");
                tooManyRetries.setForeground(Color.red);
                tooManyRetries.setVisible(false);
                pnlLogin.add(tooManyRetries);
                tooManyRetries.setBounds(525, 350, 0, 0);

                //---- invalidCred ----
                invalidCred.setText("Invalid Credentials");
                invalidCred.setForeground(Color.red);
                invalidCred.setVisible(false);
                pnlLogin.add(invalidCred);
                invalidCred.setBounds(530, 185, 0, 0);

                //---- btnMainGUI ----
                btnMainGUI.setText("Go Back To Main Page");
                btnMainGUI.addActionListener(e -> btnMainGUIActionPerformed(e));
                pnlLogin.add(btnMainGUI);
                btnMainGUI.setBounds(10, 515, 199, 50);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < pnlLogin.getComponentCount(); i++) {
                        Rectangle bounds = pnlLogin.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = pnlLogin.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    pnlLogin.setMinimumSize(preferredSize);
                    pnlLogin.setPreferredSize(preferredSize);
                }
            }
            pnlMain.add(pnlLogin, "card2");

            //======== pnlRegister ========
            {
                pnlRegister.setMinimumSize(new Dimension(627, 413));
                pnlRegister.setPreferredSize(new Dimension(700, 478));
                pnlRegister.setLayout(null);

                //---- label1 ----
                label1.setText("Register");
                label1.setFont(new Font("Segoe UI", Font.BOLD, 18));
                pnlRegister.add(label1);
                label1.setBounds(new Rectangle(new Point(525, 30), label1.getPreferredSize()));

                //---- label2 ----
                label2.setText("Username");
                pnlRegister.add(label2);
                label2.setBounds(new Rectangle(new Point(470, 70), label2.getPreferredSize()));

                //---- label3 ----
                label3.setText("First Name");
                pnlRegister.add(label3);
                label3.setBounds(new Rectangle(new Point(475, 130), label3.getPreferredSize()));

                //---- label4 ----
                label4.setText("Last Name");
                pnlRegister.add(label4);
                label4.setBounds(new Rectangle(new Point(475, 195), label4.getPreferredSize()));

                //---- label5 ----
                label5.setText("Password");
                pnlRegister.add(label5);
                label5.setBounds(new Rectangle(new Point(475, 265), label5.getPreferredSize()));

                //---- adminCheckBox ----
                adminCheckBox.setText("Admin");
                pnlRegister.add(adminCheckBox);
                adminCheckBox.setBounds(new Rectangle(new Point(475, 430), adminCheckBox.getPreferredSize()));

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
                pnlRegister.add(submitRegBut);
                submitRegBut.setBounds(475, 510, 84, submitRegBut.getPreferredSize().height);

                //---- cancelRegBut ----
                cancelRegBut.setText("Cancel");
                cancelRegBut.addActionListener(e -> {
			cancelButActionPerformed(e);
			cancelRegButActionPerformed(e);
		});
                pnlRegister.add(cancelRegBut);
                cancelRegBut.setBounds(575, 510, 86, cancelRegBut.getPreferredSize().height);
                pnlRegister.add(regUserNameField);
                regUserNameField.setBounds(475, 100, 188, regUserNameField.getPreferredSize().height);
                pnlRegister.add(firstNameField);
                firstNameField.setBounds(475, 150, 188, firstNameField.getPreferredSize().height);
                pnlRegister.add(lastNameField);
                lastNameField.setBounds(475, 220, 188, lastNameField.getPreferredSize().height);

                //---- regPasswordField ----
                regPasswordField.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        regPasswordFieldKeyTyped(e);
                    }
                });
                pnlRegister.add(regPasswordField);
                regPasswordField.setBounds(475, 285, 188, regPasswordField.getPreferredSize().height);

                //---- passStrengthMess ----
                passStrengthMess.setText("Password needs to be 6 or more characters");
                passStrengthMess.setHorizontalAlignment(SwingConstants.CENTER);
                passStrengthMess.setVisible(false);
                pnlRegister.add(passStrengthMess);
                passStrengthMess.setBounds(335, 400, 524, 25);

                //---- passStrength ----
                passStrength.setText("Password Strength - TOO SHORT");
                passStrength.setHorizontalAlignment(SwingConstants.CENTER);
                passStrength.setVisible(false);
                pnlRegister.add(passStrength);
                passStrength.setBounds(280, 345, 540, 25);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < pnlRegister.getComponentCount(); i++) {
                        Rectangle bounds = pnlRegister.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = pnlRegister.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    pnlRegister.setMinimumSize(preferredSize);
                    pnlRegister.setPreferredSize(preferredSize);
                }
            }
            pnlMain.add(pnlRegister, "card3");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Sheffield Hallan
    private JPanel pnlMain;
    private JPanel pnlLogin;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JPasswordField passField;
    private JTextField userField;
    private JButton loginBut;
    private JButton cancelBut2;
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
    private JLabel passStrengthMess;
    private JLabel passStrength;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
