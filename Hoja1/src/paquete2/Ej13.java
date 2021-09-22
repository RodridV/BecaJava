package paquete2;

import java.util.ArrayList;
import java.util.List;

public class Ej13 {

	public static void main(String[] args) {
		// Programa que muestra los 100 primeros número primos.
		
		int a,resto,i=1,numpr=0;
		List<Integer> div =new ArrayList<Integer> ();
		
		while(numpr<=100) {
			a=1;
			div.clear();
			while (a<=i) {
				resto=i%a;
				if (resto==0) {
					div.add(a);
				}
				a=a+1;
			}
			if (div.size()<=2) {
				System.out.println(i);
				numpr++;
			}
			i++;
		}
	}
}