package etablissement;

import java.time.Instant;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private Instant dateDeNaissance;
    private String email;
    private String telephone;

    public Personne(int id, String nom, String prenom, Instant dateDeNaissance, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.telephone = telephone;
    }
}
