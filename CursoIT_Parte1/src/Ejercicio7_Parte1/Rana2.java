package Ejercicio7_Parte1;


public class Rana2 extends Anfibio2{
	
	private String tama�o;
	private int patas;
	
	public Rana2(String clima, String color, int peso, String tama�o, int patas) {
	super(clima,color,peso);	
	
	this.tama�o=tama�o;
	this.patas=patas;
	}
		
	
	public String datos_Frog() {
		return "La rana es de tipo: " + tama�o + " y tiene " + patas + " patas."; 
	}
	
	

}
