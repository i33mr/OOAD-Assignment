/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thesc
 */
public class ExpandManagerPropertyPage extends javax.swing.JPanel {
    

    /**
     * Creates new form ExpandManagerPropertyPage
     */
    public ExpandManagerPropertyPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        extSideBarPanel = new javax.swing.JPanel();
        sidebarPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        rentRequestsButton = new javax.swing.JButton();
        managePropertiesButton = new javax.swing.JButton();
        myPropertiesLabel = new javax.swing.JLabel();
        newPropertyPageButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        projectNameLabel = new javax.swing.JLabel();
        propertyNameLabel = new javax.swing.JLabel();
        descTitleLabel = new javax.swing.JLabel();
        faciltiesTitleLabel = new javax.swing.JLabel();
        featuresTitleLabel = new javax.swing.JLabel();
        addressTitleLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        bedsTitleLabel = new javax.swing.JLabel();
        bathsTitleLabel = new javax.swing.JLabel();
        fac1IconLabel = new javax.swing.JLabel();
        fac2IconLabel = new javax.swing.JLabel();
        fac3IconLabel = new javax.swing.JLabel();
        fac4IconLabel = new javax.swing.JLabel();
        feat1IconLabel = new javax.swing.JLabel();
        feat2IconLabel = new javax.swing.JLabel();
        feat3IconLabel = new javax.swing.JLabel();
        feat4IconLabel = new javax.swing.JLabel();
        feat5IconLabel = new javax.swing.JLabel();
        feat6IconLabel = new javax.swing.JLabel();
        selectedImagePane = new javax.swing.JPanel();
        selectedImageIconLabel = new javax.swing.JLabel();
        propertyImage1Label = new javax.swing.JLabel();
        propertyImage2Label = new javax.swing.JLabel();
        propertyImage3Label = new javax.swing.JLabel();
        propertyImage4Label = new javax.swing.JLabel();
        propertyImage5Label = new javax.swing.JLabel();
        feat7IconLabel = new javax.swing.JLabel();
        editPropertyButton = new javax.swing.JButton();
        deletePropertyButton = new javax.swing.JButton();
        toggleActivityButton = new javax.swing.JButton();

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 700));
        //setResizable(false);

        extSideBarPanel.setPreferredSize(new java.awt.Dimension(255, 684));

        sidebarPanel.setBackground(new java.awt.Color(204, 0, 0));
        sidebarPanel.setPreferredSize(new java.awt.Dimension(255, 684));

        homeButton.setBackground(new java.awt.Color(204, 0, 0));
        homeButton.setFont(new java.awt.Font("Source Serif Pro Black", 0, 12)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.setBorder(null);

        rentRequestsButton.setBackground(new java.awt.Color(204, 0, 0));
        rentRequestsButton.setFont(new java.awt.Font("Source Serif Pro Black", 0, 12)); // NOI18N
        rentRequestsButton.setForeground(new java.awt.Color(255, 255, 255));
        rentRequestsButton.setText("Rent requests");
        rentRequestsButton.setBorder(null);

        managePropertiesButton.setBackground(new java.awt.Color(204, 0, 0));
        managePropertiesButton.setFont(new java.awt.Font("Source Serif Pro Black", 0, 12)); // NOI18N
        managePropertiesButton.setForeground(new java.awt.Color(255, 255, 255));
        managePropertiesButton.setText("Manage Properties");
        managePropertiesButton.setBorder(null);

        myPropertiesLabel.setFont(new java.awt.Font("Source Serif Pro Black", 0, 14)); // NOI18N
        myPropertiesLabel.setForeground(new java.awt.Color(255, 255, 255));
        myPropertiesLabel.setText("My Properties");

        newPropertyPageButton.setBackground(new java.awt.Color(204, 0, 0));
        newPropertyPageButton.setFont(new java.awt.Font("Source Serif Pro Black", 0, 12)); // NOI18N
        newPropertyPageButton.setForeground(new java.awt.Color(255, 255, 255));
        newPropertyPageButton.setText("New Property");
        newPropertyPageButton.setBorder(null);

        logOutButton.setBackground(new java.awt.Color(204, 0, 0));
        logOutButton.setFont(new java.awt.Font("Source Serif Pro Black", 0, 12)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setText("Log Out");
        logOutButton.setBorder(null);

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPropertyPageButton)
                            .addComponent(managePropertiesButton)))
                    .addComponent(myPropertiesLabel)
                    .addComponent(rentRequestsButton)
                    .addComponent(logOutButton)
                    .addComponent(homeButton))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(homeButton)
                .addGap(18, 18, 18)
                .addComponent(rentRequestsButton)
                .addGap(18, 18, 18)
                .addComponent(myPropertiesLabel)
                .addGap(18, 18, 18)
                .addComponent(managePropertiesButton)
                .addGap(18, 18, 18)
                .addComponent(newPropertyPageButton)
                .addGap(38, 38, 38)
                .addComponent(logOutButton)
                .addContainerGap(609, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout extSideBarPanelLayout = new javax.swing.GroupLayout(extSideBarPanel);
        extSideBarPanel.setLayout(extSideBarPanelLayout);
        extSideBarPanelLayout.setHorizontalGroup(
            extSideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        extSideBarPanelLayout.setVerticalGroup(
            extSideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extSideBarPanelLayout.createSequentialGroup()
                .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        projectNameLabel.setFont(new java.awt.Font("Source Serif Pro Black", 0, 24)); // NOI18N
        projectNameLabel.setText("Project name");

        propertyNameLabel.setFont(new java.awt.Font("Source Serif Pro Black", 0, 14)); // NOI18N
        propertyNameLabel.setText("Property name");

        descTitleLabel.setText("Description:");

        faciltiesTitleLabel.setText("Facilities");

        featuresTitleLabel.setText("Features");

        addressTitleLabel.setText("Address:");

        addressLabel.setText("line 1");

        descLabel.setText("desc text");

        bedsTitleLabel.setText("Bedrooms");

        bathsTitleLabel.setText("Bathrooms");

        fac1IconLabel.setText("Fac1Icon");

        fac2IconLabel.setText("Fac2Icon");

        fac3IconLabel.setText("Fac3Icon");

        fac4IconLabel.setText("Fac4Icon");

        feat1IconLabel.setText("Feat1Icon");

        feat2IconLabel.setText("Feat2Icon");

        feat3IconLabel.setText("Feat3Icon");

        feat4IconLabel.setText("Feat4Icon");

        feat5IconLabel.setText("Feat5Icon");

        feat6IconLabel.setText("Feat6Icon");

        selectedImageIconLabel.setText("jLabel6");

        javax.swing.GroupLayout selectedImagePaneLayout = new javax.swing.GroupLayout(selectedImagePane);
        selectedImagePane.setLayout(selectedImagePaneLayout);
        selectedImagePaneLayout.setHorizontalGroup(
            selectedImagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedImagePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectedImageIconLabel)
                .addContainerGap(443, Short.MAX_VALUE))
        );
        selectedImagePaneLayout.setVerticalGroup(
            selectedImagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedImagePaneLayout.createSequentialGroup()
                .addComponent(selectedImageIconLabel)
                .addGap(0, 311, Short.MAX_VALUE))
        );

        propertyImage1Label.setText("jLabel1");

        propertyImage2Label.setText("jLabel2");

        propertyImage3Label.setText("jLabel3");

        propertyImage4Label.setText("jLabel4");

        propertyImage5Label.setText("jLabel5");

        feat7IconLabel.setText("Feat7Icon");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressTitleLabel)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projectNameLabel)
                            .addComponent(propertyNameLabel)
                            .addComponent(addressLabel)
                            .addComponent(descTitleLabel)
                            .addComponent(descLabel))
                        .addGap(235, 235, 235)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(featuresTitleLabel)
                            .addComponent(faciltiesTitleLabel)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addComponent(feat1IconLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(feat2IconLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(feat3IconLabel))
                                        .addComponent(bedsTitleLabel))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(feat6IconLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(feat7IconLabel)
                                        .addGap(57, 57, 57)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bathsTitleLabel)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(feat4IconLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(feat5IconLabel))))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(fac1IconLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fac2IconLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fac3IconLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fac4IconLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(selectedImagePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(propertyImage1Label)
                            .addComponent(propertyImage2Label)
                            .addComponent(propertyImage3Label)
                            .addComponent(propertyImage4Label)
                            .addComponent(propertyImage5Label))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(propertyNameLabel)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(propertyImage1Label)
                        .addGap(47, 47, 47)
                        .addComponent(propertyImage2Label)
                        .addGap(56, 56, 56)
                        .addComponent(propertyImage3Label)
                        .addGap(42, 42, 42)
                        .addComponent(propertyImage4Label)
                        .addGap(48, 48, 48)
                        .addComponent(propertyImage5Label))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectedImagePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTitleLabel)
                    .addComponent(faciltiesTitleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(fac1IconLabel)
                    .addComponent(fac2IconLabel)
                    .addComponent(fac3IconLabel)
                    .addComponent(fac4IconLabel))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(featuresTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(feat1IconLabel)
                            .addComponent(feat2IconLabel)
                            .addComponent(feat3IconLabel)
                            .addComponent(feat4IconLabel)
                            .addComponent(feat5IconLabel))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(feat6IconLabel)
                            .addComponent(feat7IconLabel))
                        .addGap(5, 5, 5))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(descTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descLabel)
                        .addGap(31, 31, 31)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bedsTitleLabel)
                    .addComponent(bathsTitleLabel))
                .addGap(22, 22, 22))
        );

        editPropertyButton.setText("Edit property");
        editPropertyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPropertyButtonActionPerformed(evt);
            }
        });

        deletePropertyButton.setText("Delete Property");

        toggleActivityButton.setText("Deactivate Property");
        toggleActivityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleActivityButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(extSideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editPropertyButton)
                        .addGap(51, 51, 51)
                        .addComponent(toggleActivityButton)
                        .addGap(50, 50, 50)
                        .addComponent(deletePropertyButton)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPropertyButton)
                    .addComponent(deletePropertyButton)
                    .addComponent(toggleActivityButton))
                .addGap(70, 70, 70))
            .addComponent(extSideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        //pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editPropertyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPropertyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPropertyButtonActionPerformed

    private void toggleActivityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleActivityButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toggleActivityButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    // public static void main(String args[]) {
    //     /* Set the Nimbus look and feel */
    //     //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    //     /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    //      * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
    //      */
    //     try {
    //         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //             if ("Nimbus".equals(info.getName())) {
    //                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                 break;
    //             }
    //         }
    //     } catch (ClassNotFoundException ex) {
    //         java.util.logging.Logger.getLogger(ExpandManagerPropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (InstantiationException ex) {
    //         java.util.logging.Logger.getLogger(ExpandManagerPropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (IllegalAccessException ex) {
    //         java.util.logging.Logger.getLogger(ExpandManagerPropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //         java.util.logging.Logger.getLogger(ExpandManagerPropertyPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     }
    //     //</editor-fold>

    //     /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new ExpandManagerPropertyPage().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel addressTitleLabel;
    private javax.swing.JLabel bathsTitleLabel;
    private javax.swing.JLabel bedsTitleLabel;
    private javax.swing.JButton deletePropertyButton;
    private javax.swing.JLabel descLabel;
    private javax.swing.JLabel descTitleLabel;
    private javax.swing.JButton editPropertyButton;
    private javax.swing.JPanel extSideBarPanel;
    private javax.swing.JLabel fac1IconLabel;
    private javax.swing.JLabel fac2IconLabel;
    private javax.swing.JLabel fac3IconLabel;
    private javax.swing.JLabel fac4IconLabel;
    private javax.swing.JLabel faciltiesTitleLabel;
    private javax.swing.JLabel feat1IconLabel;
    private javax.swing.JLabel feat2IconLabel;
    private javax.swing.JLabel feat3IconLabel;
    private javax.swing.JLabel feat4IconLabel;
    private javax.swing.JLabel feat5IconLabel;
    private javax.swing.JLabel feat6IconLabel;
    private javax.swing.JLabel feat7IconLabel;
    private javax.swing.JLabel featuresTitleLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton managePropertiesButton;
    private javax.swing.JLabel myPropertiesLabel;
    private javax.swing.JButton newPropertyPageButton;
    private javax.swing.JLabel projectNameLabel;
    private javax.swing.JLabel propertyImage1Label;
    private javax.swing.JLabel propertyImage2Label;
    private javax.swing.JLabel propertyImage3Label;
    private javax.swing.JLabel propertyImage4Label;
    private javax.swing.JLabel propertyImage5Label;
    private javax.swing.JLabel propertyNameLabel;
    private javax.swing.JButton rentRequestsButton;
    private javax.swing.JLabel selectedImageIconLabel;
    private javax.swing.JPanel selectedImagePane;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JButton toggleActivityButton;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JLabel getAddressLabel() {
        return addressLabel;
    }
    public javax.swing.JLabel getAddressTitleLabel() {
        return addressTitleLabel;
    }
    public javax.swing.JLabel getBathsTitleLabel() {
        return bathsTitleLabel;
    }
    public javax.swing.JLabel getBedsTitleLabel() {
        return bedsTitleLabel;
    }
    public javax.swing.JButton getDeletePropertyButton() {
        return deletePropertyButton;
    }
    public javax.swing.JLabel getDescLabel() {
        return descLabel;
    }
    public javax.swing.JLabel getDescTitleLabel() {
        return descTitleLabel;
    }
    public javax.swing.JButton getEditPropertyButton() {
        return editPropertyButton;
    }
    public javax.swing.JPanel getExtSideBarPanel() {
        return extSideBarPanel;
    }
    public javax.swing.JLabel getFac1IconLabel() {
        return fac1IconLabel;
    }
    public javax.swing.JLabel getFac2IconLabel() {
        return fac2IconLabel;
    }
    public javax.swing.JLabel getFac3IconLabel() {
        return fac3IconLabel;
    }
    public javax.swing.JLabel getFac4IconLabel() {
        return fac4IconLabel;
    }
    public javax.swing.JLabel getFaciltiesTitleLabel() {
        return faciltiesTitleLabel;
    }
    public javax.swing.JLabel getFeat1IconLabel() {
        return feat1IconLabel;
    }
    public javax.swing.JLabel getFeat2IconLabel() {
        return feat2IconLabel;
    }
    public javax.swing.JLabel getFeat3IconLabel() {
        return feat3IconLabel;
    }
    public javax.swing.JLabel getFeat4IconLabel() {
        return feat4IconLabel;
    }
    public javax.swing.JLabel getFeat5IconLabel() {
        return feat5IconLabel;
    }
    public javax.swing.JLabel getFeat6IconLabel() {
        return feat6IconLabel;
    }
    public javax.swing.JLabel getFeat7IconLabel() {
        return feat7IconLabel;
    }
    public javax.swing.JLabel getFeaturesTitleLabel() {
        return featuresTitleLabel;
    }
    public javax.swing.JButton getHomeButton() {
        return homeButton;
    }
    public javax.swing.JButton getLogOutButton() {
        return logOutButton;
    }
    public javax.swing.JPanel getMainPanel() {
        return mainPanel;
    }
    public javax.swing.JButton getManagePropertiesButton() {
        return managePropertiesButton;
    }
    public javax.swing.JLabel getMyPropertiesLabel() {
        return myPropertiesLabel;
    }
    public javax.swing.JButton getNewPropertyPageButton() {
        return newPropertyPageButton;
    }
    public javax.swing.JLabel getProjectNameLabel() {
        return projectNameLabel;
    }
    public javax.swing.JLabel getPropertyImage1Label() {
        return propertyImage1Label;
    }
    public javax.swing.JLabel getPropertyImage2Label() {
        return propertyImage2Label;
    }
    public javax.swing.JLabel getPropertyImage3Label() {
        return propertyImage3Label;
    }
    public javax.swing.JLabel getPropertyImage4Label() {
        return propertyImage4Label;
    }
    public javax.swing.JLabel getPropertyImage5Label() {
        return propertyImage5Label;
    }
    public javax.swing.JLabel getPropertyNameLabel() {
        return propertyNameLabel;
    }
    public javax.swing.JButton getRentRequestsButton() {
        return rentRequestsButton;
    }
    public javax.swing.JLabel getSelectedImageIconLabel() {
        return selectedImageIconLabel;
    }
    public javax.swing.JPanel getSelectedImagePane() {
        return selectedImagePane;
    }
    public javax.swing.JPanel getSidebarPanel() {
        return sidebarPanel;
    }
    public javax.swing.JButton getToggleActivityButton() {
        return toggleActivityButton;
    }

}