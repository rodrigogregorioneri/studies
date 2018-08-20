package br.neri.studies.controller.request;

import br.neri.studies.entity.Usuario;

public class RequestUsuario {

	private Long id;

	private String nome;

	private String email;

	private String username;
	
	
	public Usuario toUsuario(RequestUsuario user) {
		Usuario u = new Usuario();
		u.setEmail(user.getEmail());
		u.setId(user.getId());
		u.setNome(user.getNome());
		u.setUsername(user.getUsername());
		return u;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
