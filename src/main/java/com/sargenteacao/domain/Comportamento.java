package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.Date;

import com.sargenteacao.domain.enums.TipoComportamento;

public class Comportamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer tipoComportamento;
	private Date dataIngresso;
	
	private Publicacao publicacao;
	
	private Militar militar;
	
	public Comportamento() {
		
	}

	public Comportamento(Integer id, TipoComportamento tipoComportamento, Date dataIngresso,
			Publicacao publicacao, Militar militar) {
		super();
		this.id = id;
		this.tipoComportamento = tipoComportamento.getCod();
		this.dataIngresso = dataIngresso;
		this.publicacao = publicacao;
		this.militar = militar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoComportamento getTipoComportamento() {
		return TipoComportamento.toEnum(tipoComportamento);
	}

	public void setTipoComportamento(TipoComportamento tipoComportamento) {
		this.tipoComportamento = tipoComportamento.getCod();
	}

	public Date getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(Date dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	public Militar getMilitar() {
		return militar;
	}

	public void setMilitar(Militar militar) {
		this.militar = militar;
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
		Comportamento other = (Comportamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	

}
