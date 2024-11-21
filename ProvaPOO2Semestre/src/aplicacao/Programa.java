package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Efetivo;
import entidades.Estagiario;
import entidades.Funcionario;
import entidades.Temporario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tipo = 0;
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Informe o número de funcionários: ");
		int n = sc.nextInt();
		System.out.println("*** Informe os dados dos funcionários***");
		
		for (int i = 1; i<= n ; i++) {
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.next();
			System.out.print("Número funcional: ");
			int numeroIdentificacao = sc.nextInt();
			System.out.print("Data Adimissão: ");
			LocalDate dataAdmissao = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.print("Informe o tipo (1)Efetivo (2)Estagiário (3)Temporário: ");
			tipo = sc.nextInt();
			if(tipo == 1) {
				System.out.println("Informe o salário mensal:");
				Double salarioMensal = sc.nextDouble();
				list.add(new Efetivo(nome,numeroIdentificacao,dataAdmissao,salarioMensal));
				
			}
			if(tipo == 2) {
				System.out.println("Informe o valor da Bolsa:");
				Double valorBolsa = sc.nextDouble();
				System.out.println("Informe o nome da universidade: ");
				sc.nextLine();
				String universidade = sc.next();
				list.add(new Estagiario(nome,numeroIdentificacao,dataAdmissao, valorBolsa, universidade));
				
			}
			if(tipo == 3) {
				System.out.println("Informe o valor do salário hora:");
				Double salarioHora = sc.nextDouble();
				System.out.println("Informe o número de hora: ");
				int horas = sc.nextInt();
				list.add(new Temporario(nome,numeroIdentificacao,dataAdmissao, salarioHora, horas));
				
			}
		}
		
		double soma = 0.0;
		System.out.println("\n***Dados da Folha***");
		for(Funcionario x : list) {
			double valorFolha = x.calcularSalario();
			System.out.println(x.toString());
			soma += valorFolha;	
			}
			
		System.out.println("\nValor total da folha = " + String.format("%.2f", soma));
		sc.close();
		}
	}
