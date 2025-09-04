package etablissement;

import java.time.LocalDate;

public class Etudiant extends Personne{
    private String groupe;
    private Tuteur tuteur;

    public Etudiant(int id, String nom, String prenom, LocalDate dateDeNaissance, String email, String telephone, String groupe, Tuteur tuteur) {
        super(id, nom, prenom, dateDeNaissance, email, telephone);
        this.groupe = groupe;
        this.tuteur = tuteur;
    }
}
