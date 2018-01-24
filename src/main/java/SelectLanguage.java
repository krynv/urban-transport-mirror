import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SelectLanguage extends JFrame {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - godieina fire
    private JPanel panel2;
    private JButton homeButton;
    private JLabel dateTimeLabel;
    private JButton languageSelectButton;
    private JButton displayTimetableButton;
    private JButton selectLanguage;
    private JButton englishButton;
    private JButton frenchButton;
    private JButton germanButton;
    private JLabel englishLabel;
    private JLabel frenchLabel;
    private JLabel germanLabel;
    public SelectLanguage() {
        initComponents();
        this.setContentPane(panel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Select Language");
        this.pack();
    }

    private void homeActionPerformed(ActionEvent e) {
        new UserBooking().setVisible(true);
        this.dispose();
    }

    private void button1ActionPerformed(ActionEvent e) {
        new UserBooking().setVisible(true);
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
        selectLanguage = new JButton();
        englishButton = new JButton();
        frenchButton = new JButton();
        germanButton = new JButton();
        englishLabel = new JLabel();
        frenchLabel = new JLabel();
        germanLabel = new JLabel();

        //======== panel2 ========
        {
            panel2.setMinimumSize(new Dimension(580, 385));

            // JFormDesigner evaluation mark
            panel2.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                            "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                            javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                            java.awt.Color.red), panel2.getBorder()));
            panel2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("border".equals(e.getPropertyName())) throw new RuntimeException();
                }
            });


            //---- homeButton ----
            homeButton.setText("Home");
            homeButton.addActionListener(e -> homeActionPerformed(e));

            //---- dateTimeLabel ----
            dateTimeLabel.setText("Date/Time");
            dateTimeLabel.setHorizontalAlignment(SwingConstants.CENTER);
            dateTimeLabel.setMaximumSize(new Dimension(25, 25));
            dateTimeLabel.setMinimumSize(new Dimension(25, 25));
            dateTimeLabel.setPreferredSize(new Dimension(25, 25));

            //---- languageSelectButton ----
            languageSelectButton.setText("Select Language");

            //---- displayTimetableButton ----
            displayTimetableButton.setText("Display Timetable");
            displayTimetableButton.setEnabled(false);

            //---- selectLanguage ----
            selectLanguage.setText("Load Language");
            selectLanguage.addActionListener(e -> button1ActionPerformed(e));

            //---- englishLabel ----
            englishLabel.setText("English");

            //---- frenchLabel ----
            frenchLabel.setText("French");

            //---- germanLabel ----
            germanLabel.setText("German");

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
                                                            .addGap(17, 17, 17)
                                                            .addGroup(panel2Layout.createParallelGroup()
                                                                    .addComponent(englishLabel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(frenchLabel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                                            .addGap(6, 6, 6)
                                                            .addGroup(panel2Layout.createParallelGroup()
                                                                    .addComponent(englishButton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(frenchButton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                            .addComponent(displayTimetableButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                            .addGap(17, 17, 17)
                                                            .addComponent(germanLabel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                                            .addGap(6, 6, 6)
                                                            .addComponent(germanButton, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                            .addGap(319, 319, 319)
                                                            .addComponent(selectLanguage))
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
                                                    .addComponent(languageSelectButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                            .addComponent(englishLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                            .addGap(6, 6, 6)
                                                            .addComponent(frenchLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                            .addComponent(englishButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                            .addGap(6, 6, 6)
                                                            .addComponent(frenchButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
                                            .addGap(2, 2, 2)
                                            .addGroup(panel2Layout.createParallelGroup()
                                                    .addComponent(displayTimetableButton, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(panel2Layout.createSequentialGroup()
                                                            .addGap(4, 4, 4)
                                                            .addGroup(panel2Layout.createParallelGroup()
                                                                    .addComponent(germanLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(germanButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))))
                                            .addGap(34, 34, 34)
                                            .addComponent(selectLanguage)
                                            .addGap(20, 20, 20)
                                            .addComponent(dateTimeLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(0, 385, Short.MAX_VALUE)
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
