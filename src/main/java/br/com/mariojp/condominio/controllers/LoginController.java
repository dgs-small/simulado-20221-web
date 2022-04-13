package br.com.mariojp.condominio.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import br.com.mariojp.condominio.dao.UsuarioDAO;
import br.com.mariojp.condominio.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	private final UsuarioDAO banco = new UsuarioDAO();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		Usuario user = banco.findByLogin(login);

		if (user != null && user.getSenha().equals(senha)) {
			req.getSession().setAttribute("usuario", login);
			resp.sendRedirect("/lista");
		} else {
			resp.sendRedirect("/login.jsp");
		}

//		//Pode apagar esse codigo
//		PrintWriter writer = resp.getWriter();
//        writer.println("<html><title>Etapa 1</title><body>");
//        writer.println("<h1>BOA SORTE!</h1>");
//        writer.println("<p>Os parametros passados foram:</p>");
//        writer.println("<p>login:"+login+"</p>");
//        writer.println("<p>senha:"+senha+"</p>");
//
//        writer.println("<p>Existe um usuario pré-cadastrado: login: root/ senha: 1234</p>");
//        writer.println("<p>Use o UsuarioDAO e o metodo findByLogin para autenticar o usuario. </p>");
//
//        writer.println("</body></html>");
	}

}
