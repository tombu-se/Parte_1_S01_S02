package Ejercicio2_Parte2;

public class Bici {
 
	private String marca;
	
	public static String color;
	
	public static void dar_color() {
		System.out.println("El color de la bici es " +Bici.color);
	}
	
	public Bici(String modelo) {
		marca = modelo;
	}
	
	public String dar_marca() {
		return "La marca de la bici es: " + marca;
		
	}
	public static void main(String[] args) {
		
		Bici nueva = new Bici ("BMX");
		System.out.println(nueva.dar_marca());
	
		Bici.color = "rojo";
		
		dar_color();

	}

}
