package exercicios;

import java.util.Scanner;

public class QuantosSaoParesEImpares {

	public static void main(String[] args) {
		//Este programa lê 10 numeros e conta quantos sao pares e quantos sao impares.
		try (Scanner sc = new Scanner(System.in)) {
			int numero = 0;
			int pares = 0;
			int impares = 0;
					
			System.out.println("Posso verificar se 10 numeros sao pares ou impares\n");
			System.out.println("Por favor, insira o 1° numero: \n");
			for(int i = 0; i < 10; i++) {
				numero = sc.nextInt();
				if(i < 9){
					System.out.println("Insira o " + (i+2) + "º numero\n");
				}
				if(numero % 2 == 0) {
					pares++;
				}
				else {
					impares++;
				}
			}
			System.out.println("A quantidade de numeros pares eh: " + pares + 
			"\nE a quantidade de numeros de impares eh: "+ impares + "\nObrigado!");
		}
		

	}

}
