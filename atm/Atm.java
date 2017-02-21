public class Atm {

  private int cashReserves;
  private String location;
  private int maxWithdrawalAmount;

  public Atm(int cashReserves, String location, int maxWithdrawalAmount){
    this.cashReserves = cashReserves;
    this.location = location;
    this.maxWithdrawalAmount = maxWithdrawalAmount;
  }

  public int getCashReserves(){
    return this.cashReserves;
  }

  public String getLocation(){
    return this.location;
  }

  public int getMaxWithDrawalAmount(){
    return this.maxWithdrawalAmount;
  }

  public void depleteReserves(int amount){
    cashReserves -= amount;
  }

  public void fillReserves(){
    cashReserves = 10000;
  }
}