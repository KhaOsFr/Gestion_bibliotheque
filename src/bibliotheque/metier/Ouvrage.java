package bibliotheque.metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Ouvrage {
    protected List<Auteur> liste_auteurs = new ArrayList<>();
    protected  List<Exemplaire> liste_exemplaires = new ArrayList<>();
    protected String titre, langue, genre;
    protected byte ageMin;
    protected LocalDate dateParution;
    protected TypeOuvrage typeOuvrage;
    protected double prixLocation;

    public Ouvrage(String titre, String langue, String genre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation) {
        this.titre = titre;
        this.langue = langue;
        this.genre = genre;
        this.ageMin = ageMin;
        this.dateParution = dateParution;
        this.typeOuvrage = typeOuvrage;
        this.prixLocation = prixLocation;
    }

    public void listerExemplaires() {
    }

    public void listerExemplaires(boolean enLocation) {
    }

    public List<Auteur> getListe_auteurs() {
        return liste_auteurs;
    }

    public void setListe_auteurs(List<Auteur> liste_auteurs) {
        this.liste_auteurs = liste_auteurs;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public byte getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(byte ageMin) {
        this.ageMin = ageMin;
    }

    public LocalDate getDateParution() {
        return dateParution;
    }

    public void setDateParution(LocalDate dateParution) {
        this.dateParution = dateParution;
    }

    public TypeOuvrage getTypeOuvrage() {
        return typeOuvrage;
    }

    public void setTypeOuvrage(TypeOuvrage typeOuvrage) {
        this.typeOuvrage = typeOuvrage;
    }

    public double getPrixLocation() {
        return prixLocation;
    }

    public void setPrixLocation(double prixLocation) {
        this.prixLocation = prixLocation;
    }
}
