public class Atm {


  private String location;
  private int maxWithdrawalAmount;
  private int fives;
  private int tens;
  private int twenties;
  private int cashReserves;


  public Atm(int fives, int tens, int twenties, String location, int maxWithdrawalAmount){

    this.location = location;
    this.maxWithdrawalAmount = maxWithdrawalAmount;
    this.fives = fives;
    this.tens = tens;
    this.twenties = twenties;

  }

  public int getCashReserves(){
    cashReserves += fives * 5;
    cashReserves += tens * 10;
    cashReserves += twenties * 20;
    return cashReserves;
  }

  public String getLocation(){
    return this.location;
  }

  public int getMaxWithDrawalAmount(){
    return this.maxWithdrawalAmount;
  }

  public void depleteReserves(int amount, String bills){
    if(bills == "fives"){
      this.fives -= amount/5;
    }
    if(bills == "tens"){
      this.tens -= amount/10;
    }
    if(bills == "twenties"){
      this.twenties -= amount/20;
    }
  }

  public void fillReserves(){
    this.fives = 200;
    this.tens = 100;
    this.twenties = 400;
  }
}