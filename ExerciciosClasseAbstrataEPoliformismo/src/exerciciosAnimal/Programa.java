package exerciciosAnimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Programa {

	public static void main(String[] args) {
		//Programa que voc� cadastra animais e eles fazem som, (infelizmente escrito ainda)
		char resposta = 0;
		Scanner sc = new Scanner(System.in);
		List<Animal> animais = new ArrayList<>();

		System.out.println("Bem vindo � Clinica Veterin�ria Pregui�ol�ndia!"
				+ "\nCuidamos especificamente de cachorros, cavalos e pregui�as!");

		do {
			System.out.println("\nPor favor, qual o nome do seu animalzinho?");
			String nome = sc.nextLine();

			System.out.println("\nQuantos anos elu tem?");
			int idade = sc.nextInt();

			System.out.println("\nQue tipo de animal elu �?");
			System.out.println("1 - Cachorro// 2 - Cavalo // 3 - Pregui�a");

			int opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.println("\nQual a ra�a de seu cachorro?");
				String raca = sc.next();
				Cachorro cachorro = new Cachorro(nome, idade, raca);
				animais.add(cachorro);
				break;
				
			case 2:
				System.out.println("\nQual a cor do seu cavalo?");
				String cor = sc.next();
				Cavalo cavalo = new Cavalo(nome, idade, cor);
				animais.add(cavalo);
				break;

			case 3:
				System.out.println("\nComo est� o humor da sua pregui�inha?");
				String humor = sc.nextLine();
				System.out.println("\nQual a velocidade m�dia da sua pregui�a? (Km/h)");
				double velocidadePorHora = sc.nextDouble();
				if(velocidadePorHora > 2) {
					System.out.println("\nOh n�o! Ela est� indo r�pido demais!");
				}
				Preguica preguica = new Preguica(nome, idade, humor, velocidadePorHora);
				animais.add(preguica);
				break;
			}
			sc.nextLine();
			System.out.println("\nDeseja cadastrar outro animal?");
			resposta = sc.nextLine().charAt(0);
		} while (resposta == 's' || resposta == 'S');
		
		if(animais.size() >= 2) {
			System.out.println("Seus animais est�o se recuperando!");
		}
		else {
			System.out.println("Elu j� est� bem melhor!");
		}
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
		    Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		System.out.println("\nProntinho!\n");
		
		if(animais.size() >= 2) {
			System.out.println("Elus j� est�o melhor. J� voltaram a fazer sons!\n");
		}
		else {
			System.out.println("Elu est� melhor!\n");
		}
		
		for(Animal e : animais) {
			System.out.println(e.getNome() + ": " + e.somAnimal() + "\nVamos ver se elu se move!");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException j) {
			    Thread.currentThread().interrupt();
				j.printStackTrace();
			}
			System.out.println(e.movimenta() + "\n");
		}
		sc.close();
	}

}
