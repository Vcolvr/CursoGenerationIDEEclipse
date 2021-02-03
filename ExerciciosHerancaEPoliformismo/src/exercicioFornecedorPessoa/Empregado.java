package exercicioFornecedorPessoa;

public class Empregado extends Pessoa {
	private Integer codigoSetor;
	private Double salario;
	private Double imposto;
	
	public Empregado(Integer codigoSetor, Double salario, Double imposto) {
		super();
		this.codigoSetor = codigoSetor;
		this.salario = salario;
		this.imposto = imposto;
	}

	public Empregado(String nome, String telefone, String endereco, Integer codigoSetor, Double salario,
			Double imposto) {
		super(nome, telefone, endereco);
		this.codigoSetor = codigoSetor;
		this.salario = salario;
		this.imposto = imposto;
	}

	public Integer getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(Integer codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	public double salarioTotal() {
		return salario - imposto;
	}
	public String toString() {
		return "\nFuncionario: " + nome +  "\nTelefone: " + telefone
				+ "\nEndereço: " + endereco 
				+ "\nSalário base: " + String.format("%.2f", salario)
				+ "\nEste funcionário é um empregado, paga impostos, e ganha no total R$ "
				+ String.format("%.2f", salarioTotal());
	}
	
	
	
}
