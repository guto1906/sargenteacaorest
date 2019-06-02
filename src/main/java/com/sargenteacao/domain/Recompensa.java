package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.Date;

import com.sargenteacao.domain.enums.TipoRecompensa;

public class Recompensa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Integer tipoRecompensa;
	private Date dataInicio;
	private Integer qtdDias;
	private String publicacaoConcessao;
	
	private Militar militar;
	
	public Recompensa() {
		
	}

	public Recompensa(Integer id, TipoRecompensa tipoRecompensa, Date dataInicio, Integer qtdDias,
			String publicacaoConcessao, Militar militar) {
		super();
		this.id = id;
		this.tipoRecompensa = tipoRecompensa.getCod();
		this.dataInicio = dataInicio;
		this.qtdDias = qtdDias;
		this.publicacaoConcessao = publicacaoConcessao;
		this.militar = militar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoRecompensa getTipoRecompensa() {
		return TipoRecompensa.toEnum(tipoRecompensa);
	}

	public void setTipoRecompensa(TipoRecompensa tipoRecompensa) {
		this.tipoRecompensa = tipoRecompensa.getCod();
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Integer getQtdDias() {
		return qtdDias;
	}

	public void setQtdDias(Integer qtdDias) {
		this.qtdDias = qtdDias;
	}

	public String getPublicacaoConcessao() {
		return publicacaoConcessao;
	}

	public void setPublicacaoConcessao(String publicacaoConcessao) {
		this.publicacaoConcessao = publicacaoConcessao;
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
		Recompensa other = (Recompensa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
