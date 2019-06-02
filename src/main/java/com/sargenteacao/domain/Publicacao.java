package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sargenteacao.domain.enums.TipoPublicacao;

public class Publicacao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Integer numero;
	private Date data;
	private Integer tipoPublicacao;
	
	private Subordinacao subordinacao;
	
	private List<Comportamento> comportamentos = new ArrayList<>();
	
	private List<Materia> materias = new ArrayList<>();
	
	private Militar militarAssina;
	
	private List<Promocao> promocoes = new ArrayList<>();
	
	private List<Fatd> fatds = new ArrayList<>();
	
	public Publicacao() {
		
	}

	public Publicacao(Integer id, Integer numero, Date data, TipoPublicacao tipoPublicacao, Subordinacao subordinacao,
			Militar militarAssina) {
		super();
		this.id = id;
		this.numero = numero;
		this.data = data;
		this.tipoPublicacao = tipoPublicacao.getCod();
		this.subordinacao = subordinacao;
		this.militarAssina = militarAssina;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public TipoPublicacao getTipoPublicacao() {
		return TipoPublicacao.toEnum(tipoPublicacao);
	}

	public void setTipoPublicacao(TipoPublicacao tipoPublicacao) {
		this.tipoPublicacao = tipoPublicacao.getCod();
	}

	public Subordinacao getSubordinacao() {
		return subordinacao;
	}

	public void setSubordinacao(Subordinacao subordinacao) {
		this.subordinacao = subordinacao;
	}

	public List<Comportamento> getComportamentos() {
		return comportamentos;
	}

	public void setComportamentos(List<Comportamento> comportamentos) {
		this.comportamentos = comportamentos;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	public Militar getMilitarAssina() {
		return militarAssina;
	}

	public void setMilitarAssina(Militar militarAssina) {
		this.militarAssina = militarAssina;
	}

	public List<Promocao> getPromocoes() {
		return promocoes;
	}

	public void setPromocoes(List<Promocao> promocoes) {
		this.promocoes = promocoes;
	}

	public List<Fatd> getFatds() {
		return fatds;
	}

	public void setFatds(List<Fatd> fatds) {
		this.fatds = fatds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacao other = (Publicacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
