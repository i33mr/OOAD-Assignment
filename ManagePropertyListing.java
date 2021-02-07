/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;


/**
 *
 * @author thesc
 */
public class ManagePropertyListing extends javax.swing.JPanel {
	JLabel propertyActivationLabel = new JLabel();

    /**
     * Creates new form ManageSpecificPropertyPage
     */
    public ManagePropertyListing() {
    	setBackground(Color.WHITE);
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

        projectNameLabel = new javax.swing.JLabel();
        projectNameLabel.setBounds(127, 11, 201, 25);
        priceTitleLabel = new javax.swing.JLabel();
        priceTitleLabel.setBounds(127, 169, 39, 20);
        priceLabel = new javax.swing.JLabel();
        priceLabel.setBounds(176, 169, 81, 20);
        addressTitleLabel = new javax.swing.JLabel();
        addressTitleLabel.setBounds(127, 70, 115, 14);
        addressLine1Label = new javax.swing.JLabel();
        addressLine1Label.setBounds(127, 95, 463, 39);
        propertyImageLabel = new javax.swing.JLabel();
        propertyImageLabel.setBounds(0, 11, 121, 189);
        viewDetailsButton = new javax.swing.JButton();
        viewDetailsButton.setBounds(475, 157, 115, 32);
        propertyNameLabel = new javax.swing.JLabel();
        propertyNameLabel.setBounds(127, 42, 201, 17);

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 200));
        //setResizable(false);

        projectNameLabel.setFont(new java.awt.Font("Source Serif Pro Black", 0, 18)); // NOI18N
        projectNameLabel.setText("Project name");

        priceTitleLabel.setFont(new java.awt.Font("Source Serif Pro Black", 0, 14)); // NOI18N
        priceTitleLabel.setText("Price:");

        priceLabel.setFont(new java.awt.Font("Source Serif Pro Black", 0, 14)); // NOI18N
        priceLabel.setText("price");

        addressTitleLabel.setText("Address:");

        addressLine1Label.setText("line 1");

        viewDetailsButton.setText("View details");
//        viewDetailsButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                viewDetailsButtonActionPerformed(evt);
//            }
//        });

        propertyNameLabel.setFont(new java.awt.Font("Source Serif Pro Black", 0, 12)); // NOI18N
        propertyNameLabel.setText("Property name");
        setLayout(null);
        add(propertyImageLabel);
        add(projectNameLabel);
        add(addressLine1Label);
        add(priceTitleLabel);
        add(priceLabel);
        add(propertyNameLabel);
        add(addressTitleLabel);
        add(viewDetailsButton);
        propertyActivationLabel.setBounds(127, 98, 0, 0);
        add(propertyActivationLabel);

        //pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewDetailsButtonActionPerformed

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
    //         java.util.logging.Logger.getLogger(ManagePropertyListing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (InstantiationException ex) {
    //         java.util.logging.Logger.getLogger(ManagePropertyListing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (IllegalAccessException ex) {
    //         java.util.logging.Logger.getLogger(ManagePropertyListing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //         java.util.logging.Logger.getLogger(ManagePropertyListing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     }
    //     //</editor-fold>
    //     //</editor-fold>

    //     /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new ManagePropertyListing().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLine1Label;
    private javax.swing.JLabel addressTitleLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel priceTitleLabel;
    private javax.swing.JLabel projectNameLabel;
    private javax.swing.JLabel propertyImageLabel;
    private javax.swing.JLabel propertyNameLabel;
    private javax.swing.JButton viewDetailsButton;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JLabel getAddressLine1Label() {
        return addressLine1Label;
    }
    public javax.swing.JLabel getAddressTitleLabel() {
        return addressTitleLabel;
    }
    public javax.swing.JLabel getPriceLabel() {
        return priceLabel;
    }
    public javax.swing.JLabel getPriceTitleLabel() {
        return priceTitleLabel;
    }
    public javax.swing.JLabel getProjectNameLabel() {
        return projectNameLabel;
    }
    public javax.swing.JLabel getPropertyImageLabel() {
        return propertyImageLabel;
    }
    public javax.swing.JLabel getPropertyNameLabel() {
        return propertyNameLabel;
    }
    public JLabel getPropertyActivationLabel() {
    	return propertyActivationLabel;
    }
    public javax.swing.JButton getViewDetailsButton() {
        return viewDetailsButton;
    }
}
