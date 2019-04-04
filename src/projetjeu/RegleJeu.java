package projetjeu;

import java.awt.Color;


public class RegleJeu extends javax.swing.JFrame {


    public RegleJeu() {
        initComponents();
                this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(this);
        this.setTitle("Regles");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btOK = new javax.swing.JButton();

        jMenu1.setText("Jeu");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(" Bonjour cher joueur!\n\nSi vous voulez commencer le jeu, suivez les instructions suivantes:\n\nDans le champ \"Nom du joueur\" et \"Mot de passe\", entrez l'identifiant de l'utilisateur existant et cliquez sur \"OK\". \n\n Si votre joueur n'est pas déjà dans le jeu, cliquez sur le bouton \"Créer\". \nEntrez le nom et le nom du joueur. Cliquez sur OK.\nVous reviendrez automatiquement au formulaire de connexion et verrez que dans le champ \n\"Nom du joueur\" notre utilisateur est déjà spécifié. Cliquez sur OK Un formulaire avec le jeu s'ouvre.\n\n Dans le champ \"Nom du joueur\", vous voyez le joueur actuel et dans le champ SCORE, \nles points reçus par ce joueur. Nous voyons également un champ avec un mot crypté qu'il faut deviner.\n\nVous devez appuyer sur les boutons du clavier virtuel avec la souris. Lorsque vous appuyez \nsur une lettre du clavier, sa présence dans le mot est vérifiée et, si la lettre est incluse \ndans le mot, nous affichons cette lettre avec le mot. Le nombre de mouvements à deviner est \négal à la longueur du mot. Après avoir indiqué la dernière lettre, nous voyons les informations \navec félicitations et la proposition de commencer le prochain match. Lorsque vous appuyez sur\n\"Oui\", un nouveau mot crypté apparaîtra. Lorsque vous appuyez sur \"NON\", nous restons dans \nla forme actuelle.\n\n Si, lorsque vous appuyez sur une lettre, le chèque ne la trouve pas dans le mot - l'image\nde droite affiche l'image de la potence. Avec chaque erreur, l'image est terminée.Après 6 erreurs, \nun message apparaît pour vous informer que vous avez perdu la partie et une offre pour en commencer\n une nouvelle.\n\n Si vous voulez commencer une nouvelle partie, allez dans le menu Partie-Nouvelle partie.\n\n Si vous voulez quitter le jeu - allez au jeu - laissez le point de menu du jeu.\n\n Si vous voulez en savoir plus sur les règles du jeu - allez au point de menu \nAide - Règles du jeu.\n\n Si vous avez besoin d’informations sur le programme - allez au point de menu \nAide - À propos du jeu.");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Règles du Jeu de Pendu");

        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 262, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btOK)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        this.hide();
    }//GEN-LAST:event_btOKActionPerformed


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
            java.util.logging.Logger.getLogger(RegleJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegleJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegleJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegleJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegleJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
