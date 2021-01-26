package exercicios;

import java.util.Scanner;

public class ValorXeY {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Esse programa resolve o sistema \nax + by = c \ndx + ey = f");
			System.out.print("\nPara isso preciso de 6 variaveis\n");
			
			System.out.print("\nPor favor, insira o valor de a\n");
			double a = sc.nextDouble();
			System.out.print("\nPor favor, insira o valor de b\n");
			double b = sc.nextDouble();
			System.out.print("\nPor favor, insira o valor de c\n");
			double c = sc.nextDouble();
			System.out.print("\nPor favor, insira o valor de d\n");
			double d = sc.nextDouble();
			System.out.print("\nPor favor, insira o valor de e\n");
			double e = sc.nextDouble();
			System.out.print("\nPor favor, insira o valor de f\n");
			double f = sc.nextDouble();

			double x = (c * e - b * f) / (a * e - b * d);
			double y = (a * f - c * d) / (a * e - b * d);

			System.out.print("\nO valor de x eh " + x);
			
			System.out.print("\nO valor de y eh " + y);
			
		}
		

	}

}
