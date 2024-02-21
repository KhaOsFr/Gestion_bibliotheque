package bibliotheque.metier;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DVD extends Ouvrage{
    private Long code;
    private LocalTime dureeTotale;
    private byte nbreBonus;
    private List<String> autresLangues = new ArrayList<>();
    private List<String> sousTitres = new ArrayList<>();

    public DVD(String titre, String langue, String genre, byte ageMin, LocalDate dateParution, TypeOuvrage typeOuvrage, double prixLocation, Long code, LocalTime dureeTotale, byte nbreBonus, List<String> autresLangues, List<String> sousTitres) {
        super(titre, langue, genre, ageMin, dateParution, typeOuvrage, prixLocation);
        this.code = code;
        this.dureeTotale = dureeTotale;
        this.nbreBonus = nbreBonus;
        this.autresLangues = autresLangues;
        this.sousTitres = sousTitres;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public LocalTime getDureeTotale() {
        return dureeTotale;
    }

    public void setDureeTotale(LocalTime dureeTotale) {
        this.dureeTotale = dureeTotale;
    }

    public byte getNbreBonus() {
        return nbreBonus;
    }

    public void setNbreBonus(byte nbreBonus) {
        this.nbreBonus = nbreBonus;
    }

    public List<String> getAutresLangues() {
        return autresLangues;
    }

    public void setAutresLangues(List<String> autresLangues) {
        this.autresLangues = autresLangues;
    }

    public List<String> getSousTitres() {
        return sousTitres;
    }

    public void setSousTitres(List<String> sousTitres) {
        this.sousTitres = sousTitres;
    }
}
