package gui;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import javax.swing.*;
import javax.swing.event.*;
import com.jgoodies.forms.layout.*;

public class PayForTripGUI extends JFrame {

    private String languageButtonPressed;

    public PayForTripGUI() {

        initComponents();

        this.setLocationRelativeTo(null);
        this.setContentPane(pnlMain);
        this.setTitle("Home");
        setAllToFalse();
        pnlHome.setVisible(true);
        this.pack();
    }

    private void btnSelectLanguageActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlSelectLanguage.setVisible(true);
        this.setTitle("Select Language");
    }

    private void btnDestination1ActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlSelectFares.setVisible(true);
        this.setTitle("Select Fares");
    }

    //TODO: class diagram says it doesn't accept parameters??
    public void loadLanguageFile(String language) {
        //load language file
        System.out.println("Loaded the " + language + " language");
    }

    private void btnHomeActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlHome.setVisible(true);
        this.setTitle("Home");
    }

    private void setAllToFalse() {
        pnlSelectLanguage.setVisible(false);
        pnlSelectFares.setVisible(false);
        pnlHome.setVisible(false);
    }

    /* ----- Select Language ----- */

    private void englishButtonActionPerformed(ActionEvent e) {
        languageButtonPressed = "English";
    }

    private void frenchButtonActionPerformed(ActionEvent e) {
        languageButtonPressed = "French";
    }

    private void germanButtonActionPerformed(ActionEvent e) {
        languageButtonPressed = "German";
    }

    private void btnLoadLanguageActionPerformed(ActionEvent e) {
        if (languageButtonPressed != null) { // user has actually chosen something
            loadLanguageFile(languageButtonPressed);
            pnlSelectLanguage.setVisible(false);
            pnlHome.setVisible(true);
            this.setTitle("Home");
        }
        else { // default to english
            languageButtonPressed = "English";
            loadLanguageFile(languageButtonPressed);
            pnlSelectLanguage.setVisible(false);
            pnlHome.setVisible(true);
            this.setTitle("Home");
        }
    }

    private void searchActionPerformed(ActionEvent e) {
        LocalDateTime departureDateTime = LocalDateTime.of(2018,2,4,12,0);
        LocalDateTime arrivalDateTime = LocalDateTime.of(2018,2,4,13,0);


    }

    private void ckbxOneWayStateChanged(ChangeEvent e) {
        if (ckbxOneWay.isSelected()) {
            dpdnReturn.setEnabled(false);
        }
        else {
            dpdnReturn.setEnabled(true);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Barry Chuckle
        pnlMain = new JPanel();
        pnlSide = new JPanel();
        btnHome = new JButton();
        btnSelectLanguage = new JButton();
        btnDisplayTimetable = new JButton();
        lblDateTime = new JLabel();
        pnlContent = new JPanel();
        pnlSelectLanguage = new JPanel();
        lblEnglish = new JLabel();
        btnEnglish = new JButton();
        lblFrench = new JLabel();
        btnFrench = new JButton();
        lblGerman = new JLabel();
        btnGerman = new JButton();
        btnLoadLanguage = new JButton();
        pnlHome = new JPanel();
        btnDestination1 = new JButton();
        btnDestination4 = new JButton();
        btnDestination5 = new JButton();
        btnDestination2 = new JButton();
        btnDestination3 = new JButton();
        btnDestination6 = new JButton();
        pnlSelectFares = new JPanel();
        btnSearch = new JButton();
        ckbxOpenReturn = new JCheckBox();
        ckbxReturn = new JCheckBox();
        ckbxOneWay = new JCheckBox();
        lblTicketType = new JLabel();
        dpdnDeparture = new JComboBox<>();
        dpdnReturn = new JComboBox<>();
        lblDepartureDateTime = new JLabel();
        lblReturnDateTime = new JLabel();
        lblDestination = new JLabel();

        //======== pnlMain ========
        {

            // JFormDesigner evaluation mark
            pnlMain.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), pnlMain.getBorder())); pnlMain.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            pnlMain.setLayout(new CardLayout());

            //======== pnlSide ========
            {

                //---- btnHome ----
                btnHome.setText("Home");
                btnHome.addActionListener(e -> btnHomeActionPerformed(e));

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

                //======== pnlContent ========
                {
                    pnlContent.setLayout(new CardLayout());

                    //======== pnlSelectLanguage ========
                    {

                        //---- lblEnglish ----
                        lblEnglish.setText("English");

                        //---- btnEnglish ----
                        btnEnglish.addActionListener(e -> englishButtonActionPerformed(e));

                        //---- lblFrench ----
                        lblFrench.setText("French");

                        //---- btnFrench ----
                        btnFrench.addActionListener(e -> frenchButtonActionPerformed(e));

                        //---- lblGerman ----
                        lblGerman.setText("German");

                        //---- btnGerman ----
                        btnGerman.addActionListener(e -> germanButtonActionPerformed(e));

                        //---- btnLoadLanguage ----
                        btnLoadLanguage.setText("Load Language");
                        btnLoadLanguage.addActionListener(e -> btnLoadLanguageActionPerformed(e));

                        GroupLayout pnlSelectLanguageLayout = new GroupLayout(pnlSelectLanguage);
                        pnlSelectLanguage.setLayout(pnlSelectLanguageLayout);
                        pnlSelectLanguageLayout.setHorizontalGroup(
                            pnlSelectLanguageLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, pnlSelectLanguageLayout.createSequentialGroup()
                                    .addContainerGap(115, Short.MAX_VALUE)
                                    .addGroup(pnlSelectLanguageLayout.createParallelGroup()
                                        .addGroup(pnlSelectLanguageLayout.createSequentialGroup()
                                            .addComponent(lblEnglish, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(btnEnglish, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlSelectLanguageLayout.createSequentialGroup()
                                            .addComponent(lblFrench, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(btnFrench, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlSelectLanguageLayout.createSequentialGroup()
                                            .addComponent(lblGerman, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6)
                                            .addComponent(btnGerman, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlSelectLanguageLayout.createSequentialGroup()
                                            .addGap(212, 212, 212)
                                            .addComponent(btnLoadLanguage)))
                                    .addGap(94, 94, 94))
                        );
                        pnlSelectLanguageLayout.setVerticalGroup(
                            pnlSelectLanguageLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, pnlSelectLanguageLayout.createSequentialGroup()
                                    .addContainerGap(138, Short.MAX_VALUE)
                                    .addGroup(pnlSelectLanguageLayout.createParallelGroup()
                                        .addComponent(lblEnglish, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEnglish, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addGroup(pnlSelectLanguageLayout.createParallelGroup()
                                        .addComponent(lblFrench, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnFrench, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addGroup(pnlSelectLanguageLayout.createParallelGroup()
                                        .addComponent(lblGerman, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnGerman, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                    .addGap(61, 61, 61)
                                    .addComponent(btnLoadLanguage)
                                    .addGap(128, 128, 128))
                        );
                    }
                    pnlContent.add(pnlSelectLanguage, "card2");

                    //======== pnlHome ========
                    {

                        //---- btnDestination1 ----
                        btnDestination1.setText("London");
                        btnDestination1.setFont(new Font(".SF NS Text", Font.PLAIN, 10));
                        btnDestination1.addActionListener(e -> btnDestination1ActionPerformed(e));

                        //---- btnDestination4 ----
                        btnDestination4.setText("Destination 4");
                        btnDestination4.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                        //---- btnDestination5 ----
                        btnDestination5.setText("Destination 5");
                        btnDestination5.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                        //---- btnDestination2 ----
                        btnDestination2.setText("Destination 2");
                        btnDestination2.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                        //---- btnDestination3 ----
                        btnDestination3.setText("Destination 3");
                        btnDestination3.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                        //---- btnDestination6 ----
                        btnDestination6.setText("Destination 6");
                        btnDestination6.setFont(new Font(".SF NS Text", Font.PLAIN, 10));

                        GroupLayout pnlHomeLayout = new GroupLayout(pnlHome);
                        pnlHome.setLayout(pnlHomeLayout);
                        pnlHomeLayout.setHorizontalGroup(
                            pnlHomeLayout.createParallelGroup()
                                .addGroup(pnlHomeLayout.createSequentialGroup()
                                    .addGap(0, 110, Short.MAX_VALUE)
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
                                    .addGap(0, 111, Short.MAX_VALUE))
                        );
                        pnlHomeLayout.setVerticalGroup(
                            pnlHomeLayout.createParallelGroup()
                                .addGroup(pnlHomeLayout.createSequentialGroup()
                                    .addGap(0, 112, Short.MAX_VALUE)
                                    .addGroup(pnlHomeLayout.createParallelGroup()
                                        .addComponent(btnDestination1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDestination2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDestination3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                    .addGap(33, 33, 33)
                                    .addGroup(pnlHomeLayout.createParallelGroup()
                                        .addComponent(btnDestination4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDestination5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDestination6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 113, Short.MAX_VALUE))
                        );
                    }
                    pnlContent.add(pnlHome, "card1");

                    //======== pnlSelectFares ========
                    {

                        //---- btnSearch ----
                        btnSearch.setText("Search");
                        btnSearch.addActionListener(e -> searchActionPerformed(e));

                        //---- ckbxOpenReturn ----
                        ckbxOpenReturn.setText("Open Return");

                        //---- ckbxReturn ----
                        ckbxReturn.setText("Return");

                        //---- ckbxOneWay ----
                        ckbxOneWay.setText("One Way");
                        ckbxOneWay.addChangeListener(e -> ckbxOneWayStateChanged(e));

                        //---- lblTicketType ----
                        lblTicketType.setText("Ticket Type");

                        //---- dpdnDeparture ----
                        dpdnDeparture.setModel(new DefaultComboBoxModel<>(new String[] {
                            "12:00"
                        }));

                        //---- dpdnReturn ----
                        dpdnReturn.setModel(new DefaultComboBoxModel<>(new String[] {
                            "13:00"
                        }));

                        //---- lblDepartureDateTime ----
                        lblDepartureDateTime.setText("Departure Date/Time");

                        //---- lblReturnDateTime ----
                        lblReturnDateTime.setText("Return Date/Time");

                        //---- lblDestination ----
                        lblDestination.setText("London");

                        GroupLayout pnlSelectFaresLayout = new GroupLayout(pnlSelectFares);
                        pnlSelectFares.setLayout(pnlSelectFaresLayout);
                        pnlSelectFaresLayout.setHorizontalGroup(
                            pnlSelectFaresLayout.createParallelGroup()
                                .addGroup(pnlSelectFaresLayout.createParallelGroup()
                                    .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(pnlSelectFaresLayout.createParallelGroup()
                                            .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                                .addGap(112, 112, 112)
                                                .addComponent(lblDestination))
                                            .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                                .addComponent(lblDepartureDateTime)
                                                .addGap(63, 63, 63)
                                                .addComponent(lblReturnDateTime, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                                .addComponent(dpdnDeparture, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(dpdnReturn, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblTicketType)
                                            .addComponent(ckbxOneWay, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ckbxReturn, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                                .addComponent(ckbxOpenReturn)
                                                .addGap(191, 191, 191)
                                                .addComponent(btnSearch)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 545, Short.MAX_VALUE)
                        );
                        pnlSelectFaresLayout.setVerticalGroup(
                            pnlSelectFaresLayout.createParallelGroup()
                                .addGroup(pnlSelectFaresLayout.createParallelGroup()
                                    .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblDestination)
                                        .addGap(28, 28, 28)
                                        .addGroup(pnlSelectFaresLayout.createParallelGroup()
                                            .addComponent(lblDepartureDateTime, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblReturnDateTime, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(pnlSelectFaresLayout.createParallelGroup()
                                            .addComponent(dpdnDeparture, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dpdnReturn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGap(17, 17, 17)
                                        .addComponent(lblTicketType)
                                        .addGap(6, 6, 6)
                                        .addComponent(ckbxOneWay)
                                        .addGap(6, 6, 6)
                                        .addComponent(ckbxReturn)
                                        .addGap(6, 6, 6)
                                        .addGroup(pnlSelectFaresLayout.createParallelGroup()
                                            .addComponent(ckbxOpenReturn)
                                            .addGroup(pnlSelectFaresLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(btnSearch)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 458, Short.MAX_VALUE)
                        );
                    }
                    pnlContent.add(pnlSelectFares, "card3");
                }

                GroupLayout pnlSideLayout = new GroupLayout(pnlSide);
                pnlSide.setLayout(pnlSideLayout);
                pnlSideLayout.setHorizontalGroup(
                    pnlSideLayout.createParallelGroup()
                        .addGroup(pnlSideLayout.createSequentialGroup()
                            .addGroup(pnlSideLayout.createParallelGroup()
                                .addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSelectLanguage, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDisplayTimetable, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDateTime, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pnlContent, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                );
                pnlSideLayout.setVerticalGroup(
                    pnlSideLayout.createParallelGroup()
                        .addGroup(pnlSideLayout.createSequentialGroup()
                            .addGroup(pnlSideLayout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, pnlSideLayout.createSequentialGroup()
                                    .addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSelectLanguage, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDisplayTimetable, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                    .addGap(143, 143, 143)
                                    .addComponent(lblDateTime, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlSideLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(pnlContent, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addContainerGap())
                );
            }
            pnlMain.add(pnlSide, "card2");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Barry Chuckle
    private JPanel pnlMain;
    private JPanel pnlSide;
    private JButton btnHome;
    private JButton btnSelectLanguage;
    private JButton btnDisplayTimetable;
    private JLabel lblDateTime;
    private JPanel pnlContent;
    private JPanel pnlSelectLanguage;
    private JLabel lblEnglish;
    private JButton btnEnglish;
    private JLabel lblFrench;
    private JButton btnFrench;
    private JLabel lblGerman;
    private JButton btnGerman;
    private JButton btnLoadLanguage;
    private JPanel pnlHome;
    private JButton btnDestination1;
    private JButton btnDestination4;
    private JButton btnDestination5;
    private JButton btnDestination2;
    private JButton btnDestination3;
    private JButton btnDestination6;
    private JPanel pnlSelectFares;
    private JButton btnSearch;
    private JCheckBox ckbxOpenReturn;
    private JCheckBox ckbxReturn;
    private JCheckBox ckbxOneWay;
    private JLabel lblTicketType;
    private JComboBox<String> dpdnDeparture;
    private JComboBox<String> dpdnReturn;
    private JLabel lblDepartureDateTime;
    private JLabel lblReturnDateTime;
    private JLabel lblDestination;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
