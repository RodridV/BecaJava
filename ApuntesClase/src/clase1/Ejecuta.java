package clase1;

public class Ejecuta {

	public static void main(String[] args)
	{
		/*
		El alumno aprueba si supera el examen o entrega las 2 prácticas
		  nota	practica1Entregada	practica2Entregada
		--------------------------------------------------
		    3			true				false	
		*/
		float nota;                	//declaración de la variable (indicando el tipo)
		boolean practica1Entregada;
		boolean practica2Entregada;
		
		nota = 3;                 	//asignación de la variable
		practica1Entregada = true;
		practica2Entregada = false;
		
		if (nota>=5 || practica1Entregada==true && practica2Entregada==true){
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Suspenso");
		}
		
		if (nota>=5 || (practica1Entregada==true && practica2Entregada==true)){
			System.out.println("Aprobado_de_verdad");
		}
		else {
			System.out.println("Suspenso_de_verdad");
		}
		//Es lo mismo en ambos casos. Pensábamos que el primero daría "Aprobado"
		//Le da prioridad al && y después hace el ||
		if (practica1Entregada==true && practica2Entregada==true || nota>=5 ){
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Suspenso");
		}
	}

}

