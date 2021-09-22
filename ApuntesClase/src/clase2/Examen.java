package clase2;

public class Examen {

	public static void main(String[] args) {
		String pais = "España";
		boolean historia=false;
		
		if( (pais.equals("España") || pais.equals("Francia")) && historia==true) {
			System.out.println("Encontrado1");
		}
		
		if( pais.equals("España") || pais.equals("Francia") && historia==true) {
			System.out.println("Encontrado2");
		}

	}

}
