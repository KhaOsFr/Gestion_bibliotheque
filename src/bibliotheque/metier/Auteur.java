package bibliotheque.metier;

import java.util.ArrayList;
import java.util.List;

public class Auteur {
    private List<Ouvrage> liste_ouvrages = new ArrayList<>();
    private String nom;
    private String prenom;
    private String nationalité;

    public Auteur(String nom, String prenom, String nationalité) {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalité = nationalité;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNationalité() {
        return nationalité;
    }

    public void setNationalité(String nationalité) {
        this.nationalité = nationalité;
    }

    public List<Ouvrage> getListe_ouvrages() {
        return liste_ouvrages;
    }

    public void setListe_ouvrages(List<Ouvrage> liste_ouvrages) {
        this.liste_ouvrages = liste_ouvrages;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "liste_ouvrages=" + liste_ouvrages +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nationalité='" + nationalité + '\'' +
                '}';
    }
}
