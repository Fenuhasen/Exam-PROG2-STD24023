package etablissement;

import java.time.LocalDate;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String email;
    private String telephone;

    public Personne(int id, String nom, String prenom, LocalDate dateDeNaissance, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.telephone = telephone;
    }
}
