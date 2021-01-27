package exercicios;

import java.util.Scanner;

public class ExpressaoDeD {

	public static void main(String[] args) {
		//Este programa le 3 variaveis e executa um sistema D = (R + S) / 2 onde R = (a+b)² e S é (b+c)².
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Para executar o programa, preciso de tres variaveis");
			System.out.println("Por favor, insira a primeira variavel");
			double a = sc.nextDouble();
			System.out.println("\nPor favor, insira a segunda variavel");
			double b = sc.nextDouble();
			System.out.println("\nPor favor, insira a terceira variavel");
			double c = sc.nextDouble();

			double r = Math.pow(a + b, 2);
			double s = Math.pow(b + c, 2);
			double d = (r + s) / 2;

			System.out.printf("\nO valor de D eh %.2f\n", d);
			System.out.println("Obrigado");
		}	
	}
}
