package exercicios;

import java.util.Scanner;

public class JovensEMaioresQue50 {

	public static void main(String[] args) {
		//Este programa separa pessoas mais jovens que 21 anos e com mais de 50 anos, para as contar.
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Consigo contar a quantidade de jovens menores de 21 anos"
					+ " e adultos com mais de 50.\n");
			System.out.println("Para isso, insira a idade de cada pessoa. Para sair, insira -99\n");
			int idade = 0;
			int jovens = 0;
			int maisVelhos = 0;
			while(idade != -99) {
				idade = sc.nextInt();
				if(idade <= 20 && idade >= 0) {
					jovens++;
				}
				else if(idade >= 51) {
					maisVelhos++;
				}
			System.out.println("Insira a idade do proximo. Para sair, insira -99 \n");
			}
			System.out.println("\nA quantidade de menores de 21 eh de " + jovens
					+ ". \nE de maiores de 50 eh " + maisVelhos + ".\nObrigado!");
		}
	}
}

