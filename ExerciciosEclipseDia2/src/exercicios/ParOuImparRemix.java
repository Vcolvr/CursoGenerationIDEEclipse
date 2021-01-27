package exercicios;

import java.util.Scanner;

public class ParOuImparRemix {

	public static void main(String[] args) {
		//Esse programa le se o numero eh par ou impar e faz seu quadrado ou sua raiz, respectivamente.
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Por favor, insira um numero: ");
			double numero = sc.nextDouble();
			
			if(numero % 2 == 0) {
				double raiz = Math.sqrt(numero);
				System.out.printf("%.0f eh par e sua raiz eh igual a %.2f", numero, raiz);
			}
			
			else {
				double potencia = Math.pow(numero, 2);
				System.out.printf("%.0f eh impar e seu quadrado eh igual a %.0f", numero, potencia);
			}
		}
	}

}
