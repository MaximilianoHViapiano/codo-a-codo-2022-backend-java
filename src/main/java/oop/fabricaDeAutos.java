package oop;

public class fabricaDeAutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// quiero crear mi primer objeto de la clase AUTO 

		Auto fiatUno = new Auto(); // ES EL CONSTRUCTOR 
		
		// quiero ver la velocidad del auto ...
		fiatUno.encender();
		fiatUno.verVelocidad();
		fiatUno.encender();
		fiatUno.verVelocidad();
		System.out.println(fiatUno.anio);
		fiatUno.acelerar();
		fiatUno.verVelocidad();
		fiatUno.acelerar();
		fiatUno.verVelocidad();
		fiatUno.acelerar();
		fiatUno.verVelocidad();
		fiatUno.acelerar();
		fiatUno.verVelocidad();
		fiatUno.acelerar();
		fiatUno.verVelocidad();
		fiatUno.frenar();
		fiatUno.verVelocidad();
		fiatUno.apagar();
		fiatUno.verVelocidad();		
		fiatUno.apagar();
		System.out.println("fin");
	}

}
