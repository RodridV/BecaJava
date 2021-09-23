package POO;

import java.util.Scanner;

public class POO {		//Programación Orientada a Objetos

	public static void main(String[] args) {
		//Vamos a usar nuestra clase Alumno
		
		Alumno alumno1;
		Alumno alumno2;
		Alumno alumno3;
		int suma;
		Scanner sc = new Scanner(System.in);
		
		alumno1 = new Alumno();
		alumno1.nombre="Pedro";
		alumno1.apellido1="Martín";
		alumno1.apellido2="González";
		
		alumno1.mostrar();
		
		alumno1.sumarNotas(10, 7);
		
		alumno2 = new Alumno("María", "López", "Sánchez");
		alumno2.mostrar();
		
		alumno3 = new Alumno();	//Para cuando no sabemos los datos
		
		System.out.println("Introduzca nombre");
		alumno3.nombre=sc.next();
		
		System.out.println("Introduzca primer apellido");
		alumno3.apellido1=sc.next();
		
		System.out.println("Introduzca segundo apellido");
		alumno3.apellido2=sc.next();
		
		
		alumno3.mostrar();
		
		suma = alumno3.sumarNotas(5,10);
		System.out.println(suma);
		
		
		
		sc.close();
	}

}
