package br.neri.studies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.neri.studies.controller.request.RequestUsuario;
import br.neri.studies.entity.Tarefas;
import br.neri.studies.entity.Usuario;
import br.neri.studies.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario salvaUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	
	public Usuario salvaUsuario(RequestUsuario usuario) {
		return usuarioRepository.save(usuario.toUsuario(usuario));
	}
	

}
