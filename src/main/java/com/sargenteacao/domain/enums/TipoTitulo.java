package com.sargenteacao.domain.enums;

public enum TipoTitulo {
	FERIAS(1, "Férias"),
	COMPORTAMENTO(2, "Comportamento"),
	PUNICAO(3, "Punição"),
	ESCALA(4, "Escala"),
	PRACA(5, "Data Praça"),
	RECOMPENSA(6,"Recompensa");	
	
	private int cod;
	private String descricao;
	
	private TipoTitulo(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoTitulo toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoTitulo x : TipoTitulo.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
