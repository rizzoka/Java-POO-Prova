package entidades;

import java.time.LocalDate;

public class Estagiario extends Funcionario {

	 private Double valorBolsa;
	 private String universidade;	 
	 
	public Estagiario(String nome, Integer numeroIdentificacao, LocalDate dataAdmissao, Double valorBolsa,
			String universidade) {
		super(nome, numeroIdentificacao, dataAdmissao);
		this.valorBolsa = valorBolsa;
		this.universidade = universidade;
	}
	
	public Double getValorBolsa() {
		return valorBolsa;
	}


	public void setValorBolsa(Double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}

	public String getUniversidade() {
		return universidade;
	}


	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	@Override
	public Double calcularSalario() {
		return valorBolsa;
	}

	@Override
	public String toString() {
		return "\nEstagiário - Nome = " + getNome() + " - Número de Identificação = " + getNumeroIdentificacao() + " - Data de Admissão = "+getDataAdmissao() + " - Salário Mensal = " + String.format("%.2f",calcularSalario());
	} 
}
