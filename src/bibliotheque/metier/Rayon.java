package bibliotheque.metier;

import java.util.*;

public class Rayon {
    private List<Exemplaire> liste_exemplaire = new ArrayList<>();
    private String codeRayon;
    private String genre;

    public Rayon(String codeRayon, String genre) {
        this.codeRayon = codeRayon;
        this.genre = genre;
    }

    public List<Exemplaire> getListe_exemplaire() {
        return liste_exemplaire;
    }

    public void setListe_exemplaire(List<Exemplaire> liste_exemplaire) {
        this.liste_exemplaire = liste_exemplaire;
    }

    public String getCodeRayon() {
        return codeRayon;
    }

    public void setCodeRayon(String codeRayon) {
        this.codeRayon = codeRayon;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
