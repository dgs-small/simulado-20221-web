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
public class CadastroController extends HttpServlet {
	
	private final UsuarioDAO banco = new UsuarioDAO();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");

		Usuario user = new Usuario(login, senha);

		if (banco.findByLogin(login) != null) {
			banco.save(user);
			req.setAttribute("sucessoCadastro", "Usuário " + login +" cadastrado com sucesso");
			req.getRequestDispatcher("/lista").forward(req, resp);
		}
		
	}
}
