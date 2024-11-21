package entidades;

import java.time.LocalDate;

public class Temporario extends Funcionario{

	private Double salarioHora;
	private Integer horas;
	public Temporario(String nome, Integer numeroIdentificacao, LocalDate dataAdmissao, Double salarioHora,
			Integer horas) {
		super(nome, numeroIdentificacao, dataAdmissao);
		this.salarioHora = salarioHora;
		this.horas = horas;
	}
	public Double getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(Double salarioHora) {
		this.salarioHora = salarioHora;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	@Override
	public Double calcularSalario() {
		return salarioHora * horas;
	}
	@Override
	public String toString() {
		return "\nTemporário - Nome = " + getNome() + " - Número de Identificação = " + getNumeroIdentificacao() + " - Data de Admissão = "+getDataAdmissao() + " - Salário Mensal = " + String.format("%.2f",calcularSalario());

	}
	
}