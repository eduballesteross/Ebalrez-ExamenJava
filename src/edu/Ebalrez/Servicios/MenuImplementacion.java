package edu.Ebalrez.Servicios;

import java.util.Scanner;

/**
 * Implementacion de la interfaz.
 */
public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	
	public int MostrarMenu() {
		
int opcion;
		
		do {
			
		
	
		System.out.println("######################");
		System.out.println("0- Cerrar Menu.");
		System.out.println("1- Añadir venta.");
		System.out.println("2- Añadir gasto.");
		System.out.println("3- Mostrar total.");
		System.out.println("######################");
		
		while(!sc.hasNextInt()) {
			System.out.println("Debe introducir un número entero");
			sc.nextLine();
		}	
			opcion = sc.nextInt();
			
		if (opcion<0 || opcion>3) {
			System.out.println("Debe introducir un número correspondiente a la opcion deseada. Intentelo de nuevo.");
		}
		
		}while(opcion<0 || opcion>3);
		
		sc.close();
		
		
		
		return opcion;
	}

	
}
