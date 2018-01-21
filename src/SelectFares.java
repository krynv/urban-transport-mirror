import java.awt.*;
import java.awt.event.*;
import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Sun Jan 21 15:33:25 GMT 2018
 */



/**
 * @author godieina fire
 */
public class SelectFares extends JFrame {

    public SelectFares() {
        initComponents();
        this.setContentPane(panel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Select Fares");
        this.pack();
    }

    private void homeActionPerformed(ActionEvent e) {
        new UserBooking().setVisible(true);
        this.dispose();
    }

    private void searchActionPerformed(ActionEvent e) {
        new SearchedFares().setVisible(true);
        this.dispose();
    }

    private void languageSelectActionPerformed(ActionEvent e) {
        new SelectLanguage().setVisible(true);
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - godieina fire
        panel2 = new JPanel();
        JPanel panel1 = new JPanel();
        home = new JButton();
        dateTime = new JLabel();
        languageSelect = new JButton();
        displayTimetable = new JButton();
        searchButton = new JButton();
        destinationNumberLabel = new JLabel();
        departureDateAndTimeLabel = new JLabel();
        returnDateAndTimeLabel = new JLabel();
        comboBox1 = new JComboBox();
        comboBox2 = new JComboBox();
        ticketTypeLabel = new JLabel();
        checkBox3 = new JCheckBox();
        checkBox4 = new JCheckBox();
        checkBox5 = new JCheckBox();

        //======== panel2 ========
        {

            // JFormDesigner evaluation mark
            panel2.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel2.getBorder())); panel2.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //======== panel1 ========
            {
                panel1.setMinimumSize(new Dimension(450, 350));

                //---- home ----
                home.setText("Home");
                home.addActionListener(e -> homeActionPerformed(e));

                //---- dateTime ----
                dateTime.setText("dateTime");
                dateTime.setHorizontalAlignment(SwingConstants.CENTER);
                dateTime.setMaximumSize(new Dimension(25, 25));
                dateTime.setMinimumSize(new Dimension(25, 25));
                dateTime.setPreferredSize(new Dimension(25, 25));

                //---- languageSelect ----
                languageSelect.setText("languageSelect");
                languageSelect.addActionListener(e -> languageSelectActionPerformed(e));

                //---- displayTimetable ----
                displayTimetable.setText("displayTimetable");
                displayTimetable.setEnabled(false);

                //---- searchButton ----
                searchButton.setText("Search");
                searchButton.addActionListener(e -> searchActionPerformed(e));

                //---- destinationNumberLabel ----
                destinationNumberLabel.setText("Destination #");

                //---- departureDateAndTimeLabel ----
                departureDateAndTimeLabel.setText("Departure Date/Time");

                //---- returnDateAndTimeLabel ----
                returnDateAndTimeLabel.setText("Return Date/Time");

                //---- ticketTypeLabel ----
                ticketTypeLabel.setText("Ticket Type");

                //---- checkBox3 ----
                checkBox3.setText("One Way");

                //---- checkBox4 ----
                checkBox4.setText("Return");

                //---- checkBox5 ----
                checkBox5.setText("Open Return");

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(dateTime, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addComponent(displayTimetable, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(checkBox5)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchButton))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addComponent(checkBox4)
                                        .addComponent(checkBox3))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(languageSelect, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(departureDateAndTimeLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(comboBox1))
                                            .addGap(63, 63, 63)
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addComponent(returnDateAndTimeLabel)
                                                .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(home, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                            .addGap(130, 130, 130)
                                            .addComponent(destinationNumberLabel))))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(114, 114, 114)
                                    .addComponent(ticketTypeLabel)))
                            .addContainerGap(50, Short.MAX_VALUE))
                );
                panel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {comboBox1, comboBox2, departureDateAndTimeLabel, returnDateAndTimeLabel});
                panel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {checkBox3, checkBox4, checkBox5});
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(home, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addComponent(destinationNumberLabel))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addComponent(departureDateAndTimeLabel)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addGap(17, 17, 17))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addComponent(languageSelect, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(returnDateAndTimeLabel)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(ticketTypeLabel)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkBox3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkBox4)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(checkBox5))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(displayTimetable, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(dateTime, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchButton))))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                panel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {comboBox2, returnDateAndTimeLabel});
                panel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {comboBox1, departureDateAndTimeLabel});
            }

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - godieina fire
    private JPanel panel2;
    private JButton home;
    private JLabel dateTime;
    private JButton languageSelect;
    private JButton displayTimetable;
    private JButton searchButton;
    private JLabel destinationNumberLabel;
    private JLabel departureDateAndTimeLabel;
    private JLabel returnDateAndTimeLabel;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JLabel ticketTypeLabel;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
