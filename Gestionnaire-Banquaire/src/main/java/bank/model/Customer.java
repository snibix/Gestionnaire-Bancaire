package bank.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private int counter = 1;
  private int id;
  private String name;
  private String mail;
  private int phone;
  private int age;
  private List<Account> account;

  // Contructor
  public Customer(String name, String mail, int phone, int age) {
    this.id = counter++;
    this.name = name;
    this.mail = mail;
    this.phone = phone;
    this.age = age;
    this.account = new ArrayList<>();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  // Phone
  public int getPhone() {
    return phone;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

  // Age
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Account
  public List<Account> getAccount() {
    return account;
  }

  public void setAccount(List<Account> account) {
    this.account = account;
  }
}
