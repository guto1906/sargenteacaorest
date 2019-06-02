package com.sargenteacao.domain.enums;

public enum TipoComportamento {
	EXCEPCIONAL(1, "EXCEPCIONAL"),
	OTIMO(2, "ÓTIMO"),
	BOM(3, "BOM"),
	INSUFICIENTE(4, "INSUFICIENTE"),
	MAU(5, "MAU");	
	
	private int cod;
	private String descricao;
	
	private TipoComportamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoComportamento toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoComportamento x : TipoComportamento.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
