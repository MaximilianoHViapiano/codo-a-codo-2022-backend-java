package codo.a.codo;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean llueve= true ; 
		if(llueve) {
			System.out.println("si llueve");
		}else {
			System.out.println("no, no llueve");
		}

		int edad = 26; 
		if(edad == 15) {
			System.out.println("es 15");
		}else if(edad == 24) {
			System.out.println("es 26");
		}else if(edad == 30) {
			System.out.println("es 30");
		}else {
			System.out.println("es cualuier valor");
		}
	}	
}
