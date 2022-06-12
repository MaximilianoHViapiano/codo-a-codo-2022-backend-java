package codo.a.codo;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in); 
		System.out.println("Ingrese la cantidad");
			
		//leer n
		int n = teclado.nextInt(); 
		
		for(int i=0 ;i<=n ;i++ ) {
			System.out.println(i);
		}
		teclado.close();
	}

}
