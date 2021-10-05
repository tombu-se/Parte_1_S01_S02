package Ejercicio7_Parte1;


public class Anfibio2 {

	private String clima;
	private String color;
	private int peso;
	
	public Anfibio2(String clima, String color, int peso) {
		this.clima = clima;
		this.color = color;
		this.peso = peso;
	}
	
	public String dato_anfibios () {
		return "Anfibio de clima " + clima + ", de color " + color + " y pesa " + peso +"KG.";
	}
	
	public static void main(String[] args) { 

		Anfibio2 Anfibios = new Anfibio2("calor", "rojo", 3);
		Rana2 Rana = new Rana2("frio","azul",0,"Grande", 4);
		
		System.out.println(Anfibios.dato_anfibios());

		System.out.println(Rana.datos_Frog());

		
		System.out.println(Anfibios.dato_anfibios());

					
		System.out.println(Rana.dato_anfibios());
		
		
		
	}

}

