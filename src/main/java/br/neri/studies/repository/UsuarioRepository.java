package br.neri.studies.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.neri.studies.entity.Tarefas;
import br.neri.studies.entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {


	
}
