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
@WebServlet("/api/EliminarController")
public class EliminarController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//recibe los datos del front 
		String id = req.getParameter("id"); 
		
		Connection con = AdministradorDeConexiones.getConnection(); 
		if(con !=null) {
			String sql = "DELETE FROM producto where id=" +id;  
			
		   try {
				Statement st = con.createStatement(); 
				st.executeUpdate(sql); 
				
				// cierre dela conexion 
				con.close();
				resp.sendRedirect(req.getContextPath()+"/api/ListadoController");
		   } catch(Exception e) {
			   e.printStackTrace();
		   } 
			
		}
	}
}
