package etablissement;

public class Matiere {
    private int id;
    private String label;
    private int credit;
    private Enseignant enseignant;

    public Matiere(int id, String label, int credit, Enseignant enseignant){
        this.id = id;
        this.label = label;
        this.credit = credit;
        this.enseignant = enseignant;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public int getCredit() {
        return credit;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }
}
