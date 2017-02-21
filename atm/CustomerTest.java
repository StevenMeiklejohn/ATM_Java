
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class CustomerTest {

  Customer customer1;
  Atm atm;

  @Before
  public void before(){
    customer1 = new Customer("Steve", 200, 1978);
    atm = new Atm(10000, "The Dingly Dell", 250);
  }

  @Test
  public void canGetName(){
    assertEquals("Steve", customer1.getName());
  }

  @Test
  public void canGetWallet(){
    assertEquals(200, customer1.getWallet());
  }

  @Test
  public void canGetPin(){
    assertEquals(1978, customer1.getPin());
  }

  @Test
  public void canWithdrawCash(){
    customer1.withdrawCash(100, atm);
    assertEquals(100, customer1.getWallet());
    assertEquals(9900, atm.getCashReserves());
  }


}