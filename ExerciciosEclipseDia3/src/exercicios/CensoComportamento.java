package exercicios;

import java.util.Scanner;

public class CensoComportamento {

	public static void main(String[] args) {
		//Este programa serve para contar o numero de pessoas calmas, agressivas e nervosas, de diferentes faixar etarias e imprimir os dados.
		
		try (Scanner sc = new Scanner(System.in)) {
			int idade = 0;
			int genero = 0;
			int comportamento = 0;
			int pessoas = 0;
			int calmosGeral = 0;
			int nervosasMulheres = 0;
			int agressivosHomens = 0;
			int calmosOutros = 0;
			int nervososQuarenta = 0;
			int calmosAdolescentes = 0;

			System.out.println("Posso ler os dados de comportamento de ateh 150 pessoas.\n");
			while(pessoas <= 150) {
				System.out.println("Por favor, insira a idade: \n");
				idade = sc.nextInt();
				System.out.println("Por favor, qual seu genero? (1 - Feminino/ 2 - Masculino/ 3 - Outros) \n");
				genero = sc.nextInt();
				System.out.println("Como você estah se sentindo? (1 - Calmo(a)/ 2 - Nervoso(a)/ 3 - Agressivos) \n");
				comportamento = sc.nextInt();

				if(comportamento == 3) {
					calmosGeral++;
				}
				if(genero == 1 && comportamento == 2) {
					nervosasMulheres++;
				}
				if(genero == 2 && comportamento ==3) {
					agressivosHomens++;
				}
				if(genero == 3 && comportamento == 1) {
					calmosOutros++;
				}
				if(idade > 40 && comportamento == 2) {
					nervososQuarenta++;
				}
				if(idade < 18 && comportamento == 1) {
					calmosAdolescentes++;
				}
				pessoas++;
			}
			System.out.println("Dados coletados. \n" +
			"O numero de pessoas calmas eh: " + calmosGeral + ".\n" +
			"O numero de mulheres nervosas eh: " + nervosasMulheres + ".\n" +
			"O numero de homens agressivos eh:" + agressivosHomens + ".\n" +
			"O numeros de outros calmos eh: " + calmosOutros + ".\n" +
			"O numero de pessoas maiores de 40 anos calmos eh: " + nervososQuarenta + ".\n" +
			"O numero de menores de 18 anos calmos eh: " + calmosAdolescentes + ".\n" +
			"Obrigado!");
		}	
	}
}


