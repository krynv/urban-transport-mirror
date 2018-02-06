package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jgoodies.forms.layout.*;

public class PayForTripGUI extends JFrame {
    public PayForTripGUI() {

        initComponents();
        initComponents();

        this.setLocationRelativeTo(null);
        this.setContentPane(pnlMain);
        this.setTitle("Home");
        this.pack();
    }

    private void btnSelectLanguageActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void btnDestination1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    //TODO: class diagram says it doesn't accept parameters??
    public void loadLanguageFile(String language) {
        //load language file
        System.out.println("Loaded the " + language + " language");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Barry Chuckle
        pnlMain = new JPanel();
        pnlHome = new JPanel();
        btnHome = new JButton();
        btnSelectLanguage = new JButton();
        btnDisplayTimetable = new JButton();
        lblDateTime = new JLabel();
        btnDestination4 = new JButton();
        btnDestination1 = new JButton();
        btnDestination5 = new JButton();
        btnDestination2 = new JButton();
        btnDestination6 = new JButton();
        btnDestination3 = new JButton();

        //======== pnlMain ========
        {

            // JFormDesigner evaluation mark
            pnlMain.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), pnlMain.getBorder())); pnlMain.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            pnlMain.setLayout(new CardLayout());

            //======== pnlHome ========
            {

                //---- btnHome ----
                btnHome.setText("Home");

                //---- btnSelectLanguage ----
                btnSelectLanguage.setText("Select Language");
                btnSelectLanguage.addActionListener(e -> btnSelectLanguageActionPerformed(e));

                //---- btnDisplayTimetable ----
                btnDisplayTimetable.setText("Display Timetable");
                btnDisplayTimetable.setEnabled(false);

                //---- lblDateTime ----
                lblDateTime.setText("Date/Time");
                lblDateTime.setHorizontalAlignment(SwingConstants.CENTER);
                lblDateTime.setMaximumSize(new Dimension(25, 25));
                lblDateTime.setMinimumSize(new Dimension(25, 25));
                lblDateTime.setPreferredSize(new Dimension(25, 25));

                //---- btnDestination4 ----
                btnDestination4.setText("Destination 4");
                btnDestination4.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                //---- btnDestination1 ----
                btnDestination1.setText("London");
                btnDestination1.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                btnDestination1.addActionListener(e -> btnDestination1ActionPerformed(e));

                //---- btnDestination5 ----
                btnDestination5.setText("Destination 5");
                btnDestination5.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                //---- btnDestination2 ----
                btnDestination2.setText("Destination 2");
                btnDestination2.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                //---- btnDestination6 ----
                btnDestination6.setText("Destination 6");
                btnDestination6.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                //---- btnDestination3 ----
                btnDestination3.setText("Destination 3");
                btnDestination3.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                GroupLayout pnlHomeLayout = new GroupLayout(pnlHome);
                pnlHome.setLayout(pnlHomeLayout);
                pnlHomeLayout.setHorizontalGroup(
                    pnlHomeLayout.createParallelGroup()
                        .addGroup(pnlHomeLayout.createSequentialGroup()
                            .addGroup(pnlHomeLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnHome, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(btnDisplayTimetable, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(btnSelectLanguage, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(lblDateTime, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                            .addGap(106, 106, 106)
                            .addGroup(pnlHomeLayout.createParallelGroup()
                                .addGroup(pnlHomeLayout.createSequentialGroup()
                                    .addComponent(btnDestination1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(btnDestination2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(btnDestination3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlHomeLayout.createSequentialGroup()
                                    .addComponent(btnDestination4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(btnDestination5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(btnDestination6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(127, Short.MAX_VALUE))
                );
                pnlHomeLayout.setVerticalGroup(
                    pnlHomeLayout.createParallelGroup()
                        .addGroup(pnlHomeLayout.createSequentialGroup()
                            .addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlHomeLayout.createParallelGroup()
                                .addGroup(pnlHomeLayout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                    .addComponent(btnSelectLanguage, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(btnDisplayTimetable, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addGap(141, 141, 141))
                                .addGroup(pnlHomeLayout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addGroup(pnlHomeLayout.createParallelGroup()
                                        .addComponent(btnDestination1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDestination2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDestination3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                    .addGap(33, 33, 33)
                                    .addGroup(pnlHomeLayout.createParallelGroup()
                                        .addComponent(btnDestination4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDestination5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDestination6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)))
                            .addComponent(lblDateTime, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                );
            }
            pnlMain.add(pnlHome, "card1");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Barry Chuckle
    private JPanel pnlMain;
    private JPanel pnlHome;
    private JButton btnHome;
    private JButton btnSelectLanguage;
    private JButton btnDisplayTimetable;
    private JLabel lblDateTime;
    private JButton btnDestination4;
    private JButton btnDestination1;
    private JButton btnDestination5;
    private JButton btnDestination2;
    private JButton btnDestination6;
    private JButton btnDestination3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
