package ar.com.codoacodo.controllers;


import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import ar.com.codoacodo.dto.Producto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*herencia*/
//create controler es hijo de :
@WebServlet("/CreateController")
public class ConsultarController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id"); 
		String sql = "select * from producto where id = " + id ; 
		
		Connection con = AdministradorDeConexiones.getConnection(); 
		if(con !=null) {
		   try {
				Statement st = con.createStatement(); 
				ResultSet rs = st.execute(sql);
				
				// obtengo todos los datos que contienen un producto 
				Long idProducto = rs.getLong(1); //tomar la primer columna de mi select 
				String nombre = rs.getString(2); 
				Float precio = rs.getFloat(3); 
				Date fecha = rs.getDate(4); 
				String imagen = rs.getString(5); 
				String codigo = rs.getString(6); 
				
				// si quiero construir un objeto con estos datos 
				Producto prodFromDb = new Producto(idProducto, nombre, precio, fecha, imagen, codigo); 
				
				
				// me tego que ir a ota pagina ara mostarlo 
				req.setAttribute("producto", prodFromDb);
				getServletContext().getRequestDispatcher("/detalle.jsp").forward(req, resp); 
				
				
				// cierre dela conexion 
				con.close();
		   } catch(Exception e) {
			   e.printStackTrace();
		   } 
		}
	}
	
}

