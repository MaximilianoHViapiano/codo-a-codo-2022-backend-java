package codo.a.codo;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array de enteros 
		int[] array = new int[3]; 
		array[0]= 1; 
		array[1]= 43; 
		array[2]= 32; 


		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("fin");
		System.out.println("mostrando el indice 2 : " +array[2]);
	
	}

}
