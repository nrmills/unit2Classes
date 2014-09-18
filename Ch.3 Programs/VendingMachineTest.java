
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest
{

    public VendingMachineTest()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testfillUp()
    {
        VendingMachine testvm = new VendingMachine(0,10);
        testvm.fillUp(5);
        int inventNum = testvm.getInventNum();
        assertEquals(15.0, inventNum, 1e-6);
    }

    @Test
    public void testproccessPurchase()
    {
        VendingMachine testvm = new VendingMachine(1,10);
        testvm.proccessPurchase();
        int tokenNum = testvm.getTokenNum();
        int inventNum = testvm.getInventNum();
        assertEquals(0, tokenNum, 1e-6);
        assertEquals(9, inventNum, 1e-6);
    }

    public void testinsertTokens()
    {
        VendingMachine testvm = new VendingMachine(0,10);
        testvm.insertTokens(1);
        int tokenNum = testvm.getTokenNum();
        assertEquals(1, tokenNum, 1e-6);
    }

    @Test
    public void testgetInventNum()
    {
        VendingMachine testvm = new VendingMachine(0,10);
        int inventNum = testvm.getInventNum();
        assertEquals(10, inventNum, 1e-6);
    }
    
    @Test
    public void testgetTokenNum()
    {
        VendingMachine testvm = new VendingMachine(0,10);
        int tokenNum = testvm.getTokenNum();
        assertEquals(0, tokenNum, 1e-6);
    }

}
