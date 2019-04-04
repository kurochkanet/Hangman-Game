
package projetjeu;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class AjouterJoueur extends javax.swing.JFrame {
    //déclaration de variable
    static String nom = "";
    
  
    public AjouterJoueur() {
        initComponents();
         this.setLocationRelativeTo(this);
        this.setTitle("Ajouter le nouveau joueur");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfAjoutPrenom = new javax.swing.JTextField();
        tfAjoutNom = new javax.swing.JTextField();
        btAjouter = new javax.swing.JButton();
        btQuitter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfMotPass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nom");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Prenom");

        btAjouter.setBackground(new java.awt.Color(153, 255, 153));
        btAjouter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAjouter.setText("Ajouter");
        btAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAjouterActionPerformed(evt);
            }
        });

        btQuitter.setBackground(new java.awt.Color(255, 102, 102));
        btQuitter.setText("Quitter");
        btQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuitterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mot de passe: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btAjouter)
                        .addGap(64, 64, 64)
                        .addComponent(btQuitter))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfMotPass, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(66, 66, 66)
                                .addComponent(tfAjoutPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(139, Short.MAX_VALUE)
                    .addComponent(tfAjoutNom, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(71, 71, 71)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(tfAjoutPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(tfMotPass)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAjouter)
                    .addComponent(btQuitter))
                .addGap(57, 57, 57))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(tfAjoutNom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(205, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Aller au formulaire de connexion
    private void btQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuitterActionPerformed
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJeu().setVisible(true);
            }
        });
          this.setVisible(false);

    }//GEN-LAST:event_btQuitterActionPerformed

    //Revenir au formulaire de connexion.  Procédure d'appel pour ajouter un nouveau joueur. 
    private void btAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAjouterActionPerformed
         
          //verification que login ne est pas vide
         try{
         if (tfAjoutNom.getText().equals("")&& tfAjoutPrenom.getText().equals("")&& tfMotPass.getText().equals(""))
           throw new Exception();  
             
        //verification que login ne contene pas les chifres
        else {
             if (Pattern.matches("^[ A-Za-z]+$", tfAjoutNom.getText()) && Pattern.matches("^[ A-Za-z]+$",tfAjoutPrenom.getText()))
          { 
        Gestion.ajouterJoueur(tfAjoutNom.getText()+" "+tfAjoutPrenom.getText(),tfMotPass.getText());
         java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new LoginJeu().setVisible(true);                            
                        }
                    });
          this.setVisible(false);                    
                    this.nom = tfAjoutNom.getText()+" "+tfAjoutPrenom.getText();
        }  else {
             
               JOptionPane.showMessageDialog(null, "Votre Nom et Prenom ne doit pas contenir de chiffres!");        
        }            
    }//GEN-LAST:event_btAjouterActionPerformed
     } catch (Exception ex){
         JOptionPane.showMessageDialog(null, "Entrer votre Nom,Prenom et Mot de passe!");
        }
                                                                            }

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
            java.util.logging.Logger.getLogger(AjouterJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterJoueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterJoueur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAjouter;
    private javax.swing.JButton btQuitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfAjoutNom;
    private javax.swing.JTextField tfAjoutPrenom;
    private javax.swing.JTextField tfMotPass;
    // End of variables declaration//GEN-END:variables
}
