package Ejercicio7_Parte1;


public class Rana2 extends Anfibio2{
	
	private String tamaño;
	private int patas;
	
	public Rana2(String clima, String color, int peso, String tamaño, int patas) {
	super(clima,color,peso);	
	
	this.tamaño=tamaño;
	this.patas=patas;
	}
		
	
	public String datos_Frog() {
		return "La rana es de tipo: " + tamaño + " y tiene " + patas + " patas."; 
	}
	
	

}
