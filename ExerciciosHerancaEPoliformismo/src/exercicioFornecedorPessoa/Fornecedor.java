package exercicioFornecedorPessoa;

public class Fornecedor extends Pessoa {
	private Double valorCredito;
	private Double valorDivida;
	
	public Fornecedor(Double valorCredito, Double valorDivida) {
		super();
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Fornecedor(String nome, String telefone, String endereco, Double valorCredito, Double valorDivida) {
		super(nome, telefone, endereco);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Fornecedor(String nome, String telefone, String endereco, String site, Double valorCredito,
			Double valorDivida) {
		super(nome, telefone, endereco);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(Double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public Double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(Double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double valorTotal() {
		return valorCredito - valorDivida;
	}

	public String toString() {
		if(valorTotal() < 0) {
			return "Fornecedor: " + nome + "\nTelefone: " + telefone
				+ "\nEndereço: " + endereco+ "\nSaldo: " + valorTotal()
				+ "\nEste fornecedor está devendo!";
		}
		else {
			return "Fornecedor: " + nome + "\nTelefone: " + telefone
			+ "\nEndereço: " + endereco
			+ "\nSaldo: " + valorTotal() + "\nEste vendedor tem crédito conosco!";
		}
	}
}
	

