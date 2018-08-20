package br.neri.studies.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.neri.studies.entity.Tarefas;
import br.neri.studies.entity.Usuario;

@Repository
public interface TarefasRepository extends CrudRepository<Tarefas, Long> {
	
	
	List<Tarefas>findByUsuarioId(Long id);

}
