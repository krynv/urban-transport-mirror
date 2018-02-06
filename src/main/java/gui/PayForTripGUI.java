package gui;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import javax.swing.*;
import javax.swing.event.*;
import logic.*;

public class PayForTripGUI extends JFrame {

    private String languageButtonPressed;

    public PayForTripGUI() {

        initComponents();

        this.setLocationRelativeTo(null);
        this.setContentPane(pnlMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // TODO: revert back to initial 'GUI'
        this.setTitle("Home");
        setAllToFalse();
        pnlHome.setVisible(true);
        this.pack();
    }

    /* ----- Main Menu ----- */

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

    private void setAllToFalse() { // contains all of the panels set to false
        pnlConfirmBooking.setVisible(false);
        pnlSearchedFares.setVisible(false);
        pnlSelectFares.setVisible(false);
        pnlSelectLanguage.setVisible(false);
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
        if (languageButtonPressed == null) { // default to english
            languageButtonPressed = "English";
        }

        loadLanguageFile(languageButtonPressed);
        pnlSelectLanguage.setVisible(false);
        pnlHome.setVisible(true);
        this.setTitle("Home");
    }

    /* ----- Select Fares ----- */

    private void searchActionPerformed(ActionEvent e) {
        LocalDateTime departureDateTime = LocalDateTime.of(2018,2,4,12,0);
        LocalDateTime arrivalDateTime = LocalDateTime.of(2018,2,4,13,0);

        RouteRegistry routeRegistry = new RouteRegistry();
        routeRegistry.getRoutes(new Location(1), new Location(2), departureDateTime, arrivalDateTime);

        FaresStructures faresStructures = new FaresStructures();
        faresStructures.getRouteCost(routeRegistry, departureDateTime, arrivalDateTime);

        setAllToFalse();
        pnlSearchedFares.setVisible(true);
        this.setTitle("Searched Fares");
    }

    private void ckbxOneWayStateChanged(ChangeEvent e) {
        if (ckbxOneWay.isSelected()) {
            dpdnReturn.setEnabled(false);
        }
        else {
            dpdnReturn.setEnabled(true);
        }
    }

    /* ----- Searched Fares ----- */

    private void btnFare1ActionPerformed(ActionEvent e) {
        setAllToFalse();
        pnlSearchedFares.setVisible(true);
        this.setTitle("Searched Fares");
    }

    /* ----- Confirm Booking ----- */

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void couponTextFieldKeyTyped(KeyEvent e) {
        // TODO add your code here
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
        pnlSearchedFares = new JPanel();
        btnFare3 = new JButton();
        btnFare1 = new JButton();
        btnFare2 = new JButton();
        pnlConfirmBooking = new JPanel();
        advanceButton = new JButton();
        couponTextField = new JTextField();
        couponCodeLabel = new JLabel();
        cardCheckBox = new JCheckBox();
        cashCheckBox = new JCheckBox();
        paymentMethodLabel = new JLabel();
        ticketTypeLabel = new JLabel();
        priceLabel = new JLabel();
        ticketInformationLabel = new JLabel();
        couponVerificationLabel = new JLabel();
        viaLocationsLabel = new JLabel();
        departureDateAndTimeLabel = new JLabel();
        returnDateAndTimeLabel = new JLabel();
        destinationLabel = new JLabel();
        stationLabel = new JLabel();

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

                    //======== pnlSearchedFares ========
                    {

                        //---- btnFare3 ----
                        btnFare3.setText("<html>\nDestination <br>\nDeparture Date/Time <br>\nReturn Date/Time <br>\nPRICE\n</html>");
                        btnFare3.setHorizontalAlignment(SwingConstants.TRAILING);
                        btnFare3.setFont(new Font(".SF NS Text", Font.PLAIN, 11));

                        //---- btnFare1 ----
                        btnFare1.setText("<html>\nDestination <br>\nDeparture Date/Time <br>\nReturn Date/Time <br>\nPRICE\n</html>");
                        btnFare1.setHorizontalAlignment(SwingConstants.TRAILING);
                        btnFare1.setFont(new Font(".SF NS Text", Font.PLAIN, 11));
                        btnFare1.addActionListener(e -> btnFare1ActionPerformed(e));

                        //---- btnFare2 ----
                        btnFare2.setText("<html>\nDestination <br>\nDeparture Date/Time <br>\nReturn Date/Time <br>\nPRICE\n</html>");
                        btnFare2.setHorizontalAlignment(SwingConstants.TRAILING);
                        btnFare2.setFont(new Font(".SF NS Text", Font.PLAIN, 11));

                        GroupLayout pnlSearchedFaresLayout = new GroupLayout(pnlSearchedFares);
                        pnlSearchedFares.setLayout(pnlSearchedFaresLayout);
                        pnlSearchedFaresLayout.setHorizontalGroup(
                            pnlSearchedFaresLayout.createParallelGroup()
                                .addGroup(pnlSearchedFaresLayout.createSequentialGroup()
                                    .addGap(116, 116, 116)
                                    .addGroup(pnlSearchedFaresLayout.createParallelGroup()
                                        .addGroup(pnlSearchedFaresLayout.createSequentialGroup()
                                            .addComponent(btnFare1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(btnFare2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnFare3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(123, Short.MAX_VALUE))
                        );
                        pnlSearchedFaresLayout.setVerticalGroup(
                            pnlSearchedFaresLayout.createParallelGroup()
                                .addGroup(pnlSearchedFaresLayout.createSequentialGroup()
                                    .addGap(141, 141, 141)
                                    .addGroup(pnlSearchedFaresLayout.createParallelGroup()
                                        .addComponent(btnFare1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnFare2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addComponent(btnFare3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(167, Short.MAX_VALUE))
                        );
                    }
                    pnlContent.add(pnlSearchedFares, "card4");

                    //======== pnlConfirmBooking ========
                    {

                        //---- advanceButton ----
                        advanceButton.setText("Advance");
                        advanceButton.addActionListener(e -> button1ActionPerformed(e));

                        //---- couponTextField ----
                        couponTextField.addKeyListener(new KeyAdapter() {
                            @Override
                            public void keyTyped(KeyEvent e) {
                                couponTextFieldKeyTyped(e);
                            }
                        });

                        //---- couponCodeLabel ----
                        couponCodeLabel.setText("Coupon Code");
                        couponCodeLabel.setLabelFor(couponTextField);

                        //---- cardCheckBox ----
                        cardCheckBox.setText("CARD");

                        //---- cashCheckBox ----
                        cashCheckBox.setText("CASH");

                        //---- paymentMethodLabel ----
                        paymentMethodLabel.setText("Payment Method");

                        //---- ticketTypeLabel ----
                        ticketTypeLabel.setText("Ticket Type");

                        //---- priceLabel ----
                        priceLabel.setText("Price");

                        //---- ticketInformationLabel ----
                        ticketInformationLabel.setText("Ticket Information");

                        //---- couponVerificationLabel ----
                        couponVerificationLabel.setToolTipText("Coupon Validity Check");
                        couponVerificationLabel.setHorizontalAlignment(SwingConstants.CENTER);

                        //---- viaLocationsLabel ----
                        viaLocationsLabel.setText("Via Locations");

                        //---- departureDateAndTimeLabel ----
                        departureDateAndTimeLabel.setText("Departure Date/Time");

                        //---- returnDateAndTimeLabel ----
                        returnDateAndTimeLabel.setText("Return Date/Time");

                        //---- destinationLabel ----
                        destinationLabel.setText("Destination");

                        //---- stationLabel ----
                        stationLabel.setText("Station");

                        GroupLayout pnlConfirmBookingLayout = new GroupLayout(pnlConfirmBooking);
                        pnlConfirmBooking.setLayout(pnlConfirmBookingLayout);
                        pnlConfirmBookingLayout.setHorizontalGroup(
                            pnlConfirmBookingLayout.createParallelGroup()
                                .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                    .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(160, 160, 160)
                                                .addComponent(stationLabel)
                                                .addGap(6, 6, 6)
                                                .addComponent(destinationLabel))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(departureDateAndTimeLabel, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(returnDateAndTimeLabel))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(179, 179, 179)
                                                .addComponent(viaLocationsLabel))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(153, 153, 153)
                                                .addComponent(couponVerificationLabel, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(ticketInformationLabel)
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(ticketTypeLabel)
                                                .addGap(60, 60, 60)
                                                .addComponent(priceLabel))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(paymentMethodLabel, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(cashCheckBox))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(cardCheckBox))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(couponCodeLabel))
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(couponTextField, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                .addGap(256, 256, 256)
                                                .addComponent(advanceButton)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 545, Short.MAX_VALUE)
                        );
                        pnlConfirmBookingLayout.setVerticalGroup(
                            pnlConfirmBookingLayout.createParallelGroup()
                                .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                    .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                            .addComponent(stationLabel)
                                            .addComponent(destinationLabel))
                                        .addGap(6, 6, 6)
                                        .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                            .addComponent(departureDateAndTimeLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(returnDateAndTimeLabel)))
                                        .addGap(6, 6, 6)
                                        .addComponent(viaLocationsLabel)
                                        .addGap(6, 6, 6)
                                        .addComponent(couponVerificationLabel, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(ticketInformationLabel)
                                        .addGap(12, 12, 12)
                                        .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                            .addComponent(ticketTypeLabel)
                                            .addComponent(priceLabel))
                                        .addGap(6, 6, 6)
                                        .addComponent(paymentMethodLabel)
                                        .addGap(6, 6, 6)
                                        .addComponent(cashCheckBox)
                                        .addGap(6, 6, 6)
                                        .addComponent(cardCheckBox)
                                        .addGap(6, 6, 6)
                                        .addComponent(couponCodeLabel)
                                        .addGap(6, 6, 6)
                                        .addGroup(pnlConfirmBookingLayout.createParallelGroup()
                                            .addGroup(pnlConfirmBookingLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(couponTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addComponent(advanceButton))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(0, 458, Short.MAX_VALUE)
                        );
                    }
                    pnlContent.add(pnlConfirmBooking, "card5");
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
    private JPanel pnlSearchedFares;
    private JButton btnFare3;
    private JButton btnFare1;
    private JButton btnFare2;
    private JPanel pnlConfirmBooking;
    private JButton advanceButton;
    private JTextField couponTextField;
    private JLabel couponCodeLabel;
    private JCheckBox cardCheckBox;
    private JCheckBox cashCheckBox;
    private JLabel paymentMethodLabel;
    private JLabel ticketTypeLabel;
    private JLabel priceLabel;
    private JLabel ticketInformationLabel;
    private JLabel couponVerificationLabel;
    private JLabel viaLocationsLabel;
    private JLabel departureDateAndTimeLabel;
    private JLabel returnDateAndTimeLabel;
    private JLabel destinationLabel;
    private JLabel stationLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
