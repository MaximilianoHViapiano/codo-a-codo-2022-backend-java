package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.sql.Connection;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*herencia*/
//create controler es hijo de :
public class CreateController extends HttpServlet {


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//recibe los datos del front 
		String nombre = req.getParameter("nombre"); 
		String precio = req.getParameter("precio");  //convertir en float 
		String fechaCreacion= "";   // la vamos a asignar nosotros 
		String imagen = req.getParameter("imagen"); 
		String codigo = req.getParameter("codigo"); 
		
		Connection con = AdministradorDeConexiones.getConnection(); 
		if(con !=null) {
			String sql = "INSERT INTO producto (nombre, precio, fecha_creacion, image, codigo) "; 
				   sql+= "VALUES ('"+nombre+"',"+precio+", curdate(), '"+imagen+"', '"+codigo+"')"; 
		}
		
		//en req viene los datos que manda el formuario html 
		//clave = valor
		
		//pedir una conexion: AdministradordeConexiones.getconection()
		
		//insert en la db > sql insert into 

		
		
	}
	
}
