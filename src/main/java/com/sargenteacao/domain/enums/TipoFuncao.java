package com.sargenteacao.domain.enums;

public enum TipoFuncao {
	CMTOM(1, "Cmt OM"),
	SCMT(2, "Scmt"),
	S1(3, "Ch 1 Sec"),
	S2(4, "Ch 2 Sec"),
	S3(5, "Ch 3 Sec"),
	S4(6, "Ch 4 Sec"),
	S5(7, "Ch 5 Sec"),
	CMTBIA(8, "Cmt Bia"),
	ENCMAT(9, "Enc Mat"),
	SGTE(10, "Sgte");
	
	private int cod;
	private String descricao;
	
	private TipoFuncao(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoFuncao toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoFuncao x : TipoFuncao.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
