package Tasca1_Parte2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String respuesta;
		System.out.println("Dar una palabra");
		try {
		
			respuesta = entrada.nextLine();
			
		
		System.out.println(respuesta);}
		
		catch (InputMismatchException e) {
		
			System.out.println("No se ha dado una palabra");
		}
	
		
	}
	}
