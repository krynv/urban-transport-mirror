package gui;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.swing.*;
import javax.swing.event.*;

import logic.account.AccountManager;
import logic.report.MaintenanceReport;
import logic.report.Report;
import org.json.simple.parser.ParseException;

public class EmployeeGUI extends JFrame {

    private AccountManager accountManager;

    public EmployeeGUI(String username) throws IOException, ParseException {
        this.accountManager = new AccountManager();
        this.accountManager.setActiveUser(username);

        initComponents();

        this.setContentPane(mainPnl);
        this.pack();
    }

    private void printButtonClicked(ActionEvent e) {
        String name = "maintenance";

        LocalDateTime startDateTime = LocalDateTime.of(2018, 02, 04, 12, 0,0);
        LocalDateTime endDateTime = LocalDateTime.of(2018, 02, 04, 13, 0,0);

        Report report = this.accountManager.viewReport(name, startDateTime, endDateTime);
        MaintenanceReport maintenanceReport = (MaintenanceReport) report;

        System.out.println(maintenanceReport.print(7));
        lblPrinted.setVisible(true);
    }

    private void logOutButtonActionPerformed(ActionEvent e) {
        this.accountManager.logout();

        lblPrinted.setVisible(false);
        this.dispose();

        try {
            new LoginRegisterGUI().setVisible(true);
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
    }

    private void tabbedPane14StateChanged(ChangeEvent e) {
        String name = "maintenance";

        LocalDateTime startDateTime = LocalDateTime.of(2018, 02, 04, 12, 0,0);
        LocalDateTime endDateTime = LocalDateTime.of(2018, 02, 04, 13, 0,0);

        Report report = accountManager.viewReport(name, startDateTime, endDateTime);
        MaintenanceReport maintenanceReport = (MaintenanceReport) report;

        textField2.setText(Double.toString(maintenanceReport.getMaintenanceCost()));
        textField4.setText(Double.toString(maintenanceReport.getBrakedownCost()));
        textField5.setText(maintenanceReport.getMostExpensiveVehicle());
        textField11.setText(maintenanceReport.getCheapestVehicle());
    }

    private void button13ActionPerformed(ActionEvent e) {
        panel16.setVisible(false);
        panel17.setVisible(true);
    }

    private void button21ActionPerformed(ActionEvent e) {
        panel17.setVisible(false);
        panel16.setVisible(true);
    }

    private void button22ActionPerformed(ActionEvent e) {
        panel24.setVisible(false);
        panel17.setVisible(true);
    }

    private void button19ActionPerformed(ActionEvent e) {
        panel17.setVisible(false);
        panel24.setVisible(true);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Benjamin Ward
        mainPnl = new JPanel();
        JPanel tabbedPanel = new JPanel();
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
        lblPrinted = new JLabel();
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
        textField3 = new JTextField();
        label1 = new JLabel();
        button1 = new JButton();
        textField1 = new JTextField();
        button2 = new JButton();
        button9 = new JButton();
        panel13 = new JPanel();
        panel17 = new JPanel();
        label20 = new JLabel();
        label21 = new JLabel();
        textField22 = new JTextField();
        button19 = new JButton();
        button21 = new JButton();
        panel24 = new JPanel();
        label22 = new JLabel();
        label23 = new JLabel();
        textField23 = new JTextField();
        button20 = new JButton();
        button22 = new JButton();
        panel16 = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        textField12 = new JTextField();
        textField13 = new JTextField();
        textField14 = new JTextField();
        button10 = new JButton();
        button11 = new JButton();
        textField15 = new JTextField();
        button12 = new JButton();
        button13 = new JButton();
        panel14 = new JPanel();
        textField16 = new JTextField();
        label16 = new JLabel();
        textField17 = new JTextField();
        label17 = new JLabel();
        textField18 = new JTextField();
        label18 = new JLabel();
        button14 = new JButton();
        textField19 = new JTextField();
        button15 = new JButton();
        button16 = new JButton();
        logOutPanel = new JPanel();
        logOutButton = new JButton();
        panel1 = new JPanel();

        //======== mainPnl ========
        {

            // JFormDesigner evaluation mark
            mainPnl.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), mainPnl.getBorder())); mainPnl.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            mainPnl.setLayout(new CardLayout());

            //======== tabbedPanel ========
            {

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
                                .addComponent(label10, GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
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
                                        .addGap(0, 656, Short.MAX_VALUE)
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
                                        .addGap(0, 656, Short.MAX_VALUE)
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
                                        .addComponent(label9, GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                                );
                                panel19Layout.setVerticalGroup(
                                    panel19Layout.createParallelGroup()
                                        .addComponent(label9, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                                );
                            }
                            tabbedPane14.addTab("Reports:", panel19);

                            //======== panel18 ========
                            {
                                panel18.setForeground(new Color(204, 204, 204));

                                //---- textField2 ----
                                textField2.setBackground(UIManager.getColor("Button.background"));
                                textField2.setText("\u00a3");
                                textField2.setForeground(UIManager.getColor("Button.darcula.selectedButtonForeground"));
                                textField2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                                textField2.setHorizontalAlignment(SwingConstants.CENTER);

                                //---- textField4 ----
                                textField4.setBackground(UIManager.getColor("Button.background"));
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
                                textField5.setBackground(UIManager.getColor("Button.background"));
                                textField5.setText("Vehicle");
                                textField5.setForeground(UIManager.getColor("Button.darcula.selectedButtonForeground"));
                                textField5.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                                textField5.setHorizontalAlignment(SwingConstants.CENTER);

                                //---- textField11 ----
                                textField11.setBackground(UIManager.getColor("Button.background"));
                                textField11.setText("Vehicle");
                                textField11.setForeground(UIManager.getColor("Button.darcula.selectedButtonForeground"));
                                textField11.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                                textField11.setHorizontalAlignment(SwingConstants.CENTER);

                                //---- lblPrinted ----
                                lblPrinted.setText("Report Printed");
                                lblPrinted.setVisible(false);

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
                                                    .addContainerGap(200, Short.MAX_VALUE))
                                                .addGroup(panel18Layout.createSequentialGroup()
                                                    .addGap(0, 343, Short.MAX_VALUE)
                                                    .addComponent(button3)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(button4)
                                                    .addGap(56, 56, 56))))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel18Layout.createSequentialGroup()
                                            .addContainerGap(343, Short.MAX_VALUE)
                                            .addComponent(lblPrinted, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                            .addGap(88, 88, 88)
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
                                            .addGroup(panel18Layout.createParallelGroup()
                                                .addComponent(button5, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblPrinted))
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
                                            .addContainerGap(311, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, panel23Layout.createSequentialGroup()
                                            .addContainerGap(346, Short.MAX_VALUE)
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

                                //---- textField3 ----
                                textField3.setText("\u00a3");
                                textField3.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                                //---- label1 ----
                                label1.setText("Profit / Loss");
                                label1.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                                //---- button1 ----
                                button1.setText("<");

                                //---- textField1 ----
                                textField1.setText("Start Date - End Date");

                                //---- button2 ----
                                button2.setText(">");

                                //---- button9 ----
                                button9.setText("Print reports");

                                GroupLayout panel12Layout = new GroupLayout(panel12);
                                panel12.setLayout(panel12Layout);
                                panel12Layout.setHorizontalGroup(
                                    panel12Layout.createParallelGroup()
                                        .addGroup(panel12Layout.createParallelGroup()
                                            .addGroup(panel12Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(panel12Layout.createParallelGroup()
                                                    .addGroup(panel12Layout.createSequentialGroup()
                                                        .addGap(290, 290, 290)
                                                        .addComponent(button1)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(button2))
                                                    .addGroup(panel12Layout.createSequentialGroup()
                                                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(label1))
                                                    .addGroup(panel12Layout.createSequentialGroup()
                                                        .addGap(346, 346, 346)
                                                        .addComponent(button9, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(0, 656, Short.MAX_VALUE)
                                );
                                panel12Layout.setVerticalGroup(
                                    panel12Layout.createParallelGroup()
                                        .addGroup(panel12Layout.createParallelGroup()
                                            .addGroup(panel12Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(panel12Layout.createParallelGroup()
                                                    .addComponent(button1)
                                                    .addGroup(panel12Layout.createSequentialGroup()
                                                        .addGap(4, 4, 4)
                                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(button2))
                                                .addGap(35, 35, 35)
                                                .addGroup(panel12Layout.createParallelGroup()
                                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(panel12Layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(label1)))
                                                .addGap(224, 224, 224)
                                                .addComponent(button9, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(0, 432, Short.MAX_VALUE)
                                );
                            }
                            tabbedPane14.addTab("Financials", panel12);

                            //======== panel13 ========
                            {

                                //======== panel17 ========
                                {
                                    panel17.setVisible(false);

                                    //---- label20 ----
                                    label20.setText("GET SPECIFIC DRIVER ACCIDENT REPORT");
                                    label20.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                                    //---- label21 ----
                                    label21.setText("Enter Drivers Name");
                                    label21.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                                    //---- button19 ----
                                    button19.setText("SEARCH");
                                    button19.addActionListener(e -> button19ActionPerformed(e));

                                    //---- button21 ----
                                    button21.setText("BACK");
                                    button21.addActionListener(e -> button21ActionPerformed(e));

                                    GroupLayout panel17Layout = new GroupLayout(panel17);
                                    panel17.setLayout(panel17Layout);
                                    panel17Layout.setHorizontalGroup(
                                        panel17Layout.createParallelGroup()
                                            .addGroup(panel17Layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(panel17Layout.createParallelGroup()
                                                    .addGroup(GroupLayout.Alignment.TRAILING, panel17Layout.createSequentialGroup()
                                                        .addComponent(label20, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(91, 91, 91))
                                                    .addGroup(GroupLayout.Alignment.TRAILING, panel17Layout.createSequentialGroup()
                                                        .addComponent(label21, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(200, 200, 200))
                                                    .addGroup(GroupLayout.Alignment.TRAILING, panel17Layout.createSequentialGroup()
                                                        .addComponent(textField22, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(183, 183, 183))
                                                    .addGroup(GroupLayout.Alignment.TRAILING, panel17Layout.createSequentialGroup()
                                                        .addComponent(button19, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(257, 257, 257))))
                                            .addGroup(panel17Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(button21, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                    );
                                    panel17Layout.setVerticalGroup(
                                        panel17Layout.createParallelGroup()
                                            .addGroup(panel17Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(label20, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addGap(105, 105, 105)
                                                .addComponent(label21)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField22, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(button19, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(button21, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17))
                                    );
                                }

                                //======== panel24 ========
                                {
                                    panel24.setVisible(false);

                                    //---- label22 ----
                                    label22.setText("Driver Name - Accident History");
                                    label22.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                                    //---- label23 ----
                                    label23.setText("Drivers Accident History");
                                    label23.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                                    //---- button20 ----
                                    button20.setText("PRINT REPORT");

                                    //---- button22 ----
                                    button22.setText("BACK");
                                    button22.addActionListener(e -> button22ActionPerformed(e));

                                    GroupLayout panel24Layout = new GroupLayout(panel24);
                                    panel24.setLayout(panel24Layout);
                                    panel24Layout.setHorizontalGroup(
                                        panel24Layout.createParallelGroup()
                                            .addGroup(panel24Layout.createSequentialGroup()
                                                .addGroup(panel24Layout.createParallelGroup()
                                                    .addGroup(panel24Layout.createSequentialGroup()
                                                        .addGap(169, 169, 169)
                                                        .addComponent(label22, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel24Layout.createSequentialGroup()
                                                        .addGap(32, 32, 32)
                                                        .addGroup(panel24Layout.createParallelGroup()
                                                            .addComponent(textField23, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(label23, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(panel24Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(button22, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                                .addGap(101, 101, 101)
                                                .addComponent(button20, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    );
                                    panel24Layout.setVerticalGroup(
                                        panel24Layout.createParallelGroup()
                                            .addGroup(panel24Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(label22, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                .addGap(105, 105, 105)
                                                .addComponent(label23)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField23, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(button20, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel24Layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(button22, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                    );
                                }

                                //======== panel16 ========
                                {

                                    //---- label2 ----
                                    label2.setText("Unsociable Reports");
                                    label2.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                                    //---- label3 ----
                                    label3.setText("Incident Reports");
                                    label3.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                                    //---- label4 ----
                                    label4.setText("Drivers Accident Reports");
                                    label4.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                                    //---- button10 ----
                                    button10.setText("<");

                                    //---- button11 ----
                                    button11.setText(">");

                                    //---- textField15 ----
                                    textField15.setText("Start Date - End Date");

                                    //---- button12 ----
                                    button12.setText("Print Reports");

                                    //---- button13 ----
                                    button13.setText("Driver Search");
                                    button13.addActionListener(e -> button13ActionPerformed(e));

                                    GroupLayout panel16Layout = new GroupLayout(panel16);
                                    panel16.setLayout(panel16Layout);
                                    panel16Layout.setHorizontalGroup(
                                        panel16Layout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel16Layout.createSequentialGroup()
                                                .addGroup(panel16Layout.createParallelGroup()
                                                    .addGroup(panel16Layout.createSequentialGroup()
                                                        .addGap(24, 24, 24)
                                                        .addGroup(panel16Layout.createParallelGroup()
                                                            .addComponent(textField12)
                                                            .addComponent(textField13)
                                                            .addComponent(label4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addGroup(panel16Layout.createSequentialGroup()
                                                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                            .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(76, 76, 76))
                                                    .addGroup(GroupLayout.Alignment.TRAILING, panel16Layout.createSequentialGroup()
                                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(button10)
                                                        .addGap(18, 18, 18)))
                                                .addComponent(textField15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(button11)
                                                .addGap(84, 84, 84))
                                            .addGroup(panel16Layout.createSequentialGroup()
                                                .addGroup(panel16Layout.createParallelGroup()
                                                    .addGroup(panel16Layout.createSequentialGroup()
                                                        .addGap(24, 24, 24)
                                                        .addComponent(textField14))
                                                    .addGroup(panel16Layout.createSequentialGroup()
                                                        .addGap(101, 101, 101)
                                                        .addComponent(button13, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(99, 99, 99)
                                                .addComponent(button12, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                                .addGap(107, 107, 107))
                                    );
                                    panel16Layout.setVerticalGroup(
                                        panel16Layout.createParallelGroup()
                                            .addGroup(panel16Layout.createSequentialGroup()
                                                .addGroup(panel16Layout.createParallelGroup()
                                                    .addGroup(panel16Layout.createSequentialGroup()
                                                        .addGap(72, 72, 72)
                                                        .addComponent(label2)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(textField12, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(14, 14, 14)
                                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel16Layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addGroup(panel16Layout.createParallelGroup()
                                                            .addGroup(panel16Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(textField15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(button10))
                                                            .addComponent(button11))))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textField13, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(label4)
                                                .addGap(18, 18, 18)
                                                .addComponent(textField14, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panel16Layout.createParallelGroup()
                                                    .addComponent(button13)
                                                    .addComponent(button12, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(36, Short.MAX_VALUE))
                                    );
                                }

                                GroupLayout panel13Layout = new GroupLayout(panel13);
                                panel13.setLayout(panel13Layout);
                                panel13Layout.setHorizontalGroup(
                                    panel13Layout.createParallelGroup()
                                        .addGroup(panel13Layout.createParallelGroup()
                                            .addGroup(panel13Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(panel16, GroupLayout.PREFERRED_SIZE, 641, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGroup(panel13Layout.createParallelGroup()
                                            .addComponent(panel24, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                                        .addGroup(panel13Layout.createParallelGroup()
                                            .addComponent(panel17, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                                        .addGap(0, 656, Short.MAX_VALUE)
                                );
                                panel13Layout.setVerticalGroup(
                                    panel13Layout.createParallelGroup()
                                        .addGroup(panel13Layout.createParallelGroup()
                                            .addGroup(panel13Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(panel16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGroup(panel13Layout.createParallelGroup()
                                            .addComponent(panel24, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                                        .addGroup(panel13Layout.createParallelGroup()
                                            .addComponent(panel17, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                                        .addGap(0, 439, Short.MAX_VALUE)
                                );
                            }
                            tabbedPane14.addTab("Incidents", panel13);

                            //======== panel14 ========
                            {

                                //---- textField16 ----
                                textField16.setText("#");
                                textField16.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                                textField16.setHorizontalAlignment(SwingConstants.CENTER);

                                //---- label16 ----
                                label16.setText("Number of evaders caught");
                                label16.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                                //---- textField17 ----
                                textField17.setText("\u00a3");
                                textField17.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                                textField17.setHorizontalAlignment(SwingConstants.CENTER);

                                //---- label17 ----
                                label17.setText("Revenue Recovered");
                                label17.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                                //---- textField18 ----
                                textField18.setText("\u00a3");
                                textField18.setFont(new Font("Segoe UI", Font.PLAIN, 22));
                                textField18.setHorizontalAlignment(SwingConstants.CENTER);

                                //---- label18 ----
                                label18.setText("Revenue Lost");
                                label18.setFont(new Font("Segoe UI", Font.PLAIN, 22));

                                //---- button14 ----
                                button14.setText("<");

                                //---- textField19 ----
                                textField19.setText("Start Date - End Date");

                                //---- button15 ----
                                button15.setText(">");

                                //---- button16 ----
                                button16.setText("Print Reports");

                                GroupLayout panel14Layout = new GroupLayout(panel14);
                                panel14.setLayout(panel14Layout);
                                panel14Layout.setHorizontalGroup(
                                    panel14Layout.createParallelGroup()
                                        .addGroup(panel14Layout.createParallelGroup()
                                            .addGroup(panel14Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(panel14Layout.createParallelGroup()
                                                    .addGroup(panel14Layout.createSequentialGroup()
                                                        .addGap(266, 266, 266)
                                                        .addComponent(button14)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(textField19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(button15))
                                                    .addGroup(panel14Layout.createSequentialGroup()
                                                        .addComponent(textField16, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(label16, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel14Layout.createSequentialGroup()
                                                        .addComponent(textField17, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(label17, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel14Layout.createSequentialGroup()
                                                        .addComponent(textField18, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(label18, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel14Layout.createSequentialGroup()
                                                        .addGap(396, 396, 396)
                                                        .addComponent(button16, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(0, 656, Short.MAX_VALUE)
                                );
                                panel14Layout.setVerticalGroup(
                                    panel14Layout.createParallelGroup()
                                        .addGroup(panel14Layout.createParallelGroup()
                                            .addGroup(panel14Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(panel14Layout.createParallelGroup()
                                                    .addComponent(button14)
                                                    .addGroup(panel14Layout.createSequentialGroup()
                                                        .addGap(4, 4, 4)
                                                        .addComponent(textField19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(button15))
                                                .addGap(42, 42, 42)
                                                .addGroup(panel14Layout.createParallelGroup()
                                                    .addComponent(textField16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label16, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28)
                                                .addGroup(panel14Layout.createParallelGroup()
                                                    .addComponent(textField17, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(panel14Layout.createSequentialGroup()
                                                        .addGap(7, 7, 7)
                                                        .addComponent(label17)))
                                                .addGap(26, 26, 26)
                                                .addGroup(panel14Layout.createParallelGroup()
                                                    .addComponent(textField18, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(panel14Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(label18)))
                                                .addGap(91, 91, 91)
                                                .addComponent(button16, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(0, 432, Short.MAX_VALUE)
                                );
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
                                    .addContainerGap(302, Short.MAX_VALUE)
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

                GroupLayout tabbedPanelLayout = new GroupLayout(tabbedPanel);
                tabbedPanel.setLayout(tabbedPanelLayout);
                tabbedPanelLayout.setHorizontalGroup(
                    tabbedPanelLayout.createParallelGroup()
                        .addComponent(tabbedPane12)
                );
                tabbedPanelLayout.setVerticalGroup(
                    tabbedPanelLayout.createParallelGroup()
                        .addComponent(tabbedPane12, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                );
            }
            mainPnl.add(tabbedPanel, "card1");

            //======== panel1 ========
            {

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGap(0, 660, Short.MAX_VALUE)
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGap(0, 480, Short.MAX_VALUE)
                );
            }
            mainPnl.add(panel1, "card2");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Benjamin Ward
    private JPanel mainPnl;
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
    private JLabel lblPrinted;
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
    private JTextField textField3;
    private JLabel label1;
    private JButton button1;
    private JTextField textField1;
    private JButton button2;
    private JButton button9;
    private JPanel panel13;
    private JPanel panel17;
    private JLabel label20;
    private JLabel label21;
    private JTextField textField22;
    private JButton button19;
    private JButton button21;
    private JPanel panel24;
    private JLabel label22;
    private JLabel label23;
    private JTextField textField23;
    private JButton button20;
    private JButton button22;
    private JPanel panel16;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JButton button10;
    private JButton button11;
    private JTextField textField15;
    private JButton button12;
    private JButton button13;
    private JPanel panel14;
    private JTextField textField16;
    private JLabel label16;
    private JTextField textField17;
    private JLabel label17;
    private JTextField textField18;
    private JLabel label18;
    private JButton button14;
    private JTextField textField19;
    private JButton button15;
    private JButton button16;
    private JPanel logOutPanel;
    private JButton logOutButton;
    private JPanel panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
