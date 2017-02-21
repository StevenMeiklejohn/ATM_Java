
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class CustomerTest {

  Customer customer1;
  Atm atm;
  Account account1;
  Wallet wallet1;

  @Before
  public void before(){
    account1 = new Account(300);
    wallet1 = new Wallet(0, 10, 5);
    customer1 = new Customer("Steve", wallet1, 1978, account1);
    atm = new Atm(200, 100, 400, "The Dingly Dell", 250);
  }

  @Test
  public void canGetName(){
    assertEquals("Steve", customer1.getName());
  }

  @Test
  public void canGetWallet(){
    assertEquals(200, customer1.getWalletTotal());
  }

  @Test
  public void canGetPin(){
    assertEquals(1978, customer1.getPin());
  }

  @Test
  public void canWithdrawCash(){
    customer1.withdrawCash(100, atm, "twenties");
    assertEquals(300, customer1.getWalletTotal());
    assertEquals(9900, atm.getCashReserves());
    assertEquals(200, account1.getBalance());
  }


}