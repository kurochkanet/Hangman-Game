package projetjeu;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class LoginJeu extends javax.swing.JFrame {
//déclaration de variable

    Gestion ges = new Gestion();
    static String nom = "";
    static int score = 0;
    int i = 0;

    //constucteur sans argument,paramètres de forme lors de l'ouverture
    public LoginJeu() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Bienvenue");
        tfNom1.setText(AjouterJoueur.nom);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBienvenue = new javax.swing.JLabel();
        lbNom = new javax.swing.JLabel();
        btOK = new javax.swing.JButton();
        btNew = new javax.swing.JButton();
        tfNom1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfMotDePasse = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbBienvenue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbBienvenue.setForeground(new java.awt.Color(102, 102, 255));
        lbBienvenue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBienvenue.setText("Bienvenue au jeu du pendu!");

        lbNom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNom.setText("Nom du joueur :");

        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        btNew.setText("Nouveau");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        tfNom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNom1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mot de passe :");

        tfMotDePasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMotDePasseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbBienvenue, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btNew)
                .addGap(83, 83, 83)
                .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfNom1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(tfMotDePasse))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBienvenue, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tfNom1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(tfMotDePasse))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNew)
                    .addComponent(btOK))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Gestionnaire de bouton OK. Recherchez un joueur existant et, en cas de découverte, ouvrez le formulaire avec le jeu.
    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed

        //verification que login ne est pas vide
        try {
            if (tfNom1.getText().equals("") && tfMotDePasse.getText().equals("")) //  JOptionPane.showMessageDialog(null, "Entrer votre Nom et Mot de passe!");
                      throw new Exception();
             //verification que login ne contene pas les chifres   
            else {
                if (Pattern.matches("^[ A-Za-z]+$", tfNom1.getText())) {

                    for (i = 0; i < ges.JoueurDisponibles.size(); i++) {
                        //verification que login existe
                        if (tfNom1.getText().equals(ges.JoueurDisponibles.get(i).getNom())
                                && tfMotDePasse.getText().equals(ges.JoueurDisponibles.get(i).getMotdePasse())) {
                            java.awt.EventQueue.invokeLater(new Runnable() {
                                public void run() {
                                    new JeuDuPendu().setVisible(true);
                                }
                            });
                            this.setVisible(false);
                            this.nom = ges.JoueurDisponibles.get(i).getNom();
                            this.score = ges.JoueurDisponibles.get(i).getScore();
                            break;
                        }
                    }
                    if (i == ges.JoueurDisponibles.size()) {
                        JOptionPane.showMessageDialog(null, "Votre Nom et/ou Mot de passe pas bonne!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Votre Nom ne doit pas contenir de chiffres!");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Entrer votre Nom et/ou Mot de passe!");
        }
    }//GEN-LAST:event_btOKActionPerformed

    //gestionnaire pour appuyer sur le bouton NEW. Ouvre le formulaire avec l'ajout d'un nouveau joueur.
    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterJoueur().setVisible(true);
            }
        });
        this.setVisible(false);

    }//GEN-LAST:event_btNewActionPerformed

    private void tfMotDePasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMotDePasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMotDePasseActionPerformed

    private void tfNom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNom1ActionPerformed

    }//GEN-LAST:event_tfNom1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNew;
    private javax.swing.JButton btOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbBienvenue;
    private javax.swing.JLabel lbNom;
    private javax.swing.JTextField tfMotDePasse;
    private javax.swing.JTextField tfNom1;
    // End of variables declaration//GEN-END:variables
}
