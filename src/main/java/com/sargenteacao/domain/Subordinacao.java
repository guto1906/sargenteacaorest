package com.sargenteacao.domain;

import java.util.ArrayList;
import java.util.List;

public class Subordinacao {
	
	private String primeiroEscalao;
	private String segundoEscalao;
	private String terceiroEscalao;
	private String denominacaoHistorica;
	
	private List<CartaReferencia> cartasReferencia = new ArrayList<>();
	
	private List<HistoricoMilitar> historicosMilitar = new ArrayList<>();
	
	private List<Publicacao> publicacoes = new ArrayList<>();

}
