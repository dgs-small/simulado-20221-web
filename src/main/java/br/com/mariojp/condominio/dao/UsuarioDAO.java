package br.com.mariojp.condominio.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.mariojp.condominio.model.Usuario;

public class UsuarioDAO {

	private static Map<String, Usuario> usuarios = new HashMap<String, Usuario>();

	static {
		Usuario usuario = new Usuario();
		usuario.setLogin("root");
		usuario.setSenha("1234");
		usuarios.put(usuario.getLogin(), usuario);
	}

	public Usuario findByLogin(String login) {
		return usuarios.get(login);
	}

	public void save(Usuario usuario) {
		usuarios.put(usuario.getLogin(), usuario);
	}

	public void delete(Usuario usuario) {
		delete(usuario.getLogin());
	}

	public void delete(String login) {
		usuarios.remove(login);
	}

	public List<Usuario> findAll() {
		return new ArrayList<Usuario>(usuarios.values());
	}

}
