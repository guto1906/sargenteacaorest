package com.sargenteacao.domain.enums;

public enum TipoSU {
	CMDO(1, "Comando"),
	EM(2, "Estado Maior"),
	BIAC(3, "Bia Cmdo"),
	BIACAN(4, "Bia Can"),
	BIAMSL(5,"Bia Msl");	
	
	private int cod;
	private String descricao;
	
	private TipoSU(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoSU toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoSU x : TipoSU.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
