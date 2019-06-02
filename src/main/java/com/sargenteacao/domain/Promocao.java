package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.Date;

import com.sargenteacao.domain.enums.TipoPosto;

public class Promocao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Integer tipoPosto;
	private Date dataIngresso;
	
	private Publicacao publicacao;
	
	private Militar promovido;
	
	public Promocao() {
		
	}

	public Promocao(Integer id, TipoPosto tipoPosto, Date dataIngresso, Publicacao publicacao, Militar promovido) {
		super();
		this.id = id;
		this.tipoPosto = tipoPosto.getCod();
		this.dataIngresso = dataIngresso;
		this.publicacao = publicacao;
		this.promovido = promovido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoPosto getTipoPosto() {
		return TipoPosto.toEnum(tipoPosto);
	}

	public void setTipoPosto(TipoPosto tipoPosto) {
		this.tipoPosto = tipoPosto.getCod();
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

	public Militar getPromovido() {
		return promovido;
	}

	public void setPromovido(Militar promovido) {
		this.promovido = promovido;
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
		Promocao other = (Promocao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
