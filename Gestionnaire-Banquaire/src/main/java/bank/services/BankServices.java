package main.java.bank.services;

import java.util.ArrayList;
import java.util.List;

import bank.model.Account;
import bank.model.Customer;

public class BankServices {
  private List<Customer> customers;

  public BankServices() {
    this.customers = new ArrayList<>();
  }

  // Ajouter un client
  public void addCustomer(Customer c) {
    customers.add(c);
    System.out.println("Client ajouté : " + c.getName() + " (ID: " + c.getId() + ")");
  }

  // Rechercher un client par ID
  public Customer searchCustomer(int id) {
    for (Customer c : customers) {
      if (c.getId() == id) {
        return c;
      }
    }
    return null;
  }

  // Dépôt d’argent
  public void depot(int accountNumber, double montant) {
    Account account = searchAccount(accountNumber);
    if (account != null) {
      account.setPay(account.getPay() + montant);
      System.out.println("Dépôt de " + montant + " effectué sur le compte " + accountNumber);
    } else {
      System.out.println("Compte introuvable !");
    }
  }

  // Retrait d’argent
  public void retrait(int accountNumber, double montant) {
    Account account = searchAccount(accountNumber);
    if (account != null) {
      if (account.getPay() >= montant) {
        account.setPay(account.getPay() - montant);
        System.out.println("Retrait de " + montant + " effectué sur le compte " + accountNumber);
      } else {
        System.out.println("Solde insuffisant !");
      }
    } else {
      System.out.println("Compte introuvable !");
    }
  }

  // Transaction entre deux comptes
  public void transaction(int accountSource, int accountDest, double montant) {
    Account source = searchAccount(accountSource);
    Account dest = searchAccount(accountDest);

    if (source != null && dest != null) {
      if (source.getPay() >= montant) {
        source.setPay(source.getPay() - montant);
        dest.setPay(dest.getPay() + montant);
        System.out.println("Transaction de " + montant + " du compte " + accountSource + " vers le compte "
            + accountDest + " effectuée.");
      } else {
        System.out.println("Solde insuffisant sur le compte source !");
      }
    } else {
      System.out.println("Un des comptes n’existe pas !");
    }
  }

  // méthode privée pour retrouver un compte
  private Account searchAccount(int accountNumber) {
    for (Customer c : customers) {
      for (Account a : c.getAccount()) {
        if (a.getAccountNumber() == accountNumber) {
          return a;
        }
      }
    }
    return null;
  }
}
