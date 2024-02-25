package orienteObjet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;


public class Service {
    private static final String CHOIX_AVEC = "Avec";
    private static final String CHOIX_SANS = "Sans";
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    public static int generateZeroOne() {
        return Math.random() < 0.5 ? 0 : 1;
    }

    public static void addInterne(List<Etudiant> listPersonne, Scanner scanner) {
        String choix;
        do {
            System.out.println("Voulez-vous créer un Interne avec ou sans argument ? (Avec/Sans)");
            choix = scanner.nextLine();
        } while (!choix.equalsIgnoreCase(CHOIX_AVEC) && !choix.equalsIgnoreCase(CHOIX_SANS));

        if (choix.equalsIgnoreCase(CHOIX_AVEC)) {
            System.out.println("Entrez le Matricule :");
            String matricule = scanner.next();

            System.out.println("Entrez le NomComplet :");
            scanner.nextLine(); // Discard the previous line break
            String nomComplet = scanner.nextLine();

            LocalDate dateNaissance = null;
            boolean validDate = false;
            while (!validDate) {
                System.out.println("Entrez une date de naissance au format JJ-MM-AAAA :");
                String inputDate = scanner.next();
                try {
                    dateNaissance = LocalDate.parse(inputDate, dateFormatter);
                    validDate = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Format de date invalide. Veuillez réessayer.");
                }
            }
            int telephone = 0;
            boolean validTelephone = false;
            while (!validTelephone) {
                System.out.println("Entrez le Numero de Téléphone :");
                String telephoneInput = scanner.next();
            
                if (telephoneInput.matches("[0-9]+")) {
                    telephone = Integer.parseInt(telephoneInput);
                    validTelephone = true;
                } else {
                    System.out.println("Numero de Téléphone invalide. Veuillez entrer un entier.");
                }
            }
            System.out.println("Entrez le Numero de Batiment :");
            String numeroBatiment = scanner.next();

            System.out.println("Entrez le Numero de Chambre :");
            String numeroChambre = scanner.next();

            System.out.println("Entrez le Type de Bourse (DEMI ou ENTTIER) :");
            Bourse typeBourse = Bourse.valueOf(scanner.next());

            scanner.nextLine();
  listPersonne.add(new Interne(matricule, nomComplet, dateNaissance, String.valueOf(telephone), numeroBatiment, numeroChambre, typeBourse));
        } else {
            listPersonne.add(new Interne());
        }
    }
    
   public static void addExterne(List <Etudiant> listPersonne, Scanner scanner){
    String choix;
    do {
        System.out.println("Voulez-vous créer un Externe avec ou sans argument ? (Avec/Sans)");
        choix = scanner.nextLine();
    }while(!choix.equalsIgnoreCase(CHOIX_AVEC)&&!choix.equalsIgnoreCase(CHOIX_SANS));
    if (choix.equalsIgnoreCase(CHOIX_AVEC)) {
        System.out.println("Entrer la matricule :");
        String matricule = scanner.next();

        System.out.println("Entrer le nomCompet :");
        String nomComplet = scanner.next();
        scanner.nextLine();
        
        LocalDate dateNaissance = null;
        boolean validDate = false;

        while (!validDate) {
            System.out.println("Entrer la date de naissance au format de JJ/MM/YY :");
            String inputDate = scanner.next();
            try {
                dateNaissance = LocalDate.parse(inputDate, dateFormatter);
                validDate = true;
            } catch (DateTimeParseException e) {
               System.out.println("Format invalid! Veuillez réessayer!");
            }
        }

        int telephone = 0;
        boolean validNumber = false;
 
        while (!validNumber) {
            System.out.println("Entrer le numéro de téléphone :");
            String inputTelephone = scanner.next();

            if (inputTelephone.matches("[0-9]+")) {
                telephone = Integer.parseInt(inputTelephone);
                validNumber = true;
            }else{
                System.out.println("Veuillez saisir des entiers!");
            }
        }

        System.out.println("Entrer l'aide :");
        String aide = scanner.next();

        System.out.println("Entrer l'adresse :");
        String adresse = scanner.next();

        scanner.nextLine();
        listPersonne.add(new Externe(matricule,nomComplet,dateNaissance,String.valueOf(telephone),Integer.valueOf(aide),adresse));
    }else{
        listPersonne.add(new Externe());
    }
    }
}