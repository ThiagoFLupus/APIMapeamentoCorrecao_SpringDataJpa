package com.mapeamento.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import java.util.List;
import javax.persistence.CascadeType;

@Entity
@Table(name= "TB_TUTOR")
public class Tutor {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String nome;
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name= "tutor_id", referencedColumnName= "id")
	private List<Pupilo> pupilos;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Pupilo> getPupilos() {
		return pupilos;
	}
	public void setPupilos(List<Pupilo> pupilo) {
		this.pupilos = pupilos;
	}
}
