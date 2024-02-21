package bibliotheque.metier;

import java.time.LocalDate;
import java.time.LocalTime;

public class CD extends Ouvrage {
    private Long code;
    private byte nbrePlages;
    private LocalTime dureeTotale;

    public CD(String titre, String langue, String genre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, Long code, byte nbrePlages, LocalTime dureeTotale) {
        super(titre, langue, genre, ageMin, dateParution, typeOuvrage, prixLocation);
        this.code = code;
        this.nbrePlages = nbrePlages;
        this.dureeTotale = dureeTotale;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public byte getNbrePlages() {
        return nbrePlages;
    }

    public void setNbrePlages(byte nbrePlages) {
        this.nbrePlages = nbrePlages;
    }

    public LocalTime getDureeTotale() {
        return dureeTotale;
    }

    public void setDureeTotale(LocalTime dureeTotale) {
        this.dureeTotale = dureeTotale;
    }
}
