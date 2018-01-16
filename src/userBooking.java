import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
public class userBooking extends JFrame {
    public userBooking() {
        initComponents();
        this.setContentPane(panel2);
        this.pack();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - godieina fire
        panel2 = new JPanel();
        panel1 = new JPanel();
        home = new JButton();
        dateTime = new JLabel();
        languageSelect = new JButton();
        displayTimetable = new JButton();
        destination1 = new JButton();
        destination2 = new JButton();
        destination3 = new JButton();
        destination4 = new JButton();
        destination5 = new JButton();
        destination6 = new JButton();

        //======== panel2 ========
        {
            panel2.setMinimumSize(new Dimension(500, 500));

            panel2.setLayout(new GridLayout());

            //======== panel1 ========
            {

                //---- home ----
                home.setText("Home");

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

                //---- destination1 ----
                destination1.setText("Destination 1");
                destination1.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

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

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(home, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(384, Short.MAX_VALUE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(displayTimetable, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(destination4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(destination5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(destination6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(languageSelect, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(destination1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(destination2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(destination3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(dateTime, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 48, Short.MAX_VALUE))))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(home, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(destination1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addComponent(destination2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addComponent(destination3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addComponent(languageSelect, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(destination4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(destination5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(destination6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addComponent(displayTimetable, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                            .addComponent(dateTime, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                );
            }
            panel2.add(panel1);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - godieina fire
    private JPanel panel1;
    private JPanel panel2;
    private JButton home;
    private JLabel dateTime;
    private JButton languageSelect;
    private JButton displayTimetable;
    private JButton destination1;
    private JButton destination2;
    private JButton destination3;
    private JButton destination4;
    private JButton destination5;
    private JButton destination6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
