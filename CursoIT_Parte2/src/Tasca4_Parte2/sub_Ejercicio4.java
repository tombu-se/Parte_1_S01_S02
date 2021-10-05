package Tasca4_Parte2;

import java.util.Scanner;

public class sub_Ejercicio4 extends Ejercicio4 {

	Scanner entrada = new Scanner (System.in);

	String nombre;
	sub_Ejercicio4(){
		System.out.println("Dar nombre");
		nombre = entrada.nextLine();
		
		int i;
		try {
			for (i=0; i<nombre.length();i++)
		System.out.print(nombre.substring(i, i+1));
		}
		catch (Exception e){
		
			System.out.println("Introducir solo letras");
		
		}
			
	}
	
}
