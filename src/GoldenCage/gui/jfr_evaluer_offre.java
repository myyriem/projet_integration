package GoldenCage.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FGH
 */
public class jfr_evaluer_offre extends javax.swing.JFrame {

    public int n =0;
    public String c1,c2,c3,c4,c5 ="n";
    /**
     * Creates new form jfr_evaluer_offre
     */
    public jfr_evaluer_offre() {
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

        jp_evaluer = new javax.swing.JPanel();
        lb_photo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_description = new javax.swing.JTextArea();
        lb_descip = new javax.swing.JLabel();
        lb_descip1 = new javax.swing.JLabel();
        lb_descip2 = new javax.swing.JLabel();
        lb_descip3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jp_etoilenoire = new javax.swing.JPanel();
        lb_en5 = new javax.swing.JLabel();
        lb_en4 = new javax.swing.JLabel();
        lb_en3 = new javax.swing.JLabel();
        lb_en2 = new javax.swing.JLabel();
        lb_en1 = new javax.swing.JLabel();
        btn_noter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Evaluer Offre");
        setResizable(false);

        jp_evaluer.setBackground(new java.awt.Color(204, 204, 255));

        lb_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salle_de fete.jpg"))); // NOI18N

        txt_description.setColumns(20);
        txt_description.setForeground(new java.awt.Color(255, 204, 255));
        txt_description.setRows(5);
        txt_description.setText("El Boirak est une salle polyvalente, \nhaut de gamme et raffinée. \nElle offre un patio évoquant les constructions \nandalouses, ainsi qu'une grande salle couverte \net climatisée dont les baies vitrées donnent \nsur un vaste jardin boisé.");
        txt_description.setEnabled(false);
        jScrollPane1.setViewportView(txt_description);

        lb_descip.setFont(new java.awt.Font("Kunstler Script", 0, 48)); // NOI18N
        lb_descip.setForeground(new java.awt.Color(255, 51, 51));
        lb_descip.setText("El bourak");

        lb_descip1.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        lb_descip1.setForeground(new java.awt.Color(102, 102, 102));
        lb_descip1.setText("Description");

        lb_descip2.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        lb_descip2.setForeground(new java.awt.Color(255, 153, 153));
        lb_descip2.setText("Salle de fête");

        lb_descip3.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        lb_descip3.setForeground(new java.awt.Color(51, 51, 255));
        lb_descip3.setText("Prix : 1000 Dt");

        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reserver");

        jp_etoilenoire.setBackground(new java.awt.Color(255, 255, 255));

        lb_en5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg"))); // NOI18N
        lb_en5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_en5MouseClicked(evt);
            }
        });

        lb_en4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg"))); // NOI18N
        lb_en4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_en4MouseClicked(evt);
            }
        });

        lb_en3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg"))); // NOI18N
        lb_en3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_en3MouseClicked(evt);
            }
        });

        lb_en2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg"))); // NOI18N
        lb_en2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_en2MouseClicked(evt);
            }
        });

        lb_en1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg"))); // NOI18N
        lb_en1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_en1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_etoilenoireLayout = new javax.swing.GroupLayout(jp_etoilenoire);
        jp_etoilenoire.setLayout(jp_etoilenoireLayout);
        jp_etoilenoireLayout.setHorizontalGroup(
            jp_etoilenoireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_etoilenoireLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_en1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_en2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_en3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_en4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_en5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        jp_etoilenoireLayout.setVerticalGroup(
            jp_etoilenoireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_etoilenoireLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_etoilenoireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_en2)
                    .addComponent(lb_en3)
                    .addGroup(jp_etoilenoireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_en1)
                        .addComponent(lb_en4)
                        .addComponent(lb_en5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_noter.setText("Noter");

        javax.swing.GroupLayout jp_evaluerLayout = new javax.swing.GroupLayout(jp_evaluer);
        jp_evaluer.setLayout(jp_evaluerLayout);
        jp_evaluerLayout.setHorizontalGroup(
            jp_evaluerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_evaluerLayout.createSequentialGroup()
                .addGroup(jp_evaluerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_evaluerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_evaluerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_evaluerLayout.createSequentialGroup()
                                .addComponent(btn_noter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jp_etoilenoire, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_evaluerLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))))
                    .addGroup(jp_evaluerLayout.createSequentialGroup()
                        .addGroup(jp_evaluerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_evaluerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lb_descip1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_evaluerLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(lb_descip2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_evaluerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lb_descip, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_evaluerLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lb_descip3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_photo)))
                .addGap(26, 26, 26))
        );
        jp_evaluerLayout.setVerticalGroup(
            jp_evaluerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_evaluerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_evaluerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_evaluerLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lb_descip2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_descip, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_descip3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_descip1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_evaluerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_evaluerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jp_evaluerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jp_evaluerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_noter)
                            .addComponent(jp_etoilenoire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_evaluerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_evaluer, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jp_evaluer, javax.swing.GroupLayout.PREFERRED_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(709, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_en1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_en1MouseClicked
        // TODO add your handling code here:
        
        
            //System.out.println("aaa");
            lb_en1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg")));
            lb_en3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg")));
            lb_en4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg")));
            lb_en5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg")));  
            
        
        
        
    }//GEN-LAST:event_lb_en1MouseClicked

    private void lb_en2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_en2MouseClicked
        // TODO add your handling code here:
        
            lb_en1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg")));
            lb_en4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg")));
            lb_en5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg")));  
           
    }//GEN-LAST:event_lb_en2MouseClicked

    private void lb_en3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_en3MouseClicked
        // TODO add your handling code here:
        
            lb_en1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg")));
            lb_en5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg")));  
            
    }//GEN-LAST:event_lb_en3MouseClicked

    private void lb_en4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_en4MouseClicked
        // TODO add your handling code here:
   
            //System.out.println("aaa");
            lb_en1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_noire.jpg")));  
      
       
    }//GEN-LAST:event_lb_en4MouseClicked

    private void lb_en5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_en5MouseClicked
        // TODO add your handling code here:
       
            lb_en1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));
            lb_en5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etoile_jaune.jpg")));  
            
    }//GEN-LAST:event_lb_en5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jfr_comptClient jfr = new jfr_comptClient();
        jfr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(jfr_evaluer_offre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfr_evaluer_offre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfr_evaluer_offre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfr_evaluer_offre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfr_evaluer_offre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_noter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_etoilenoire;
    private javax.swing.JPanel jp_evaluer;
    private javax.swing.JLabel lb_descip;
    private javax.swing.JLabel lb_descip1;
    private javax.swing.JLabel lb_descip2;
    private javax.swing.JLabel lb_descip3;
    private javax.swing.JLabel lb_en1;
    private javax.swing.JLabel lb_en2;
    private javax.swing.JLabel lb_en3;
    private javax.swing.JLabel lb_en4;
    private javax.swing.JLabel lb_en5;
    private javax.swing.JLabel lb_photo;
    private javax.swing.JTextArea txt_description;
    // End of variables declaration//GEN-END:variables
}
