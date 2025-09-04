package etablissement;

import java.time.Instant;
import java.util.List;

public class Etudiant extends Personne{
    private String groupe;
    private Tuteur tuteur;
    private List<Note> listeNotes;

    public Etudiant(int id, String nom, String prenom, Instant dateDeNaissance, String email, String telephone, String groupe, Tuteur tuteur) {
        super(id, nom, prenom, dateDeNaissance, email, telephone);
        this.groupe = groupe;
        this.tuteur = tuteur;
    }

    public String getGroupe() {
        return groupe;
    }

    public Tuteur getTuteur() {
        return tuteur;
    }

    public List<Note> getListeNotes() {
        return listeNotes;
    }

    public void addNotes(Note note) {
        this.listeNotes.add(note);
    }

}
