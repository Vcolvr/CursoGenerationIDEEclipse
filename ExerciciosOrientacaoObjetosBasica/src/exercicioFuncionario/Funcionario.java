package exercicioFuncionario;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	
	private String nome;
	private String funcao;
	private double horasTrabalhadas;
	private double salarioPorHora;
	public List<Funcionario> funcionarios = new ArrayList<>();
	
	public Funcionario(String nome, String funcao, double horasTrabalhadas, double salarioPorHora) {
		this.nome = nome;
		this.funcao = funcao;
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioPorHora = salarioPorHora;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getSalarioPorHora() {
		return salarioPorHora;
	}
	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}
	
	public double salario() {
		return horasTrabalhadas * salarioPorHora;
	}
	
	public double aumentarSalario(double porcentagem) {
		return salario() * (0.1 * porcentagem);
	}

	@Override
	public String toString() {
		return "Funcionario:" + nome + "\nCargo: " + funcao + "\nSalario: R$" + salario();
	}
	
}
