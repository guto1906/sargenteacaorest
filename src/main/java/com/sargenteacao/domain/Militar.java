package com.sargenteacao.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sargenteacao.domain.enums.TipoFuncao;
import com.sargenteacao.domain.enums.TipoOM;
import com.sargenteacao.domain.enums.TipoSU;

public class Militar implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String nome;
	private String arma;
	private String servico;
	private String qualificacao;
	private String identidade;
	private Integer funcao;
	private String cpf;
	private String nomePai;
	private String nomeMae;
	private String codpes;
	private Boolean pronto;
	private Integer antiguidade;
	private Integer subunidade;
	private Integer OM;
	private Militar padrinho;
	private Militar padrinhoSubstituto;
	
	private List<Escala> escalas = new ArrayList<>();
	
	private List<Recompensa> recompensas = new ArrayList<>();
	
	private List<Medalha> medalhas = new ArrayList<>();
	
	private List<Praca> datasPraca = new ArrayList<>();
	
	private List<Punicao> punicoes = new ArrayList<>();
	
	private List<Comportamento> comportamentos = new ArrayList<>();
	
	private List<Materia> materias = new ArrayList<>();
	
	private List<Publicacao> publicacoesAssinadas = new ArrayList<>();
	
	private List<Promocao> promocoes = new ArrayList<>();
	
	private List<Fatd> fatdsArrolado = new ArrayList<>();
	
	private List<Fatd> fatdsParticipante = new ArrayList<>();
	
	private List<Fatd> decisaoFatds = new ArrayList<>();
	
	private List<HistoricoMilitar> assinaHistoricos = new ArrayList<>();
	
	private List<HistoricoMilitar> historicos = new ArrayList<>();
	
	private List<CartaReferencia> cartasReferencia = new ArrayList<>();
	
	private List<CartaReferencia> assinaCartasReferencia = new ArrayList<>();
	
	
	public Militar() {
		
	}


	public Militar(Integer id, String nome, String arma, String servico, String qualificacao,
			String identidade, TipoFuncao funcao, String cpf, String nomePai, String nomeMae,
			String codpes, Boolean pronto, Integer antiguidade, TipoSU subunidade, TipoOM oM,
			Militar padrinho, Militar padrinhoSubstituto) {
		super();
		this.id = id;
		this.nome = nome;
		this.arma = arma;
		this.servico = servico;
		this.qualificacao = qualificacao;
		this.identidade = identidade;
		this.funcao = funcao.getCod();
		this.cpf = cpf;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.codpes = codpes;
		this.pronto = pronto;
		this.antiguidade = antiguidade;
		this.subunidade = subunidade.getCod();
		OM = oM.getCod();
		this.padrinho = padrinho;
		this.padrinhoSubstituto = padrinhoSubstituto;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getArma() {
		return arma;
	}


	public void setArma(String arma) {
		this.arma = arma;
	}


	public String getServico() {
		return servico;
	}


	public void setServico(String servico) {
		this.servico = servico;
	}


	public String getQualificacao() {
		return qualificacao;
	}


	public void setQualificacao(String qualificacao) {
		this.qualificacao = qualificacao;
	}


	public String getIdentidade() {
		return identidade;
	}


	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}


	public TipoFuncao getFuncao() {		
		return TipoFuncao.toEnum(funcao);
	}


	public void setFuncao(TipoFuncao funcao) {
		this.funcao = funcao.getCod();
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNomePai() {
		return nomePai;
	}


	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}


	public String getNomeMae() {
		return nomeMae;
	}


	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}


	public String getCodpes() {
		return codpes;
	}


	public void setCodpes(String codpes) {
		this.codpes = codpes;
	}


	public Boolean getPronto() {
		return pronto;
	}


	public void setPronto(Boolean pronto) {
		this.pronto = pronto;
	}


	public Integer getAntiguidade() {
		return antiguidade;
	}


	public void setAntiguidade(Integer antiguidade) {
		this.antiguidade = antiguidade;
	}


	public TipoSU getSubunidade() {
		return TipoSU.toEnum(subunidade);
	}


	public void setSubunidade(TipoSU subunidade) {
		this.subunidade = subunidade.getCod();
	}


	public TipoOM getOM() {
		return TipoOM.toEnum(OM);
	}


	public void setOM(TipoOM oM) {
		OM = oM.getCod();
	}


	public Militar getPadrinho() {
		return padrinho;
	}


	public void setPadrinho(Militar padrinho) {
		this.padrinho = padrinho;
	}


	public Militar getPadrinhoSubstituto() {
		return padrinhoSubstituto;
	}


	public void setPadrinhoSubstituto(Militar padrinhoSubstituto) {
		this.padrinhoSubstituto = padrinhoSubstituto;
	}


	public List<Escala> getEscalas() {
		return escalas;
	}


	public void setEscalas(List<Escala> escalas) {
		this.escalas = escalas;
	}


	public List<Recompensa> getRecompensas() {
		return recompensas;
	}


	public void setRecompensas(List<Recompensa> recompensas) {
		this.recompensas = recompensas;
	}


	public List<Medalha> getMedalhas() {
		return medalhas;
	}


	public void setMedalhas(List<Medalha> medalhas) {
		this.medalhas = medalhas;
	}


	public List<Praca> getDatasPraca() {
		return datasPraca;
	}


	public void setDatasPraca(List<Praca> datasPraca) {
		this.datasPraca = datasPraca;
	}


	public List<Punicao> getPunicoes() {
		return punicoes;
	}


	public void setPunicoes(List<Punicao> punicoes) {
		this.punicoes = punicoes;
	}


	public List<Comportamento> getComportamentos() {
		return comportamentos;
	}


	public void setComportamentos(List<Comportamento> comportamentos) {
		this.comportamentos = comportamentos;
	}


	public List<Materia> getMaterias() {
		return materias;
	}


	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}


	public List<Publicacao> getPublicacoesAssinadas() {
		return publicacoesAssinadas;
	}


	public void setPublicacoesAssinadas(List<Publicacao> publicacoesAssinadas) {
		this.publicacoesAssinadas = publicacoesAssinadas;
	}


	public List<Promocao> getPromocoes() {
		return promocoes;
	}


	public void setPromocoes(List<Promocao> promocoes) {
		this.promocoes = promocoes;
	}


	public List<Fatd> getFatdsArrolado() {
		return fatdsArrolado;
	}


	public void setFatdsArrolado(List<Fatd> fatdsArrolado) {
		this.fatdsArrolado = fatdsArrolado;
	}


	public List<Fatd> getFatdsParticipante() {
		return fatdsParticipante;
	}


	public void setFatdsParticipante(List<Fatd> fatdsParticipante) {
		this.fatdsParticipante = fatdsParticipante;
	}


	public List<Fatd> getDecisaoFatds() {
		return decisaoFatds;
	}


	public void setDecisaoFatds(List<Fatd> decisaoFatds) {
		this.decisaoFatds = decisaoFatds;
	}


	public List<HistoricoMilitar> getAssinaHistoricos() {
		return assinaHistoricos;
	}


	public void setAssinaHistoricos(List<HistoricoMilitar> assinaHistoricos) {
		this.assinaHistoricos = assinaHistoricos;
	}


	public List<HistoricoMilitar> getHistoricos() {
		return historicos;
	}


	public void setHistoricos(List<HistoricoMilitar> historicos) {
		this.historicos = historicos;
	}


	public List<CartaReferencia> getCartasReferencia() {
		return cartasReferencia;
	}


	public void setCartasReferencia(List<CartaReferencia> cartasReferencia) {
		this.cartasReferencia = cartasReferencia;
	}


	public List<CartaReferencia> getAssinaCartasReferencia() {
		return assinaCartasReferencia;
	}


	public void setAssinaCartasReferencia(List<CartaReferencia> assinaCartasReferencia) {
		this.assinaCartasReferencia = assinaCartasReferencia;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Militar other = (Militar) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	

	

}
