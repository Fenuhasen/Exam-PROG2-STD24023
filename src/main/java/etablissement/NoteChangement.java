package etablissement;

import java.time.Instant;

public class NoteChangement {
    private int valeur;
    private Instant dateDeChangement;
    private String description;

    public NoteChangement(int valeur, Instant dateDeChangement, String description) {
        this.valeur = valeur;
        this.dateDeChangement = dateDeChangement;
        this.description = description;
    }

    public int getValeur() {
        return valeur;
    }

    public Instant getDateDeChangement() {
        return dateDeChangement;
    }

    public String getDescription() {
        return description;
    }
}
