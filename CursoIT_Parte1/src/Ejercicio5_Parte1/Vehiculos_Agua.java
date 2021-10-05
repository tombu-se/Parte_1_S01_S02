package Ejercicio5_Parte1;

public class Vehiculos_Agua extends Vehiculos {
	
	private String modelo;
	private int motor;

	public Vehiculos_Agua(String tipo, int precio, int peso, int largo, String modelo, int motor) {
		super(tipo, precio, peso, largo);
		
		this.modelo=modelo;
		this.motor=motor;
	}
	
	public String info_vehiculo() {
		return "El modelo del vehiculo es: " + modelo + " y su motor es: " + motor;
	}

	
}
