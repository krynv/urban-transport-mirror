import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import javax.swing.*;
import javax.swing.border.*;
import com.jgoodies.forms.layout.*;

public class SearchedFares extends JFrame {
    public SearchedFares(LocalDateTime departureDateTime, LocalDateTime arrivalDateTime) {

        RouteRegistry routeRegistry = new RouteRegistry();

        routeRegistry.getRoutes(new Location(1), new Location(2), departureDateTime, arrivalDateTime);

        button1.setText("<html>" + "<br>" +"</html>");


        initComponents();
        this.setContentPane(panel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Searched Fares");
        this.pack();
    }

    private void languageSelectActionPerformed(ActionEvent e) {
        new SelectLanguage().setVisible(true);
        this.dispose();
    }

    private void homeActionPerformed(ActionEvent e) {
        new UserBooking().setVisible(true);
        this.dispose();
    }

    private void button1ActionPerformed(ActionEvent e) {
        new ConfirmBooking().setVisible(true);
        this.dispose();
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Barry Chuckle
        panel2 = new JPanel();
        displayTimetableButton = new JButton();
        dateTimeLabel = new JLabel();
        languageSelectButton = new JButton();
        homeButton = new JButton();
        button1 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== panel2 ========
        {
            panel2.setMinimumSize(new Dimension(580, 385));

            // JFormDesigner evaluation mark
            panel2.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel2.getBorder())); panel2.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- displayTimetableButton ----
            displayTimetableButton.setText("Display Timetable");
            displayTimetableButton.setEnabled(false);

            //---- dateTimeLabel ----
            dateTimeLabel.setText("Date/Time");
            dateTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
            dateTimeLabel.setMaximumSize(new Dimension(25, 25));
            dateTimeLabel.setMinimumSize(new Dimension(25, 25));
            dateTimeLabel.setPreferredSize(new Dimension(25, 25));

            //---- languageSelectButton ----
            languageSelectButton.setText("Select Language");
            languageSelectButton.addActionListener(e -> languageSelectActionPerformed(e));

            //---- homeButton ----
            homeButton.setText("Home");
            homeButton.addActionListener(e -> homeActionPerformed(e));

            //---- button1 ----
            button1.setText("<html>\nDestination <br>\nDeparture Date/Time <br>\nReturn Date/Time <br>\nPRICE\n</html>");
            button1.setHorizontalAlignment(SwingConstants.TRAILING);
            button1.setFont(new Font(".SF NS Text", Font.PLAIN, 11));
            button1.addActionListener(e -> button1ActionPerformed(e));

            //---- button3 ----
            button3.setText("<html>\nDestination <br>\nDeparture Date/Time <br>\nReturn Date/Time <br>\nPRICE\n</html>");
            button3.setHorizontalAlignment(SwingConstants.TRAILING);
            button3.setFont(new Font(".SF NS Text", Font.PLAIN, 11));

            //---- button4 ----
            button4.setText("<html>\nDestination <br>\nDeparture Date/Time <br>\nReturn Date/Time <br>\nPRICE\n</html>");
            button4.setHorizontalAlignment(SwingConstants.TRAILING);
            button4.setFont(new Font(".SF NS Text", Font.PLAIN, 11));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(languageSelectButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(displayTimetableButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(panel2Layout.createParallelGroup()
                                    .addGroup(panel2Layout.createSequentialGroup()
                                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(button3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(dateTimeLabel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(115, Short.MAX_VALUE))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(languageSelectButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(displayTimetableButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(dateTimeLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Barry Chuckle
    private JPanel panel2;
    private JButton displayTimetableButton;
    private JLabel dateTimeLabel;
    private JButton languageSelectButton;
    private JButton homeButton;
    private JButton button1;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
