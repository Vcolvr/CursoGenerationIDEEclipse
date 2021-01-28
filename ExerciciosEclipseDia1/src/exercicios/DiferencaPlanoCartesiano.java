package exercicios;

import java.util.Scanner;

public class DiferencaPlanoCartesiano {

	public static void main(String[] args) {
		//Este programa calcula a distancia entre dois pontos no plano cartesiano.
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Ola. Para realizar os calculos preciso das coordenadas de A e B");
			System.out.println("\nPor favor, insira o valor de x para A");
			double x1 = sc.nextDouble();
			System.out.println("\nPor favor, insira o valor de y para A");
			double y1 = sc.nextDouble();
			System.out.println("\nPor favor, insira o valor de x para B");
			double x2 = sc.nextDouble();
			System.out.println("\nPor favor, insira o valor de y para B");
			double y2 = sc.nextDouble();
			
			double diffX = Math.pow(x1 - x2, 2);
			double diffY = Math.pow(y1 - y2, 2);
			double diferenca = Math.sqrt(diffX + diffY);
			
			System.out.printf("\nA distancia entre A e B eh: %.2f", diferenca);
		}

	}

}
