
public class Wallet{

  private int fives;
  private int tens;
  private int twenties;
  private int total;

  public Wallet(int fives, int tens, int twenties){
    this.fives = fives;
    this.tens = tens;
    this.twenties = twenties;
  }


  public int getTotal(){
    total += fives * 5;
    total += tens * 10;
    total += twenties * 20;
    return total;
  }

  public void addCash(int amount, String bills){
    if(bills == "fives"){
      this.fives += amount/5;
    }
    if(bills == "tens"){
      this.tens += amount/10;
    }
    if(bills == "twenties"){
      this.twenties += amount/20;
    }
  }


}