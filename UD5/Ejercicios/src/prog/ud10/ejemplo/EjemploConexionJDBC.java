package prog.ud10.ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemploConexionJDBC {

	public static void main(String[] args) {
			try (Connection con = DriverManager.getConnection(
					"jdbc:mariadb://localhost:3306/tienda","fran", "Fr4n");
				Statement stmt = con.createStatement()) {
				System.out.println("Conexión con éxito.");
			//stmt.executeQuery("Select....");
			
			} catch (SQLException  e) {
				System.out.println("No se pudo conectar.");
				e.printStackTrace();
			}
			
	}

}
