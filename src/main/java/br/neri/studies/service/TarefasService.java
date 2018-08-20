package br.neri.studies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.neri.studies.entity.Tarefas;
import br.neri.studies.entity.Usuario;
import br.neri.studies.repository.TarefasRepository;

@Service
public class TarefasService {
	
	@Autowired
	private TarefasRepository tarefasRepository;
	
	public Tarefas salvarTarefas(Tarefas tarefas) {
		return tarefasRepository.save(tarefas);
	}
	
	public List<Tarefas> buscaPorUsuario(Long id) {
		return tarefasRepository.findByUsuarioId(id);
	}

}
