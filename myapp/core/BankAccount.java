package myapp.core;

import java.util.*;

public class BankAccount {

private String accountName;
private String accountNumber;
private Float accountBalance;
private List<String> trasactions = new LinkedList<>();
private Boolean closed = false;
private Long accountOpenDate;
private Long accountCloseDate;


// Default Constructor
//public BankAccount() {}

// Constructors
public BankAccount(String accountHolderName){
  this.setAccountName(accountHolderName);
  this.setAccountBalance(0f);
  this.setAccountNumber();

  System.out.println("Account is created: " + accountHolderName + " Account Number is " + this.accountNumber);
}

// Constructor Overloading
public BankAccount(String accountHolderName, Float accountBalance) {
  this.setAccountName(accountHolderName);
  this.setAccountBalance(accountBalance);
  this.setAccountNumber();

  System.out.println("Account is created: " + accountHolderName + " Account Number is " + this.accountNumber + " Account Balance: " + accountBalance);
}


// Methods
public void deposit(Float depositAmount) {
  if(depositAmount < 0) {
    throw new IllegalArgumentException("Invalid amount to be deposited");
  } else {
  this.accountBalance += depositAmount;
  String depositAcknowledgmentMsg = ("deposit " + depositAmount + " at "  + System.currentTimeMillis());
  this.trasactions.add(depositAcknowledgmentMsg);
  System.out.println(depositAcknowledgmentMsg);
  }
}

public void withdraw(Float withdrawAmount) {
  if(withdrawAmount < 0 && (accountBalance - withdrawAmount) <0) {
    throw new IllegalArgumentException("Invalid amount to be withdrawn");
  } else {
  this.accountBalance -= withdrawAmount;
  String withdrawAcknowledgmentMsg = ("withdrawn " + withdrawAmount + " at "  + System.currentTimeMillis());
  this.trasactions.add(withdrawAcknowledgmentMsg);
  System.out.println(withdrawAcknowledgmentMsg);
}
}


// getters and setters
public String getAccountNumber() {
  return this.accountNumber;
}

public void setAccountNumber() {
  
  UUID id = UUID.randomUUID();
  //System.out.println(id.toString());
  String idAsString = id.toString();
  this.accountNumber = idAsString.substring(0,8);
}

public String getAccountName() {
  return this.accountName;
}

public void setAccountName(String accountName) {
  this.accountName = accountName;
}

public float getAccountBalance() {
  return this.accountBalance;
}

public void setAccountBalance(float accountBalance) {
  this.accountBalance = accountBalance;
}

}