package POO;


public class Alumno {
	//Las cosas que puede tener una clase se llaman miembros:
	
	//·Campos o propiedades
	public String nombre;
	public String apellido1;
	public String apellido2;
	
	
	//·Constructores: lo que puede recibir el objeto cuando se crea
	public Alumno()	{
		/*
		System.out.println("Introduzca nombre");
		this.nombre=sc.next();
		
		System.out.println("Introduzca primer apellido");
		this.apellido1=sc.next();
		
		System.out.println("Introduzca segundo apellido");
		this.apellido2=sc.next();
		*/
	}
	
	
	public Alumno(String nombre,String apellido1,String apellido2) { //Parámetros o argumetos
		this.nombre= nombre;		//Distintas a las de arriba (mirar colores)
		this.apellido1= apellido1;
		this.apellido2 = apellido2;
		
	}
	
	//Métodos: función
	public void mostrar()	//Public-> se puede acceder desde el objeto; void-> no devuelve valor
	{
		String mensaje;
		
		mensaje = "NOMBRE: " + nombre + "\n"		//No es necesario el this
				+ "PRIMER APELLIDO: "+ this.apellido1+"\n"
				+"SEGUNDO APELLIDO: "+ this.apellido2;
		
		System.out.println(mensaje+"\n");
	}
	
	
	public int sumarNotas (int numero1, int numero2) {	//En este caso indicamos que se devuelve un entero (int)
		int resultado;
		resultado = numero1 + numero2;
		return resultado;				//Siempre al final del todo
	}
	
	public float sumarNotas (float p_nota1, float p_nota2) {
		float resultado;
		resultado = p_nota1+p_nota2;
		return resultado;
	}
}
