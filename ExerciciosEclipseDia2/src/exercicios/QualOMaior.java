package exercicios;

import java.util.Scanner;

public class QualOMaior {

	public static void main(String[] args) {
		//Esse programa le tres variaveis e diz qual eh o maior.
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Vou comparar tres variaveis e ver qual a maior: ");
			System.out.println("Por favor, insira a primeira variavel: ");
			int inteiro1 = sc.nextInt();
			System.out.println("Por favor, insira a segunda variavel: ");
			int inteiro2 = sc.nextInt();
			System.out.println("Por favor, insira a terceira variavel: ");
			int inteiro3 = sc.nextInt();
			System.out.println();
			
			if(inteiro1 >= inteiro2 && inteiro1 >= inteiro3) {
				System.out.println(inteiro1 + " eh o maior numero.");
				}
			else if(inteiro2 >= inteiro3 && inteiro2 >= inteiro1) {
				System.out.println(inteiro2 + " eh o maior numero.");
			}
			else {
				System.out.println(inteiro3 + " eh o maior numero.");
			}
		}
	}

}
