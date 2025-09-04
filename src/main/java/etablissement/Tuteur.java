package etablissement;

import java.time.LocalDate;

public class Tuteur extends Personne{
    private String descriptionLien;

    public Tuteur(int id, String nom, String prenom, LocalDate dateDeNaissance, String email, String telephone, String descriptionLien) {
        super(id, nom, prenom, dateDeNaissance, email, telephone);
        this.descriptionLien = descriptionLien;
    }
}
