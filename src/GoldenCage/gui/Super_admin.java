/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.gui;

/**
 *
 * @author Amina
 */
public class Super_admin extends javax.swing.JFrame {

    /**
     * Creates new form Afficher_Admine
     */
    public Super_admin() {
        initComponents();
        remplirAdmin();
    }
    
    public void remplirAdmin(){
//        List<Comptes> listadm = new ArrayList<Comptes>();
//        AdminDAO amddao =new AdminDAO();
//        listadm = amddao.afficherAdmin();
//       int i=0;
//        for (Comptes c :listadm) {
//         
//            
//            Table_Admin.getModel().setValueAt(c.getIdCompte(),i,0);
//            Table_Admin.getModel().setValueAt(c.getNom(), i,1);
//            Table_Admin.getModel().setValueAt(c.getPrenom(), i,2);
//            Table_Admin.getModel().setValueAt(c.getAdresse(), i,3);
//            Table_Admin.getModel().setValueAt(c.getEmail(), i,4);
//            Table_Admin.getModel().setValueAt(c.getNumTel(), i,5);
//            i++;
//            System.out.println(i);
//        }
//        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_bouton = new javax.swing.JPanel();
        bt_acceuil = new javax.swing.JButton();
        bt_compte_client = new javax.swing.JButton();
        bt_compte_prestataire = new javax.swing.JButton();
        bt_reclamation = new javax.swing.JButton();
        bt_statistique = new javax.swing.JButton();
        lb_nom_admin = new javax.swing.JLabel();
        bt_offre = new javax.swing.JButton();
        bt_comtpe_admin = new javax.swing.JButton();
        bt_quitter = new javax.swing.JButton();
        p_Afficher = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p_bouton.setBackground(new java.awt.Color(233, 213, 230));
        p_bouton.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Wide Latin", 0, 12), new java.awt.Color(135, 8, 165))); // NOI18N
        p_bouton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p_bouton.setLayout(null);

        bt_acceuil.setText("Acceuil");
        bt_acceuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_acceuilActionPerformed(evt);
            }
        });
        p_bouton.add(bt_acceuil);
        bt_acceuil.setBounds(10, 70, 140, 23);

        bt_compte_client.setText("Compte client");
        bt_compte_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_compte_clientActionPerformed(evt);
            }
        });
        p_bouton.add(bt_compte_client);
        bt_compte_client.setBounds(10, 130, 140, 23);

        bt_compte_prestataire.setText("Compte Prestataire");
        p_bouton.add(bt_compte_prestataire);
        bt_compte_prestataire.setBounds(10, 160, 140, 23);

        bt_reclamation.setText("Les réclamation");
        p_bouton.add(bt_reclamation);
        bt_reclamation.setBounds(10, 220, 140, 23);

        bt_statistique.setText("Les statistiques");
        bt_statistique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_statistiqueActionPerformed(evt);
            }
        });
        p_bouton.add(bt_statistique);
        bt_statistique.setBounds(10, 250, 140, 23);

        lb_nom_admin.setText("SuperAdmin");
        p_bouton.add(lb_nom_admin);
        lb_nom_admin.setBounds(70, 20, 100, 30);

        bt_offre.setText("Les offres");
        p_bouton.add(bt_offre);
        bt_offre.setBounds(10, 190, 140, 23);

        bt_comtpe_admin.setText("Compte Admin");
        bt_comtpe_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_comtpe_adminActionPerformed(evt);
            }
        });
        p_bouton.add(bt_comtpe_admin);
        bt_comtpe_admin.setBounds(10, 100, 140, 23);

        bt_quitter.setText("Quitter");
        bt_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quitterActionPerformed(evt);
            }
        });
        p_bouton.add(bt_quitter);
        bt_quitter.setBounds(10, 280, 140, 23);

        p_Afficher.setBackground(new java.awt.Color(233, 213, 230));
        p_Afficher.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SuperAdmin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Wide Latin", 0, 14), new java.awt.Color(153, 0, 153))); // NOI18N

        javax.swing.GroupLayout p_AfficherLayout = new javax.swing.GroupLayout(p_Afficher);
        p_Afficher.setLayout(p_AfficherLayout);
        p_AfficherLayout.setHorizontalGroup(
            p_AfficherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );
        p_AfficherLayout.setVerticalGroup(
            p_AfficherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p_bouton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p_Afficher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_bouton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
            .addComponent(p_Afficher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_acceuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_acceuilActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bt_acceuilActionPerformed

    private void bt_compte_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_compte_clientActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bt_compte_clientActionPerformed

    private void bt_statistiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_statistiqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_statistiqueActionPerformed

    private void bt_quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quitterActionPerformed
        // TODO add your handling code here:
//        int n = Alert_quit.showConfirmDialog(this,"Quitter l'application ?","Quitter",Alert_quit.YES_NO_OPTION);
//        if (n == Alert_quit.YES_OPTION)
//        {
//            System.exit(0);
//        }
    }//GEN-LAST:event_bt_quitterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
        p_Afficher.setVisible(false);
//        Table_Admin.setVisible(false);
        }      
     
    
    private void bt_comtpe_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_comtpe_adminActionPerformed
         
       
      Afficher_Admine ll=new  Afficher_Admine();
       ll.setVisible(true);
       dispose();
    }//GEN-LAST:event_bt_comtpe_adminActionPerformed

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
            java.util.logging.Logger.getLogger(Super_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Super_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Super_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Super_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Super_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_acceuil;
    private javax.swing.JButton bt_compte_client;
    private javax.swing.JButton bt_compte_prestataire;
    private javax.swing.JButton bt_comtpe_admin;
    private javax.swing.JButton bt_offre;
    private javax.swing.JButton bt_quitter;
    private javax.swing.JButton bt_reclamation;
    private javax.swing.JButton bt_statistique;
    private javax.swing.JLabel lb_nom_admin;
    private javax.swing.JPanel p_Afficher;
    private javax.swing.JPanel p_bouton;
    // End of variables declaration//GEN-END:variables
}
