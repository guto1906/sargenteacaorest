package com.sargenteacao.domain.enums;

public enum TipoParte {
	PRIMEIRA(1, "1 Parte"),
	SEGUNDA(2, "2 Parte"),
	TERCEIRA(3, "3 Parte"),
	QUARTA(4, "4 Parte");	
	
	private int cod;
	private String descricao;
	
	private TipoParte(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoParte toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoParte x : TipoParte.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
