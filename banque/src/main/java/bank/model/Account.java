package bank.model;

public class Account {
  private double accountNumber;
  private double pay;
  private String transactionHistory;

  public Account(double accountNumber, double pay, String transactionHistory) {
    this.accountNumber = accountNumber;
    this.pay = pay;
    this.transactionHistory = transactionHistory;
  }

  // AccountNumber
  public double getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(double accountNumber) {
    this.accountNumber = accountNumber;
  }

  // PAY
  public double getPay() {
    return pay;
  }

  public void setPay(double pay) {
    this.pay = pay;
  }

  // TransactionHistory
  public String getTransactionHistory() {
    return transactionHistory;
  }

  public void setTransactionHistory(String transactionHistory) {
    this.transactionHistory = transactionHistory;
  }

}
