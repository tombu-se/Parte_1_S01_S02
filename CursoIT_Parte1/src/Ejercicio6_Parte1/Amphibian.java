package Ejercicio6_Parte1;

public class Amphibian {

	private String clima;
	private String color;
	private int peso;
	
	public Amphibian() {
		this.clima="frio";
		this.color="rojo";
		this.peso=4;
	}
	
	public String dato_anfibios () {
		return "Anfibio de clima " + clima + ", de color " + color + " y pesa " + peso +"KG.";
	}
	
	public static void main(String[] args) { 

		Amphibian Anfibios = new Amphibian();
		Frog Rana = new Frog ("Grande", 4);
		
		System.out.println(Anfibios.dato_anfibios());
		System.out.println(Rana.datos_Frog());
		
		System.out.println(Rana.dato_anfibios());
		
		
		
	}

}
