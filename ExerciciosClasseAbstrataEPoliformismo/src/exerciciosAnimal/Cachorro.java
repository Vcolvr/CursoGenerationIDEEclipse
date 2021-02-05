package exerciciosAnimal;

public class Cachorro extends Animal {
	private String raca;
	
	public Cachorro(String raca) {
		super();
		this.raca = raca;
	}

	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String somAnimal() {
		return "roff roof";
	}
	@Override
	public String movimenta() {
		int n = (int)(Math.random()*2.0+(1.0));
		switch (n) {
		case 1:
			return "T� meio lentinho ainda, mas vai voltar r�pido a correr!";
		case 2:
			return "T� correndo melhor que antes de vir pra c�!";
		default:
			return "O bich�o � brabo, hein!";
		}

	}
}
