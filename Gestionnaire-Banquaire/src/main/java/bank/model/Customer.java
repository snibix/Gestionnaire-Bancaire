package bank.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private String name;
  private String mail;
  private List<Account> account;

  // Contructor
  public Customer(String name, String mail) {
    this.name = name;
    this.mail = mail;
    this.account = new ArrayList<>();
  }

  // Name
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Mail
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  // Account
  public List<Account> getAccount() {
    return account;
  }

  public void setAccount(List<Account> account) {
    this.account = account;
  }
}
