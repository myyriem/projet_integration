/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package goldencage.frames;

import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import goldencage.dao.ClientDAO;
import goldencage.dao.ComptesDAO;
import goldencage.dao.PersonneDAO;
import goldencage.dao.PrestataireDAO;
import goldencage.entities.Client;
import goldencage.entities.Comptes;
import goldencage.entities.Personne;
import goldencage.entities.Prestataire;
import java.io.File;
import java.io.FileInputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author FGH
 */
public class jfr_inscription extends javax.swing.JFrame {

    boolean clt,prest =false;
    String url="";
    File image;
    FileInputStream fis;
    int len;
    
    /**
     * Creates new form jfr_inscription
     */
    public jfr_inscription() {
        initComponents();
        jlb_photo.setVisible(false);
        jlb_cin.setVisible(false);
        jtf_cin.setVisible(false);
        jlb_nom.setVisible(false);
        jtf_nom.setVisible(false);        
        jlb_prenom.setVisible(false);
        jtf_prenom.setVisible(false);        
        jlb_adresse.setVisible(false);
        jtf_adresse.setVisible(false);
        jlb_email.setVisible(false);
        jtf_email.setVisible(false);
        jlb_numTel.setVisible(false);
        jtf_numTel.setVisible(false);
        jlb_login.setVisible(false);
        jtf_login.setVisible(false);
        jlb_pwd.setVisible(false);
        jtf_pwd.setVisible(false);
        jlb_photo.setVisible(false);
        
        jlb_espace.setVisible(false);
        jtf_espace.setVisible(false);
        jb_retour.setVisible(false);
        jb_save.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfChooser = new javax.swing.JFileChooser();
        jlb_cin = new javax.swing.JLabel();
        jtf_cin = new javax.swing.JTextField();
        jlb_nom = new javax.swing.JLabel();
        jtf_nom = new javax.swing.JTextField();
        jlb_prenom = new javax.swing.JLabel();
        jtf_prenom = new javax.swing.JTextField();
        jlb_adresse = new javax.swing.JLabel();
        jtf_adresse = new javax.swing.JTextField();
        jlb_email = new javax.swing.JLabel();
        jtf_email = new javax.swing.JTextField();
        jlb_numTel = new javax.swing.JLabel();
        jtf_numTel = new javax.swing.JTextField();
        jlb_login = new javax.swing.JLabel();
        jtf_login = new javax.swing.JTextField();
        jlb_pwd = new javax.swing.JLabel();
        jtf_pwd = new javax.swing.JPasswordField();
        jlb_espace = new javax.swing.JLabel();
        jtf_espace = new javax.swing.JTextField();
        jlb_photo = new javax.swing.JLabel();
        jlb_client = new javax.swing.JLabel();
        jlb_prest = new javax.swing.JLabel();
        jb_client = new javax.swing.JButton();
        jb_prest = new javax.swing.JButton();
        jb_retour = new javax.swing.JButton();
        jb_save = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jlb_conect = new javax.swing.JLabel();
        jb_conect = new javax.swing.JButton();
        jlb_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inscription");
        setResizable(false);
        getContentPane().setLayout(null);

        jlb_cin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_cin.setForeground(new java.awt.Color(0, 51, 153));
        jlb_cin.setText("CIN :");
        getContentPane().add(jlb_cin);
        jlb_cin.setBounds(140, 210, 120, 30);
        getContentPane().add(jtf_cin);
        jtf_cin.setBounds(370, 220, 240, 30);

        jlb_nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_nom.setForeground(new java.awt.Color(0, 51, 153));
        jlb_nom.setText("Nom : ");
        getContentPane().add(jlb_nom);
        jlb_nom.setBounds(140, 250, 120, 30);
        getContentPane().add(jtf_nom);
        jtf_nom.setBounds(160, 310, 240, 80);

        jlb_prenom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_prenom.setForeground(new java.awt.Color(0, 51, 153));
        jlb_prenom.setText("Prénom : ");
        getContentPane().add(jlb_prenom);
        jlb_prenom.setBounds(140, 290, 120, 30);
        getContentPane().add(jtf_prenom);
        jtf_prenom.setBounds(280, 290, 240, 30);

        jlb_adresse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_adresse.setForeground(new java.awt.Color(0, 51, 153));
        jlb_adresse.setText("Adresse :");
        getContentPane().add(jlb_adresse);
        jlb_adresse.setBounds(140, 330, 120, 30);
        getContentPane().add(jtf_adresse);
        jtf_adresse.setBounds(280, 330, 240, 30);

        jlb_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_email.setForeground(new java.awt.Color(0, 51, 153));
        jlb_email.setText("E-mail :");
        getContentPane().add(jlb_email);
        jlb_email.setBounds(140, 370, 120, 30);
        getContentPane().add(jtf_email);
        jtf_email.setBounds(470, 380, 240, 30);

        jlb_numTel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_numTel.setForeground(new java.awt.Color(0, 51, 153));
        jlb_numTel.setText("N° de télèphone :");
        getContentPane().add(jlb_numTel);
        jlb_numTel.setBounds(140, 410, 120, 30);
        getContentPane().add(jtf_numTel);
        jtf_numTel.setBounds(280, 410, 240, 30);

        jlb_login.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlb_login.setForeground(new java.awt.Color(0, 51, 153));
        jlb_login.setText("Nom d’utilisateur :");
        getContentPane().add(jlb_login);
        jlb_login.setBounds(750, 340, 120, 30);
        getContentPane().add(jtf_login);
        jtf_login.setBounds(750, 370, 240, 30);

        jlb_pwd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_pwd.setForeground(new java.awt.Color(0, 51, 153));
        jlb_pwd.setText("Mot de passe :");
        getContentPane().add(jlb_pwd);
        jlb_pwd.setBounds(750, 400, 120, 30);
        getContentPane().add(jtf_pwd);
        jtf_pwd.setBounds(750, 430, 240, 30);

        jlb_espace.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_espace.setForeground(new java.awt.Color(0, 51, 153));
        jlb_espace.setText("Nom Espace :");
        getContentPane().add(jlb_espace);
        jlb_espace.setBounds(140, 450, 120, 30);
        getContentPane().add(jtf_espace);
        jtf_espace.setBounds(280, 450, 240, 30);

        jlb_photo.setForeground(new java.awt.Color(0, 0, 255));
        jlb_photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_photo.setText("Telecharger votre photo");
        jlb_photo.setToolTipText(""); // NOI18N
        jlb_photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlb_photo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_photoMouseClicked(evt);
            }
        });
        getContentPane().add(jlb_photo);
        jlb_photo.setBounds(840, 170, 130, 130);

        jlb_client.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_client.setForeground(new java.awt.Color(0, 0, 153));
        jlb_client.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_client.setText("Si vous etes un client taper ici !");
        getContentPane().add(jlb_client);
        jlb_client.setBounds(250, 160, 240, 50);

        jlb_prest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_prest.setForeground(new java.awt.Color(0, 0, 153));
        jlb_prest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_prest.setText("Si vous etes un prestataire de service taper ici !");
        getContentPane().add(jlb_prest);
        jlb_prest.setBounds(500, 160, 310, 50);

        jb_client.setText("Je suis un client");
        jb_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_clientActionPerformed(evt);
            }
        });
        getContentPane().add(jb_client);
        jb_client.setBounds(300, 220, 150, 50);

        jb_prest.setText("Je suis un prestataire");
        jb_prest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_prestActionPerformed(evt);
            }
        });
        getContentPane().add(jb_prest);
        jb_prest.setBounds(580, 220, 150, 50);

        jb_retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goldencage/icons/Reload.png"))); // NOI18N
        jb_retour.setText("    Retour   ");
        jb_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_retourActionPerformed(evt);
            }
        });
        getContentPane().add(jb_retour);
        jb_retour.setBounds(600, 520, 120, 40);

        jb_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goldencage/icons/Save.png"))); // NOI18N
        jb_save.setText("  Enregistrer ");
        jb_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_saveActionPerformed(evt);
            }
        });
        getContentPane().add(jb_save);
        jb_save.setBounds(30, 300, 130, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 142, 920, 10);

        jlb_conect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlb_conect.setForeground(new java.awt.Color(0, 0, 153));
        jlb_conect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_conect.setText("Si vous avez deja un compte taper ici pour vous connecter ");
        getContentPane().add(jlb_conect);
        jlb_conect.setBounds(300, 290, 400, 50);

        jb_conect.setText("Se connecter");
        jb_conect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_conectActionPerformed(evt);
            }
        });
        getContentPane().add(jb_conect);
        jb_conect.setBounds(430, 350, 150, 50);

        jlb_background.setForeground(new java.awt.Color(0, 51, 153));
        jlb_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goldencage/images/jfr_insrci_bg.jpg"))); // NOI18N
        getContentPane().add(jlb_background);
        jlb_background.setBounds(0, 0, 1000, 600);

        setSize(new java.awt.Dimension(1016, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_clientActionPerformed
        // TODO add your handling code here:
        clt=true;
        jlb_photo.setVisible(true);
        jlb_cin.setVisible(true);
        jtf_cin.setVisible(true);
        jlb_nom.setVisible(true);
        jtf_nom.setVisible(true);        
        jlb_prenom.setVisible(true);
        jtf_prenom.setVisible(true);        
        jlb_adresse.setVisible(true);
        jtf_adresse.setVisible(true);
        jlb_email.setVisible(true);
        jtf_email.setVisible(true);
        jlb_numTel.setVisible(true);
        jtf_numTel.setVisible(true);
        jlb_login.setVisible(true);
        jtf_login.setVisible(true);
        jlb_pwd.setVisible(true);
        jtf_pwd.setVisible(true);
        
        jlb_client.setVisible(false);
        jb_client.setVisible(false);
        jlb_prest.setVisible(false);
        jb_prest.setVisible(false);
        jlb_conect.setVisible(false);
        jb_conect.setVisible(false);
        
        jb_retour.setVisible(true);
        jb_save.setVisible(true);
    }//GEN-LAST:event_jb_clientActionPerformed

    private void jb_prestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_prestActionPerformed
        // TODO add your handling code here:
        prest=true;
        jlb_photo.setVisible(true);
        jlb_cin.setVisible(true);
        jtf_cin.setVisible(true);
        jlb_nom.setVisible(true);
        jtf_nom.setVisible(true);        
        jlb_prenom.setVisible(true);
        jtf_prenom.setVisible(true);        
        jlb_adresse.setVisible(true);
        jtf_adresse.setVisible(true);
        jlb_email.setVisible(true);
        jtf_email.setVisible(true);
        jlb_numTel.setVisible(true);
        jtf_numTel.setVisible(true);
        jlb_login.setVisible(true);
        jtf_login.setVisible(true);
        jlb_pwd.setVisible(true);
        jtf_pwd.setVisible(true);
        jlb_espace.setVisible(true);
        jtf_espace.setVisible(true);
        
        jlb_conect.setVisible(false);
        jb_conect.setVisible(false);
        jlb_client.setVisible(false);
        jb_client.setVisible(false);
        jlb_prest.setVisible(false);
        jb_prest.setVisible(false);
        
        jb_save.setVisible(true);
        jb_retour.setVisible(true);
    }//GEN-LAST:event_jb_prestActionPerformed

    private void jb_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_retourActionPerformed
        // TODO add your handling code here:
        clt=false;
        prest=false;
        
        jlb_photo.setVisible(false);
        jlb_cin.setVisible(false);
        jtf_cin.setVisible(false);
        jlb_nom.setVisible(false);
        jtf_nom.setVisible(false);        
        jlb_prenom.setVisible(false);
        jtf_prenom.setVisible(false);        
        jlb_adresse.setVisible(false);
        jtf_adresse.setVisible(false);
        jlb_email.setVisible(false);
        jtf_email.setVisible(false);
        jlb_numTel.setVisible(false);
        jtf_numTel.setVisible(false);
        jlb_login.setVisible(false);
        jtf_login.setVisible(false);
        jlb_pwd.setVisible(false);
        jtf_pwd.setVisible(false);
        jlb_photo.setVisible(false);
        jlb_espace.setVisible(false);
        jtf_espace.setVisible(false);
        
        jlb_client.setVisible(true);
        jb_client.setVisible(true);
        jlb_prest.setVisible(true);
        jb_prest.setVisible(true);
        jlb_conect.setVisible(true);
        jb_conect.setVisible(true);
        
        jb_save.setVisible(false);
        jb_retour.setVisible(false);
    }//GEN-LAST:event_jb_retourActionPerformed

    private void jb_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_saveActionPerformed
        // TODO add your handling code here:
        
        if (jtf_cin.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Veuillez donner le N° de votre cin ","Attention", JOptionPane.INFORMATION_MESSAGE);
        }else if (jtf_nom.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Veuillez donner votre nom","Attention", JOptionPane.INFORMATION_MESSAGE);
        }else if (jtf_prenom.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Veuillez donner votre prenom","Attention", JOptionPane.INFORMATION_MESSAGE);
        }else if (jtf_adresse.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Veuillez donner votre adresse","Attention", JOptionPane.INFORMATION_MESSAGE);
        }else if (jtf_email.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Veuillez donner votre e-mail ","Attention", JOptionPane.INFORMATION_MESSAGE);
        }else if (jtf_numTel.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Veuillez donner votre N° de télèphone","Attention", JOptionPane.INFORMATION_MESSAGE);
        }else if (jtf_login.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Veuillez donner un login ","Attention", JOptionPane.INFORMATION_MESSAGE);
        }else if(jtf_pwd.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Veuillez donner un mot de passe ","Attention", JOptionPane.INFORMATION_MESSAGE);
        }else if (url.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Aucune image choisit !","Attention", JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            ComptesDAO codao = new ComptesDAO();
            Comptes co = new Comptes();
            List<Comptes> listecomptes = new ArrayList<Comptes>();
            co.setLogin(jtf_login.getText());
            co.setMotDePasse(jtf_pwd.getText());
            
            boolean logExiste=false;
            listecomptes = codao.afficherComptes();
            for(Comptes c : listecomptes)
            {
                if(co.getLogin().equals(c.getLogin()))
                {
                    JOptionPane.showMessageDialog(this, "Ce login existe deja ! Veuillez chosir un autre.","Attention", JOptionPane.INFORMATION_MESSAGE);
                    logExiste=true;
                }
            }
            PersonneDAO pdao=new PersonneDAO();
            List<Personne> listePersonne = new ArrayList<Personne>();
            listePersonne =pdao.afficherlesPersonnes();
            boolean cinExiste=false;
            
            for(Personne p : listePersonne)
            {
                if(p.getCin() == Integer.parseInt(jtf_cin.getText()))
                {
                    JOptionPane.showMessageDialog(this, "Ce N° de cin existe deja ! Veuillez chosir un autre.","Attention", JOptionPane.INFORMATION_MESSAGE);
                    cinExiste=true;
                }
            }
            
            if (!logExiste && !cinExiste)
            {
                if(clt)
                {
                    co.setTypeCompte("Client");
                    codao.insertComptes(co);
                    int id = codao.rechercherIdComptesByLogin(jtf_login.getText());
                    Client clt =new Client();
                    ClientDAO cltDao = new ClientDAO();
                    clt.setIdCompte(id);
                    clt.setCinClient(Integer.parseInt(jtf_cin.getText()));
                    clt.setCin(Integer.parseInt(jtf_cin.getText()));
                    clt.setNom(jtf_nom.getText());
                    clt.setPrenom(jtf_prenom.getText());
                    clt.setAdresse(jtf_adresse.getText());
                    clt.setEmail(jtf_email.getText());
                    clt.setTelephone(Integer.parseInt(jtf_numTel.getText()));
                    cltDao.insertPersonne(clt,fis,len);
                    cltDao.insertClient(clt);
                    JOptionPane.showMessageDialog(this, "Succès. Vous allez etre redirigé vers votre compte", "Information", JOptionPane.INFORMATION_MESSAGE);
                    jfr_compteClient jfr = new jfr_compteClient();
                    jfr.setVisible(true);
                    jfr.setIdCompte(id);
                    this.setVisible(false);
                }else if (prest)
                {
                    co.setTypeCompte("Prestataire");
                    codao.insertComptes(co);
                    int id = codao.rechercherIdComptesByLogin(jtf_login.getText());
                    Prestataire prest =new Prestataire();
                    PrestataireDAO prestDao = new PrestataireDAO();
                    prest.setIdCompte(id);
                    prest.setCinPrestataire(Integer.parseInt(jtf_cin.getText()));
                    prest.setCin(Integer.parseInt(jtf_cin.getText()));
                    prest.setNom(jtf_nom.getText());
                    prest.setPrenom(jtf_prenom.getText());
                    prest.setAdresse(jtf_adresse.getText());
                    prest.setEmail(jtf_email.getText());
                    prest.setTelephone(Integer.parseInt(jtf_numTel.getText()));
                    prest.setNomEspace(jtf_espace.getText());
                    prestDao.insertPersonne(prest,fis,len);
                    prestDao.insertPrestataire(prest);
                    JOptionPane.showMessageDialog(this, "Succès. Vous allez etre redirigé vers votre compte", "Information", JOptionPane.INFORMATION_MESSAGE);
                    jfr_comptePrestataire jfr = new jfr_comptePrestataire();
                    jfr.setVisible(true);
                    jfr.setIdCompte(id);
                    this.setVisible(false);
                }
            }
            
        }
    }//GEN-LAST:event_jb_saveActionPerformed

    private void jb_conectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_conectActionPerformed
        // TODO add your handling code here:
        jfr_connexion jfr = new jfr_connexion();
        jfr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_conectActionPerformed

    private void jlb_photoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_photoMouseClicked
        // TODO add your handling code here:
        FileFilter ff = new FileNameExtensionFilter("JPEG File", "jpg","jpeg");
        jfChooser.setFileFilter(ff);
        int n = jfChooser.showOpenDialog(this);
        if(n==jfChooser.APPROVE_OPTION)
        {
            url = jfChooser.getSelectedFile().getAbsolutePath();
            try {
                image =new File(url);
                fis =new FileInputStream(image);
                len = (int)image.length();




            } catch (Exception e) {
                e.printStackTrace();
            }
        } 
    }//GEN-LAST:event_jlb_photoMouseClicked

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
                 //System.out.println(info.getName());
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                }*/
                UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
                

            }

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfr_connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(jfr_connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfr_inscription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_client;
    private javax.swing.JButton jb_conect;
    private javax.swing.JButton jb_prest;
    private javax.swing.JButton jb_retour;
    private javax.swing.JButton jb_save;
    private javax.swing.JFileChooser jfChooser;
    private javax.swing.JLabel jlb_adresse;
    private javax.swing.JLabel jlb_background;
    private javax.swing.JLabel jlb_cin;
    private javax.swing.JLabel jlb_client;
    private javax.swing.JLabel jlb_conect;
    private javax.swing.JLabel jlb_email;
    private javax.swing.JLabel jlb_espace;
    private javax.swing.JLabel jlb_login;
    private javax.swing.JLabel jlb_nom;
    private javax.swing.JLabel jlb_numTel;
    private javax.swing.JLabel jlb_photo;
    private javax.swing.JLabel jlb_prenom;
    private javax.swing.JLabel jlb_prest;
    private javax.swing.JLabel jlb_pwd;
    private javax.swing.JTextField jtf_adresse;
    private javax.swing.JTextField jtf_cin;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_espace;
    private javax.swing.JTextField jtf_login;
    private javax.swing.JTextField jtf_nom;
    private javax.swing.JTextField jtf_numTel;
    private javax.swing.JTextField jtf_prenom;
    private javax.swing.JPasswordField jtf_pwd;
    // End of variables declaration//GEN-END:variables
}
