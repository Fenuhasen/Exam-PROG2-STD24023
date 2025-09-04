package etablissement;

import java.util.List;

public class Note {
    private Etudiant etudiant;
    private float valeurInitiale;
    private List<NoteChangement> noteChangement;

    public Note(Etudiant etudiant, float valeurInitiale, List<NoteChangement> noteChangement) {
        this.etudiant = etudiant;
        this.valeurInitiale = valeurInitiale;
        this.noteChangement = noteChangement;
    }
}
