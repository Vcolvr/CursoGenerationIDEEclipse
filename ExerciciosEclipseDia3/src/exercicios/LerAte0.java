package exercicios;

import java.util.Scanner;

public class LerAte0 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int numero = 0;
			int soma = 0;
					
			System.out.println("Consigo somar numeros ateh que seja escrito um zero.\n");
			System.out.println("Por favor, insira um numero: \n");

			do {
				numero = sc.nextInt();
				if(numero!= 0) {
					System.out.println("Ainda nao eh um zero. Por favor, insira um novo numero.\n");
				}
				soma = soma + numero;
				}while(numero != 0);
				System.out.println("\nA soma dos numeros eh igual a " + soma + "\nObrigado!");
		}
	}
}
