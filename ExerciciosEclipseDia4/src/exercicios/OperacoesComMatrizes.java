package exercicios;

import java.util.Scanner;

public class OperacoesComMatrizes {
	
	public static void main(String[] args) {
		//Este programa le 2 matrizes e possibilita operacoes basicas com elas.
		try (Scanner sc = new Scanner(System.in)) {
			int m = 4;
			int n = 6;
			int[][] matN1 = new int[m][n];
			int[][] matN2 = new int[m][n];
			int[][] matM1 = new int[m][n];
			
			System.out.println("Insira os valores de N1:");
				
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					System.out.printf("MatN1[%d][%d]:", i, j);
					matN1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Insira os valores de N1:");
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					System.out.printf("MatN2[%d][%d]:", i, j);
					matN2[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Qual operacao voce quer fazer?");
			System.out.println("1 - Soma/ 2 - Subtracao/");
			System.out.println("3 - Multiplicacao/ 4 - Divisao/");
			System.out.println("Para cancelar, digite qualquer outro numero");
			int opcao = sc.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Voce escolheu SOMA:");
				for(int i = 0; i < m; i++) {
					for(int j = 0; j < n; j++) {
						matM1[i][j] = matN1[i][j] + matN2[i][j];
						System.out.printf("MatN1[%d][%d] + MatN2[%d][%d] = %d.\nObrigado!", i, j, i, j, matM1[i][j]);
					}
				}
				break;
			case 2:
				System.out.println("Voce escolheu SUBTRACAO:");
				for(int i = 0; i < m; i++) {
					for(int j = 0; j < n; j++) {
						matM1[i][j] = matN1[i][j] - matN2[i][j];
						System.out.printf("MatN1[%d][%d] + MatN2[%d][%d] = %d.\nObrigado!", i, j, i, j, matM1[i][j]);
					}
				}
				break;
			case 3:
				System.out.println("Voce escolheu MULTIPLICACAO:");
				for(int i = 0; i < m; i++) {
					for(int j = 0; j < n; j++) {
						matM1[i][j] = matN1[i][j] * matN2[i][j];
						System.out.printf("MatN1[%d][%d] + MatN2[%d][%d] = %d.\nObrigado!", i, j, i, j, matM1[i][j]);
					}
				}
				break;
			case 4:
				System.out.println("Voce escolheu DIVISAO:");
				for(int i = 0; i < m; i++) {
					for(int j = 0; j < n; j++) {
						matM1[i][j] = matN1[i][j] / matN2[i][j];
						System.out.printf("MatN1[%d][%d] + MatN2[%d][%d] = %d.\nObrigado!", i, j, i, j, matM1[i][j]);
					}
				}
				break;
			default:
				System.out.println("Obrigado!");
				break;
			}
			sc.close();
		}catch(Exception e) {
			System.out.println("Desculpe, o valor inserido nao eh permitido.");
		}
	}
}