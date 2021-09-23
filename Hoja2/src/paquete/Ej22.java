package paquete;

import java.util.Arrays;
import java.util.Scanner;

public class Ej22 {

	public static void main(String[] args) {
		/*
		Realiza un programa que lea desde teclado 10 números sin repetir. Si el usuario introduce
		algún número repetido se le debe notificar, y no ha de ser contabilizado.
		*/
		
		int cont=0,comprobar;	//Contador para llegar hasta los 10 números;Para comprobar repetición de número
		Scanner sc = new Scanner(System.in);
		int [] num= new int [10];
		boolean repetido; //Para ver si es repetido
		
		System.out.println("Introduzca número");
		num[cont]=sc.nextInt();
		
		while (cont<num.length-1) {	//Hay que quitarle 1 para que no vuelva a entrar al bucle
			repetido=false;
			System.out.println("Introduzca número");
			comprobar=sc.nextInt();
			for (int i=0;i<=cont;i++) {
				if (num[i]==comprobar) {
					repetido=true;
				}
			}
			if (repetido==false) {
				cont++;
				num[cont]=comprobar;
			}
			else {
				System.out.println("El número introducido es repetido");
			}
		}
		
		System.out.println("Los número introducidos son" +"\n"
							+Arrays.toString(num));
		sc.close();
	}

}
