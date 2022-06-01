package myapp.core;

public class Main {
  public static void main (String[] args) {
    BankAccount firstAccount = new BankAccount("Calvin");
    
    BankAccount secondAccount = new BankAccount("James", 50f);

    BankAccount thirdAccount = new BankAccount("John", 790f);
  }
}
