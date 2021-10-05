package Ejercicio5_Parte1;

public class Vehiculos {
	
	private String tipo;
	private int precio;
	private int peso;
	private int largo;
	
	public Vehiculos(String tipo, int precio, int peso, int largo) {
		this.tipo=tipo;
		this.precio=precio;
		this.peso=peso;
		this.largo=largo;
	}

	public String get_info() {
		return "Info del vehiculo: " + "\nTipo: " + tipo + "\nPrecio: " + precio + "$" + "\nPeso: " + peso + "KG" + "\nLargo: " + largo + "M";
	}
	
	public Vehiculos(String tipo) {
		this(tipo, 0, 0, 0);
	}
	
	public Vehiculos (String tipo, int precio) {
		this(tipo, precio, 0 , 0);
	}
	
	public Vehiculos (String tipo, int precio, int peso) {
		this(tipo, precio, peso, 0);
	}
	
	public static void main(String[] args) {
		
		Vehiculos Auto = new Vehiculos ("Auto", 1111, 2333, 2);
		Vehiculos_Agua Barco = new Vehiculos_Agua ("Barco",2222,1111,3, "X10", 1000);
		
         System.out.println(Auto.get_info());
		
         System.out.println(Barco.info_vehiculo());
         System.out.println(Barco.get_info());
		
	}

}


