package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.Date;

import com.sargenteacao.domain.enums.TipoPunicao;

public class Punicao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Integer tipoPunicao;
	private Date dataInicio;
	private Integer numeroDias;
	private Integer enquadramento;
	private Date dataAnulacao;
	private Date dataCancelamento;
	private String publicacaoPunicao;
	private String publicacaoAnulacao;
	private String publicacaoCancelamento;
	
	private Militar militar;

	public Punicao() {
		
	}

	public Punicao(Integer id, TipoPunicao tipoPunicao, Date dataInicio, Integer numeroDias,
			Integer enquadramento, Date dataAnulacao, Date dataCancelamento,
			String publicacaoPunicao, String publicacaoAnulacao, String publicacaoCancelamento,
			Militar militar) {
		super();
		this.id = id;
		this.tipoPunicao = tipoPunicao.getCod();
		this.dataInicio = dataInicio;
		this.numeroDias = numeroDias;
		this.enquadramento = enquadramento;
		this.dataAnulacao = dataAnulacao;
		this.dataCancelamento = dataCancelamento;
		this.publicacaoPunicao = publicacaoPunicao;
		this.publicacaoAnulacao = publicacaoAnulacao;
		this.publicacaoCancelamento = publicacaoCancelamento;
		this.militar = militar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoPunicao getTipoPunicao() {
		return TipoPunicao.toEnum(tipoPunicao);
	}

	public void setTipoPunicao(TipoPunicao tipoPunicao) {
		this.tipoPunicao = tipoPunicao.getCod();
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Integer getNumeroDias() {
		return numeroDias;
	}

	public void setNumeroDias(Integer numeroDias) {
		this.numeroDias = numeroDias;
	}

	public Integer getEnquadramento() {
		return enquadramento;
	}

	public void setEnquadramento(Integer enquadramento) {
		this.enquadramento = enquadramento;
	}

	public Date getDataAnulacao() {
		return dataAnulacao;
	}

	public void setDataAnulacao(Date dataAnulacao) {
		this.dataAnulacao = dataAnulacao;
	}

	public Date getDataCancelamento() {
		return dataCancelamento;
	}

	public void setDataCancelamento(Date dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}

	public String getPublicacaoPunicao() {
		return publicacaoPunicao;
	}

	public void setPublicacaoPunicao(String publicacaoPunicao) {
		this.publicacaoPunicao = publicacaoPunicao;
	}

	public String getPublicacaoAnulacao() {
		return publicacaoAnulacao;
	}

	public void setPublicacaoAnulacao(String publicacaoAnulacao) {
		this.publicacaoAnulacao = publicacaoAnulacao;
	}

	public String getPublicacaoCancelamento() {
		return publicacaoCancelamento;
	}

	public void setPublicacaoCancelamento(String publicacaoCancelamento) {
		this.publicacaoCancelamento = publicacaoCancelamento;
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
		Punicao other = (Punicao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
