import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
public class UserBooking extends JFrame {

    private String language;
    //private ListOfRoutes routes;
    //private ListOfFares fares;
    private String couponID;
    private double credits;

    private RouteRegistry routeRegistry;


    public UserBooking() {
        initComponents();
        this.setContentPane(panel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Home");
        this.pack();
    }

    //TODO: added int to cost
    private void reCalcCost(double credits, int cost) {
        // do something
    }

    private void destination1ActionPerformed(ActionEvent e) {
        new SelectFares().setVisible(true);
        this.dispose();
    }

    //TODO: class diagram says it doesn't accept parameters??
    public void loadLanguageFile(String language) {
        //load language file
        System.out.println("Loaded the " + language + " language");
    }

    public void selectLanguage(ActionEvent e) {
        new SelectLanguage().setVisible(true);
        this.dispose();
    }





    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - godieina fire
        panel2 = new JPanel();
        homeButton = new JButton();
        dateTimeLabel = new JLabel();
        languageSelectButton = new JButton();
        displayTimetableButton = new JButton();
        destination1 = new JButton();
        destination2 = new JButton();
        destination3 = new JButton();
        destination4 = new JButton();
        destination5 = new JButton();
        destination6 = new JButton();

        //======== panel2 ========
        {
            panel2.setMinimumSize(new Dimension(580, 385));
            panel2.setPreferredSize(new Dimension(580, 385));

            // JFormDesigner evaluation mark
            panel2.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel2.getBorder())); panel2.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- homeButton ----
            homeButton.setText("Home");

            //---- dateTimeLabel ----
            dateTimeLabel.setText("Date/Time");
            dateTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
            dateTimeLabel.setMaximumSize(new Dimension(25, 25));
            dateTimeLabel.setMinimumSize(new Dimension(25, 25));
            dateTimeLabel.setPreferredSize(new Dimension(25, 25));

            //---- languageSelectButton ----
            languageSelectButton.setText("Select Language");
            languageSelectButton.addActionListener(e -> {
			selectLanguage(e);
		});

            //---- displayTimetableButton ----
            displayTimetableButton.setText("Display Timetable");
            displayTimetableButton.setEnabled(false);

            //---- destination1 ----
            destination1.setText("Destination 1");
            destination1.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
            destination1.addActionListener(e -> destination1ActionPerformed(e));

            //---- destination2 ----
            destination2.setText("Destination 2");
            destination2.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

            //---- destination3 ----
            destination3.setText("Destination 3");
            destination3.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

            //---- destination4 ----
            destination4.setText("Destination 4");
            destination4.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

            //---- destination5 ----
            destination5.setText("Destination 5");
            destination5.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

            //---- destination6 ----
            destination6.setText("Destination 6");
            destination6.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(languageSelectButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(destination1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(destination2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(destination3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addComponent(displayTimetableButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(destination4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(destination5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(destination6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addComponent(dateTimeLabel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(0, 580, Short.MAX_VALUE)
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(languageSelectButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addComponent(destination1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addComponent(destination2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addComponent(destination3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(displayTimetableButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addComponent(destination4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addComponent(destination5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addComponent(destination6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addComponent(dateTimeLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
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
    private JLabel dateTimeLabel;
    private JButton languageSelectButton;
    private JButton displayTimetableButton;
    private JButton destination1;
    private JButton destination2;
    private JButton destination3;
    private JButton destination4;
    private JButton destination5;
    private JButton destination6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}
