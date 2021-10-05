package Ejercicio4_Parte1;

public class Moto {
	
	private static final int a = 0;
	private final int b = 0;
	
	public Moto(int x) {
		x=b;
	}
	
	public static void main(String[] args) {
		
		Moto BMW = new Moto(4);
		
    //BMW.a++;	
    System.out.println(Moto.a);
    //Moto.a++;
	System.out.println(BMW.b);
    //BMW.b++;
	}

}
