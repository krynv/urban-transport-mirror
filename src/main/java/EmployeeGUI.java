import javax.swing.plaf.*;
import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.swing.event.*;

public class EmployeeGUI extends JFrame {

    private AccountManager accountManager;

    private JPanel mainPanel;
    private JPanel panel1;

    public EmployeeGUI(String username) throws IOException, ParseException {
        this.accountManager = new AccountManager();
        this.accountManager.setActiveUser(username);
        initComponents();
        this.setContentPane(mainPanel);
        this.pack();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void tabbedPane14StateChanged(ChangeEvent e) {
        String name = "maintenance";
        LocalDateTime startDateTime = LocalDateTime.of(2018, 02, 04, 12, 0,0);
        LocalDateTime endDateTime = LocalDateTime.of(2018, 02, 04, 13, 0,0);

        Report report = this.accountManager.viewReport(name, startDateTime, endDateTime);
        MaintenanceReport maintenanceReport = (MaintenanceReport) report;

        textField2.setText(Double.toString(maintenanceReport.getMaintenanceCost()));
        textField4.setText(Double.toString(maintenanceReport.getBrakedownCost()));
        textField5.setText(maintenanceReport.getMostExpensiveVehicle());
        textField11.setText(maintenanceReport.getCheapestVehicle());
    }

    private void printButtonClicked(ActionEvent e) {
        String name = "maintenance";

        LocalDateTime startDateTime = LocalDateTime.of(2018, 02, 04, 12, 0,0);
        LocalDateTime endDateTime = LocalDateTime.of(2018, 02, 04, 13, 0,0);

        Report report = this.accountManager.viewReport(name, startDateTime, endDateTime);
        MaintenanceReport maintenanceReport = (MaintenanceReport) report;

        System.out.println(maintenanceReport.print(7));
    }

    private void logOutButtonActionPerformed(ActionEvent e) {
        this.accountManager.logout();
        this.dispose();
        try {
            new LoginGUI().setVisible(true);
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Barry Chuckle
        mainPanel = new JPanel();
        tabbedPane12 = new JTabbedPane();
        panel20 = new JPanel();
        label10 = new JLabel();
        panel3 = new JPanel();
        tabbedPane13 = new JTabbedPane();
        panel4 = new JPanel();
        label14 = new JLabel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        panel8 = new JPanel();
        tabbedPane15 = new JTabbedPane();
        panel15 = new JPanel();
        label15 = new JLabel();
        panel21 = new JPanel();
        panel22 = new JPanel();
        panel9 = new JPanel();
        tabbedPane14 = new JTabbedPane();
        panel19 = new JPanel();
        label9 = new JLabel();
        panel18 = new JPanel();
        textField2 = new JTextField();
        textField4 = new JTextField();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        textField6 = new JTextField();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        textField5 = new JTextField();
        textField11 = new JTextField();
        panel23 = new JPanel();
        textField7 = new JTextField();
        button6 = new JButton();
        button7 = new JButton();
        textField8 = new JTextField();
        textField9 = new JTextField();
        textField10 = new JTextField();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        button8 = new JButton();
        panel12 = new JPanel();
        panel13 = new JPanel();
        panel14 = new JPanel();
        logOutPanel = new JPanel();
        logOutButton = new JButton();

        //======== mainPanel ========
        {

            // JFormDesigner evaluation mark
            mainPanel.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), mainPanel.getBorder())); mainPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //======== tabbedPane12 ========
            {

                //======== panel20 ========
                {

                    //---- label10 ----
                    label10.setText("Welcome to Transport Management");
                    label10.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                    label10.setHorizontalAlignment(SwingConstants.CENTER);

                    GroupLayout panel20Layout = new GroupLayout(panel20);
                    panel20.setLayout(panel20Layout);
                    panel20Layout.setHorizontalGroup(
                        panel20Layout.createParallelGroup()
                            .addComponent(label10, GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    );
                    panel20Layout.setVerticalGroup(
                        panel20Layout.createParallelGroup()
                            .addGroup(panel20Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label10, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                    );
                }
                tabbedPane12.addTab("Staff Menu:", panel20);

                //======== panel3 ========
                {
                    panel3.setLayout(new GridLayout());

                    //======== tabbedPane13 ========
                    {

                        //======== panel4 ========
                        {
                            panel4.setLayout(new GridLayout());

                            //---- label14 ----
                            label14.setText("News Homepage");
                            label14.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                            label14.setHorizontalAlignment(SwingConstants.CENTER);
                            panel4.add(label14);
                        }
                        tabbedPane13.addTab("T1", panel4);

                        //======== panel5 ========
                        {
                            panel5.setLayout(new GridLayout());
                        }
                        tabbedPane13.addTab("T2", panel5);

                        //======== panel6 ========
                        {
                            panel6.setLayout(new GridLayout());
                        }
                        tabbedPane13.addTab("T3", panel6);

                        //======== panel7 ========
                        {
                            panel7.setLayout(new GridLayout());
                        }
                        tabbedPane13.addTab("T4", panel7);
                    }
                    panel3.add(tabbedPane13);
                }
                tabbedPane12.addTab("News", panel3);

                //======== panel8 ========
                {
                    panel8.setLayout(new GridLayout());

                    //======== tabbedPane15 ========
                    {

                        //======== panel15 ========
                        {
                            panel15.setLayout(new GridLayout());

                            //---- label15 ----
                            label15.setText("Accounts Homepage");
                            label15.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                            label15.setHorizontalAlignment(SwingConstants.CENTER);
                            panel15.add(label15);
                        }
                        tabbedPane15.addTab("T1", panel15);

                        //======== panel21 ========
                        {

                            GroupLayout panel21Layout = new GroupLayout(panel21);
                            panel21.setLayout(panel21Layout);
                            panel21Layout.setHorizontalGroup(
                                panel21Layout.createParallelGroup()
                                    .addGap(0, 641, Short.MAX_VALUE)
                            );
                            panel21Layout.setVerticalGroup(
                                panel21Layout.createParallelGroup()
                                    .addGap(0, 432, Short.MAX_VALUE)
                            );
                        }
                        tabbedPane15.addTab("T2", panel21);

                        //======== panel22 ========
                        {

                            GroupLayout panel22Layout = new GroupLayout(panel22);
                            panel22.setLayout(panel22Layout);
                            panel22Layout.setHorizontalGroup(
                                panel22Layout.createParallelGroup()
                                    .addGap(0, 641, Short.MAX_VALUE)
                            );
                            panel22Layout.setVerticalGroup(
                                panel22Layout.createParallelGroup()
                                    .addGap(0, 432, Short.MAX_VALUE)
                            );
                        }
                        tabbedPane15.addTab("T3", panel22);
                    }
                    panel8.add(tabbedPane15);
                }
                tabbedPane12.addTab("Accounts", panel8);

                //======== panel9 ========
                {
                    panel9.setLayout(new GridLayout());

                    //======== tabbedPane14 ========
                    {
                        tabbedPane14.setFont(tabbedPane14.getFont().deriveFont(tabbedPane14.getFont().getStyle() | Font.ITALIC));
                        tabbedPane14.addChangeListener(e -> {
			tabbedPane14StateChanged(e);
			tabbedPane14StateChanged(e);
			tabbedPane14StateChanged(e);
			tabbedPane14StateChanged(e);
		});

                        //======== panel19 ========
                        {

                            //---- label9 ----
                            label9.setText("Select one of the available reports");
                            label9.setHorizontalAlignment(SwingConstants.CENTER);
                            label9.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                            GroupLayout panel19Layout = new GroupLayout(panel19);
                            panel19.setLayout(panel19Layout);
                            panel19Layout.setHorizontalGroup(
                                panel19Layout.createParallelGroup()
                                    .addComponent(label9, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                            );
                            panel19Layout.setVerticalGroup(
                                panel19Layout.createParallelGroup()
                                    .addComponent(label9, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                            );
                        }
                        tabbedPane14.addTab("Reports:", panel19);

                        //======== panel18 ========
                        {

                            //---- textField2 ----
                            textField2.setBackground(UIManager.getColor("Button.background"));
                            textField2.setText("\u00a3");
                            textField2.setForeground(UIManager.getColor("Button.darcula.selectedButtonForeground"));
                            textField2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                            textField2.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- textField4 ----
                            textField4.setBackground(new Color(60, 63, 65));
                            textField4.setText("\u00a3");
                            textField4.setForeground(UIManager.getColor("Button.darcula.selectedButtonForeground"));
                            textField4.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                            textField4.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- label5 ----
                            label5.setText("Maintenance Cost");
                            label5.setHorizontalAlignment(SwingConstants.CENTER);
                            label5.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                            //---- label6 ----
                            label6.setText("Breakdown Cost");
                            label6.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                            label6.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- label7 ----
                            label7.setText("Most Expensive Vehicles");
                            label7.setHorizontalAlignment(SwingConstants.CENTER);
                            label7.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                            //---- label8 ----
                            label8.setText("Cheapest Vehicle");
                            label8.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                            label8.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- textField6 ----
                            textField6.setText("Start Date - End Date");
                            textField6.setFont(new Font("Segoe UI", Font.PLAIN, 12));

                            //---- button3 ----
                            button3.setText("<");

                            //---- button4 ----
                            button4.setText(">");

                            //---- button5 ----
                            button5.setText("Print Report");
                            button5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
                            button5.addActionListener(e -> printButtonClicked(e));

                            //---- textField5 ----
                            textField5.setBackground(new Color(60, 63, 65));
                            textField5.setText("Vehicle");
                            textField5.setForeground(UIManager.getColor("Button.darcula.selectedButtonForeground"));
                            textField5.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                            textField5.setHorizontalAlignment(SwingConstants.CENTER);

                            //---- textField11 ----
                            textField11.setBackground(new Color(60, 63, 65));
                            textField11.setText("Vehicle");
                            textField11.setForeground(UIManager.getColor("Button.darcula.selectedButtonForeground"));
                            textField11.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                            textField11.setHorizontalAlignment(SwingConstants.CENTER);

                            GroupLayout panel18Layout = new GroupLayout(panel18);
                            panel18.setLayout(panel18Layout);
                            panel18Layout.setHorizontalGroup(
                                panel18Layout.createParallelGroup()
                                    .addGroup(panel18Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panel18Layout.createParallelGroup()
                                            .addGroup(panel18Layout.createSequentialGroup()
                                                .addGroup(panel18Layout.createParallelGroup()
                                                    .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                        .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                                    .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textField11, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                                .addGap(43, 43, 43)
                                                .addGroup(panel18Layout.createParallelGroup()
                                                    .addComponent(label8)
                                                    .addComponent(label7)
                                                    .addComponent(label6)
                                                    .addComponent(label5))
                                                .addContainerGap(185, Short.MAX_VALUE))
                                            .addGroup(panel18Layout.createSequentialGroup()
                                                .addGap(0, 328, Short.MAX_VALUE)
                                                .addComponent(button3)
                                                .addGap(18, 18, 18)
                                                .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(button4)
                                                .addGap(56, 56, 56))))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel18Layout.createSequentialGroup()
                                        .addContainerGap(416, Short.MAX_VALUE)
                                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                                        .addGap(89, 89, 89))
                            );
                            panel18Layout.setVerticalGroup(
                                panel18Layout.createParallelGroup()
                                    .addGroup(panel18Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button4)
                                            .addComponent(button3))
                                        .addGap(33, 33, 33)
                                        .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label5))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label6))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label7)
                                            .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                        .addGap(7, 7, 7)
                                        .addGroup(panel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(label8)
                                            .addComponent(textField11, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))
                            );
                        }
                        tabbedPane14.addTab("Maintenance", panel18);

                        //======== panel23 ========
                        {

                            //---- textField7 ----
                            textField7.setText("Start Date - End Date");
                            textField7.setFont(new Font("Segoe UI", Font.PLAIN, 12));

                            //---- button6 ----
                            button6.setText("<");

                            //---- button7 ----
                            button7.setText(">");

                            //---- textField8 ----
                            textField8.setText("%");
                            textField8.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                            textField8.setHorizontalAlignment(SwingConstants.CENTER);
                            textField8.setBackground(UIManager.getColor("Button.background"));

                            //---- textField9 ----
                            textField9.setHorizontalAlignment(SwingConstants.CENTER);
                            textField9.setText("%");
                            textField9.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                            textField9.setBackground(UIManager.getColor("Button.background"));

                            //---- textField10 ----
                            textField10.setHorizontalAlignment(SwingConstants.CENTER);
                            textField10.setText("%");
                            textField10.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                            textField10.setBackground(UIManager.getColor("Button.background"));

                            //---- label11 ----
                            label11.setText("of buses full.");
                            label11.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                            //---- label12 ----
                            label12.setText("of trains full.");
                            label12.setHorizontalAlignment(SwingConstants.CENTER);
                            label12.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                            //---- label13 ----
                            label13.setText("of trams full.");
                            label13.setHorizontalAlignment(SwingConstants.CENTER);
                            label13.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                            //---- button8 ----
                            button8.setText("Print Report");

                            GroupLayout panel23Layout = new GroupLayout(panel23);
                            panel23.setLayout(panel23Layout);
                            panel23Layout.setHorizontalGroup(
                                panel23Layout.createParallelGroup()
                                    .addGroup(panel23Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(panel23Layout.createParallelGroup()
                                            .addComponent(textField9)
                                            .addGroup(panel23Layout.createSequentialGroup()
                                                .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(textField8, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                                    .addComponent(textField10, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel23Layout.createParallelGroup()
                                            .addComponent(label11)
                                            .addComponent(label12)
                                            .addComponent(label13))
                                        .addContainerGap(296, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panel23Layout.createSequentialGroup()
                                        .addContainerGap(331, Short.MAX_VALUE)
                                        .addComponent(button6)
                                        .addGap(18, 18, 18)
                                        .addGroup(panel23Layout.createParallelGroup()
                                            .addComponent(button8, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel23Layout.createSequentialGroup()
                                                .addComponent(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(button7)))
                                        .addGap(59, 59, 59))
                            );
                            panel23Layout.setVerticalGroup(
                                panel23Layout.createParallelGroup()
                                    .addGroup(panel23Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button6)
                                            .addComponent(button7))
                                        .addGap(38, 38, 38)
                                        .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(textField8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label11))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(textField9, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label12))
                                        .addGap(18, 18, 18)
                                        .addGroup(panel23Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(textField10, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label13))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                        .addComponent(button8, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))
                            );
                        }
                        tabbedPane14.addTab("Capacity", panel23);

                        //======== panel12 ========
                        {
                            panel12.setLayout(new GridLayout());
                        }
                        tabbedPane14.addTab("Financials", panel12);

                        //======== panel13 ========
                        {
                            panel13.setLayout(new GridLayout());
                        }
                        tabbedPane14.addTab("Incidents", panel13);

                        //======== panel14 ========
                        {
                            panel14.setLayout(new GridLayout());
                        }
                        tabbedPane14.addTab("Fare Evasion", panel14);
                    }
                    panel9.add(tabbedPane14);
                }
                tabbedPane12.addTab("Reports", panel9);

                //======== logOutPanel ========
                {

                    //---- logOutButton ----
                    logOutButton.setText("Log Out");
                    logOutButton.addActionListener(e -> logOutButtonActionPerformed(e));

                    GroupLayout logOutPanelLayout = new GroupLayout(logOutPanel);
                    logOutPanel.setLayout(logOutPanelLayout);
                    logOutPanelLayout.setHorizontalGroup(
                        logOutPanelLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, logOutPanelLayout.createSequentialGroup()
                                .addContainerGap(287, Short.MAX_VALUE)
                                .addComponent(logOutButton)
                                .addGap(276, 276, 276))
                    );
                    logOutPanelLayout.setVerticalGroup(
                        logOutPanelLayout.createParallelGroup()
                            .addGroup(logOutPanelLayout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(logOutButton)
                                .addContainerGap(220, Short.MAX_VALUE))
                    );
                }
                tabbedPane12.addTab("Log Out", logOutPanel);
            }

            GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
            mainPanel.setLayout(mainPanelLayout);
            mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup()
                    .addComponent(tabbedPane12)
            );
            mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup()
                    .addComponent(tabbedPane12)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Barry Chuckle
    private JTabbedPane tabbedPane12;
    private JPanel panel20;
    private JLabel label10;
    private JPanel panel3;
    private JTabbedPane tabbedPane13;
    private JPanel panel4;
    private JLabel label14;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JTabbedPane tabbedPane15;
    private JPanel panel15;
    private JLabel label15;
    private JPanel panel21;
    private JPanel panel22;
    private JPanel panel9;
    private JTabbedPane tabbedPane14;
    private JPanel panel19;
    private JLabel label9;
    private JPanel panel18;
    private JTextField textField2;
    private JTextField textField4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JTextField textField6;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JTextField textField5;
    private JTextField textField11;
    private JPanel panel23;
    private JTextField textField7;
    private JButton button6;
    private JButton button7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JButton button8;
    private JPanel panel12;
    private JPanel panel13;
    private JPanel panel14;
    private JPanel logOutPanel;
    private JButton logOutButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
