package ejecuta;

import clases.Curso;

public class Inicio {

	public static void main(String[] args) {
		
		Curso java = new Curso();
		
		//java.horas = -10;		//Lo admitiría si horas fuese público, pero no tiene sentido, cambiamos en Curso.java
	
		//denominacion=java.denominacion();  //No lo admite porque es privado
		
		java.setDenominacion("Beca Java");
		java.setHoras(90);
		java.setAcademia("Experis");
		
		
		System.out.println(java.getDenominacion());
		System.out.println(java.getHoras());
		System.out.println(java.getAcademia());

	}

}
