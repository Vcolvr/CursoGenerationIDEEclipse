package exercicioContaBancaria;

public class ContaBancaria {
	
	private int numeroDaConta;
	private String nomeDoDono;
	private double saldo;

	public void Clientes(int numeroDaConta, String nomeDoDono, double saldoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoDono = nomeDoDono;
		deposito(saldoInicial);
	}

	public void Clientes(int numeroDaConta, String nomeDoDono) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoDono = nomeDoDono;
	}

	public String getNomeDoDono() {
		return nomeDoDono;
	}

	public void setNomeDoDono(String nomeDoDono) {
		this.nomeDoDono = nomeDoDono;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double deposito(double saldo) {
		return this.saldo = saldo + this.saldo;
	}

	public double retirada(double saldo) {
		return this.saldo = this.saldo - saldo - 5.00;
	}

	public String toString() {
		return "Conta numero: " + getNumeroDaConta() + ", Dono: " + getNomeDoDono() + ", Saldo: R$"
				+ String.format("%.2f%n", getSaldo());
	}

}
