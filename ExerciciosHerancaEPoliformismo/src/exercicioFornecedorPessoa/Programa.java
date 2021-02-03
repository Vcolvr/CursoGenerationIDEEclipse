package exercicioFornecedorPessoa;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Programa {

	public static void main(String[] args) {
		char empregado = 0, respostaO = 0, respostaA = 0, respostaE = 0;
		int aux = 0;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Pessoa> empresa = new ArrayList<>();

		System.out.println("Vamos cadastrar algumas pessoas?");
		System.out.println("Digite a quantidade de pessoas que quer cadastrar:");
		int quantidade = sc.nextInt();

		for (int i = 0; i < quantidade; i++) {
			sc.nextLine();
			System.out.println("\nSobre o funcionario #" + (i + 1));
			System.out.println("Qual é o nome dele?");
			String nome = sc.nextLine();
			System.out.println("\nQual o telefone dele? (Sem caracteres especiais)");
			String telefone = sc.nextLine();
			System.out.println("\nQual é o endereço dele?");
			String endereco = sc.nextLine();
			do {
				aux = 0;
				System.out.println("\nEle trabalha na nossa empresa?(S/N)");
				empregado = sc.next().charAt(0);
				if (empregado == 'n' || empregado == 'N') {
					System.out.println("\nQuanto de crédito tem esse fornecedor?");
					double valorCredito = sc.nextDouble();
					System.out.println("\nQuanto de dívida tem esse fornecedor?");
					double valorDivida = sc.nextDouble();
					Fornecedor fornecedor = new Fornecedor(nome, telefone, endereco, valorCredito, valorDivida);
					empresa.add(fornecedor);
				} else {
					System.out.println("\nEsta pessoa é um operário?(S/N)");
					respostaO = sc.next().charAt(0);
					if (respostaO == 's' || respostaO == 'S') {
						System.out.println("\nQual seu salário base?");
						double salario = sc.nextDouble();
						System.out.println("\nQual o valor agregado de sua produção?");
						double valorProducao = sc.nextDouble();
						System.out.println("\nQual a porcentagem da sua comissão?");
						double comissao = sc.nextDouble();
						Operario operario = new Operario(nome, telefone, endereco, salario, valorProducao, comissao);
						empresa.add(operario);
					} else {
						System.out.println("\nEsta pessoa é um empregado?(S/N)");
						respostaE = sc.next().charAt(0);
						if (respostaE == 's' || respostaE == 'S') {
							System.out.println("\nQual o código do setor deste funcionário?");
							int codigoSetor = sc.nextInt();
							System.out.println("\nQual o salário base deste funcionário?");
							double salarioBase = sc.nextDouble();
							System.out.println("\nQuanto de imposto este funcionário paga?");
							double imposto = sc.nextDouble();
							Empregado empregadoE = new Empregado(nome, telefone, endereco, codigoSetor, salarioBase,
									imposto);
							empresa.add(empregadoE);
						} else {
							System.out.println("\nEsta pessoa é um administrador?(S/N)");
							respostaA = sc.next().charAt(0);
							if (respostaA == 's' || respostaA == 'S') {
								System.out.println("\nQual é o seu salário base?");
								double salarioBase = sc.nextDouble();
								System.out.println("\nQuanto é a sua ajuda de custo?");
								double ajudaDeCusto = sc.nextDouble();
								Administrador administrador = new Administrador(nome, telefone, endereco, salarioBase,
										ajudaDeCusto);
								empresa.add(administrador);
							} else {
								System.out.println("\nEsta pessoa é um vendedor?(S/N)");
								char respostaV = sc.next().charAt(0);
								if (respostaV == 's' || respostaV == 'S') {
									System.out.println("\nQuanto é o seu salário?");
									double salarioBase = sc.nextDouble();
									System.out.println("\nQual o valor de suas vendas?");
									double valorVendas = sc.nextDouble();
									System.out.println("\nQuanto este vendedor ganha em comissão?");
									double comissaoV = sc.nextDouble();
									Vendedor vendedor = new Vendedor(nome, telefone, endereco, salarioBase, valorVendas,
											comissaoV);
									empresa.add(vendedor);

								} else {
									aux = 1;
								}
							}
						}
					}
				}
			} while (aux == 1);
		}
		System.out.println("\nAs pessoas cadastrados foram:");
		for (Pessoa e : empresa) {
			System.out.println(e);
		}
		sc.close();
	}
}
