package P06;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public final void testAdd() {
		int a = 1234;
		int b = 8765;
		
		Calculator add = new Calculator();
		int actualAdd = add.add(a, b);
			
		assertEquals(9999, actualAdd);
		
	}
	
	@Test
	public final void testSubtract() {
		int c = 9876;
		int d = 4321;
		
		Calculator subtract = new Calculator();
		int actualSubtract = subtract.subtract(c, d);
		
		assertEquals(5555, actualSubtract);
		
	}
	
	@Test
	public final void testMultiply() {
		int e = 12;
		int f = 21;
		
		Calculator multiply = new Calculator();
		int actualMultiply = multiply.multiply(e, f);
		
		assertEquals(252, actualMultiply);
		
	}
	
	@Test
	public final void testDivide() {
		int g = 369;
		int h = 123;
		
		Calculator divide = new Calculator();
		int actualDivide = divide.divide(g, h);
		
		assertEquals(3, actualDivide);
		
	}
	
	
	
	
	
	
}
