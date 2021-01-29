package exercicios;

import java.util.Scanner;

public class SomaESomaDiagonal {

	public static void main(String[] args) {
		//Este programa soma os valores individuais de uma matriz e tambem de sua diagonal principal.
		try (Scanner sc = new Scanner(System.in)) {
			int m = 3;
			int n = 3;
			int[][] mat = new int[m][n];
			int soma = 0;
			int somaDiagonal = 0;
			System.out.printf("Insira o valor de\n");
			
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					System.out.printf("Mat[%d][%d]:", i, j);
					mat[i][j] = sc.nextInt();
					soma = soma + mat[i][j];
					if(i == j) {
						somaDiagonal = somaDiagonal + mat[i][j];
					}
				}
			}
			System.out.printf("A soma dos valores desta matriz eh de %d,"
					+ " sendo a soma da sua diagonal principal %d.\n", soma, somaDiagonal);
			System.out.println("Diagonal principal: ");
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					if(i == j) {
					System.out.print(mat[i][j] + " ");
					}
				}
			}
		}
		catch(Exception e) {
			System.out.println("Desculpe, o valor inserido nao eh permitido.");
		}
	}
}
