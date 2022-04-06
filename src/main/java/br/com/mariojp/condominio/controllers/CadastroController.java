package br.com.mariojp.condominio.controllers;

import java.io.IOException;

import br.com.mariojp.condominio.dao.UsuarioDAO;
import br.com.mariojp.condominio.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastro")
public class CadastroController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		UsuarioDAO banco = new UsuarioDAO();
		Usuario user = new Usuario(login, senha);
		
		if (banco.findByLogin(login) != null) {
			resp.getWriter().write("<html><body><p>Usuário já existe</p></body</html>");
		} else {
			resp.getWriter().write("<html><body><p>Usuário " + login + " cadastrado com sucesso</p></body</html>");
			banco.save(user);
		}
	}
}
