package exercicios;

import java.util.Scanner;

public class MediaPonderada235 {

	public static void main(String[] args) {
		//Este programa pega tres notas com pesos diferentes (2, 3 e 5) e faz sua media ponderada.
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Ola. Por favor, insira a primeira nota: \n");
			double nota1 = sc.nextDouble();
			System.out.print("\nAgora, por favor, insira a segunda nota: \n");
			double nota2 = sc.nextDouble();
			System.out.print("\nPor ultimo, por favor, insira a terceira nota: \n");
			double nota3 = sc.nextDouble();

			double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

			System.out.println("A sua media ponderada foi: " + mediaPonderada);
			
			if(mediaPonderada >= 5) {
				System.out.print("\nParabens! Voce passou!\n");
			}
			else {
				System.out.print("\nVoce esta em recuperacao! Que pena!\n");
			}
		}
	}
}
