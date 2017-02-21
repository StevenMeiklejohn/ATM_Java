

public class Customer{
  private String name;
  private int wallet;
  private int pin;

  public Customer(String name, int wallet, int pin){
    this.name = name;
    this.wallet = wallet;
    this.pin = pin;
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

  public void withdrawCash(int amount, Atm atm){
    this.wallet += amount;
    atm.depleteReserves(amount);
  }
}
