import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class WalletTest {

  Wallet wallet1;


  @Before
  public void before(){
    wallet1 = new Wallet(2, 1, 0);
  }

  @Test
  public void canGetTotal(){
    assertEquals(20, wallet1.getTotal());
  }

  @Test
  public void canAddCash(){
    wallet1.addCash(100, "twenties");
    assertEquals(120, wallet1.getTotal());
  }


}