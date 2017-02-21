import static org.junit.Assert.*;
import org.junit.*;

public class AccountTest {

  Account account;

  @Before
  public void before(){
    account = new Account(120);
  }

  @Test
  public void accountHasBalance(){
    assertEquals(120, account.getBalance());
  }

  @Test
  public void canReduceBalance(){
    account.reduceBalance(100);
    assertEquals(20, account.getBalance());
  }

}