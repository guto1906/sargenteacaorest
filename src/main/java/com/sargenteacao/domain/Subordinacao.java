package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Subordinacao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String primeiroEscalao;
	private String segundoEscalao;
	private String terceiroEscalao;
	private String denominacaoHistorica;
	
	private List<CartaReferencia> cartasReferencia = new ArrayList<>();
	
	private List<HistoricoMilitar> historicosMilitar = new ArrayList<>();
	
	private List<Publicacao> publicacoes = new ArrayList<>();
	
	public Subordinacao() {
		
	}

	public Subordinacao(Integer id, String primeiroEscalao, String segundoEscalao, String terceiroEscalao,
			String denominacaoHistorica) {
		super();
		this.id = id;
		this.primeiroEscalao = primeiroEscalao;
		this.segundoEscalao = segundoEscalao;
		this.terceiroEscalao = terceiroEscalao;
		this.denominacaoHistorica = denominacaoHistorica;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrimeiroEscalao() {
		return primeiroEscalao;
	}

	public void setPrimeiroEscalao(String primeiroEscalao) {
		this.primeiroEscalao = primeiroEscalao;
	}

	public String getSegundoEscalao() {
		return segundoEscalao;
	}

	public void setSegundoEscalao(String segundoEscalao) {
		this.segundoEscalao = segundoEscalao;
	}

	public String getTerceiroEscalao() {
		return terceiroEscalao;
	}

	public void setTerceiroEscalao(String terceiroEscalao) {
		this.terceiroEscalao = terceiroEscalao;
	}

	public String getDenominacaoHistorica() {
		return denominacaoHistorica;
	}

	public void setDenominacaoHistorica(String denominacaoHistorica) {
		this.denominacaoHistorica = denominacaoHistorica;
	}

	public List<CartaReferencia> getCartasReferencia() {
		return cartasReferencia;
	}

	public void setCartasReferencia(List<CartaReferencia> cartasReferencia) {
		this.cartasReferencia = cartasReferencia;
	}

	public List<HistoricoMilitar> getHistoricosMilitar() {
		return historicosMilitar;
	}

	public void setHistoricosMilitar(List<HistoricoMilitar> historicosMilitar) {
		this.historicosMilitar = historicosMilitar;
	}

	public List<Publicacao> getPublicacoes() {
		return publicacoes;
	}

	public void setPublicacoes(List<Publicacao> publicacoes) {
		this.publicacoes = publicacoes;
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
		Subordinacao other = (Subordinacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
