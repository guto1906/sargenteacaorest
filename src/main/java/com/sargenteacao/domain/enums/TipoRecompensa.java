package com.sargenteacao.domain.enums;

public enum TipoRecompensa {
	ELOGIO(1, "Elogio"),
	REFELEOGIOSA(2, "Referencia Elogiosa"),
	DISPRECOMPENSA(3, "Dispensa como Recompensa");
	
	private int cod;
	private String descricao;
	
	private TipoRecompensa(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoRecompensa toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoRecompensa x : TipoRecompensa.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
