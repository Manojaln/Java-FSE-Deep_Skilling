import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestCalc {
	 @Test
	    public void testAdd() {
	        Calc calc = new Calc();
	        int result = calc.add(2, 3);
	        assertEquals(5, result);
	    }
}
