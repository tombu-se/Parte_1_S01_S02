package Ejercicio6_Parte1;

public class Frog extends Amphibian{
	
	private String tamaño;
	private int patas;
	
	
	public Frog(String tamaño, int patas) {
	super();	
	
	this.tamaño=tamaño;
	this.patas=patas;
	}
	
	public String datos_Frog() {
		return "La rana es de tipo: " + tamaño + " y tiene " + patas + " patas."; 
	}
	
	

}
