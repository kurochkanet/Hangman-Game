package projetjeu;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Gestion {
//déclaration de variable

    public static ArrayList<Joueur> JoueurDisponibles = new ArrayList<Joueur>();
    static String MotdeChoix = getMotVisible();
    static int JeuMot = 0;
    static int ImgCounter = 0;
    static char ranombutLettre=' ';

//une fonction qui retourne au hasard un mot de la liste
    public static String getMotVisible() {
        String[] dictionnaire = {"CHEVAL", "CHIEN", "CROCODILE", "CHAT", "PERROQUET", "AUTRUCHE", "DROMADAIRE", "vache", "cerf", "cog", "raton", "grenouille"};  //création du dictionnaire 
        int MotRandom = new Random().nextInt(dictionnaire.length);
        String Mot = (dictionnaire[MotRandom]);
        MotdeChoix = Mot;
        return MotdeChoix;
    }

//une fonction qui retourne le mot crypté
    public static String getMotInvisible(String word) {
        String Mot = getMotVisible();
        String FaireMotInvisible = "";
        JeuMot = word.length();
        ImgCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            FaireMotInvisible += "*";
        }
        return FaireMotInvisible;

    }

    //une fonction qui renvoie un mot après avoir appuyé sur des lettres. Dans le cas de deviner des lettres - il s'ouvre à l'utilisateur. En cas d'erreur, il complète le compteur d'erreurs.
    public static String changeLettre(String motInv, String mot, String let) {
        boolean bonneLettre = false;
        String b = "";
        char c = let.charAt(0);
        char[] charMot = mot.toCharArray();
        char[] charMotFinal = motInv.toCharArray();

        for (int i = 0; i < charMot.length; i++) {
            if (charMot[i] == c) {
                charMotFinal[i] = c;
                b = new String(charMotFinal);
                Joueur.setScore(LoginJeu.nom);
                bonneLettre = true;
                JeuMot--;
            }
            b = new String(charMotFinal);
        }
        if (bonneLettre == false) {
            ImgCounter++;

        }
        return b;
    }

    //une fonction qui affiche une lettre 
    public static String allusionLettre(String motInv, String mot) {
        boolean bonneLettre = false;
        String c = "";
      
//chercher les lettres qui doivent etre ouvertes
        char[] charMot = mot.toCharArray();
        char[] charMotFinal = motInv.toCharArray();
        ArrayList<Character> restOfChar = new ArrayList<Character>();
        
         for (int i = 0; i < charMot.length; i++){                   
                if (charMotFinal[i] == '*') {                    
                    restOfChar.add(charMot[i]);                   
                }}  
         
//choisir random lettre et affiche la
        
        int randomInt= new Random().nextInt(restOfChar.size());
        char randomChar = restOfChar.get(randomInt);    
        ranombutLettre = randomChar;
        for (int j = 0; j < charMot.length; j++) {
            if (charMot[j] == randomChar && charMot[j] !='*') {
                charMotFinal[j] = randomChar;
                c = new String(charMotFinal);
               
                bonneLettre = true;
                JeuMot--;
               
            }
            
            c = new String(charMotFinal);

        }
        return c;
    }

    public static ArrayList<Joueur> getJoueurDisponibles() {
        return JoueurDisponibles;
    }

//procédure pour ajouter un nouveau joueur à une liste existante

    /**
     *
     * @param nomPrenom
     * @param pass
     */
        public static void ajouterJoueur(String nomPrenom, String pass) {
        
        JoueurDisponibles.add(new Joueur(nomPrenom,pass));
    }

//remplir la table des joueurs
    public Gestion() {
        JoueurDisponibles.add(new Joueur("KurochkaGanna","123"));
        JoueurDisponibles.add(new Joueur("Joueur","123"));
        JoueurDisponibles.add(new Joueur("Joueur A","123", 12));
        JoueurDisponibles.add(new Joueur("JoueurB","123", 6));
        JoueurDisponibles.add(new Joueur("JoueurC","123", 2));
    }

    @Override
    public String toString() {
        return "JoueurDisponibles= " + JoueurDisponibles;
    }
    
   }
