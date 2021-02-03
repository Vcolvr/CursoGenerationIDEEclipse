package exercicioOperario;

public class Pessoa {
	protected String nome;
	protected int idade;
	protected int numeroDeCracha;
	protected int telefone;
	protected double salario;
	
	public Pessoa() {
	}

	public Pessoa(String nome, int idade, int numeroDeCracha, int telefone, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.numeroDeCracha = numeroDeCracha;
		this.telefone = telefone;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumeroDeCracha() {
		return numeroDeCracha;
	}

	public void setNumeroDeCracha(int numeroDeCracha) {
		this.numeroDeCracha = numeroDeCracha;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
