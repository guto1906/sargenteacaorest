package com.sargenteacao.domain;

import java.util.Date;

import com.sargenteacao.domain.enums.TipoRecompensa;

public class Recompensa {
	
	private TipoRecompensa tipoRecompensa;
	private Date dataInicio;
	private Integer qtdDias;
	private String publicacaoConcessao;
	
	private Militar militar;

}
