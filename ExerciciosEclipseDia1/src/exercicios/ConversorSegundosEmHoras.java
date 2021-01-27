package exercicios;

import java.util.Scanner;


public class ConversorSegundosEmHoras {

	public static void main(String[] args) {
		//Esse programa lê a quantidade de segundos e os converte em horas, minutos e segundos.
		try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Por favor, insira a quantidade de segundos:");
		double segundos = sc.nextDouble();
		
		double horas = segundos / Math.pow(60, 2);
		double restoPraMinutos = segundos % (60 * 60);
		double minutos = restoPraMinutos / 60;
		double segundosDoEvento = restoPraMinutos % 60;
		
		System.out.printf("\nO evento irah durar %f hora(s), %f minuto(s) e %f segundo(s)."
				+ "\nBoa Sorte!", horas, minutos, segundosDoEvento);
		
		}
	}
}
