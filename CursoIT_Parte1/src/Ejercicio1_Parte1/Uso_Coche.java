package Ejercicio1_Parte1;

public class Uso_Coche {
	private String color;
	
     public Uso_Coche (String pintura) {
    	     color = pintura;
     }
     
     public String dame_color(){
    	 return "El color del coche es: " + color + ".";
     }
}
