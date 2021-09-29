package clases;

import java.util.HashMap;
import java.util.Scanner;

import interfaz.ICRUD;

public class RepoCoches implements ICRUD<Coches,String>
{
	//Constructor
	public RepoCoches() {
		this.lista_coches = new HashMap<String, Coches>();
	}

	//Campos
	public HashMap<String, Coches> lista_coches;
	public Scanner sc=new Scanner(System.in);
	
	//Métodos
	@Override
	public void nuevo(Coches clase) {			//Añadir coche
		this.lista_coches.put(clase.matricula,clase);
		System.out.println("Coche añadido a la lista.\n");
	}

	@Override
	public Coches leer(String id) {
		if (lista_coches.size()==0) {			//Para comprobar que no está vacío
			System.out.println("El listado de coches está vacío.\n");
		}
		else {
			try {							//Por si la matrícula no está en el listado.
				Coches miCoche = this.lista_coches.get(id);
				System.out.println(miCoche.toString());
			}
			catch (Exception e) {
				System.out.println("No se ha encontrado el coche indicado.\n");
			}
		}
	return null;
	}

	@Override
	public HashMap<String, Coches> listar() {
		if (lista_coches.size()==0) {
			System.out.println("El listado de coches está vacío.\n");
		}
		else {
			System.out.println("La lista de coches introducidos es la siguiente:\n");
			System.out.println(lista_coches.values());
			
		}
		return null;
	}

	@Override
	public void editar(String id) {
		
		if (lista_coches.size()==0) {		//Comprobamos que no esté vacío
			System.out.println("El listado de coches está vacío.\n");
		}
		else {
			if (lista_coches.get(id)==null) {		//Comprobamos que existe un coche en el listado con dicha matrícula
				System.out.println("Coche no encontrado.\n");
			}
			else {
				System.out.println("¿Qué desea modificar: marca(1), color(2), ambas(3)?");
				int respuesta= Integer.valueOf(sc.nextLine());
				String marca;
				String color;
				Coches coche;
				if (respuesta==1) {
					System.out.println("Introduzca marca:");
					marca=sc.nextLine();
					color=lista_coches.get(id).color;
					coche=new Coches(id, marca, color);
					this.lista_coches.put(id, coche);
					System.out.println("Datos del coche modificados.\n");
				}
				else if (respuesta ==2) {
					System.out.println("Introduzca color:");
					color=sc.nextLine();
					marca=lista_coches.get(id).marca;
					coche=new Coches(id, marca, color);
					this.lista_coches.put(id, coche);
					System.out.println("Datos del coche modificados.\n");
				}
				else if(respuesta==3) {
					System.out.println("Introduzca marca:");
					marca=sc.nextLine();
					System.out.println("Introduzca color:");
					color=sc.nextLine();
					coche=new Coches(id, marca, color);
					this.lista_coches.put(id, coche);
					System.out.println("Datos del coche modificados.\n");
				}
				else {
					System.out.println("Opción incorrecta.\n");
				}
			}
			}
			
		}
		


	@Override
	public void eliminar(String id) {
		if (this.lista_coches.remove(id)==null) {		//Comprobamos que existe el coche que se desea eliminar en el listado
			System.out.println("No se encuentra el coche que desea eliminar.\n");
		}	
		else {
			System.out.println("Eliminado con éxito.\n");
		}
	}
	
	
	

}
