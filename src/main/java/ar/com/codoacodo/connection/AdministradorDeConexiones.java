package ar.com.codoacodo.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {

	public static Connection getConnection() {
		
		/* 
		/ es la conexion LOCAL
		String url ="jdbc:mysql://127.0.0.1:3306/codo-a-codo?serverTimeZone=UTC&usrSSL=false";
		String username= "root"; 
		String password =""; 
		
		String driverName ="com.mysql.cj.jdbc.Driver";    // mysql o postgres
		 */		
		
		// ahora para HEROKU 
		String url = System.getenv("DATASOURCE_URL");
		String user= System.getenv("DATASOURCE_USERNAME");
		String password =System.getenv("DATASOURCE_PASSWORD");
		String driverName =System.getenv("DATASOURCE_DRIVER");
		
		
		// control de errores
		Connection con; 
		try {
			Class.forName(driverName); // carga en memoria el driver 
			con = DriverManager.getConnection(url,user,password);    // esto me devuelve una conexin que yo me guardo en CON
		}catch(Exception e) {
			con = null; 
			e.printStackTrace();  // muestro el fallo 
		}
		return con; 
	}
	
	
	public static void main(String[] args) {
		Connection con = AdministradorDeConexiones.getConnection(); 
		if(con != null) {
			System.out.println("CONEXIN OK");
		} else {
			System.out.println("CONEXIoN fallo");
		}
	}
	
}
