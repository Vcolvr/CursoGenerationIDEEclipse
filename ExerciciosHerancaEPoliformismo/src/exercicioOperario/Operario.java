package exercicioOperario;

public class Operario extends Pessoa {
	private double valorProducao;
	private double comissao;
	
	public Operario(double valorProducao, double comissao) {
		super();
		this.valorProducao = valorProducao;
		this.comissao = comissao;
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
		return salario + (valorProducao *(0.1 * comissao));
	}

}
