package exercicioPaciente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		//O programa tenta emular um sistema de hospital em que o usuário insere informações e tratamentos e tem uma lista de tudo
		
		System.out.println("Bem vinde ao Hospital Santa Padroeira da Misericórdia!");
		System.out.println("\nPor favor, insira os dados de nosso novo paciente! ");
		
		System.out.println("Qual é o nome desse paciente?");
		String nome = sc.nextLine();
		System.out.println("\nQual a idade desse paciente?");
		int idade = sc.nextInt();
		System.out.println("\nDe que convênio participa?");
		String convenio = sc.next();
		System.out.println("\nQuais os sintomas desse paciente?");
		sc.next();
		String sintomas = sc.nextLine();
		System.out.println("\nEm que dia ele começou a se sentir mal?(dd/mm/yyyy)");
		Date momento = sdf.parse(sc.nextLine());
		System.out.println("\nEle já fez algum tratamento para lidar com esse problema?(S/N)");
		char resposta = sc.nextLine().charAt(0);
		
		Paciente paciente = new Paciente(nome, idade, convenio, sintomas, momento);
		
		if(resposta == 's' || resposta == 'S') {
			System.out.println("Quantos remédios/ soluções o paciente tentou?");
			int quantidade = sc.nextInt();
			
			for(int i = 1; i <= quantidade; i ++) {
				System.out.println("Descreva o tratamento Nº" + i + ".");
				if(i == 1) {
					sc.nextLine();
				}
				String tratamento = sc.nextLine();
				paciente.adicionarTratamentos(tratamento);
			}
		}
		System.out.println();
		System.out.println(paciente);
		if(resposta == 'n' ||resposta == 'N') {
			System.out.println();
			System.out.println("Tratando pela primeira vez.");
		}
		else {
			System.out.println();
			System.out.println("Já tentou estes tratamentos:");
			for(String e: paciente.getTratamentos()) {
				System.out.println(e);
			}
		}
		sc.close();
	}

}
