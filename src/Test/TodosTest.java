package Test;

import org.junit.Test;


public class TodosTest {
	
	@ Test
	public  void ProbarTodos() {
		
		
		
		MatematicaTest MT = new MatematicaTest();
		MT.testMinimo();

	}
	
	@ Test
	public  void ProbarTodos2() {
		
		OrdenadorTest OT = new OrdenadorTest();
		OT.testOrdenar();
		
	}

}
