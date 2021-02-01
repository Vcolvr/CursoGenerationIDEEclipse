package exercicios;

import java.util.Scanner;

public class MaiorPontuacaoVetor {

	public static void main(String[] args) {
		//Este programa le 5 numeros e diz qual eh o maior.
		try (Scanner sc = new Scanner(System.in)) {
			
			int[] vect = new int[5];
			int maior = 0;

			for(int i = 0; i <= 4; i++) {
				System.out.printf("Insira o valor do vetor[%d]:\n", i);
				vect[i] = sc.nextInt();
				if(i == 0) {
					maior = vect[i];
				}
				if(vect[i] >= maior) {
					maior = vect[i];
				}
			}
			for(int i = 0; i <=4; i++) {
				if(vect[i] == maior) {
					System.out.printf("O maior valor encontrado foi no vetor[%d],"
							+ " com o numero %d!", i, maior);
				}
			}
		sc.close();

		}catch(Exception e) {
			System.out.println("Desculpe, o valor inserido nao eh permitido.");
		}
	}
}
