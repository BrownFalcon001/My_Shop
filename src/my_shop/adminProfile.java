/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_shop;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
/**
 *
 * @author spifu
 */
public class adminProfile extends javax.swing.JFrame {

    /**
     * Creates new form adminProfile
     */
    public adminProfile() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usernameShow = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        shopList = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rentedShopList = new javax.swing.JComboBox<>();
        emptyShopList = new javax.swing.JComboBox<>();
        announce = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sLGo = new javax.swing.JButton();
        rSLGo = new javax.swing.JButton();
        eSLGo = new javax.swing.JButton();
        notifi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel2.setText("Admin");

        usernameShow.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usernameShow.setText("3nthusiasticFalcons");

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel5.setText("Shop List : ");

        shopList.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        shopList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "shop11", "shop12", "shop13", "shop14", "shop21", "shop22", "shop23", "shop24", "shop31", "shop32", "shop33", "shop34", "shop41", "shop42", "shop43", "shop44" }));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel6.setText("Rented Shop List :");

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel3.setText("Empty Shop List :");

        rentedShopList.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        rentedShopList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        rentedShopList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentedShopListActionPerformed(evt);
            }
        });

        emptyShopList.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        emptyShopList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8" }));

        announce.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        announce.setText("Announce");
        announce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                announceActionPerformed(evt);
            }
        });

        logOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logOut.setText("Log out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(50, 196, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_shop/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel1)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        sLGo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sLGo.setText("Go");
        sLGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sLGoActionPerformed(evt);
            }
        });

        rSLGo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rSLGo.setText("Go");
        rSLGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSLGoActionPerformed(evt);
            }
        });

        eSLGo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eSLGo.setText("Go");
        eSLGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eSLGoActionPerformed(evt);
            }
        });

        notifi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_shop/notification.png"))); // NOI18N
        notifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(announce)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(notifi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usernameShow))
                            .addComponent(logOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rentedShopList, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSLGo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(shopList, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sLGo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(emptyShopList, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eSLGo)))
                        .addContainerGap(72, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(usernameShow)
                        .addGap(18, 18, 18)
                        .addComponent(logOut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(notifi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(shopList, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sLGo))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rentedShopList, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSLGo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emptyShopList, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eSLGo)))
                .addGap(77, 77, 77)
                .addComponent(announce, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 562));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rentedShopListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentedShopListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rentedShopListActionPerformed

    private void announceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_announceActionPerformed
        // TODO add your handling code here:
        Notice notice = new Notice();
        notice.setVisible(true);
        notice.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        notice.setResizable(false);
        dispose();
    }//GEN-LAST:event_announceActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
//        confirmation conf = new confirmation();
//        conf.setVisible(true);
//        conf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        conf.setResizable(false);
//        if(conf.Yes()) {    
//            loginPage lp = new loginPage();
//            lp.setVisible(true);
//            conf.dispose();
//            dispose();
//        }
        int n = JOptionPane.showConfirmDialog(this, "Would you like to log out?","",JOptionPane.YES_NO_OPTION);
        if(n==0) {
            loginPage lPage = new loginPage();
            lPage.setVisible(true);
            lPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            lPage.setResizable(false);
            dispose();  
        }
    }//GEN-LAST:event_logOutActionPerformed

    private void sLGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sLGoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sLGoActionPerformed

    private void notifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifiActionPerformed
        // TODO add your handling code here:
        admin_notif aNotif = new admin_notif();
        aNotif.setVisible(true);
        aNotif.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        aNotif.setResizable(false);
        dispose();
    }//GEN-LAST:event_notifiActionPerformed

    private void rSLGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSLGoActionPerformed
        // TODO add your handling code here:
        shopInfo shopinfo = new shopInfo();
        shopinfo.setVisible(true);
        shopinfo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        shopinfo.setResizable(false);
        dispose();
    }//GEN-LAST:event_rSLGoActionPerformed

    private void eSLGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eSLGoActionPerformed
        // TODO add your handling code here:
        shopInfoEmptyShop emptyshop = new shopInfoEmptyShop();
        emptyshop.setVisible(true);
        emptyshop.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        emptyshop.setResizable(false);
        dispose();
        
    }//GEN-LAST:event_eSLGoActionPerformed

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
            java.util.logging.Logger.getLogger(adminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton announce;
    private javax.swing.JButton eSLGo;
    private javax.swing.JComboBox<String> emptyShopList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logOut;
    private javax.swing.JButton notifi;
    private javax.swing.JButton rSLGo;
    private javax.swing.JComboBox<String> rentedShopList;
    private javax.swing.JButton sLGo;
    private javax.swing.JComboBox<String> shopList;
    private javax.swing.JLabel usernameShow;
    // End of variables declaration//GEN-END:variables
}
