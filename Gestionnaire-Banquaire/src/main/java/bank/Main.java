package bank;

import java.util.Scanner;

import bank.model.Account;
import bank.model.Customer;
import bank.services.BankServices;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();
        BankServices bankServices = new BankServices();
        boolean exist = false;

        while (!exist) {
            System.out.println("1 - Ajouter un client");
            System.out.println("2 - Crée un compte");
            System.out.println("3 - Dépot");
            System.out.println("4 - Retrait");
            System.out.println("5 - Transaction");
            System.out.println("6 - Afficher Solde");
            System.out.println("7 - Afficher Historique");
            System.out.println("8 - Quitter");

            int result = sc.nextInt();
            sc.nextLine();

            switch (result) {
                case 1 -> {
                    System.out.println("Le Nom :");
                    String name = sc.nextLine();

                    System.out.println("L'email :");
                    String email = sc.nextLine();

                    System.out.println("Le numéro de téléphone : ");
                    int phone = sc.nextInt();

                    System.out.println("L'age :");
                    int age = sc.nextInt();

                    Customer c = new Customer(name, email, phone, age);
                    bankServices.addCustomer(c);
                }
                case 2 -> {

                    System.out.println("Etes-vous déjà client chez nous ? (oui/non)");
                    String answer = sc.nextLine();

                    Customer currentCustomer;

                    if (answer.equalsIgnoreCase("oui")) {
                        System.out.println("Votre numéro d'utilisateur ?");
                        int idCustomer = sc.nextInt();
                        sc.nextLine();

                        currentCustomer = bankServices.searchCustomer(idCustomer);

                        if (currentCustomer == null) {
                            System.out.println("Client introuvable !");
                            return;
                        }
                    } else {
                        System.out.println("Nom : ");
                        String name = sc.nextLine();
                        System.out.println("Mail : ");
                        String mail = sc.nextLine();
                        System.out.println("Téléphone : ");
                        int phone = sc.nextInt();
                        System.out.println("Âge : ");
                        int age = sc.nextInt();

                        currentCustomer = new Customer(name, mail, phone, age);
                        bankServices.addCustomer(currentCustomer);
                    }

                }

                case 3 -> {
                    System.out.println("Votre numéro de compte ?");
                    int numAccount = sc.nextInt();

                    System.out.println("Le montant a déposé sur le compte ?");
                    double montant = sc.nextInt();
                    sc.nextLine();

                    bankServices.depot(numAccount, montant);
                }

                case 4 -> {
                    System.out.println("Votre numéro de compte ?");
                    int numAccount = sc.nextInt();

                    System.out.println("Le montant a déposé sur le compte ?");
                    double montant = sc.nextInt();
                    sc.nextLine();

                    bankServices.retrait(numAccount, montant);
                }

                case 5 -> {

                }

                case 6 -> {

                }

                case 7 -> {

                }

                case 8 -> {
                    exist = true;
                }

                default -> {
                }
            }
        }

    }
}