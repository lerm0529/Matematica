//Test del metodo ordenar de la clase ordenador
package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Matematica.Ordenador;

public class OrdenadorTest {

	
	@Test
	public void testOrdenar() {
		Ordenador a;
		a = new Ordenador();
		int []resp = a.Ordenar(new int[]{5,1,3});
		System.out.println(resp[0]+ " " + resp[1]+ " " + resp[2]);
		
		int [] expected = {1,3,5};
		int [] actual;
	
		
		assertArrayEquals(expected, resp);
	}

}
