package clase5;

public class Tablasmultiplicar {

	public static void main(String[] args) {
		//Mostrar las 10 primeras tablas de multipicar y la suma de la tabla
		
		int multipl,suma=0;				//Valor de cada multiplicación y suma acumulativa para cada tabla
		for (int i=1;i<=10;i++) {		//Tablas del 1 al 10
			System.out.println("Tabla del "+ i +":");
			for(int j=1;j<=10;j++) {
				multipl=i*j;
				System.out.println(i + " x " + j + " = " + multipl);
				suma += multipl;
			}
			System.out.println("La suma de la tabla del "+ i +" vale "+ suma +"\n");
			suma=0;
		}
	}

}
