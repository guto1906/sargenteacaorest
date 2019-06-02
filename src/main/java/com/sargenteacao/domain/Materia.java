package com.sargenteacao.domain;

import java.util.ArrayList;
import java.util.List;

import com.sargenteacao.domain.enums.TipoParte;
import com.sargenteacao.domain.enums.TipoSubTitulo;
import com.sargenteacao.domain.enums.TipoTitulo;

public class Materia {
	
	private TipoParte nomeParte;
	private TipoTitulo titulo;
	private TipoSubTitulo subtitulo;
	private String corpo;
	
	private List<Militar> militares = new ArrayList<>();
	
	private Publicacao publicacao;

}
