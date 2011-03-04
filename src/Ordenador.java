import java.util.Arrays;


public class Ordenador {

	public static void main(String[] args) {
		Ordenador a;
		a = new Ordenador();
		int []resp = a.Ordenar(new int[]{5,1,3});
		System.out.println(resp[0]+ " " + resp[1]+ " " + resp[2]);
	}

	int M = Integer.MAX_VALUE ;

	int[] Ordenar(int []arreglo){
		int n = arreglo.length;
		int []arreglo2 = new int[n];
		Arrays.fill(arreglo2, M);	

		for (int j=0;j<n;j++)
		{ 
			int min=0;
			for (int i=0;i<n;i++){
				if(arreglo[i]<arreglo2[j]){
					arreglo2[j]=arreglo[i];
					min=i;
				}

			}
			arreglo[min]=M;
		}
		return arreglo2;
	}

}
