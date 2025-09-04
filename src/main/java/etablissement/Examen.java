package etablissement;

import java.time.Instant;

public class Examen {
    private int id;
    private String titre;
    private Matiere matiere;
    private Instant dateDExamen;
    private int coefficient;

    public Examen(int id, String titre, Matiere matiere, Instant dateDExamen, int coefficient) {
        this.id = id;
        this.titre = titre;
        this.matiere = matiere;
        this.dateDExamen = dateDExamen;
        this.coefficient = coefficient;
    }
}