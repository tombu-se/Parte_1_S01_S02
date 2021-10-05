package Ejercicio3_Parte1;

public class Avion {
         
	public Avion () {
		System.out.println("El constructor");
	}
	static {
		System.out.println("Bloque estatico");
	}
	
	{
		System.out.println("Bloque de inicio");
	}
	
	static {
		System.out.println("Bloque estatico");
	}
	public static void main(String[] args) {

		System.out.println("main");
		new Avion();
		
		
	}

}
