package Ejercicio6_Parte1;

public class Frog extends Amphibian{
	
	private String tama�o;
	private int patas;
	
	
	public Frog(String tama�o, int patas) {
	super();	
	
	this.tama�o=tama�o;
	this.patas=patas;
	}
	
	public String datos_Frog() {
		return "La rana es de tipo: " + tama�o + " y tiene " + patas + " patas."; 
	}
	
	

}
