package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*herencia*/
//create controler es hijo de :
@WebServlet("/CreateController")
public class CreateController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//recibe los datos del front 
		String nombre = req.getParameter("nombre"); 
		//String precio = req.getParameter("precio");  //convertir en float
		//float precio = Float.valueOf(req.getParameter("precio"));
		float precio = 30; 
		String fechaCreacion= "";   // la vamos a asignar nosotros 
		String imagen = req.getParameter("imagen"); 
		String codigo = req.getParameter("codigo"); 
		
		Connection con = AdministradorDeConexiones.getConnection(); 
		if(con !=null) {
			String sql = "INSERT INTO producto (nombre, precio, fecha_creacion, imagen, codigo) ";
				   sql+= "VALUES ('"+nombre+"',"+precio+", curdate(), '"+imagen+"', '"+codigo+"')"; 
			
		   try {
				Statement st = con.createStatement(); 
				st.execute(sql); 
				
				// cierre dela conexion 
				con.close();
				
		   } catch(Exception e) {
			   e.printStackTrace();
		   } 
			
		}
		
		
		
		
		
		//en req viene los datos que manda el formuario html 
		//clave = valor
		
		//pedir una conexion: AdministradordeConexiones.getconection()
		
		//insert en la db > sql insert into 

		
		
	}
	
}
