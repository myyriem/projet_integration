/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GoldenCage.gui;

import GoldenCage.Dao.ComptesDAO;
import GoldenCage.Dao.ComptesDAO;

import GoldenCage.entites.Comptes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Amina
 */
public class Afficher_Admine extends javax.swing.JFrame {

    /**
     * Creates new form Afficher_Admine
     */
    public Afficher_Admine() {
        initComponents();
        remplirAdmin();
         build();//On initialise notre fenêtre
    }
         
   

    
    private void build(){
		setTitle("Ma première fenêtre"); //On donne un titre à l'application
		setSize(1000,650); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
    }
    
    
    public void remplirAdmin(){
        List<Comptes> listadm = new ArrayList<Comptes>();
        ComptesDAO amddao =new ComptesDAO();
        listadm = amddao.afficherComptes();
       int i=0;
        for (Comptes c :listadm) {
         
            
            Table_Admin.getModel().setValueAt(c.getIdCompte(),i,0);
            Table_Admin.getModel().setValueAt(c.getNom(), i,1);
            Table_Admin.getModel().setValueAt(c.getPrenom(), i,2);
            Table_Admin.getModel().setValueAt(c.getAdresse(), i,3);
            Table_Admin.getModel().setValueAt(c.getEmail(), i,4);
            Table_Admin.getModel().setValueAt(c.getNumTel(), i,5);
            i++;
            System.out.println(i);
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

        p_bouton = new javax.swing.JPanel();
        bt_acceuil = new javax.swing.JButton();
        bt_compte_client = new javax.swing.JButton();
        bt_compte_prestataire = new javax.swing.JButton();
        bt_reclamation = new javax.swing.JButton();
        bt_statistique = new javax.swing.JButton();
        bt_offre = new javax.swing.JButton();
        bt_comtpe_admin = new javax.swing.JButton();
        bt_quitter = new javax.swing.JButton();
        p_Afficher = new javax.swing.JPanel();
        tb = new javax.swing.JToolBar();
        tb_bt_ajouter = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        tb_bt_modifier = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        tb_bt_supprimer = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        tb_bt_lister = new javax.swing.JButton();
        table_admin = new javax.swing.JScrollPane();
        Table_Admin = new javax.swing.JTable();
        B_Quitter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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

        getContentPane().add(p_bouton);
        p_bouton.setBounds(0, 0, 168, 323);

        p_Afficher.setBackground(new java.awt.Color(233, 213, 230));
        p_Afficher.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Afficher Admin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Wide Latin", 0, 14), new java.awt.Color(153, 0, 153))); // NOI18N

        tb.setBackground(new java.awt.Color(255, 204, 204));
        tb.setRollover(true);

        tb_bt_ajouter.setBackground(new java.awt.Color(255, 204, 204));
        tb_bt_ajouter.setText("Ajouter");
        tb_bt_ajouter.setFocusable(false);
        tb_bt_ajouter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tb_bt_ajouter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_bt_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_bt_ajouterActionPerformed(evt);
            }
        });
        tb.add(tb_bt_ajouter);
        tb.add(jSeparator1);

        tb_bt_modifier.setBackground(new java.awt.Color(255, 204, 204));
        tb_bt_modifier.setText("Modifier");
        tb_bt_modifier.setFocusable(false);
        tb_bt_modifier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tb_bt_modifier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_bt_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_bt_modifierActionPerformed(evt);
            }
        });
        tb.add(tb_bt_modifier);
        tb.add(jSeparator2);

        tb_bt_supprimer.setBackground(new java.awt.Color(255, 204, 204));
        tb_bt_supprimer.setText("Supprimer");
        tb_bt_supprimer.setFocusable(false);
        tb_bt_supprimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tb_bt_supprimer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_bt_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_bt_supprimerActionPerformed(evt);
            }
        });
        tb.add(tb_bt_supprimer);
        tb.add(jSeparator3);

        tb_bt_lister.setBackground(new java.awt.Color(255, 204, 204));
        tb_bt_lister.setText("Afficher tout");
        tb_bt_lister.setFocusable(false);
        tb_bt_lister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tb_bt_lister.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tb_bt_lister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_bt_listerActionPerformed(evt);
            }
        });
        tb.add(tb_bt_lister);

        Table_Admin.setAutoCreateRowSorter(true);
        Table_Admin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Nom", "Prenom", "Adresse", "E-mail", "Téléphone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_admin.setViewportView(Table_Admin);
        Table_Admin.getAccessibleContext().setAccessibleParent(Table_Admin);

        B_Quitter.setText("Quitter");
        B_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_QuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_AfficherLayout = new javax.swing.GroupLayout(p_Afficher);
        p_Afficher.setLayout(p_AfficherLayout);
        p_AfficherLayout.setHorizontalGroup(
            p_AfficherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_AfficherLayout.createSequentialGroup()
                .addGroup(p_AfficherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_AfficherLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(p_AfficherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tb, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p_AfficherLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(B_Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        p_AfficherLayout.setVerticalGroup(
            p_AfficherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_AfficherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(table_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_Quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        B_Quitter.getAccessibleContext().setAccessibleName("b_Quitter");

        getContentPane().add(p_Afficher);
        p_Afficher.setBounds(174, 0, 536, 323);

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

    private void tb_bt_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_bt_ajouterActionPerformed
        // TODO add your handling code here:
//        dispose();
//        new Ajouter_Admine();
       
    }//GEN-LAST:event_tb_bt_ajouterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
        p_Afficher.setVisible(false);
        Table_Admin.setVisible(false);
        }      
    
    private void tb_bt_listerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_bt_listerActionPerformed
        // TODO add your handling code here:
        Table_Admin.setVisible(true);
        p_Afficher.setVisible(true);

        remplirAdmin();
    }//GEN-LAST:event_tb_bt_listerActionPerformed
 
    
    private void B_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_QuitterActionPerformed

//       PageAcceuil ll=new  PageAcceuil();
//       ll.setVisible(true);
        //       dispose();
       
    }//GEN-LAST:event_B_QuitterActionPerformed

    private void bt_comtpe_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_comtpe_adminActionPerformed
        // TODO add your handling code here:
        remplirAdmin();
    }//GEN-LAST:event_bt_comtpe_adminActionPerformed

    private void tb_bt_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_bt_supprimerActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tb_bt_supprimerActionPerformed

    private void tb_bt_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_bt_modifierActionPerformed
////        // TODO add your handling code here:
    }//GEN-LAST:event_tb_bt_modifierActionPerformed

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
            java.util.logging.Logger.getLogger(Afficher_Admine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Afficher_Admine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Afficher_Admine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Afficher_Admine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Afficher_Admine().setVisible(true);
              
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Quitter;
    private javax.swing.JTable Table_Admin;
    private javax.swing.JButton bt_acceuil;
    private javax.swing.JButton bt_compte_client;
    private javax.swing.JButton bt_compte_prestataire;
    private javax.swing.JButton bt_comtpe_admin;
    private javax.swing.JButton bt_offre;
    private javax.swing.JButton bt_quitter;
    private javax.swing.JButton bt_reclamation;
    private javax.swing.JButton bt_statistique;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JPanel p_Afficher;
    private javax.swing.JPanel p_bouton;
    private javax.swing.JScrollPane table_admin;
    private javax.swing.JToolBar tb;
    private javax.swing.JButton tb_bt_ajouter;
    private javax.swing.JButton tb_bt_lister;
    private javax.swing.JButton tb_bt_modifier;
    private javax.swing.JButton tb_bt_supprimer;
    // End of variables declaration//GEN-END:variables
}
