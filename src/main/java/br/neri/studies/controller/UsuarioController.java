package br.neri.studies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.neri.studies.controller.request.RequestUsuario;
import br.neri.studies.entity.Usuario;
import br.neri.studies.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/saveentity")
	public Usuario salvarUsuarioDTO(@RequestBody RequestUsuario usuario) {
		return usuarioService.salvaUsuario(usuario);
	}
	
	
	@PostMapping("/savedto")
	public Usuario salvarUsuarioEntity(@RequestBody Usuario usuario) {
		return usuarioService.salvaUsuario(usuario);
	}

}
