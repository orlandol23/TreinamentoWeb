import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	public class ModuloDAO extends HttpServlet{
		private String SQL_LISTAR_MODULO = "select * from tb_modulo";
		
		Connection conn;
		
		public List<Modulo> listarmodulo() {
			
			List<Modulo> listarmodulo = new ArrayList();
			
			try (   Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(SQL_LISTAR_MODULO);) {

				while (rs.next()) {
					Modulo modulo = new Modulo();
					modulo.setNome(rs.getString("nome"));
					modulo.setTitular(rs.getString("titular"));
					modulo.setAuxiliar(rs.getString("auxiliar"));
					modulo.setDtInauguracao(rs.getDate("data"));

					listarmodulo.add(modulo);
				}

				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return listarmodulo;
		}

	}
	
	