package ar.com.codoacodo.dto;

import java.util.Date; 

public class Producto {
	private Long idProducto;
	private String nombre;
	private Float precio;
	private Date fecha;
	private String imagen; 
	private String codigo;
	
//	public Producto(Long idProducto, String nombre, Float precio, Date fecha, String imagen, String codigo) {
//		super();
//		this.idProducto = idProducto;
//		this.nombre = nombre;
//		this.precio = precio;
//		this.fecha = fecha;
//		this.imagen = imagen;
//		this.codigo = codigo;
//	}

	public Producto(Long idProducto2, String nombre2, Float precio2, java.util.Date fecha2, String imagen2,
			String codigo2) {
		super();
		this.idProducto = idProducto2;
		this.nombre = nombre2;
		this.precio = precio2;
		this.fecha = fecha2;
		this.imagen = imagen2;
		this.codigo = codigo2;
		
		// TODO Auto-generated constructor stub
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	
}