package br.neri.studies.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Tarefas {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome_tarefas;
	
    @ManyToOne
    private Usuario usuario;
    
    @OneToOne
    private TipoTarefa tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_tarefas() {
		return nome_tarefas;
	}

	public void setNome_tarefas(String nome_tarefas) {
		this.nome_tarefas = nome_tarefas;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	



	
	
	

}
