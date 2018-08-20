package br.neri.studies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.neri.studies.entity.Tarefas;
import br.neri.studies.service.TarefasService;

@RestController
@RequestMapping("/tarefas")
public class TarefasController {
	
	@Autowired
	private TarefasService tarefasService;
	
	@PostMapping("/save")
	public Tarefas salvarTarefas(@RequestBody Tarefas tarefas) {
		return tarefasService.salvarTarefas(tarefas);
	}
	
	@GetMapping("/search")
	public List<Tarefas> buscaTarefas( @RequestParam(value = "id") Long id) {
		return tarefasService.buscaPorUsuario(id);
	}
	

	

}
