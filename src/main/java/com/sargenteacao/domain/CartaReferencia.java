package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.Date;

public class CartaReferencia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String corpo;
	private Date dataAssinatura;
	
	private Militar militar;
	
	private Militar militarAssina;
	
	private Subordinacao subordinacao;
	
	public CartaReferencia() {
	
	}

	public CartaReferencia(Integer id, String corpo, Date dataAssinatura, Militar militar, Militar militarAssina,
			Subordinacao subordinacao) {
		super();
		this.id = id;
		this.corpo = corpo;
		this.dataAssinatura = dataAssinatura;
		this.militar = militar;
		this.militarAssina = militarAssina;
		this.subordinacao = subordinacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public Date getData() {
		return dataAssinatura;
	}

	public void setData(Date dataAssinatura) {
		this.dataAssinatura = dataAssinatura;
	}

	public Militar getMilitar() {
		return militar;
	}

	public void setMilitar(Militar militar) {
		this.militar = militar;
	}

	public Militar getMilitarAssina() {
		return militarAssina;
	}

	public void setMilitarAssina(Militar militarAssina) {
		this.militarAssina = militarAssina;
	}

	public Subordinacao getSubordinacao() {
		return subordinacao;
	}

	public void setSubordinacao(Subordinacao subordinacao) {
		this.subordinacao = subordinacao;
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
		CartaReferencia other = (CartaReferencia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	


}
