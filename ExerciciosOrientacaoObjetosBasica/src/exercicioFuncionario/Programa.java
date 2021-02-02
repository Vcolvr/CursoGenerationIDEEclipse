package exercicioFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.println("Bom dia! Deseja cadastrar quantos funcionários?");
		int quantidade = sc.nextInt();
		char resposta3;
		
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Qual o nome deste funcionárie?");
			String nome = sc.next();
			sc.nextLine();
			System.out.println("\nQual a função deste funcionárie?");
			String funcao = sc.nextLine();
			System.out.println("\nQuantas horas ele trabalha por dia?");
			double horasTrabalhadas = sc.nextDouble();
			System.out.println("\nQuanto ele ganha por hora trabalhada?");
			double salarioPorHora = sc.nextDouble();
			Funcionario funcionario = new Funcionario(nome, funcao, horasTrabalhadas, salarioPorHora);
			funcionarios.add(funcionario);
		}
		
		for(Funcionario e: funcionarios) {
			System.out.println(e);
		}
		
		System.out.println("\nDeseja trocar alguém de função?");
		char resposta = sc.next().charAt(0);
		if(resposta == 's'||resposta == 'S') {
			do {
			System.out.println("Qual o nome dessa pessoa?");
			String nomeMudado = sc.next();
			System.out.println("A pessoa tendo a funcao mudada é " + nomeMudado);
			for(Funcionario e: funcionarios) {
				if(nomeMudado.equals(e.getNome())) {
					System.out.println("Digite o nome da nova função: ");
					String novaFuncao = sc.next();
					e.setFuncao(novaFuncao);
				}
			}
			System.out.println("Deseja fazer com algum outro funcionário?");
			resposta3 = sc.next().charAt(0);
			}while (resposta3 == 's');
		}
		System.out.println("Deseja aumentar os salarios dessas pessoas?");
		
		char resposta2 = sc.next().charAt(0);
		if(resposta2 == 's'||resposta2 == 'S') {
			System.out.println("Qual a porcentagem desse aumento?");
			double porcentagem = sc.nextDouble();
			for(Funcionario e: funcionarios) {
				e.aumentarSalario(porcentagem);
				System.out.println(e);
			}
		}
		sc.close();
	}
}
