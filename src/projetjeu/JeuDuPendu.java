package projetjeu;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeMath.random;
import static projetjeu.Gestion.JeuMot;

public class JeuDuPendu extends javax.swing.JFrame {
//déclaration de variable

    String let;
    String mot = "";
    String motInv = "";
    int ImageCoun = 0;

    //constucteur sans argument,paramètres de forme lors de l'ouverture
    public JeuDuPendu() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(this);
        this.setTitle("Jeu du Perdu");

        setImage();

        mot = Gestion.MotdeChoix.toUpperCase();
        motInv = Gestion.getMotInvisible(mot);
        tfMot.setText(motInv);
        tfJoueur.setText(LoginJeu.nom);
        tfScore.setText(Integer.toString(Joueur.getScore(tfJoueur.getText())));

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPictStart = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfJoueur = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfMot = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfScore = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        E = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G = new javax.swing.JButton();
        H = new javax.swing.JButton();
        I = new javax.swing.JButton();
        J = new javax.swing.JButton();
        K = new javax.swing.JButton();
        L = new javax.swing.JButton();
        M = new javax.swing.JButton();
        N = new javax.swing.JButton();
        O = new javax.swing.JButton();
        P = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        R = new javax.swing.JButton();
        S = new javax.swing.JButton();
        T = new javax.swing.JButton();
        U = new javax.swing.JButton();
        V = new javax.swing.JButton();
        W = new javax.swing.JButton();
        X = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btAllou = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        MenuJeu = new javax.swing.JMenu();
        jmiNouvPartie = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiQLogiciel = new javax.swing.JMenuItem();
        MenuAide = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nom du Joueur :");

        tfJoueur.setEditable(false);
        tfJoueur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfJoueur.setForeground(new java.awt.Color(0, 51, 204));
        tfJoueur.setEnabled(false);
        tfJoueur.setFocusable(false);
        tfJoueur.setHighlighter(null);
        tfJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJoueurActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setText(" Trouver le mot suivant :");

        tfMot.setEditable(false);
        tfMot.setBackground(new java.awt.Color(255, 255, 255));
        tfMot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfMot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMotActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Score :");

        tfScore.setEditable(false);
        tfScore.setBackground(new java.awt.Color(255, 255, 255));
        tfScore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfScore.setForeground(new java.awt.Color(255, 51, 102));
        tfScore.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfScore.setText("0");
        tfScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfScoreActionPerformed(evt);
            }
        });

        jToolBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        A.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        A.setText("A");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        B.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        B.setText("B");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        D.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        D.setText("D");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        E.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        E.setText("E");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        F.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        F.setText("F");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        G.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        G.setText("G");
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });

        H.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        H.setText("H");
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        I.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        I.setText("I");
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });

        J.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        J.setText("J");
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });

        K.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        K.setText("K");
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });

        L.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        L.setText("L");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        M.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        M.setText("M");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        N.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        N.setText("N");
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });

        O.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        O.setText("O");
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });

        P.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        P.setText("P");
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });

        Q.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Q.setText("Q");
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });

        R.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        R.setText("R");
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });

        S.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        S.setText("S");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });

        T.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        T.setText("T");
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });

        U.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        U.setText("U");
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });

        V.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        V.setText("V");
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });

        W.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        W.setText("W");
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });

        X.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        Y.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Y.setText("Y");
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });

        Z.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Z.setText("Z");
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Choisissez une lettre :");

        btAllou.setText(" Allusion");
        btAllou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAllouActionPerformed(evt);
            }
        });

        MenuJeu.setText("Jeu");
        MenuJeu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MenuJeuKeyPressed(evt);
            }
        });

        jmiNouvPartie.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmiNouvPartie.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmiNouvPartie.setText("Nouelle partie");
        jmiNouvPartie.setToolTipText("Cliquer ici pour commancer nouvelle partie de jeu");
        jmiNouvPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNouvPartieActionPerformed(evt);
            }
        });
        MenuJeu.add(jmiNouvPartie);
        MenuJeu.add(jSeparator1);

        jmiQLogiciel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jmiQLogiciel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmiQLogiciel.setText("Quitter le jeu");
        jmiQLogiciel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiQLogicielActionPerformed(evt);
            }
        });
        MenuJeu.add(jmiQLogiciel);

        MenuBar.add(MenuJeu);

        MenuAide.setText("Aide");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("A propose de");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MenuAide.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Regle de jeu");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        MenuAide.add(jMenuItem4);

        MenuBar.add(MenuAide);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(U, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Q, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(tfMot, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfJoueur))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(lbPictStart, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(tfScore, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAllou)
                        .addGap(125, 125, 125))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfMot, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A)
                            .addComponent(B)
                            .addComponent(C)
                            .addComponent(D)
                            .addComponent(E)
                            .addComponent(F))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(G)
                            .addComponent(H)
                            .addComponent(I)
                            .addComponent(J)
                            .addComponent(K)
                            .addComponent(L))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M)
                            .addComponent(N)
                            .addComponent(O)
                            .addComponent(P)
                            .addComponent(Q)
                            .addComponent(R))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(S)
                            .addComponent(T)
                            .addComponent(U)
                            .addComponent(V)
                            .addComponent(W)
                            .addComponent(X))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Y)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Z)
                                .addComponent(btAllou)))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPictStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfScore, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//fonction pour changer les images

    public void setImage() {
        String imgResource = "";
        imgResource = imgResource + String.valueOf(Gestion.ImgCounter) + ".png";
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(imgResource)));
        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(lbPictStart.getWidth(), lbPictStart.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        lbPictStart.setIcon(i);
    }
    
//fonction pour afficher une boîte de dialogue lorsque vous devinez des mots et perdez la partie

    public void dernierLettre() {
        // si vous devinez toutes les lettres du mot - afficher la boîte de dialogue. Lorsque vous appuyez sur le bouton UE, nous lançons un nouveau jeu.
        if (JeuMot == 0) {
            int p = JOptionPane.showConfirmDialog(null, "\nFelicitation!\nVous avez deviné le mot.\nCommancez nouveau jeu? ", "Gagnant", JOptionPane.YES_NO_OPTION);
            if (p == 0) {
                jmiNouvPartie.doClick();                
            }else {              
                enVisibleButtons();
                btAllou.setEnabled(false);
            }
        }
        //si le nombre d'erreurs est 6 - le jeu se termine. Lorsque vous appuyez sur le bouton OUI, nous lançons un nouveau jeu.
        if (Gestion.ImgCounter == 6) {
            int m = JOptionPane.showConfirmDialog(null, "\nVous avez perdu:(((  \nRepetez-vous encore fois?", "Perdant", JOptionPane.YES_NO_OPTION);
            if (m == 0) {
                jmiNouvPartie.doClick();              
            } else {
                tfMot.setText("");
                enVisibleButtons();
                btAllou.setEnabled(false);
            }
        }
    }
//Lorsque vous cliquez sur ce menu Item, nous transférons un nouveau jeu.
    private void jmiNouvPartieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNouvPartieActionPerformed
        //  tfMotVisible.setText(Gestion.MotdeChoix);
        mot = Gestion.MotdeChoix.toUpperCase();
        motInv = Gestion.getMotInvisible(mot);
        tfMot.setText(motInv);
        tfScore.setText(Integer.toString(Joueur.getScore(tfJoueur.getText())));
        VisibleButtons();
        btAllou.setEnabled(true);
        setImage();
    }//GEN-LAST:event_jmiNouvPartieActionPerformed
//Ouvrez le formulaire avec les règles du jeu
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegleJeu().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMenuItem4ActionPerformed
//Ouvrez le formulaire avec des informations sur le programme
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AProposDe().setVisible(true);
            }
        });
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void tfJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJoueurActionPerformed

    }//GEN-LAST:event_tfJoueurActionPerformed

    private void tfMotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMotActionPerformed

    }//GEN-LAST:event_tfMotActionPerformed
//fermer le programme
    private void jmiQLogicielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiQLogicielActionPerformed
       this.dispose();
    }//GEN-LAST:event_jmiQLogicielActionPerformed

//boutons et leurs gestionnaires
    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        let = "F";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        F.setEnabled(false);
        dernierLettre();
        setImage();
        

    }//GEN-LAST:event_FActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        let = "A";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        A.setEnabled(false);
        dernierLettre();
        setImage();
        

    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        let = "B";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        B.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        let = "C";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        C.setEnabled(false);
        dernierLettre();
        setImage();
        

    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        let = "D";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        D.setEnabled(false);
        dernierLettre();
        setImage();
        

    }//GEN-LAST:event_DActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        let = "E";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        E.setEnabled(false);
        dernierLettre();
        setImage();
        

    }//GEN-LAST:event_EActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        let = "G";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        G.setEnabled(false);
        dernierLettre();
        setImage();
      

    }//GEN-LAST:event_GActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        let = "H";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        H.setEnabled(false);
        dernierLettre();
        setImage();
        

    }//GEN-LAST:event_HActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        let = "I";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        I.setEnabled(false);
        dernierLettre();
        setImage();
        

    }//GEN-LAST:event_IActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        let = "J";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        J.setEnabled(false);
        dernierLettre();
        setImage();
        

    }//GEN-LAST:event_JActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        let = "K";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        K.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_KActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        let = "L";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        L.setEnabled(false);
        dernierLettre();
        setImage();
        

    }//GEN-LAST:event_LActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        let = "M";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        M.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_MActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        let = "N";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        N.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_NActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        let = "O";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        O.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_OActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        let = "P";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        P.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_PActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
        let = "Q";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        Q.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_QActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
        let = "R";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        R.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_RActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        let = "S";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        S.setEnabled(false);
        dernierLettre();
        setImage(); 
    }//GEN-LAST:event_SActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
        let = "T";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        T.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_TActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
        let = "U";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        U.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_UActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        let = "V";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        V.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_VActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
        let = "W";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        W.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_WActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        let = "X";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        X.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_XActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
        let = "Y";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        Y.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_YActionPerformed

    private void ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZActionPerformed
        let = "Z";
        motInv = tfMot.getText();
        tfMot.setText(Gestion.changeLettre(motInv, mot, let));
        tfScore.setText(String.valueOf(Joueur.getScore(LoginJeu.nom)));
        Z.setEnabled(false);
        dernierLettre();
        setImage();
    }//GEN-LAST:event_ZActionPerformed

    private void tfScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfScoreActionPerformed


    }//GEN-LAST:event_tfScoreActionPerformed

    private void MenuJeuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MenuJeuKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuJeuKeyPressed

    private void btAllouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAllouActionPerformed
        motInv = tfMot.getText();
        tfMot.setText(Gestion.allusionLettre(motInv, mot));   
      
        dernierLettre();
        setImage();
    }//GEN-LAST:event_btAllouActionPerformed

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
            java.util.logging.Logger.getLogger(JeuDuPendu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JeuDuPendu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JeuDuPendu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JeuDuPendu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JeuDuPendu().setVisible(true);
            }
        });
    }

    //procédure qui active les boutons
    private void VisibleButtons() {

        A.setEnabled(true);
        B.setEnabled(true);
        C.setEnabled(true);
        D.setEnabled(true);
        E.setEnabled(true);
        F.setEnabled(true);
        G.setEnabled(true);
        H.setEnabled(true);
        I.setEnabled(true);
        J.setEnabled(true);
        K.setEnabled(true);
        L.setEnabled(true);
        M.setEnabled(true);
        N.setEnabled(true);
        O.setEnabled(true);
        P.setEnabled(true);
        Q.setEnabled(true);
        R.setEnabled(true);
        S.setEnabled(true);
        T.setEnabled(true);
        U.setEnabled(true);
        V.setEnabled(true);
        W.setEnabled(true);
        X.setEnabled(true);
        Y.setEnabled(true);
        Z.setEnabled(true);
    }

    //procédure qui active les boutons

    private void enVisibleButtons() {

        A.setEnabled(false);
        B.setEnabled(false);
        C.setEnabled(false);
        D.setEnabled(false);
        E.setEnabled(false);
        F.setEnabled(false);
        G.setEnabled(false);
        H.setEnabled(false);
        I.setEnabled(false);
        J.setEnabled(false);
        K.setEnabled(false);
        L.setEnabled(false);
        M.setEnabled(false);
        N.setEnabled(false);
        O.setEnabled(false);
        P.setEnabled(false);
        Q.setEnabled(false);
        R.setEnabled(false);
        S.setEnabled(false);
        T.setEnabled(false);
        U.setEnabled(false);
        V.setEnabled(false);
        W.setEnabled(false);
        X.setEnabled(false);
        Y.setEnabled(false);
        Z.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JButton M;
    private javax.swing.JMenu MenuAide;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuJeu;
    private javax.swing.JButton N;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JButton btAllou;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jmiNouvPartie;
    private javax.swing.JMenuItem jmiQLogiciel;
    private javax.swing.JLabel lbPictStart;
    private javax.swing.JTextField tfJoueur;
    private javax.swing.JTextField tfMot;
    private javax.swing.JTextField tfScore;
    // End of variables declaration//GEN-END:variables
}
