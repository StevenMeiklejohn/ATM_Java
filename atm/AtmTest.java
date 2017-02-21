


import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class AtmTest {

  Atm atm;

  @Before
  public void before(){
    atm = new Atm(10000, "The Dingly Dell", 250);
  }


  @Test
  public void canGetCashReserves(){
    assertEquals(10000, atm.getCashReserves());
  }

  @Test
  public void canGetLocation(){
    assertEquals("The Dingly Dell", atm.getLocation());
  }

  @Test
  public void canGetMaxWithdrawal(){
    assertEquals(250, atm.getMaxWithDrawalAmount());
  }

  @Test
  public void canDepleteReserves(){
    atm.depleteReserves(100);
    assertEquals(9900, atm.getCashReserves());
  }

  @Test
  public void canFillReserves(){
    atm.fillReserves();
    assertEquals(10000, atm.getCashReserves());
  }


  }