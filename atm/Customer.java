

public class Customer{
  private String name;
  private int wallet;
  private int pin;
  private Account account;

  public Customer(String name, int wallet, int pin, Account account){
    this.name = name;
    this.wallet = wallet;
    this.pin = pin;
    this.account = account;
  }

  public String getName(){
    return this.name;
  }

  public int getWallet(){
    return this.wallet;
  }

  public int getPin(){
    return this.pin;
  }

  public Account getAccount(){
    return this.account;
  }

  public String withdrawCash(int amount, Atm atm){
    if(amount < account.getBalance()){
    this.wallet += amount;
    account.reduceBalance(amount);
    atm.depleteReserves(amount);
    return "Please take your money.";
  }
  return "There are insufficient funds in your account.";
  }
}
