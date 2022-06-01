package myapp.core;

public class FixedDepositAccount extends BankAccount{

  private float interest = 0f;
  private int duration = 0;
  
  public FixedDepositAccount(String name, float initialBal) {
    // call the parent 's class default constructor
    super(name,initialBal);
  }

  public FixedDepositAccount(String name, float initialBal, float interest) {
    super(name,initialBal); // ..
    this.interest = interest;
  }

  public FixedDepositAccount(String name, float initialBal, float interest, int duration) {
    this(name, initialBal, interest); // .
    this.duration = duration;
  }

  @Override
  public float getAccountBalance() {
    return super.getAccountBalance() * .1f;
  }
}
