import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
public class SelectLanguage extends JFrame {
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
        JPanel panel1 = new JPanel();
        home = new JButton();
        dateTime = new JLabel();
        languageSelect = new JButton();
        displayTimetable = new JButton();
        selectLanguage = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

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

                //---- displayTimetable ----
                displayTimetable.setText("displayTimetable");
                displayTimetable.setEnabled(false);

                //---- selectLanguage ----
                selectLanguage.setText("Load Language");
                selectLanguage.addActionListener(e -> button1ActionPerformed(e));

                //---- label1 ----
                label1.setText("English");

                //---- label2 ----
                label2.setText("French");

                //---- label3 ----
                label3.setText("German");

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(home, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addComponent(dateTime, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addComponent(displayTimetable, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addComponent(languageSelect, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                    .addGap(17, 17, 17)
                                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(label1)
                                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addComponent(button2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(button4, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))))
                                    .addGap(0, 240, Short.MAX_VALUE))))
                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addContainerGap(325, Short.MAX_VALUE)
                            .addComponent(selectLanguage)
                            .addGap(36, 36, 36))
                );
                panel1Layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {button2, label1});
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(home, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(label1)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 173, Short.MAX_VALUE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(languageSelect, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(displayTimetable, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                    .addComponent(selectLanguage)
                                    .addGap(20, 20, 20)
                                    .addComponent(dateTime, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap())
                );
                panel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {button2, label1});
            }

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
    private JButton selectLanguage;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
