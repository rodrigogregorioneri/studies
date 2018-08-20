package br.neri.studies.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.neri.studies.entity.TipoTarefa;

@Repository
public interface TipoTarefaRepository extends CrudRepository<TipoTarefa, Long> {

}
