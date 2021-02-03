package exercicioFornecedorPessoa;

public class Administrador extends Pessoa{
	private double salario;
	private double ajudaDeCusto;
	
	public Administrador(double salario, double ajudaDeCusto) {
		super();
		this.salario = salario;
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public Administrador(String nome, String telefone, String endereco, double salario, double ajudaDeCusto) {
		super(nome, telefone, endereco);
		this.salario = salario;
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double salarioTotal() {
		return salario + ajudaDeCusto;
	}
	
	public String toString() {
		return "\nFuncionario: " + nome +  "\nTelefone: " + telefone
				+ "\nEndereço: " + endereco 
				+ "\nSalário base: " + String.format("%.2f", salario)
				+ "\nEste funcionário é um administrador, com ajuda de custo, e ganha no total R$ "
				+ String.format("%.2f", salarioTotal());
	}
}
