package exercicios;

import java.util.Scanner;

public class DiasEmAnosMesesEDias {

	public static void main(String[] args) {
		//Esse programa converte os dias vividos em anos meses e dias.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos dias você viveu?");
		int dias = sc.nextInt();
		
		int anos = dias / 365;
		int restoPraMeses = dias % 365;
		int meses = restoPraMeses / 30;
		int diasVividos = restoPraMeses % 30;
		
		System.out.printf("\nVoce viveu %d ano(s), %d mes(es) e %d dias.\nParabens!", anos, meses, diasVividos);
		sc.close();
	}
}
