package bibliotheque.metier;

import java.time.LocalDate;

public class Livre extends Ouvrage {
    private String isbn, resume;
    private int nombrePages;
    private TypeLivre typeLivre;

    public Livre(String titre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, String langue, String genre, String isbn, int nombrePages, TypeLivre typeLivre, String resume) {
        super(titre, langue, genre, ageMin, dateParution, typeOuvrage, prixLocation);
        this.isbn = isbn;
        this.resume = resume;
        this.nombrePages = nombrePages;
        this.typeLivre = typeLivre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    public TypeLivre getTypeLivre() {
        return typeLivre;
    }

    public void setTypeLivre(TypeLivre typeLivre) {
        this.typeLivre = typeLivre;
    }
}
