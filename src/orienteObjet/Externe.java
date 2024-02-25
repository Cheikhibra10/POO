package orienteObjet;

import java.time.LocalDate;

public class Externe extends Etudiant {
private int aide;
private String adresse;

    public Externe() {
    }

    public Externe(String matricule, String nomComplet, LocalDate dateNaissance, String telephone, int aide, String adresse) {
        super(matricule, nomComplet, dateNaissance, telephone);
        this.aide = aide;
        this.adresse = adresse;
    }


    public int getAide() {
        return aide;
    }

    public void setAide(int aide) {
        this.aide = aide;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString(){
        return ""+super.toString()+" / "+aide+" / "+adresse+"]";
    }

}
