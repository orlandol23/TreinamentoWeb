

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModulosTreinamentoServlet
 */
@WebServlet("/modulos")
public class ModulosTreinamentoServlet extends HttpServlet{

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response){
	
		PrintWriter out = null;
		try {
			out = response.getWriter();
			
			List<String> listaModulos = new ArrayList<>();
			listaModulos.add("NOME           | INSTRUTOR TITULAR      | INSTRUTOR AUXILIAR.           |  DT INICIO" +"<br>");
			listaModulos.add("NIVELAMENTO    | Ivo				      | Leonardo				      | 20/06/2020"+"<br>");
			listaModulos.add("HTML/CSS	     | Jonas				  | Leonardo				      | 27/06/2020"+"<br>");
			listaModulos.add("JAVASCRIPT	 | Jonas				  | Leonardo				      | 02/07/2020"+"<br>");
			listaModulos.add("POO		     | Ivo				      | Leonardo				      | 11/07/2020"+"<br>");
			listaModulos.add("Java			 | Leonardo			      | Ivo					          | 18/07/2020"+"<br>");
			listaModulos.add("BD			 | Leonardo			      | Fabio				          | 24/07/2020"+"<br>");
			listaModulos.add("Aplicações Web | Fabio				  | Ivo					          | 30/07/2020"+"<br>");
			listaModulos.add("Spring Boot	 | Fabio				  | Ivo					          | 05/08/2020"+"<br>");
			listaModulos.add("Angular		 | Jonas				  | Fabio				          | 13/08/20200"+"<br>");

			request.setAttribute("titulo", "Lista de modulos");
			request.setAttribute("modulos", listaModulos);
			
			RequestDispatcher rd = request.getRequestDispatcher("/consultar-modulos.jsp");
		    try {
				rd.forward(request,response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
			
		}catch(IOException e) {
			System.out.println("Erro ao executar servlet: MinhaPrimeiraServlet");
		}
	}
	
}

