package exercicios;

import java.util.Scanner;

public class AnosMesesEDiasEmDias {
	
		public static void main(String[] args) {
			//Este programa lê a idade em anos, meses e dias e os converte para dias.
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Preciso que você me informe sua idade em anos, meses e dias");
			System.out.println("Por favor, insira quantos anos...");
			int anos = sc.nextInt();
			System.out.println("meses...");
			int meses = sc.nextInt();
			System.out.println("e dias!");
			int dias = sc.nextInt();
			
			int anosEmDias = anos * 365;
			int mesesEmDias = meses * 30;
			int somaDeDias = anosEmDias + mesesEmDias + dias;
			
			System.out.printf("\nO total de dias eh igual a " + somaDeDias + ".\nObrigado!");
			
			sc.close();
		}

	}

