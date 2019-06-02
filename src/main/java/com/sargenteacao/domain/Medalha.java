package com.sargenteacao.domain;

import java.util.Date;

import com.sargenteacao.domain.enums.TipoMedalha;

public class Medalha {
	
	private TipoMedalha tipoMedalha;
	private Date dataConcessao;
	private String publicacaoConcessao;
	private String publicacaoCassassao;
	
	private Militar militarAgraciado;

}
