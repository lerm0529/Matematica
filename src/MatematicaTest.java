import static org.junit.Assert.*;

import org.junit.Test;


public class MatematicaTest {

	@Test
	public void testMinimo() {
		Matematica objMat;
		objMat = new Matematica();
		
		System.out.println("El numero minimo es " + objMat.Minimo(7, 10));
		int expected;
		expected = 7;
		int actual;
		actual = objMat.Minimo(7, 10);
		
		assertEquals(expected, actual, 0);
	}

}
