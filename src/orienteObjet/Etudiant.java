package orienteObjet;

import java.time.LocalDate;
import java.time.Period;

public abstract class   Etudiant {

    protected String matricule;
    private String nomComplet;
    private LocalDate dateNaissance;
    private String telephone;
    private int age;

    
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

   
    public int getAge() {
        return age;
    }

    public void calculAge(){
        age = Period.between(dateNaissance , LocalDate.now()).getYears();
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }


    public Etudiant(String matricule, String nomComplet, LocalDate dateNaissance, String telephone) {
        this.matricule = matricule;
        this.nomComplet = nomComplet;
        this.dateNaissance = dateNaissance;
        this.telephone = telephone;
        calculAge();
    }

    public Etudiant(){

    }

    public String toString(){
        return "[" +matricule + " / " + nomComplet + " / " + dateNaissance + " / " + telephone + " / " + age + "";
    }

}


