package com.sargenteacao.domain.enums;

public enum TipoOM {
	GAAAE2(55426, "2 GAAAe");	
	
	private int cod;
	private String descricao;
	
	private TipoOM(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoOM toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoOM x : TipoOM.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
