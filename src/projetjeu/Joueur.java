
package projetjeu;

import java.util.Objects;
import static projetjeu.Gestion.JoueurDisponibles;


public class Joueur {
      public String nom;
      public String motdePasse;
      public int score;

      //constructeur avec 2 argument
    public Joueur(String nom,String motPasse) {
        this.nom = nom;
        this.motdePasse=motPasse;
        this.score = 0;
    }

    public String getMotdePasse() {
        return motdePasse;
    }

    public void setMotdePasse(String motdePasse) {
        this.motdePasse = motdePasse;
    }

    //constructeur avec 3 argument
    public Joueur(String nom,String pass, int score) {
        this.nom = nom;
        this.motdePasse=pass;
        this.score = score;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    //une fonction qui donnee score actuelle
     public static int getScore(String nomPrenom) {
        int getscore=0;
        for (int i = 0; i < JoueurDisponibles.size(); i++) {
            if (nomPrenom.equals(JoueurDisponibles.get(i).getNom())) {
                getscore = JoueurDisponibles.get(i).getScore();
            }
        }        
        return getscore;
    }
     
       public static void setScore(String nomPrenom) {      
        for (int i = 0; i < JoueurDisponibles.size(); i++) {
            if (nomPrenom.equals(JoueurDisponibles.get(i).getNom())) {
           JoueurDisponibles.get(i).setScore(JoueurDisponibles.get(i).getScore()+1);
            }  } 
    }          

    public void setScore(int score) {
        this.score = score;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Joueur other = (Joueur) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Joueur:" + "nom = " + nom + ", score = " + score;
    }
}
