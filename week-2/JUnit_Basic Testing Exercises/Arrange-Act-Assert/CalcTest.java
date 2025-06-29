import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalcTest {
	 private Calc calculator;
	    // Setup - runs before each test
	    @Before
	    public void setUp() {
	        calculator = new Calc(); // Arrange
	        System.out.println("Setup complete.");
	    }
	    //runs after each test
	    @After
	    public void tearDown() {
	        calculator = null;
	        System.out.println("Teardown complete.");
	    }
	    @Test
	    public void testAddition() {
	        // Act
	        int result = calculator.add(5, 3);
	        // Assert
	        assertEquals(8, result);
	    }
	    @Test
	    public void testMultiplication() {
	        // Act
	        int result = calculator.multiply(4, 3);
	       // Assert
	        assertEquals(12, result);
	    }
}
