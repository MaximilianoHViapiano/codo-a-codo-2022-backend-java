package oop;

// nombre de la clase
public class Auto {
	
	// atributos de la clase 
	public String color; 
	public int anio; 
	public long serie;
	public String marca; 
	public String modelo; 
	public float velocidad;  
	public float velocidadMaxima;  
	public boolean encendido; 
	
	// cuando nce el objeto: CONSTRUCTOR
	public Auto() {
		this.setVelocidad(0);
		//velocidad = 0;
		this.setAnio(2022);
		//anio = 2022; 
		//marca = "SIN MARCA"; 
		//modelo = "SIN MODELO";
		this.setEncendido(false);
		//encendido = false; 
		//velocidadMaxima = 3; 
	}
	//metodos de la clase 
	public void encender() {
		if (!encendido) {
			encendido = true;
			System.out.println("encendiendo el auto");
		} else {
			System.out.println("Error el auto ya encendido");
		}		
		
	}

	public void apagar() {
//		if(encendido) {
//			encendido = false; 
//			System.out.println("se ha apagado el auto");
//		} else {
//			System.out.println("Error el auto ya esta apagado");
//		}
		if(encendido) {
			//this.isEncendido()       //boolean se generan como isAlgo(), si son wraper Boolean se generan como getAlgo() 
			while(this.getVelocidad() > 0 ) {
				frenar(); 
			}
			this.setEncendido(false);
			// reemplace lo de abajo porque ahora trabajo con lo geter y seter 
			//encendido = false;
			System.out.println("se ha apagado correctamente"); 
		} else {
			System.out.println("no se puede apagar dos veces"); 
		}
				
	}
	
	public void acelerar() {
		if(encendido) {
			if(velocidad<velocidadMaxima) {
				velocidad++;				
			} else {
				System.out.println("Error velocidad maxima alcanzada");
			}
		} else {
			System.out.println("Error el auto NO esta ENCENDIDO");
		}
		 
		
	}
	
	public void frenar() {
		if(encendido) {
			if(velocidad > 0 ) {
				velocidad--;	
			}
			 			
		} else {
			System.out.println("Error auto APAGADO");
		}

		
	}
	
	public void verVelocidad() {
		System.out.println(velocidad);
	}
	
	public String getMarca() {
		// esto es la logica oculta al mundo exterior
		
		// todo esto esta hecho en una sola linea mas abajo 
		//if(marca == null) {
		//	return "S/Marca"; 
		//} else {
		//	return marca;			
		//}
 
		return marca == null ? "" : marca; 
		
		
	}
	
	
	// os que ponga como PRIVATE , NO SE LOS PUEDE ACCEDER DESDE AFUERA 
	public void setMarca(String marca) {
		this.marca = marca; 
		// al poner this. hago referencia al atributo PRIVATE que defini arriba de todo MARCA 
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAnio() {
		return anio;
	}
	private void setAnio(int anio) {
		this.anio = anio;
	}
	public long getSerie() {
		return serie;
	}
	private void setSerie(long serie) {
		this.serie = serie;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getVelocidad() {
		return velocidad;
	}
	private void setVelocidad(float velocidad) {
		if(velocidad < 0) {
			this.velocidad= 0; 
		} else {
			this.velocidad = velocidad;	
		}
		
	}
	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	// alt + shift + S ara GENERAR LOS GET Y SET DE LOS ATRIBUTOS QUE YO QUIERO
	
	
}
