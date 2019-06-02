package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.Date;

public class Praca implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Date dataInicio;
	private Date dataTermino;
	private String publicacaoInclusao;
	private String publicacaoExclusao;
	
	private Militar militar;
	
	public Praca() {
		
	}

	public Praca(Integer id, Date dataInicio, Date dataTermino, String publicacaoInclusao, String publicacaoExclusao,
			Militar militar) {
		super();
		this.id = id;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.publicacaoInclusao = publicacaoInclusao;
		this.publicacaoExclusao = publicacaoExclusao;
		this.militar = militar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getPublicacaoInclusao() {
		return publicacaoInclusao;
	}

	public void setPublicacaoInclusao(String publicacaoInclusao) {
		this.publicacaoInclusao = publicacaoInclusao;
	}

	public String getPublicacaoExclusao() {
		return publicacaoExclusao;
	}

	public void setPublicacaoExclusao(String publicacaoExclusao) {
		this.publicacaoExclusao = publicacaoExclusao;
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
		Praca other = (Praca) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
