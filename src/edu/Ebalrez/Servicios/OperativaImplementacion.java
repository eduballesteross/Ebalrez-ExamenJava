package edu.Ebalrez.Servicios;

import java.util.Scanner;

/**
 * Implementacion a OperativaInterfaz
 */


public class OperativaImplementacion implements OperativaInterfaz {


	Scanner sc = new Scanner(System.in);
	
	public double AñadirVenta() {
		
	double precioVenta;
		
		
		do {
			
		System.out.println("Introduzca el precio de la prenda en formato'99,99'");
		
		while(!sc.hasNextDouble()) {
			System.out.println("Debe introducir un número entero");
			sc.nextLine();
		}	
			precioVenta = sc.nextDouble();
			
		if (precioVenta<0) {
			System.out.println("Debe introducir un número correspondiente a la opcion deseada. Intentelo de nuevo.");
		}
		
		}while(precioVenta<0);
		
	
		
		return precioVenta;
		
	}

}
