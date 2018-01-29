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
        homeButton = new JButton();
        dateTime = new JLabel();
        languageSelectButton = new JButton();
        displayTimetableButton = new JButton();
        searchButton = new JButton();
        destinationNumberLabel = new JLabel();
        departureDateAndTimeLabel = new JLabel();
        returnDateAndTimeLabel = new JLabel();
        departureDropdownMenu = new JComboBox<>();
        returnDropdownMenu = new JComboBox();
        ticketTypeLabel = new JLabel();
        oneWayCheckBox = new JCheckBox();
        returnCheckBox = new JCheckBox();
        openReturnCheckBox = new JCheckBox();

        //======== panel2 ========
        {
            panel2.setMinimumSize(new Dimension(580, 385));

            // JFormDesigner evaluation mark
            panel2.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel2.getBorder())); panel2.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- homeButton ----
            homeButton.setText("Home");
            homeButton.addActionListener(e -> homeActionPerformed(e));

            //---- dateTime ----
            dateTime.setText("Date/Time");
            dateTime.setHorizontalAlignment(SwingConstants.CENTER);
            dateTime.setMaximumSize(new Dimension(25, 25));
            dateTime.setMinimumSize(new Dimension(25, 25));
            dateTime.setPreferredSize(new Dimension(25, 25));

            //---- languageSelectButton ----
            languageSelectButton.setText("Select Language");
            languageSelectButton.addActionListener(e -> languageSelectActionPerformed(e));

            //---- displayTimetableButton ----
            displayTimetableButton.setText("displayTimetable");
            displayTimetableButton.setEnabled(false);

            //---- searchButton ----
            searchButton.setText("Search");
            searchButton.addActionListener(e -> searchActionPerformed(e));

            //---- destinationNumberLabel ----
            destinationNumberLabel.setText("Destination #");

            //---- departureDateAndTimeLabel ----
            departureDateAndTimeLabel.setText("Departure Date/Time");

            //---- returnDateAndTimeLabel ----
            returnDateAndTimeLabel.setText("Return Date/Time");

            //---- departureDropdownMenu ----
            departureDropdownMenu.setModel(new DefaultComboBoxModel<>(new String[] {
                "test1",
                "test2",
                "test3"
            }));

            //---- ticketTypeLabel ----
            ticketTypeLabel.setText("Ticket Type");

            //---- oneWayCheckBox ----
            oneWayCheckBox.setText("One Way");

            //---- returnCheckBox ----
            returnCheckBox.setText("Return");

            //---- openReturnCheckBox ----
            openReturnCheckBox.setText("Open Return");

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addGap(130, 130, 130)
                                    .addComponent(destinationNumberLabel))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(languageSelectButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(departureDateAndTimeLabel)
                                        .addComponent(departureDropdownMenu, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
                                    .addGap(63, 63, 63)
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(returnDateAndTimeLabel, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(returnDropdownMenu, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(displayTimetableButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dateTime, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel2Layout.createParallelGroup()
                                        .addComponent(ticketTypeLabel)
                                        .addComponent(oneWayCheckBox, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(returnCheckBox, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(openReturnCheckBox))
                                    .addGap(191, 191, 191)
                                    .addComponent(searchButton)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(0, 580, Short.MAX_VALUE)
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(destinationNumberLabel)))
                            .addGap(6, 6, 6)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(languageSelectButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(departureDateAndTimeLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(departureDropdownMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(returnDateAndTimeLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(returnDropdownMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGap(15, 15, 15)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(displayTimetableButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(dateTime, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(ticketTypeLabel)
                                    .addGap(6, 6, 6)
                                    .addComponent(oneWayCheckBox)
                                    .addGap(6, 6, 6)
                                    .addComponent(returnCheckBox)
                                    .addGap(6, 6, 6)
                                    .addComponent(openReturnCheckBox))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addComponent(searchButton)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(0, 385, Short.MAX_VALUE)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - godieina fire
    private JPanel panel2;
    private JButton homeButton;
    private JLabel dateTime;
    private JButton languageSelectButton;
    private JButton displayTimetableButton;
    private JButton searchButton;
    private JLabel destinationNumberLabel;
    private JLabel departureDateAndTimeLabel;
    private JLabel returnDateAndTimeLabel;
    private JComboBox<String> departureDropdownMenu;
    private JComboBox returnDropdownMenu;
    private JLabel ticketTypeLabel;
    private JCheckBox oneWayCheckBox;
    private JCheckBox returnCheckBox;
    private JCheckBox openReturnCheckBox;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
