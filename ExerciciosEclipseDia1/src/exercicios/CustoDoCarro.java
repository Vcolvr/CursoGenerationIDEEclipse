package exercicios;

import java.util.Scanner;

public class CustoDoCarro {

	public static void main(String[] args) {
		//Esse programa faz o calculo do preco de um carro somando as porcentagens de impostos e do distribuidor.
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Saudacoes. Qual eh o preco do carro?");
			double precoDoCarro = sc.nextDouble();
			
			double impostoSobrePreco = precoDoCarro * 0.45;
			double distribuidorSobrePreco = precoDoCarro * 0.28;
			double somaTotal = precoDoCarro + impostoSobrePreco + distribuidorSobrePreco;
			
			System.out.printf("\nO preco do carro eh igual a %.2f reais", somaTotal);
		}
	}
}
