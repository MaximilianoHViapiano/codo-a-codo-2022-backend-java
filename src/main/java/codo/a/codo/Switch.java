package codo.a.codo;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int nota = 5;  // nota harcodeada 
		// hora para leer la nota desde el teclado 
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Ingrese la nota");
		
		int nota = teclado.nextInt();
		switch (nota) {
		case 10:
			System.out.println("excelente");
			break;
		case 4:
			System.out.println("aprobo");
			break;
		default:
			System.out.println("no aprobo");
			break;
		}
		teclado.close();
	}

}
