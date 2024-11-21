package entidades;

import java.time.LocalDate;

public abstract class Funcionario {
	private String nome;
	private Integer numeroIdentificacao;
	private LocalDate dataAdmissao;
	
	public Funcionario(String nome, Integer numeroIdentificacao, LocalDate dataAdmissao) {
		this.nome = nome;
		this.numeroIdentificacao = numeroIdentificacao;
		this.dataAdmissao = dataAdmissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(Integer numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public abstract Double calcularSalario();
}
