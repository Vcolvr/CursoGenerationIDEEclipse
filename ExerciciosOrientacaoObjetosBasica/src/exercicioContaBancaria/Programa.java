package exercicioContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria contas;

		System.out.println("Digite o numero da conta:");
		int numeroDaConta = sc.nextInt();
		System.out.println("Digite o nome do dono da conta:");
		String nomeDoDono = sc.next();
		System.out.println("Existe um deposito inicial? (S/N)");
		char resposta = sc.next().charAt(0);

		if (resposta == 'S' || resposta == 's') {
			System.out.println("Digite o valor do deposito inicial:");
			double saldo = sc.nextDouble();
			contas = new ContaBancaria(numeroDaConta, nomeDoDono, saldo);
		} else {
			contas = new ContaBancaria(numeroDaConta, nomeDoDono);
		}

		System.out.println();
		System.out.println("Informacoes da conta:");
		System.out.println(contas);

		System.out.println("Digite o valor do deposito:");
		double deposito = sc.nextDouble();
		contas.deposito(deposito);
		System.out.println("Informacoes atualizadas da conta:");
		System.out.println(contas);

		System.out.println("Digite o valor de retirada");
		double retirada = sc.nextDouble();
		contas.retirada(retirada);
		System.out.println("Informacoes atualizadas da conta:");
		System.out.println(contas);

		sc.close();

	}

}
