/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_shop;

import javax.swing.*;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.io.FileWriter; 
/**
 *
 * @author Abrar Faiyaz Khan
 */
public class shopOwner extends javax.swing.JFrame {

    /**
     * Creates new form shopOwner
     */
    public shopOwner() {
        initComponents();
//        String line;
//        try {
//            FileReader fr = new FileReader("src\\ownerInfo.csv");
//            FileReader fr1 = new FileReader("src\\track.txt");
//            BufferedReader br = new BufferedReader(fr);
//            BufferedReader br1 = new BufferedReader(fr1);
//            String key = br1.readLine();  
//            String str="";
//            while ((line = br.readLine()) != null) {
//                str = line;
//                String[] arr = line.split(",");
//                if (arr[1].equals(key)) {
//                    break;
//                }
//            }
//            String[] arr = str.split(",");
//          owner_usename.setText(arr[1]);
//
//        }
//        catch (FileNotFoundException ex) {
//            Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
//        }
          String line="";
          try {
              FileReader fr = new FileReader("src\\track.txt");
              BufferedReader br = new BufferedReader(fr);
              line = br.readLine();
              owner_usename.setText(line);
          }
          catch (FileNotFoundException ex) {
             Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
             Logger.getLogger(loginPage.class.getName()).log(Level.SEVERE, null, ex);
          }
          try {
                FileReader fr = new FileReader("src\\ownerInfo.txt");  
                BufferedReader br = new BufferedReader(fr);

                //FileReader ffr=new FileReader("src\\database.txt");
                //BufferedReader bfr=new BufferedReader(ffr);

                String line1;
//                Boolean matched = false;
                while ((line1 = br.readLine()) != null) {
                    String[] arr = line1.split(",");
                    if (arr[1].equals(line)) {
//                        matched=true;
                        break;
                    }
                }
                String[] arr = line1.split(",");
                owner_shopName.setText(arr[2]);
                owner_rent.setText(arr[3]);
                owner_dueRent.setText(arr[4]);
                fr.close();
                try {
                    FileReader fr1 = new FileReader("src\\shopLocation.txt");  
                    BufferedReader br1 = new BufferedReader(fr1);
                    String fnd = arr[2];
                    String line2;
                    while ((line2 = br1.readLine()) != null) {
                        String[] arr1 = line2.split(",");
                        if (arr1[0].equals(fnd)) {
    //                        matched=true;
                            break;
                        }
                    }
                    String[] arr1 = line2.split(",");
                    location.setText(arr1[1]);
                }
                catch (FileNotFoundException ex) {
                    Logger.getLogger(shopOwner.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(shopOwner.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(shopOwner.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(shopOwner.class.getName()).log(Level.SEVERE, null, ex);
            }
          
          
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton9 = new javax.swing.JButton();
        panel_owner = new javax.swing.JPanel();
        label_head = new javax.swing.JLabel();
        owner_usename = new javax.swing.JLabel();
        payRent = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ownerLogout = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        owner_rent = new javax.swing.JLabel();
        owner_dueRent = new javax.swing.JLabel();
        placeComplaint = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        owner_shopName = new javax.swing.JLabel();
        notif = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        location = new javax.swing.JLabel();

        jButton9.setText("jButton9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel_owner.setBackground(new java.awt.Color(50, 196, 210));
        panel_owner.setPreferredSize(new java.awt.Dimension(1000, 562));

        label_head.setFont(new java.awt.Font("Sylfaen", 1, 40)); // NOI18N
        label_head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_head.setText("Shop Owner");

        owner_usename.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        owner_usename.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        owner_usename.setText("owner11");
        owner_usename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                changeName(evt);
            }
        });

        payRent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        payRent.setText("Pay Rent");
        payRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payRentActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Place Complaint");

        ownerLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ownerLogout.setText("Log Out");
        ownerLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerLogoutActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Leave Shop");

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setText("Due Rent               :");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_shop/logo.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel6.setText("Rent                      :");

        owner_rent.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        owner_rent.setText("30000");

        owner_dueRent.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        owner_dueRent.setText("60000");

        placeComplaint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        placeComplaint.setText("Place Complaint");
        placeComplaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeComplaintActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setText("Shop Name             :");

        owner_shopName.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        owner_shopName.setText("shop11");

        notif.setBackground(new java.awt.Color(50, 196, 210));
        notif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_shop/notification.png"))); // NOI18N
        notif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel3.setText("Shop Location        :");

        location.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        location.setText("1st floor, east");

        javax.swing.GroupLayout panel_ownerLayout = new javax.swing.GroupLayout(panel_owner);
        panel_owner.setLayout(panel_ownerLayout);
        panel_ownerLayout.setHorizontalGroup(
            panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ownerLayout.createSequentialGroup()
                .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_ownerLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(147, 147, 147)
                        .addComponent(label_head, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_ownerLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(notif, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(owner_usename, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ownerLogout))))
                .addGap(22, 22, 22))
            .addGroup(panel_ownerLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ownerLayout.createSequentialGroup()
                        .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_ownerLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(owner_rent, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(owner_dueRent, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_ownerLayout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(payRent, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_ownerLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(placeComplaint, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel_ownerLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(location))))
                    .addGroup(panel_ownerLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(owner_shopName)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_ownerLayout.setVerticalGroup(
            panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ownerLayout.createSequentialGroup()
                .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ownerLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(label_head, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ownerLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ownerLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(owner_usename, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ownerLogout))
                    .addGroup(panel_ownerLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(notif, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(owner_shopName))
                .addGap(18, 18, 18)
                .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(location))
                .addGap(18, 18, 18)
                .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(owner_rent))
                .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ownerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(owner_dueRent)
                            .addComponent(payRent, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(panel_ownerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_ownerLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(panel_ownerLayout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panel_ownerLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(placeComplaint, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_owner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_owner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ownerLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerLogoutActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this, "Would you like to log out?","",JOptionPane.YES_NO_OPTION);
        if(n==0) {
            loginPage lPage = new loginPage();
            lPage.setVisible(true);
            lPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            lPage.setResizable(false);
            dispose();  
        }
    }//GEN-LAST:event_ownerLogoutActionPerformed

    private void changeName(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_changeName
        // TODO add your handling code here:
    }//GEN-LAST:event_changeName

    private void payRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payRentActionPerformed
        // TODO add your handling code here:
        PayRent pay = new PayRent();
        pay.setVisible(true);
//        pay.setResizable(false);
//        pay.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        pay.dispose();
    }//GEN-LAST:event_payRentActionPerformed

    private void placeComplaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeComplaintActionPerformed
        // TODO add your handling code here:
        Complain comp = new Complain();
        comp.setVisible(true);
        comp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        comp.setResizable(false);
        dispose();
    }//GEN-LAST:event_placeComplaintActionPerformed

    private void notifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifActionPerformed
        // TODO add your handling code here:
        shopOwner_notif notif = new shopOwner_notif();
        notif.setVisible(true);
        notif.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        notif.setResizable(false);
        dispose();
    }//GEN-LAST:event_notifActionPerformed
    public void init() {
        
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(shopOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shopOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shopOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shopOwner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shopOwner().setVisible(true);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel label_head;
    private javax.swing.JLabel location;
    private javax.swing.JButton notif;
    private javax.swing.JButton ownerLogout;
    private javax.swing.JLabel owner_dueRent;
    private javax.swing.JLabel owner_rent;
    private javax.swing.JLabel owner_shopName;
    public javax.swing.JLabel owner_usename;
    private javax.swing.JPanel panel_owner;
    private javax.swing.JButton payRent;
    private javax.swing.JButton placeComplaint;
    // End of variables declaration//GEN-END:variables
}
