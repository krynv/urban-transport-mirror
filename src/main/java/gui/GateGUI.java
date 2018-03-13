package gui;

import logic.gate.GateController;
import logic.location.Location;
import logic.location.LocationDaoJson;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GateGUI extends JFrame {

    private GateController gateController;
    private DefaultTableModel model;

    public GateGUI() {
        gateController = new GateController();
        model = new DefaultTableModel();

        initComponents();
        initLocations();
        initInformation();

        this.setContentPane(pnlMain);
        this.pack();
    }

    private void initLocations() {
        LocationDaoJson locationDaoJson = new LocationDaoJson();
        List<Location> locations = locationDaoJson.getLocations();

        cbxLocations.setModel(new DefaultComboBoxModel(locations.toArray()));
    }

    private void initInformation() {
        model.addColumn("Token Id");
        model.addColumn("Account");
        model.addColumn("Departure Location");

        tblInformation.setModel(model);
    }

    private void btnEntryActionPerformed(ActionEvent e) {
        String type = "Entry";
        String tokenId = txtTokenId.getText();
        String locationId = Integer.toString(cbxLocations.getSelectedIndex());

        if (!tokenId.isEmpty()) {
            gateController.presentToken(type, tokenId, locationId);

            if (gateController.canOpen()) {
                model.insertRow(model.getRowCount(),
                        new Object[]{
                                tokenId,
                                gateController.getAccount().getName(),
                                gateController.getAccount().getJourneys().getLatestJourney().getDepartureLocation()
                        });
            }
        }
    }

    private void btnExitActionPerformed(ActionEvent e) {
        String type = "Exit";
        String tokenId = txtTokenId.getText();
        String locationId = Integer.toString(cbxLocations.getSelectedIndex());

        gateController.presentToken(type, tokenId, locationId);

        if (gateController.canOpen()) {
            model = (DefaultTableModel) tblInformation.getModel();

            for (int i = 0; i < model.getRowCount(); i++) {
                if (model.getValueAt(i, 0).equals(tokenId)) {
                    model.removeRow(i);
                    break;
                }
            }
        } else {
            System.out.println("Close");    // TODO: Add UI aid to showcase this.
        }
    }

    private void btnMainGUIActionPerformed(ActionEvent e) {
        this.dispose();
    }

    private void txtTokenIdFocusGained(FocusEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Sheffield Hallan
        pnlMain = new JPanel();
        btnMainGUI = new JButton();
        scrollPane1 = new JScrollPane();
        tblInformation = new JTable();
        cbxLocations = new JComboBox();
        txtTokenId = new JTextField();
        btnEntry = new JButton();
        btnExit = new JButton();
        lblLocation = new JLabel();
        lblToken = new JLabel();

        //======== pnlMain ========
        {
            pnlMain.setMaximumSize(null);
            pnlMain.setPreferredSize(new Dimension(1111, 635));
            pnlMain.setMinimumSize(null);

            //---- btnMainGUI ----
            btnMainGUI.setText("Main Page");
            btnMainGUI.setMaximumSize(new Dimension(151, 25));
            btnMainGUI.setMinimumSize(new Dimension(151, 25));
            btnMainGUI.setPreferredSize(new Dimension(151, 25));
            btnMainGUI.addActionListener(e -> btnMainGUIActionPerformed(e));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(tblInformation);
            }

            //---- txtTokenId ----
            txtTokenId.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    txtTokenIdFocusGained(e);
                }
            });

            //---- btnEntry ----
            btnEntry.setText("Entry");
            btnEntry.addActionListener(e -> btnEntryActionPerformed(e));

            //---- btnExit ----
            btnExit.setText("Exit");
            btnExit.addActionListener(e -> btnExitActionPerformed(e));

            //---- lblLocation ----
            lblLocation.setText("Select Gate Locations:");

            //---- lblToken ----
            lblToken.setText("Enter a Token Id:");

            GroupLayout pnlMainLayout = new GroupLayout(pnlMain);
            pnlMain.setLayout(pnlMainLayout);
            pnlMainLayout.setHorizontalGroup(
                pnlMainLayout.createParallelGroup()
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlMainLayout.createParallelGroup()
                            .addComponent(btnMainGUI, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGroup(pnlMainLayout.createParallelGroup()
                                    .addGroup(pnlMainLayout.createSequentialGroup()
                                        .addComponent(btnEntry, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlMainLayout.createSequentialGroup()
                                        .addGroup(pnlMainLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblToken)
                                            .addComponent(lblLocation))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbxLocations, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(txtTokenId, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                                .addGap(65, 65, 65)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            pnlMainLayout.setVerticalGroup(
                pnlMainLayout.createParallelGroup()
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlMainLayout.createParallelGroup()
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGroup(pnlMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLocation)
                                    .addComponent(cbxLocations, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlMainLayout.createParallelGroup()
                                    .addComponent(txtTokenId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblToken))
                                .addGap(47, 47, 47)
                                .addGroup(pnlMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEntry, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 453, GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)
                        .addComponent(btnMainGUI, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Sheffield Hallan
    private JPanel pnlMain;
    private JButton btnMainGUI;
    private JScrollPane scrollPane1;
    private JTable tblInformation;
    private JComboBox cbxLocations;
    private JTextField txtTokenId;
    private JButton btnEntry;
    private JButton btnExit;
    private JLabel lblLocation;
    private JLabel lblToken;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
