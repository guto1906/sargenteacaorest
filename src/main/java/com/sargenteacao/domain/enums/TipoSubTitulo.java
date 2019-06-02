package com.sargenteacao.domain.enums;

public enum TipoSubTitulo {
	APRESENTACAO(1, "Apresentação"),
	PUBLICACAO(2, "Publicação"),
	CONCESSAO(3, "Concessão"),
	RECLASSIFICACAO(4, "Reclassificação"),
	TERMINO(5, "Término");	
	
	private int cod;
	private String descricao;
	
	private TipoSubTitulo(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoSubTitulo toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoSubTitulo x : TipoSubTitulo.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
