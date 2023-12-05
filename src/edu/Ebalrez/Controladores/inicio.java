package edu.Ebalrez.Controladores;

import java.util.Scanner;

import edu.Ebalrez.Servicios.MenuImplementacion;
import edu.Ebalrez.Servicios.MenuInterfaz;
import edu.Ebalrez.Servicios.OperativaImplementacion;
import edu.Ebalrez.Servicios.OperativaInterfaz;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	MenuInterfaz menuI = new MenuImplementacion();
	OperativaInterfaz operativaI = new OperativaImplementacion();
	
	int opcion;
	boolean cerrarMenu = false;
	double precioVenta;
	
	while(!cerrarMenu) {
	opcion=menuI.MostrarMenu();
	
	
	switch(opcion) {
	
	case 0:
		System.out.println("*Has seleccionado la opcion de cerrar menu.");
		cerrarMenu=true;
		break;
		
	case 1:
		
		precioVenta=operativaI.AñadirVenta();
		break;
		
	case 2:
		System.out.println("*Has seleccionado la opcion de añadir gasto.");
		break;
			
	case 3:
		System.out.println("*Has seleccionado la opcion de mostrar total.");
		break;
	}
			
	
			
	}		
	
	
	
	
	

	}

}
