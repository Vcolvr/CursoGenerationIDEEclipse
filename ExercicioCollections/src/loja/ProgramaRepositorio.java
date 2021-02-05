package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaRepositorio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto> produtos = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("Digite o n�mero para fazer uma opera��o com nosso estoque: ");
			System.out.println("1 - Adicionar produtos// 2 - Remover produto//");
			System.out.println("3 - Editar produtos// 4 - Imprimir lista de produtos(Encerra o programa)//");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				sc.nextLine();
				System.out.println("\nQual o nome do produto?");
				String nome = sc.nextLine();
				System.out.println("\nQual o pre�o unit�rio?");
				double preco = sc.nextDouble();
				System.out.println("\nQuantos desse produto foram adicionados no estoque?");
				int quantidade = sc.nextInt();

				Produto produto = new Produto(nome, preco, quantidade);
				produtos.add(produto);
				System.out.printf("\nFoi adicionado o produto %s, de preco %.2f" + " e de quantidade %d foi adicionado",
						produto.getNome(), produto.getPreco(), produto.getQuantidade());
				break;

			case 2:
				sc.nextLine();
				System.out.println("\nQual o nome do produto a ser removido?");
				String nomeRemover = sc.nextLine();
				for (Produto e : produtos) {
					if (nomeRemover.equals(e.getNome())) {
						System.out.println("\nO produto " + e.getNome() + " ser� removido");
						produtos.remove(e);
					}
				}
			case 3:
				sc.nextLine();
				System.out.println("\nQual o nome do produto a ser atualizado");
				String nomeAtualizar = sc.nextLine();
				for (Produto e : produtos) {
					if (nomeAtualizar.equals(e.getNome())) {
						System.out.println("\nQual ser� o novo nome?");
						String novoNome = sc.next();
						e.setNome(novoNome);
						System.out.println("\nQual ser� o novo pre�o?");
						Double novoPreco = sc.nextDouble();
						e.setPreco(novoPreco);
						System.out.println("\nQual ser� a nova quantidade?");
						Integer novaQuantidade = sc.nextInt();
						e.setQuantidade(novaQuantidade);
						break;
					}
				}
			case 4:
				for (Produto e : produtos) {
					System.out.println(e);
					break;
				}
			}
		} while (opcao != 4);
		System.out.println("\nObrigado por usar nosso sistema!");
		sc.close();
	}

}
