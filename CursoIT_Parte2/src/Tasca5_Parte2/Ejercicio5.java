package Tasca5_Parte2;

import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio5 {

	public static void main(String[] args) {
		    
		    Scanner entrada = new Scanner(System.in);
		    int num = 0;
		    
		    boolean trato = false;
		    while(!trato) {
		    	try {
		    		System.out.println("Ingresar numero");
		    		num =entrada.nextInt();
		    		trato = true;
		    	}
		    	catch (InputMismatchException e) {
		    		String loop = entrada.nextLine();
		    		System.out.println("Error");
		    	}		    	
		    }
		    System.out.println("Has ingresado: " + num);
	}
}