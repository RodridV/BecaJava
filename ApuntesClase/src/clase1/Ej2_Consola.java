package clase1;

public class Ej2_Consola {

	public static void main(String[] args) {
		
		int numero1 = 10;
		int numero2 = 7;
		int suma;
		
		// numero1 = 10;
		// numero2 = 7;
		
		numero1 = 11;
		System.out.println(numero1);
		numero1++;
		System.out.println(numero1);
		numero1 = numero1+1;
		System.out.println(numero1);
		numero1+=1;
		System.out.println(numero1);
		
		suma= numero1 + numero2;
		
		System.out.println("La suma vale ");   //Con ln pasa a la siguiente línea
		System.out.println(suma);
		
		System.out.print("La suma vale ");
		System.out.print(suma);
		
	}

}
