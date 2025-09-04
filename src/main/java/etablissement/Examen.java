package etablissement;

import java.time.Instant;
import java.util.List;

public class Examen {
    private int id;
    private String titre;
    private Matiere matiere;
    private Instant dateDExamen;
    private int coefficient;

    public Examen(int id, String titre, Matiere matiere, Instant dateDExamen, int coefficient) {
        this.id = id;
        this.titre = titre;
        this.matiere = matiere;
        this.dateDExamen = dateDExamen;
        this.coefficient = coefficient;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public Instant getDateDExamen() {
        return dateDExamen;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public float getNoteExamen(Examen examen, Etudiant etudiant, Instant date){
        List<Note> notes = etudiant.getListeNotes();
        notes.clear();
        for (int i = 0; i < etudiant.getListeNotes().size(); i++) {
            if (etudiant.getListeNotes().get(i).getExamen().getId() == examen.getId()){
                notes.add(etudiant.getListeNotes().get(i));
            }
        }
        /*float acc = 0;
        for(int i=0; i<notes.size(); i++){
            for(int j=0; j<notes.get(i).getNoteChangement().size(); j++){
                if(notes.get(i).getNoteChangement().get(j).getDateDeChangement().isBefore(date) == true){

                }
            }
            acc += notes.get(i).getNoteChangement().get(j).getValeur();
        }
        return acc;
        */
        return notes.get(0).getValeurInitiale();
    }

}