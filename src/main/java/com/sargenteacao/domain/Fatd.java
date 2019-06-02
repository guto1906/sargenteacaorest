package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.Date;

public class Fatd implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String numeroProcesso;
	private Date dataProcesso;
	private String relatoFato;
	private Date dataAssinaturaRelatoFato;
	private Date dataCienteArralodo;
	private Date dataJusticativa;
	private Date dataDecisao;
	
	private Militar militarArrolado;
	
	private Militar militarParticipante;
	
	private Militar autoridade;
	
	private Publicacao publicacao;
	
	public Fatd() {
	
	}

	public Fatd(Integer id, String numeroProcesso, Date dataProcesso, String relatoFato,
			Date dataAssinaturaRelatoFato, Date dataCienteArralodo, Date dataJusticativa,
			Date dataDecisao, Militar militarArrolado, Militar militarParticipante,
			Militar autoridade, Publicacao publicacao) {
		super();
		this.id = id;
		this.numeroProcesso = numeroProcesso;
		this.dataProcesso = dataProcesso;
		this.relatoFato = relatoFato;
		this.dataAssinaturaRelatoFato = dataAssinaturaRelatoFato;
		this.dataCienteArralodo = dataCienteArralodo;
		this.dataJusticativa = dataJusticativa;
		this.dataDecisao = dataDecisao;
		this.militarArrolado = militarArrolado;
		this.militarParticipante = militarParticipante;
		this.autoridade = autoridade;
		this.publicacao = publicacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public Date getDataProcesso() {
		return dataProcesso;
	}

	public void setDataProcesso(Date dataProcesso) {
		this.dataProcesso = dataProcesso;
	}

	public String getRelatoFato() {
		return relatoFato;
	}

	public void setRelatoFato(String relatoFato) {
		this.relatoFato = relatoFato;
	}

	public Date getDataAssinaturaRelatoFato() {
		return dataAssinaturaRelatoFato;
	}

	public void setDataAssinaturaRelatoFato(Date dataAssinaturaRelatoFato) {
		this.dataAssinaturaRelatoFato = dataAssinaturaRelatoFato;
	}

	public Date getDataCienteArralodo() {
		return dataCienteArralodo;
	}

	public void setDataCienteArralodo(Date dataCienteArralodo) {
		this.dataCienteArralodo = dataCienteArralodo;
	}

	public Date getDataJusticativa() {
		return dataJusticativa;
	}

	public void setDataJusticativa(Date dataJusticativa) {
		this.dataJusticativa = dataJusticativa;
	}

	public Date getDataDecisao() {
		return dataDecisao;
	}

	public void setDataDecisao(Date dataDecisao) {
		this.dataDecisao = dataDecisao;
	}

	public Militar getMilitarArrolado() {
		return militarArrolado;
	}

	public void setMilitarArrolado(Militar militarArrolado) {
		this.militarArrolado = militarArrolado;
	}

	public Militar getMilitarParticipante() {
		return militarParticipante;
	}

	public void setMilitarParticipante(Militar militarParticipante) {
		this.militarParticipante = militarParticipante;
	}

	public Militar getAutoridade() {
		return autoridade;
	}

	public void setAutoridade(Militar autoridade) {
		this.autoridade = autoridade;
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
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
		Fatd other = (Fatd) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
