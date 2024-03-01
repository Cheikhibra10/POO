package main;

import orienteObjet.Etudiant;
import orienteObjet.Externe;
import orienteObjet.Interne;
import orienteObjet.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
       List <Etudiant> listPersonnes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int choix = Service.generateZeroOne();
        if (choix==0){
            Service.addInterne(listPersonnes,  scanner );
        }else if (choix == 1){
            Service.addExterne(listPersonnes,  scanner);
        }
        boolean Oki = false;
        boolean Exist = false;
        for (Etudiant etudiant : listPersonnes){
            if (etudiant instanceof Interne){
                Exist = true;

                System.out.println("liste des Etudiants Internes:");
                System.out.println(etudiant);

            }
            if (etudiant instanceof Externe){
                Oki = true;
                System.out.println("liste des Etudiants Externes:");
                System.out.println(etudiant);
            }
        }
        if (!Exist){
            System.out.println("Aucun Internes trouvés");
        }
       if (!Oki){
            System.out.println("Aucun Externe trouvés");
        }
    }
}
// int result = generateZeroOne();
        /*Etudiant e1 = new Etudiant();
        e1.setMatricule("0001");
        e1.setNomComplet("Breukh Sene");
        e1.setTelephone("770000000");
        e1.setDateNaissance(LocalDate.parse("29/09/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(e1);

        Exo
        NB: utiliser les contructeurs avec ou sans arguments
        créer une liste d'etudiant contenant des internes et des externes
        si la machine donne 0 on ajoute un interne
        si elle donne 1 on ajoute un externe
        Poser la question a l'utilisateur s'il veut creer cet objet avec un contructeur avec ou sans arguments
        Afficher tous les etudiants
        Afficher tous les externes
        Afficher la somme des bourses et la somme des aides


           if (scanner.nextInt()==1){
                String typeBourse = Bourse.DEMI;
            }else {
                Bourse typeBourse = Bourse.ENTIER;
            }

         */
