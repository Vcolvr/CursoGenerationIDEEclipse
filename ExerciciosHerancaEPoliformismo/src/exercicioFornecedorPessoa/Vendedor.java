package exercicioFornecedorPessoa;

public class Vendedor extends Pessoa{
	private double salario;
	private double valorVendas;
	private double comissao;
	
	public Vendedor(double salario, double valorVendas, double comissao) {
		super();
		this.salario = salario;
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public Vendedor(String nome, String telefone, String endereco, double salario, double valorVendas,
			double comissao) {
		super(nome, telefone, endereco);
		this.salario = salario;
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double salarioTotal() {
		return salario + (valorVendas *(0.01 * comissao));
	}
	
	public String toString() {
		return "\nFuncionario: " + nome +  "\nTelefone: " + telefone
				+ "\nEndereço: " + endereco 
				+ "\nSalário base: " + String.format("%.2f", salario)
				+ "\nEste funcionário é um vendedor, recebendo comissão, e ganha no total R$ "
				+ String.format("%.2f", salarioTotal());
	}
}
