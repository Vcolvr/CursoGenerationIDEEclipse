package exercicioFornecedorPessoa;


public class Operario extends Pessoa {
	private double salario;
	private double valorProducao;
	private double comissao;
	

	public Operario(double salario, double valorProducao, double comissao) {
		super();
		this.salario = salario;
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public Operario(String nome, String telefone, String endereco, double salario, double valorProducao,
			double comissao) {
		super(nome, telefone, endereco);
		this.salario = salario;
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double salarioTotal() {
		return salario + (valorProducao *(0.01 * comissao));
	}
	
	public String toString() {
		return "\nFuncionario: " + nome +  "\nTelefone: " + telefone
				+ "\nEndere�o: " + endereco 
				+ "\nSal�rio base: " + String.format("%.2f", salario)
				+ "\nEste funcion�rio � um oper�rio, recebendo comiss�o, e ganha no total R$ "
				+ String.format("%.2f", salarioTotal());
	}
	
	

}
