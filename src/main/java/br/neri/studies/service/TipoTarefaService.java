package br.neri.studies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.neri.studies.entity.TipoTarefa;
import br.neri.studies.repository.TipoTarefaRepository;

@Service
public class TipoTarefaService {
	
	@Autowired
	private TipoTarefaRepository tipoTarefaRepository;
	
	public TipoTarefa salvarTarefas(TipoTarefa tipo) {
		return tipoTarefaRepository.save(tipo);
	}	

}
