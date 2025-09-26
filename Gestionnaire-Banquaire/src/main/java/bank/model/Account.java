package bank.model;

public class Account {
  private int counter = 1;
  private int accountNumber;
  private double pay;
  private String transactionHistory;

  public Account(double pay) {
    this.accountNumber = counter++;
    this.pay = pay;
    this.transactionHistory = transactionHistory;
  }

  // AccountNumber
  public double getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
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

  @Override
  public String toString() {
    return "[" + pay + "]";
  }

}
