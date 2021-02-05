package exerciciosAnimal;

public class Cavalo extends Animal {
	private String cor;

	public Cavalo(String cor) {
		super();
		this.cor = cor;
	}
	
	public Cavalo(String nome, int idade, String cor) {
		super(nome, idade);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String somAnimal() {
		return "*respiração de cavalo*";
	}

	@Override
	public String movimenta() {
		return "Como corre rápido o alazão!";
	}
}
