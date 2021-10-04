package ejecuta;


import java.util.ArrayList;
import java.util.Scanner;

import modelos.Articulo;
import repositorios.RepoArticulo;

public class Inicio2 {
	
	public static void main(String[] args) {
		
		RepoArticulo repo= new RepoArticulo("BBDDPrueba");
		Articulo articulo= new Articulo();
		Scanner sc = new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);		//Para los float
		
		String referencia;
		ArrayList<Articulo> productos;
		
		int opcion;
		String menu = "\nMen�:\n"
					+ "1. Nuevo art�culo\n"
					+ "2. Listar art�culos\n"
					+ "3. Leer informaci�n del art�culo\n"
					+ "4. Eliminar art�culo\n"
					+ "5. Modificar informaci�n del art�culo\n"
					+ "6. Salir\n";
		
		do 
		{
			System.out.println(menu);
			System.out.print("Introduzca opci�n: ");
			opcion = Integer.valueOf(sc.nextLine());
			
			switch(opcion)
			{
				
			case 1: //Nuevo
				articulo = new Articulo();
				System.out.println("Introduzca referencia:");
				articulo.referencia=sc.nextLine();
				
				System.out.println("Introduzca nombre del art�culo:");
				articulo.nombre=sc.nextLine();
				
				System.out.println("Introduzca precio del art�culo:");
				articulo.precio=sc2.nextFloat();
				
				try {
					repo.nuevo(articulo);
				} catch (Exception e) {
					System.out.println("Se ha producido un error al agregar el art�culo.\n");
				}
				break;
			case 2: //Listar
				try {
					productos=repo.listar();
					if(productos.size()==0)
					{
						System.out.println("Sin datos.");
					}
					else
					{
						System.out.println("Los productos almacenados en la base de datos son:\n");
						for(Articulo ar : productos) 
						{
							System.out.println( ar.toString() );
						}
					}
					
				} catch (Exception e) {
					System.out.println("No se han podido leer los art�culos.\n");
				}
				break;
			case 3: //Leer informaci�n de producto individual
				System.out.println("Introduzca referencia del art�culo que desea conocer su informaci�n:");
				referencia=sc.nextLine();
				
				try {
					articulo=repo.leer(referencia);
					if(articulo!=null) {
						System.out.println(articulo.toString());
					}
					else {
						System.out.println("No se ha encontrado la referencia.");
					}
					
				} catch (Exception e) {
					System.out.println("Se ha producido un error al leer el producto.\n");
				}
				break;
			case 4:	//Eliminar art�culo
				System.out.println("Introduzca referencia del art�culo que desea eliminar:");
				referencia=sc.nextLine();
				try {
					repo.eliminar(referencia);
				} catch (Exception e) {
					System.out.println("Se ha producido un error al eliminar el producto.\n");
				}
				break;
			case 5: //Editar
				System.out.println("Introduzca referencia del art�culo que desea editar:");
				referencia=sc.nextLine();
				
				System.out.println("Introduzca los nuevos datos.\n");
				System.out.print("Referencia: ");
				articulo.referencia=sc.nextLine();
				
				System.out.print("\nNombre del art�culo: ");
				articulo.nombre=sc.nextLine();
				
				System.out.print("\nPrecio del producto: ");
				articulo.precio=sc2.nextFloat();
				
				try {
					repo.editar(referencia, articulo);
				} catch (Exception e) {
					System.out.println("Se ha producido un error al modificar el producto");
				}			
				break;

			case 6:
				System.out.println("Fin del programa.");
				break;
			default:
				System.out.println("Opci�n incorrecta.");
				break;
			}
		}while(opcion!=6);
		sc.close();
		sc2.close();
	}
}
