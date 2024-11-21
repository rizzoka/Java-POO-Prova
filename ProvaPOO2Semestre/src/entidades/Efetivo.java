package entidades;

import java.time.LocalDate;

public class Efetivo extends Funcionario{

	private Double salarioMensal;

	public Efetivo(String nome, Integer numeroIdentificacao, LocalDate dataAdmissao, Double salarioMensal) {
		super(nome, numeroIdentificacao, dataAdmissao);
		this.salarioMensal = salarioMensal;
	}

	
	public Double getSalarioMensal() {
		return salarioMensal;
	}


	public void setSalarioMensal(Double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	
	
	@Override
	public String toString() {
		return "\nEfetivo - Nome = " + getNome() + " - Número de Identificação = " + getNumeroIdentificacao() + " - Data de Admissão = "+getDataAdmissao() + " - Salário Mensal = " + String.format("%.2f",calcularSalario());
	}


	@Override
	public Double calcularSalario() {
		return salarioMensal;
	}
}
