package exercicios;

public class DivisorDe1000Por11Resta5 {

	public static void main(String[] args) {
		//Este programa mostra todos os numeros entre 1000 e 1999 que divididos por 11 tem o resto 5.
		System.out.println("Todos os numeros maiores que 1000 que divididos por 11 tem o resto de 5: \n");
		for(int divisor = 1000; divisor < 1999; divisor++) {
			if(divisor % 11 == 5) {
				System.out.println(divisor + "\n");
			}
		}
		System.out.println("Obrigado!");
	}
}
