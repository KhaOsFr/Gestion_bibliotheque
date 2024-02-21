package bibliotheque.metier;

import java.time.LocalDate;

public class Location {
    private Lecteur lecteur;
    private Exemplaire exemplaire;
    private LocalDate dateLoc;
    private LocalDate dateRestitution;
    private double amende;

    public Location(LocalDate dateLoc, LocalDate dateRestitution, double amende) {
        this.dateLoc = dateLoc;
        this.dateRestitution = dateRestitution;
        this.amende = amende;
    }

    public Location(LocalDate dateLoc, LocalDate dateRestitution, Lecteur lecteur, Exemplaire exemplaire) {
        this.lecteur = lecteur;
        this.exemplaire = exemplaire;
        this.dateLoc = dateLoc;
        this.dateRestitution = dateRestitution;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public void setExemplaire(Exemplaire exemplaire) {
        this.exemplaire = exemplaire;
    }

    public Lecteur getLecteur() {
        return lecteur;
    }

    public void setLecteur(Lecteur lecteur) {
        this.lecteur = lecteur;
    }

    public LocalDate getDateLoc() {
        return dateLoc;
    }

    public void setDateLoc(LocalDate dateLoc) {
        this.dateLoc = dateLoc;
    }

    public LocalDate getDateRestitution() {
        return dateRestitution;
    }

    public void setDateRestitution(LocalDate dateRestitution) {
        this.dateRestitution = dateRestitution;
    }

    public double getAmende() {
        return amende;
    }

    public void setAmende(double amende) {
        this.amende = amende;
    }

    public void calculerAmende(){}
    public void enregistrerRetour(){}

    @Override
    public String toString() {
        return "Location{" +
                "lecteur=" + lecteur +
                ", exemplaire=" + exemplaire +
                ", dateLoc=" + dateLoc +
                ", dateRestitution=" + dateRestitution +
                ", amende=" + amende +
                '}';
    }
}
