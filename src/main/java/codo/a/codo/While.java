package codo.a.codo;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador= 10; 
		
		while(contador>=0) {
			System.out.println("contador: " +contador);
			
			
//			if(contador == 3) {
//				//break; salgo del while principal
//				continue; // hace que cuando contador ==3 NO EJECUTE EL DECREMENTO 
//			}
//			contador--; 
			
			// par o impar 
			if(contador % 2 == 0) {
				System.out.println("contador par " +contador );
			}else {
				System.out.println("contador impar " +contador );
			}
			contador--; 
		}
	
	
	
	}

}
