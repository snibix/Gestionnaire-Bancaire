package bank;

import java.util.Scanner;

import bank.model.Account;
import bank.model.Customer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(system.in);
        boolean exist = false;

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

        while (!exist) {

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
                }
                case 2 -> {
                    System.out.println("Voulez-vous mettre de l'argent a l'ouverture du compte ?");
                    int pay = sc.nextInt();

                    Account account = new Account(pay);

                }

                case 3 -> {

                }

                case 4 -> {

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