package exercicios;

import java.util.Scanner;

public class QualCategoria {

	public static void main(String[] args) {
		//Este programa le uma idade e coloca a pessoa dentro de uma categoria por idade.
				try (Scanner sc = new Scanner(System.in)) {
					System.out.println("Insira sua idade para sabermos em que categoria voce esta: ");
					int idade = sc.nextInt();
					
					if(idade >= 10 && idade <= 14) {
						System.out.println("Voce esta na categoria Infantil (10 - 14 Anos).\nBoa sorte!");
					}
					else if(idade >= 15 && idade <= 17) {
						System.out.println("Voce esta na categoria Juvenil (15 - 17 Anos).\nBoa sorte!");
					}
					else if (idade >= 18 && idade <= 25) {
						System.out.println("Voce esta na categoria Adulto (18 - 25 Anos).\nBoa sorte!");
					}
					else {
						System.out.println("Voce nao esta em nenhuma categoria.\nObrigado!");
					}
				}
	}
}
