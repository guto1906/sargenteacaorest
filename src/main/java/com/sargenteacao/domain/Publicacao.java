package com.sargenteacao.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sargenteacao.domain.enums.TipoPublicacao;

public class Publicacao {
	
	private Integer numero;
	private Date data;
	private TipoPublicacao tipoPublicacao;
	
	private Subordinacao subordinacao;
	
	private List<Comportamento> comportamentos = new ArrayList<>();
	
	private List<Materia> materias = new ArrayList<>();
	
	private Militar militarAssina;
	
	private List<Promocao> promocoes = new ArrayList<>();
	
	private List<Fatd> fatds = new ArrayList<>();
	

}
