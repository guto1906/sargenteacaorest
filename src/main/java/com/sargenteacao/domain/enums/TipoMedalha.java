package com.sargenteacao.domain.enums;

public enum TipoMedalha {
	OURO(1, "Militar Ouro"),
	PRATA(2, "Militar Prata"),
	BRONZE(3, "Militar Bronze"),
	TROPAOURO(4, "Corpo Tropa Ouro"),
	TROPAPRATA(5, "Corpo Tropa Prata");	
	
	private int cod;
	private String descricao;
	
	private TipoMedalha(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoMedalha toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoMedalha x : TipoMedalha.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
