package com.gestion.Jalsuri_BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdCategoria;

	@Column(name = "NomCategoria", length = 100, unique = true, nullable = false)
	private String NomCategoria;

	@Column(name = "EstCategoria",nullable = false)
	private boolean EstCategoria;

	
	
	public Categoria() {
	}

	public Categoria(Long idCategoria, String nomCategoria, boolean estCategoria) {
		super();
		IdCategoria = idCategoria;
		NomCategoria = nomCategoria;
		EstCategoria = estCategoria;
	}

	public Long getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		IdCategoria = idCategoria;
	}

	public String getNomCategoria() {
		return NomCategoria;
	}

	public void setNomCategoria(String nomCategoria) {
		NomCategoria = nomCategoria;
	}

	public boolean isEstCategoria() {
		return EstCategoria;
	}

	public void setEstCategoria(boolean estCategoria) {
		EstCategoria = estCategoria;
	}

}
