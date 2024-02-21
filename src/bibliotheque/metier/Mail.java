package bibliotheque.metier;

import java.time.LocalDateTime;

public class Mail {
    private String objet;
    private String message;
    private LocalDateTime dateEnvoie;

    public Mail(String objet, String message, LocalDateTime dateEnvoie) {
        this.objet = objet;
        this.message = message;
        this.dateEnvoie = dateEnvoie;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDateEnvoie() {
        return dateEnvoie;
    }

    public void setDateEnvoie(LocalDateTime dateEnvoie) {
        this.dateEnvoie = dateEnvoie;
    }
}
