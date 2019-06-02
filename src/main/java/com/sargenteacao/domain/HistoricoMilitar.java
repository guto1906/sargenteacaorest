package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.Date;

public class HistoricoMilitar implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Date dataInicioPeriodo;
	private Date dataTerminoPeriodo;
	private Date dataAssinutara;
	
	private Militar militarAssina;
	
	private Militar militar;
	
	private Subordinacao subordinacao;
	
	public HistoricoMilitar() {
		
	}

	public HistoricoMilitar(Integer id, Date dataInicioPeriodo, Date dataTerminoPeriodo, Date dataAssinutara,
			Militar militarAssina, Militar militar, Subordinacao subordinacao) {
		super();
		this.id = id;
		this.dataInicioPeriodo = dataInicioPeriodo;
		this.dataTerminoPeriodo = dataTerminoPeriodo;
		this.dataAssinutara = dataAssinutara;
		this.militarAssina = militarAssina;
		this.militar = militar;
		this.subordinacao = subordinacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataInicioPeriodo() {
		return dataInicioPeriodo;
	}

	public void setDataInicioPeriodo(Date dataInicioPeriodo) {
		this.dataInicioPeriodo = dataInicioPeriodo;
	}

	public Date getDataTerminoPeriodo() {
		return dataTerminoPeriodo;
	}

	public void setDataTerminoPeriodo(Date dataTerminoPeriodo) {
		this.dataTerminoPeriodo = dataTerminoPeriodo;
	}

	public Date getDataAssinutara() {
		return dataAssinutara;
	}

	public void setDataAssinutara(Date dataAssinutara) {
		this.dataAssinutara = dataAssinutara;
	}

	public Militar getMilitarAssina() {
		return militarAssina;
	}

	public void setMilitarAssina(Militar militarAssina) {
		this.militarAssina = militarAssina;
	}

	public Militar getMilitar() {
		return militar;
	}

	public void setMilitar(Militar militar) {
		this.militar = militar;
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
		HistoricoMilitar other = (HistoricoMilitar) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
