package com.sargenteacao.domain;

import java.util.Date;

import com.sargenteacao.domain.enums.TipoPunicao;

public class Punicao {
	
	private TipoPunicao tipoPunicao;
	private Date dataInicio;
	private Integer numeroDias;
	private Integer enquadramento;
	private Date dataAnulacao;
	private Date dataCancelamento;
	private String publicacaoPunicao;
	private String publicacaoAnulacao;
	private String publicacaoCancelamento;
	
	private Militar militar;

}
