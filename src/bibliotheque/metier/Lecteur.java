package bibliotheque.metier;

import java.time.LocalDate;
import java.util.*;

//Si unique développer une méthode equals et ashcall (jsp si il a dit ça) pour verif qu'il soit unique
public class Lecteur {
    private List<Location> liste_location = new ArrayList<>();
    private Long numLecteur;
    private String nom;
    private String prenom;
    private LocalDate dateNaiss;
    private String mail;
    private String adresse;
    private String tel;

    public Lecteur(String nom, String prenom, LocalDate dateNaiss, String mail, String adresse, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.mail = mail;
        this.adresse = adresse;
        this.tel = tel;
    }

    public Long getNumLecteur() {
        return numLecteur;
    }

    public void setNumLecteur(Long numLecteur) {
        this.numLecteur = numLecteur;
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

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Location> getListe_location() {
        return liste_location;
    }

    public void setListe_locationLocation(List<Location> liste_location) {
        this.liste_location = liste_location;
    }

    public void listerExemplaireEnLocation(){}
    public void listerExemplaireLoues(){}

}
