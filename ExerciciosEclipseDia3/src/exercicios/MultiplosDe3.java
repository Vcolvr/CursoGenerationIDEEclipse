package exercicios;

import java.util.Scanner;

public class MultiplosDe3 {

	public static void main(String[] args) {
		//Este programa faz a media de multiplos de 3 de numeros que o usuario digitar.
		try (Scanner sc = new Scanner(System.in)) {
			int numero = 1;
			double multiplos = 0;
			double divisor = 0;
			double media = 0;
			System.out.println("Posso fazer uma media de multiplos de 3 para voce.\n"
					+ "Digite os numeros abaixo. Para terminar, digite 0.");
					
			do {
				numero = sc.nextInt();
				if(numero % 3 == 0 && numero != 0){
					multiplos = multiplos + numero;
					divisor++;
				}
				if(numero != 0) {
					System.out.println("Insira o proximo numero: ");
				}
			}while(numero != 0);
					media = multiplos / divisor;
					
					System.out.println("A media de todos os multiplos de 3 inseridos eh: " + media
							+ ". \nObrigado!");
		}
		

	}

}
