package programa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		/*
		 * Fazer anota��es de redes de apoio, lugares para ficar. pop-up de liga��o se
		 * p� superclasse de comunica��o. Redes de apoio para quest�es psicol�gicas.
		 * Viol�ncias psicologicas e f�sicas se diferem na comunica��o Uber vai gratuito
		 * para delegacia da Mulher. int n = (int)(Math.random()*2.0+(1.0));
		 */
		// Wannabe banco de dados
		RedesDeApoio AcolheAcolhedora = new RedesDeApoio("Acolhe(dora)", "contat@acolhedora.org", "Psicologico");
		RedesDeApoio CasaDasAdvogadas = new RedesDeApoio("Casa das Advogadas", "contato@casadasadv.org", "Juridico");
		RedesDeApoio MapaDoAcolhimento = new RedesDeApoio("Mapa de Acolhimento", "contato@mapadoacolhimento.org",
				"Psicol�gico e Jur�dico");
		Delegacia delegaciaDaMulher = new Delegacia((int) (Math.random() * 30.0 + (1.0)), "Piraporinha");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm");
		// fim do banco de dados

		String nome, CPF, telefone, endereco, email, nomeProxima, telefoneProxima, relacao;
		char respostaCerteza, dados, respostaCertezaPessoa, respostaAdicionarPessoa;
		int numeroDaOcorrencia = 1, idade;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Bem-vinda ao SOS Mulher.\nA sua seguran�a � a nossa prioridade.");
			System.out.println("\nInsira seus dados: \nQual � o seu nome?");
			nome = sc.nextLine();
			System.out.println("\nQual � a sua idade?");
			idade = sc.nextInt();
			System.out.println("\nInsira o seu CPF:");
			CPF = sc.next();
			System.out.println("\nQual o seu endere�o?");
			endereco = sc.next();
			System.out.println("\nQual � o seu telefone?");
			sc.nextLine();
			telefone = sc.next();
			System.out.println("\nQual � o seu email?");
			email = sc.next();
			System.out.println("Nome:" + nome + "\nIdade: " + idade + "\nCPF: " + CPF + "\nEndereco: " + endereco
					+ "\nTelefone: " + telefone + "\nEmail: " + email);

			System.out.println("\nOs seus dados est�o corretos? (S/N)");
			dados = sc.next().charAt(0);
			if (dados != 'S' || dados != 's') {
				sc.nextLine();
			}
		} while (dados != 'S' && dados != 's');
		Mulher mulher = new Mulher(nome, idade, CPF, endereco, telefone, email);

		System.out.println("\nEstamos quase concluindo seu cadastro...");
		System.out.println("\nGostaria de adicionar uma pessoa que voc� confie? (S/N)");
		char resposta = sc.next().charAt(0);

		do {
			if (resposta == 's' || resposta == 'S') {
				do {
					do {
						System.out.println("\nQual � o nome dessa pessoa?");
						nomeProxima = sc.nextLine();
						sc.next();
						System.out.println("\nQual � o n�mero se caso precisarmos ligar para ela?");
						telefoneProxima = sc.next();
						System.out.println("\nQual � a sua rela��o com ela?(m�e/amigo(a)/namorado(a))");
						sc.next();
						relacao = sc.nextLine();
						System.out.println(
								"Nome: " + nomeProxima + "\nTelefone: " + telefoneProxima + "\nRela��o: " + relacao);
						System.out.println("Confirma os dados desta pessoa?");
						respostaCertezaPessoa = sc.next().charAt(0);
					} while (respostaCertezaPessoa != 'n' && respostaCertezaPessoa != 'N');

					PessoaProxima pessoa = new PessoaProxima(nomeProxima, telefoneProxima, relacao);
					mulher.adicionarPessoaProxima(pessoa);
					respostaCerteza = 's';
					System.out.println("Deseja adicionar outra pessoa?");
					respostaAdicionarPessoa = sc.next().charAt(0);
				} while (respostaAdicionarPessoa != 'n' && respostaAdicionarPessoa != 'N');
			}

			else {
				System.out.println("\nTem certeza? � muito importante para a sua seguran�a!");
				respostaCerteza = sc.next().charAt(0);
				if (respostaCerteza == 'n' || respostaCerteza == 'N') {
					resposta = 's';
					System.out.println("Encaminharemos voc� para o cadastro da pessoa.");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ex) {
						Thread.currentThread().interrupt();
					}
				}
			}
		} while (respostaCerteza != 's' && respostaCerteza != 'S');

		System.out.println("\nTudo pronto!");

		System.out.println("\nComo podemos te ajudar neste momento?");
		System.out.println("1 - Acionar a pol�cia// 2 - Redes de Apoio//");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			String agressao = "Agress�o e amea�a";
			Date agora = new Date();
			System.out.println("Sua ocorr�ncia foi registrada.");
			delegaciaDaMulher.contato();
			Ocorrencia ocorrencia = new Ocorrencia(numeroDaOcorrencia, agressao, agora);
			mulher.adicionarOcorrencia(ocorrencia);
			numeroDaOcorrencia++;
			System.out.println(ocorrencia);
			break;
		case 2:
			System.out.println("Precisa de apoio psicol�gico ou jur�dico? (P/J)");
			char psiOuJur = sc.next().charAt(0);
			if (psiOuJur == 'p' || psiOuJur == 'P') {
				System.out.println();
			} else {

			}
		}
		sc.close();
	}
}
