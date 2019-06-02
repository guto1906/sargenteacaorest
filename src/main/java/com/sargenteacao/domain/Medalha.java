package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.Date;

import com.sargenteacao.domain.enums.TipoMedalha;

public class Medalha implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer tipoMedalha;
	private Date dataConcessao;
	private String publicacaoConcessao;
	private String publicacaoCassassao;
	
	private Militar militarAgraciado;
	
	public Medalha() {
		
	}

	public Medalha(Integer id, TipoMedalha tipoMedalha, Date dataConcessao, String publicacaoConcessao,
			String publicacaoCassassao, Militar militarAgraciado) {
		super();
		this.id = id;
		this.tipoMedalha = tipoMedalha.getCod();
		this.dataConcessao = dataConcessao;
		this.publicacaoConcessao = publicacaoConcessao;
		this.publicacaoCassassao = publicacaoCassassao;
		this.militarAgraciado = militarAgraciado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoMedalha getTipoMedalha() {
		return TipoMedalha.toEnum(tipoMedalha);
	}

	public void setTipoMedalha(TipoMedalha tipoMedalha) {
		this.tipoMedalha = tipoMedalha.getCod();
	}

	public Date getDataConcessao() {
		return dataConcessao;
	}

	public void setDataConcessao(Date dataConcessao) {
		this.dataConcessao = dataConcessao;
	}

	public String getPublicacaoConcessao() {
		return publicacaoConcessao;
	}

	public void setPublicacaoConcessao(String publicacaoConcessao) {
		this.publicacaoConcessao = publicacaoConcessao;
	}

	public String getPublicacaoCassassao() {
		return publicacaoCassassao;
	}

	public void setPublicacaoCassassao(String publicacaoCassassao) {
		this.publicacaoCassassao = publicacaoCassassao;
	}

	public Militar getMilitarAgraciado() {
		return militarAgraciado;
	}

	public void setMilitarAgraciado(Militar militarAgraciado) {
		this.militarAgraciado = militarAgraciado;
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
		Medalha other = (Medalha) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
