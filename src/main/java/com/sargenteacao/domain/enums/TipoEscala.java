package com.sargenteacao.domain.enums;

public enum TipoEscala {
	OFDIA(1, "Of Dia"),
	ADJUNTO(2, "Adjunto"),
	CMTGDA(3, "Cmt Gda"),
	SGTBC(4, "Sgt Dia BC"),
	SGTCAN(5, "Sgt Dia Bia Can"),
	SGTMSL(6, "Sgt Dia Bia Msl"),
	CBDIA(7, "Cb Dia"),
	PLANTAO(8, "Plantão"),
	CBGDA(9, "Cb Gda"),
	SENTINELA(10, "Sentinela"),
	TELEFONISTA(11, "Telefonista"),
	MOTORISTA(12, "Motorista"),
	ENCRANCHO(13, "Enc Rancho"),
	AUXRANCHO(14, "Aux Rancho"),
	GRADRANCHO(15, "Grad Rancho"),
	BOMBEIRO(16, "Bombeiro");
	
	private int cod;
	private String descricao;
	
	private TipoEscala(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoEscala toEnum(Integer id) {
		if (id == null) {
			return null;
		}
		for (TipoEscala x : TipoEscala.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido " + id);
	}

}
