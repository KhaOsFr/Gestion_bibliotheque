package bibliotheque.metier;

import java.util.*;

public class Exemplaire {
    private Ouvrage ouvrage;
    private List<Location> liste_location = new ArrayList<>();
    private Rayon rayon;
    private String matricule;
    private String descriptionEtat;

    public Exemplaire(Ouvrage ouvrage, List<Location> liste_location, Rayon rayon, String matricule, String descriptionEtat) {
        this.ouvrage = ouvrage;
        this.liste_location = liste_location;
        this.rayon = rayon;
        this.matricule = matricule;
        this.descriptionEtat = descriptionEtat;
    }

    public Exemplaire(String matricule, String descriptionEtat, Ouvrage ouvrage) {
        this.matricule = matricule;
        this.descriptionEtat = descriptionEtat;
        this.ouvrage = ouvrage;
    }

    public List<Location> getListe_location() {
        return liste_location;
    }

    public void setListe_location(List<Location> liste_location) {
        this.liste_location = liste_location;
    }

    public Rayon getRayon() {
        return rayon;
    }

    public void setRayon(Rayon rayon) {
        this.rayon = rayon;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getDescriptionEtat() {
        return descriptionEtat;
    }

    public void setDescriptionEtat(String descriptionEtat) {
        this.descriptionEtat = descriptionEtat;
    }
    public void modifierEtat(String Etat){}

    public void lecteurActuel(){
    }
    public void lecteurs(){}
    public void envoiMailLecteurActuel(Mail mail){}
    public void envoiMailLecteurs(Mail mail){
    }
    public boolean enRetard(){
        return true;
    }
    public int joursRetard(){return 1;}
    public boolean enLocation(){return true;}
}
