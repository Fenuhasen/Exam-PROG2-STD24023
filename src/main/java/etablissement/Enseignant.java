package etablissement;

import java.time.Instant;

public class Enseignant extends Personne {
    private String specialite;

    public Enseignant(int id, String nom, String prenom, Instant dateDeNaissance, String email, String telephone, String specialite) {
        super(id, nom, prenom, dateDeNaissance, email, telephone);
        this.specialite = specialite;
    }
}
