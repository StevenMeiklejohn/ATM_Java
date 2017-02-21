public class Account{

  int balance;

  public Account(int balance){
    this.balance = balance;
  }

  public int getBalance(){
    return this.balance;
  }

  public void reduceBalance(int amount){
    this.balance -= amount;
  }
}