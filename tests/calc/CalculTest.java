/**
 * 
 */
package calc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author kévin
 *
 */
public class CalculTest {

	private Calcul calcul;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.calcul = new Calcul();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link calc.Calcul#add(float, float)}.
	 */
	@Test
	public void testAdd() throws Exception {
		float result = calcul.add(2.2f,2.2f);
		assertEquals(result, (4.4f), 0.1);
	}

	/**
	 * Test method for {@link calc.Calcul#minus(float, float)}.
	 */
	@Test
	public void testMinus() throws Exception {
		float result = calcul.minus(2.2f, 2.1f);
		assertEquals(result, 0.1f, 0.1);
	}

	/**
	 * Test method for {@link calc.Calcul#multiplication(float, float)}.
	 */
	@Test
	public void testMultiplication() throws Exception {
		float result = calcul.multiplication(2.2f, 2.2f);
		assertEquals(result, 4.84f, 0.01);
	}

	/**
	 * Test method for {@link calc.Calcul#premier(float, float)}.
	 */
	@Test
	public void testPremier() throws Exception {
		boolean result = calcul.premier(11f);
		assertTrue(result);
	}
	
	/**
	 * Test method for {@link calc.Calcul#division(float, float)}.
	 */
	@Test
	public void testDivision() throws Exception {
		float a = 5.5f;
		float b = 5;
		float result = calcul.division(a, b);
		assertEquals(result, 1.1f, 0.1f);
	}
}
