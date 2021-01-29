package exercicios;

import java.util.Scanner;

public class DadoDezVezes {

	public static void main(String[] args) {
		//Esse numero le dez valores e calcula a media aritmetica, mostrando os maiores valores.
		double[] vect = new double[10];
		double maior = 0;
		double soma = 0;
		double seis = 0;
		double quantidadeMaior = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("1 - Inserir rolagem/ 2 - Rolagem automatica / Outro Valor - Cancelar ");
			int opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				for(int i = 0; i < 10; i++) {
					System.out.println("Digite o #" + (i + 1) +  " valor:");
					do {
					vect[i] = sc.nextDouble();
					if(i == 0) {
						maior = vect[i];
					}
					if(vect[i] <= 6 && vect[i] >= 1) {
						soma = soma + vect[i];
					}
					if(vect[i] >= maior) {
						maior = vect[i];
					}
					if(vect[i] < 1 || vect[i] > 6) {
						System.out.print("Valor invalido. Insira um novo valor para #" + (i + 1) + ":\n");
					}
					} while (vect[i] < 1 || vect[i] > 6);
				}
				break;
				
			case 2:
				for(int i = 0; i < 10; i++) {
					vect[i] = (int)(Math.random()*6+1);
					soma = soma + vect[i];
					if(i == 0) {
						maior = vect[i];
					}
					if(vect[i] >= maior) {
						maior = vect[i];
					}
					continue;
				}
				break;
				
			default:
				System.out.println("Por favor, reinicie o programa.");
				System.exit(0);
			}
			
			for(int i = 0; i < 10; i++) {
				if(vect[i] == 6) {
					seis++;
				}
				if(vect[i] == maior) {
					System.out.println("Vetor [" + i + "] = " + String.format("%.2f", vect[i])
					+ " ---> Maior Valor!");
					quantidadeMaior++;
				}
				else {
					System.out.println("Vetor [" + i + "] = " + String.format("%.2f", vect[i]));
				}
			}
			double media = soma / 10;
			System.out.println("A media dos valores foi de " + media + ".");
			
			System.out.println("O maior valor possivel no dado (seis) apareceu " + seis + " vez(es).");

			if(seis == 0) {
				System.out.println("O maior valor nesse conjunto de dados aconteceu " 
						+ quantidadeMaior + " vez(es)."
						+ "O valor em questao foi " + maior);
				
			}
		}catch(Exception e) {
			System.out.println("Desculpe, o valor inserido nao eh permitido.");
		}
	}
}
