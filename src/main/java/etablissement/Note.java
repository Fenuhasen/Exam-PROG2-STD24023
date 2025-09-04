package etablissement;

import java.util.List;

public class Note {
    private Etudiant etudiant;
    private float valeurInitiale;
    private List<NoteChangement> noteChangement;
    private Examen examen;

    public Note(Etudiant etudiant, float valeurInitiale, List<NoteChangement> noteChangement, Examen examen) {
        this.etudiant = etudiant;
        this.valeurInitiale = valeurInitiale;
        this.noteChangement = noteChangement;
        this.examen = examen;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public float getValeurInitiale() {
        return valeurInitiale;
    }

    public List<NoteChangement> getNoteChangement() {
        return noteChangement;
    }
    public Examen getExamen(){
        return examen;
    }
}
