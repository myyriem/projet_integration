
package GoldenCage.gui;

import javax.swing.UIManager;
import de.javasoft.plaf.synthetica.*;
import goldencage.dao.ComptesDAO;
import goldencage.entities.Comptes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import static chrriis.dj.nativeswing.swtimpl.NativeInterface.runEventPump;
import chrriis.dj.nativeswing.swtimpl.NativeInterfaceListener;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import goldencage.facebook.RecupToken;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;


public class jfr_connexion extends javax.swing.JFrame {
    public static String API_KEY = "410047825806487";
    public static String SECRET = "4bf9ec05eef97a19e081a1d72f488626";

    public static String firstRequest = "https://graph.facebook.com/oauth/authorize?"
    + "client_id="
    + API_KEY
    + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
    + "scope=publish_stream,offline_access,create_event,read_stream,email,user_birthday";
  
    public static String secondRequest="https://graph.facebook.com/oauth/access_token?"
    + "client_id="
    + API_KEY
    + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
    + "client_secret=" + SECRET + "&code=";

    public static String access_token = "410047825806487|c0nfaze_YldM4-mu27XME3EHK0Y";
    public static boolean firstRequestDone = false;
    public static boolean secondRequestDone = false;
    
    public int idCompte;
    
    String login="ko";
    int i =0;
    Timer timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                i++;
                if(i==3)
                {
                    if (login.equals("ko"))
                    {
                        jtf_login.setText("");
                        jtf_mdp.setText("");
                        jtf_login.setEnabled(true);
                        jtf_mdp.setEnabled(true);
                        jProgressBar1.setVisible(false);
                        jlb_invalide.setVisible(true);
                        
                    }
                    else if (login.equals("admin"))
                    {
                        jfr_compteAdmin jf = new jfr_compteAdmin();
                        jf.setVisible(true);
                        jf.setIdCompte(idCompte);
                        dispose();
                    }
                    else if (login.equals("client"))
                    {
                        jfr_compteClient jf = new jfr_compteClient();
                        jf.setVisible(true);
//                        jf.setIdCompte(idCompte);
                        dispose();
                    }else if (login.equals("prestataire"))
                    {
                        jfr_comptePrestataire jf = new jfr_comptePrestataire();
                        jf.setVisible(true);
                        jf.setIdCompte(idCompte);
                        dispose();
                    }else if (login.equals("superAdmin"))
                    {
                        jfr_compteAdmin jf = new jfr_compteAdmin();
                        jf.setVisible(true);
                        jf.setIdCompte(idCompte);
                        System.out.println("super admin");
                        dispose();
                    }
                    else if(login.equals("fb"))
                    {
                        
                    }
                   else
                    {
                        i=0;
                        timer.stop();
                    }
                }
                
                    
            }
        });

    
    
    

    /**
     * Creates new form jfr_connexion
     */
    public jfr_connexion() {
        NativeInterface.open();
        NativeInterface.initialize();
        
        ComptesDAO compDAO= new ComptesDAO();
        List<Comptes> comptes = compDAO.afficherComptes();
        if(comptes.size()==0){
            
        }
        else
        {
            initComponents();
            jProgressBar1.setVisible(false);
            jlb_invalide.setVisible(false);
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

        jlb_goldencage = new javax.swing.JLabel();
        jlb_pwd = new javax.swing.JLabel();
        jlb_login = new javax.swing.JLabel();
        jtf_login = new javax.swing.JTextField();
        jb_connexion = new javax.swing.JButton();
        jb_inscription = new javax.swing.JButton();
        jb_quitter = new javax.swing.JButton();
        jb_fb = new javax.swing.JButton();
        jtf_mdp = new javax.swing.JPasswordField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jlb_invalide = new javax.swing.JLabel();
        jlb_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connexion");
        setResizable(false);
        getContentPane().setLayout(null);

        jlb_goldencage.setBackground(new java.awt.Color(0, 153, 255));
        jlb_goldencage.setFont(new java.awt.Font("Edwardian Script ITC", 1, 48)); // NOI18N
        jlb_goldencage.setForeground(new java.awt.Color(51, 51, 255));
        jlb_goldencage.setText("Golden Cage");
        getContentPane().add(jlb_goldencage);
        jlb_goldencage.setBounds(70, 80, 320, 57);

        jlb_pwd.setBackground(new java.awt.Color(0, 153, 255));
        jlb_pwd.setFont(new java.awt.Font("Freestyle Script", 0, 36)); // NOI18N
        jlb_pwd.setForeground(new java.awt.Color(51, 51, 255));
        jlb_pwd.setText("Mot de passe");
        getContentPane().add(jlb_pwd);
        jlb_pwd.setBounds(580, 190, 170, 40);

        jlb_login.setBackground(new java.awt.Color(0, 153, 255));
        jlb_login.setFont(new java.awt.Font("Freestyle Script", 0, 36)); // NOI18N
        jlb_login.setForeground(new java.awt.Color(51, 51, 255));
        jlb_login.setText("Nom d’utilisateur");
        getContentPane().add(jlb_login);
        jlb_login.setBounds(570, 100, 200, 40);

        jtf_login.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtf_login.setForeground(new java.awt.Color(0, 0, 102));
        jtf_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_loginActionPerformed(evt);
            }
        });
        getContentPane().add(jtf_login);
        jtf_login.setBounds(580, 140, 180, 30);

        jb_connexion.setBackground(new java.awt.Color(255, 255, 255));
        jb_connexion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_connexion.setForeground(new java.awt.Color(0, 0, 153));
        jb_connexion.setText("Connexion");
        jb_connexion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb_connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_connexionActionPerformed(evt);
            }
        });
        getContentPane().add(jb_connexion);
        jb_connexion.setBounds(660, 310, 110, 30);

        jb_inscription.setBackground(new java.awt.Color(255, 255, 255));
        jb_inscription.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_inscription.setForeground(new java.awt.Color(0, 0, 153));
        jb_inscription.setText("S'inscrire");
        jb_inscription.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb_inscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_inscriptionActionPerformed(evt);
            }
        });
        getContentPane().add(jb_inscription);
        jb_inscription.setBounds(580, 370, 130, 30);

        jb_quitter.setBackground(new java.awt.Color(255, 255, 255));
        jb_quitter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_quitter.setForeground(new java.awt.Color(0, 0, 153));
        jb_quitter.setText("Quitter");
        jb_quitter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_quitterActionPerformed(evt);
            }
        });
        getContentPane().add(jb_quitter);
        jb_quitter.setBounds(580, 430, 130, 30);

        jb_fb.setBackground(new java.awt.Color(102, 102, 255));
        jb_fb.setForeground(new java.awt.Color(0, 0, 102));
        jb_fb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goldencage/images/btn_fb.png"))); // NOI18N
        jb_fb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb_fb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_fbActionPerformed(evt);
            }
        });
        getContentPane().add(jb_fb);
        jb_fb.setBounds(510, 310, 120, 30);
        getContentPane().add(jtf_mdp);
        jtf_mdp.setBounds(581, 230, 180, 30);

        jProgressBar1.setBackground(new java.awt.Color(102, 255, 102));
        jProgressBar1.setForeground(new java.awt.Color(102, 255, 102));
        jProgressBar1.setMaximum(5);
        jProgressBar1.setIndeterminate(true);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(600, 270, 146, 14);

        jlb_invalide.setForeground(new java.awt.Color(255, 0, 0));
        jlb_invalide.setText("Verifier votre login et mot de passe");
        jlb_invalide.setToolTipText("");
        getContentPane().add(jlb_invalide);
        jlb_invalide.setBounds(590, 270, 170, 30);

        jlb_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/goldencage/images/bg_jfr_connexion.jpg"))); // NOI18N
        jlb_background.setText("a");
        getContentPane().add(jlb_background);
        jlb_background.setBounds(0, 0, 800, 600);

        setSize(new java.awt.Dimension(809, 641));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_loginActionPerformed

    private void jb_connexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_connexionActionPerformed
        // TODO add your handling code here:
        String log= jtf_login.getText();
        String mdp = jtf_mdp.getText();
        
        ComptesDAO cDao = new ComptesDAO();
        Comptes c = cDao.rechercherComptesByLoginAndPassword(log,mdp);
        login="ko";
        
        if(c.getTypeCompte()!=null)
        {
            if(c.getTypeCompte().equals("client"))
            {
                idCompte=c.getIdCompte();
                login="client";
            }
            else if (c.getTypeCompte().equals("admin"))
            {
                idCompte=c.getIdCompte();
                login="admin";
            }
            else if(c.getTypeCompte().equals("prestataire"))
            {
                idCompte=c.getIdCompte();
                login="prestataire";
            }
            else
            {
                idCompte=c.getIdCompte();
                login="superAdmin";
            }
        }
  
        jtf_login.setEnabled(false);
        jtf_mdp.setEnabled(false);
        jlb_invalide.setVisible(false);
        jProgressBar1.setVisible(true);
        timer.start();

//        jfr_compteAdmin jf = new jfr_compteAdmin();
//        jf.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_jb_connexionActionPerformed

    private void jb_inscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_inscriptionActionPerformed
        // TODO add your handling code here:
        jfr_inscription jfr = new jfr_inscription();
        jfr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_inscriptionActionPerformed

    private void jb_quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_quitterActionPerformed
        // TODO add your handling code here:
        int n= JOptionPane.showConfirmDialog(this, "Quitter l'application ?", "Quitter", JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION)
        {
            this.dispose(); 
        }
    }//GEN-LAST:event_jb_quitterActionPerformed

    private void jb_fbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_fbActionPerformed
        // TODO add your handling code here:
        timer.start();
        jProgressBar1.setVisible(true);
        login="fb";
        jtf_login.setEnabled(false);
        jtf_mdp.setEnabled(false);
        
        final JFrame authFrame = new JFrame();
    // Create the JWebBrowser and add the WebBrowserAdapter
    JPanel webBrowserPanel = new JPanel(new BorderLayout());
    final JWebBrowser webBrowser = new JWebBrowser();
    webBrowser.setMenuBarVisible(false);
    webBrowser.setButtonBarVisible(false);
    webBrowser.setLocationBarVisible(false);
    webBrowser.navigate(firstRequest);
    webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
      @Override
      public void locationChanged(WebBrowserNavigationEvent e) {
        super.locationChanged(e);
        // Check if first request was not done
        if (!firstRequestDone) {
          // Check if you left the location and were redirected to the next 
          // location
          if (e.getNewResourceLocation().contains("http://www.facebook.com/connect/login_success.html?code=")){
            // If it successfully redirects you, get the verification code
            // and go for a second request
            String[] splits = e.getNewResourceLocation().split("=");
            String stage2temp = secondRequest + splits[1];
              //System.out.println("First ="+splits[1]);
            webBrowser.navigate(stage2temp);
            firstRequestDone = true;
          }
        } else {
          // If secondRequest is not done yet, you perform this and get the 
          // access_token
          if (!secondRequestDone) {
            //System.out.println(webBrowser.getHTMLContent());
            // Create reader with the html content
            StringReader readerSTR = new StringReader(webBrowser.getHTMLContent());
            // Create a callback for html parser
            HTMLEditorKit.ParserCallback callback = 
            new HTMLEditorKit.ParserCallback() {
                @Override
              public void handleText(char[] data,int pos) {
                webBrowser.setHTMLContent("");
                // because there is only one line with the access_token 
                // in the html content you can parse it
                webBrowser.setHTMLContent("");
                String string = new String(data);
                String[] temp1 = string.split("&");
                System.out.println(temp1);
                webBrowser.setHTMLContent("");
                String[] temp2 = temp1[0].split("=");
                webBrowser.setHTMLContent("");
                access_token = temp2[1];
                
                RecupToken.main(access_token);
                
                dispose();
                
              }
            };
            try {
              // Call the parse method 
              new ParserDelegator().parse(readerSTR,callback,true);
            } catch (IOException e1) {
              e1.printStackTrace();
            }
            // After everything is done, you can dispose the jframe
            authFrame.dispose();      
          }
        }
      }
    });
    webBrowserPanel.add(webBrowser,BorderLayout.CENTER);
    authFrame.add(webBrowserPanel);
    authFrame.setSize(1000, 600);
    authFrame.setResizable(false);
    authFrame.setLocationRelativeTo(null);
    authFrame.setVisible(true);
    }//GEN-LAST:event_jb_fbActionPerformed

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
                new jfr_connexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JButton jb_connexion;
    private javax.swing.JButton jb_fb;
    private javax.swing.JButton jb_inscription;
    private javax.swing.JButton jb_quitter;
    private javax.swing.JLabel jlb_background;
    private javax.swing.JLabel jlb_goldencage;
    private javax.swing.JLabel jlb_invalide;
    private javax.swing.JLabel jlb_login;
    private javax.swing.JLabel jlb_pwd;
    private javax.swing.JTextField jtf_login;
    private javax.swing.JPasswordField jtf_mdp;
    // End of variables declaration//GEN-END:variables
}
