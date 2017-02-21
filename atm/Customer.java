

public class Customer{
  private String name;
  private Wallet wallet;
  private int pin;
  private Account account;
  private String bills;
  private String billType;

  public Customer(String name, Wallet wallet, int pin, Account account){
    this.name = name;
    this.wallet = wallet;
    this.pin = pin;
    this.account = account;
  }

  public String getName(){
    return this.name;
  }

  public int getWalletTotal(){
    return wallet.getTotal();
  }

  public int getPin(){
    return this.pin;
  }

  public Account getAccount(){
    return this.account;
  }

  public String withdrawCash(int amount, Atm atm, String bills){
    if(amount < account.getBalance()){
    wallet.addCash(amount, bills);
    account.reduceBalance(amount);
    atm.depleteReserves(amount, bills);
    return "Please take your money.";
  }
  return "There are insufficient funds in your account.";
  }
}
