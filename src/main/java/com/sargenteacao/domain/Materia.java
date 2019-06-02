package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sargenteacao.domain.enums.TipoParte;
import com.sargenteacao.domain.enums.TipoSubTitulo;
import com.sargenteacao.domain.enums.TipoTitulo;

public class Materia implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer nomeParte;
	private Integer titulo;
	private Integer subtitulo;
	private String corpo;
	
	private List<Militar> militares = new ArrayList<>();
	
	private Publicacao publicacao;
	
	public Materia() {
		
	}

	public Materia(Integer id, TipoParte nomeParte, TipoTitulo titulo, TipoSubTitulo subtitulo, String corpo,
			Publicacao publicacao) {
		super();
		this.id = id;
		this.nomeParte = nomeParte.getCod();
		this.titulo = titulo.getCod();
		this.subtitulo = subtitulo.getCod();
		this.corpo = corpo;
		this.publicacao = publicacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoParte getNomeParte() {
		return TipoParte.toEnum(nomeParte);
	}

	public void setNomeParte(TipoParte nomeParte) {
		this.nomeParte = nomeParte.getCod();
	}

	public TipoTitulo getTitulo() {
		return TipoTitulo.toEnum(titulo);
	}

	public void setTitulo(TipoTitulo titulo) {
		this.titulo = titulo.getCod();
	}

	public TipoSubTitulo getSubtitulo() {
		return TipoSubTitulo.toEnum(subtitulo);
	}

	public void setSubtitulo(TipoSubTitulo subtitulo) {
		this.subtitulo = subtitulo.getCod();
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public List<Militar> getMilitares() {
		return militares;
	}

	public void setMilitares(List<Militar> militares) {
		this.militares = militares;
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
		Materia other = (Materia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
