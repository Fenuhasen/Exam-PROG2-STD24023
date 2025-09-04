package etablissement;

import java.time.Instant;
import java.time.LocalDate;

public class Enseignant extends Personne {
    private String specialite;

    public Enseignant(int id, String nom, String prenom, LocalDate dateDeNaissance, String email, String telephone, String specialite) {
        super(id, nom, prenom, dateDeNaissance, email, telephone);
        this.specialite = specialite;
    }
}
