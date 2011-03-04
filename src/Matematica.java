import java.io.Console;


public class Matematica {

	int a;
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	static int b;
	
	int Minimo(int a,int b)
	{
		if (a<b) return a;
		return b;
		
	}
	
	public static void main(String[] args) {
		
		Matematica objMat;
		objMat = new Matematica();
		System.out.println("El numero minimo es " + objMat.Minimo(7, 10));
	
	}

}
