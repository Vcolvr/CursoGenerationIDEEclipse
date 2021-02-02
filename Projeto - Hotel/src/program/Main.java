package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
		char resposta = 0, confirma = 0, confirma2 = 0;
		double preco = 0, auxPreco = 0;
		int quartosVagos = 12; 
		int contadorQuartoSimples = 3, contadorQuartoCasal = 3, contadorQuartoFamilia = 3, contadorQuartoLuxo = 3;
		int opcao = 0, quarto = 0, telefone = 0, diarias = 0, quantidade = 0, auxQuartos = 0;
		String nome, email;
		Scanner sc = new Scanner(System.in);
		do {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				
				System.out.println("Bem vindo ao Hotel California!");
				do {
					System.out.println("\nTemos quatro opções de quarto disponíveis: \n"
						+ "1 - Quarto simples\n2 - Quarto casal\n3 - Quarto familia\n4 - Quarto de Luxo\n"
						+ "Digite a opção desejada para saber mais.");
					
					opcao = sc.nextInt();
					System.out.println();
					
						switch(opcao) {
						case 1:
							System.out.println("Quarto simples: Este quarto inclui uma cama de solteiro, "
									+ "um banheiro e uma televisão. Temos " + contadorQuartoSimples + " vaga(s).");
							break;
						case 2:
							System.out.println("Quarto casal: Este quarto inclui uma cama de casal, "
									+ "um banheiro e uma televisão. Temos " + contadorQuartoCasal + " vaga(s).");
							break;
						case 3:
							System.out.println("Quarto familia: Este quarto inclui uma cama de casal,"
							+ " duas camas de solteiro, um banheiro, um frigobar e uma televisão."
							+ "Temos " + contadorQuartoFamilia + " vaga(s).");
							break;
						case 4:
							System.out.println("Quarto de Luxo: Este quarto inclui uma cama king size,"
									+ " um banheiro com jacuzzi ar condicionado, vista privilegiada, "
									+ "um frigobar, uma televisão, com café da manhã incluso."
									+ " Temos " + contadorQuartoLuxo + " vaga(s).");
							break;
						default:
							System.out.println("Opção inválida.");
							break;
						}
						
						System.out.println();
						System.out.println("Deseja saber sobre outro quarto?(S/N)");
						resposta = sc.next().charAt(0);
						
				}while (resposta == 's' || resposta == 'S');
				System.out.println();
				System.out.println("Quarto simples - R$ 110,00\nQuarto casal - R$ 130,00"
						+ "\nQuarto familia - R$ 170,00\nQuarto de Luxo - R$ 230,00");
				System.out.println();
				
				
				do {
					if(quartosVagos < 0) {
						System.out.println("Esta quantidade de quartos não está disponível.");
						quartosVagos = quartosVagos + quantidade;
					}
				System.out.println("Quantos quartos serão alugados?");
				quantidade = sc.nextInt();
				quartosVagos = quartosVagos - quantidade;
				}while (quartosVagos < 0);
				
				
					for(int i = 0; i < quantidade; i++) {
						do {
						do {
						do {
						System.out.println("\nQuarto #" + (i + 1) + ":\nQual é a opção escolhida? \n"
								+ "1 - Quarto simples\n2 - Quarto casal\n3 - Quarto família\n4 - Quarto de Luxo");
						quarto = sc.nextInt();
						auxQuartos = 0;
						if(quarto == 1) {
							preco = preco + 110.00;
							contadorQuartoSimples--;
							if(contadorQuartoSimples <= -1) {
								auxQuartos = 1;
								preco = preco - 110.00;
								contadorQuartoSimples++;
							}
						}
						else if(quarto == 2) {
							preco = preco + 130.00;
							contadorQuartoCasal--;
							if(contadorQuartoCasal <= -1) {
								auxQuartos = 1;
								preco = preco - 130.00;
								contadorQuartoCasal++;
							}
						}
						else if(quarto == 3) {
							preco = preco + 180.00;
							contadorQuartoFamilia--;
							if(contadorQuartoFamilia <= -1) {
								auxQuartos = 1;
								preco = preco - 180.00;
								contadorQuartoFamilia++;
							}
						}
						else if(quarto == 4) {
							preco = preco + 230.00;
							contadorQuartoLuxo--;
							if(contadorQuartoLuxo <= -1) {
								auxQuartos = 1;
								preco = preco - 230.00;
								contadorQuartoLuxo++;
							}
						}
						else {
							System.out.println("Opção invalida.\n");
						}
						if (auxQuartos == 1) {
							System.out.println("Todos os quartos dessa categoria estão ocupados. "
									+ "Por favor, escolha outro.");
						}
						}while (auxQuartos == 1);
						}while (quarto < 1 || quarto > 4);
						do {
						System.out.println("Subtotal é de " + String.format("%.2f", preco)
						+ " reais por dia. Confirma? (S/N)");
						confirma = sc.next().charAt(0);
						}while (confirma != 'n' && confirma != 's' && confirma != 'S' && confirma != 'N');
						if(confirma == 'n' || confirma == 'N') {
							if (preco < 0) {
								preco = 0;
							}
							if (quarto == 1) {
								contadorQuartoSimples++;
								preco = preco - 110;
							}
							else if (quarto == 2) {
								contadorQuartoCasal++;
								preco = preco - 130;
							}
							else if (quarto == 3 ) {
								contadorQuartoFamilia++;
								preco = preco - 170;
							}
							else if (quarto == 4) {
								contadorQuartoLuxo++;
								preco = preco - 230;
							}
						}
						}while(confirma == 'n' || confirma == 'N');
				}
				
				do {
					if(auxPreco == 0) {
						auxPreco = preco;
					}
					preco = auxPreco;
					System.out.println("\nVamos efetuar seu cadastro!");
					System.out.println("Por favor, insira seu nome:");
					nome = sc.next();
					System.out.println("Qual seu e-mail?");
					email = sc.next();
					System.out.println("Qual seu telefone? (Sem caracteres especiais)");
					telefone = sc.nextInt();
					System.out.println("Por quantas diárias você alugará esses quartos?");
					diarias = sc.nextInt();
					preco = preco * diarias;
				do {	
					System.out.println();
					System.out.println("Nome: " + nome +".\nTelefone: " + telefone + "\nEmail: " + email
								+ "\nO valor total é de " + String.format("%.2f", preco)
								+ " reais. Confirma? (S/N)");
					confirma2 = sc.next().charAt(0);
				}while (confirma2 != 'n' && confirma2 != 's' && confirma2 != 'S' && confirma2 != 'N');
				}while (confirma2 == 'n' || confirma2 == 'N');
				
				System.out.println();
				System.out.println("Seu cadastro foi realizado com sucesso! "
						+ "Sua hospedagem está confirmada. Nos vemos em breve.\n"
						+ "Enviaremos por e-mail sua nota fiscal.");
				
				try{
					Thread.sleep(7000);
				}
				catch(InterruptedException ex)
				{
				    Thread.currentThread().interrupt();
				}
		}while (quartosVagos > 0);
		System.out.println("Todos os quartos estão ocupados");
		sc.close();
		}catch(Exception e) {
			System.out.println("Desculpe, o valor inserido não é permitido.");
		}
	}
}
