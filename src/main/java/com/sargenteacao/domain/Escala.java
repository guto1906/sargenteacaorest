package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.Date;

import com.sargenteacao.domain.enums.TipoEscala;
import com.sargenteacao.domain.enums.TipoFolga;

public class Escala implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer tipoEscala;
	private Date dataInicio;
	private Date dataTermino;
	private Integer tipoFolga;
	
	private Militar militar;

	public Escala() {
		
	}

	public Escala(Integer id, TipoEscala tipoEscala, Date dataInicio, Date dataTermino, TipoFolga tipoFolga,
			Militar militar) {
		super();
		this.id = id;
		this.tipoEscala = tipoEscala.getCod();
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.tipoFolga = tipoFolga.getCod();
		this.militar = militar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoEscala getTipoEscala() {
		return TipoEscala.toEnum(tipoEscala);
	}

	public void setTipoEscala(TipoEscala tipoEscala) {
		this.tipoEscala = tipoEscala.getCod();
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

	public TipoFolga getTipoFolga() {
		return TipoFolga.toEnum(tipoFolga);
	}

	public void setTipoFolga(TipoFolga tipoFolga) {
		this.tipoFolga = tipoFolga.getCod();
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
		Escala other = (Escala) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
