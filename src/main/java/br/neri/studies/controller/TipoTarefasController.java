package br.neri.studies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.neri.studies.entity.TipoTarefa;
import br.neri.studies.service.TipoTarefaService;

@RestController
@RequestMapping("/tipo")
public class TipoTarefasController {

	@Autowired
	private TipoTarefaService tipoTarefaService;
	
	@PostMapping("/save")
	public TipoTarefa salvarTarefas(@RequestBody TipoTarefa tipo) {
		return tipoTarefaService.salvarTarefas(tipo);
	}
}
