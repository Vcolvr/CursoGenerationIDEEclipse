package exercicioPaciente;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	private String nome;
	private int idade;
	private String convenio;
	private String sintomas;
	private Date dataDeEntrada;

	private List<String> tratamentos = new ArrayList<>();
	
	public Paciente(String nome, int idade, String convenio, String sintomas, Date dataDeEntrada) {
		this.nome = nome;
		this.idade = idade;
		this.convenio = convenio;
		this.sintomas = sintomas;
		this.dataDeEntrada = dataDeEntrada;
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

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getDiagnostico() {
		return sintomas;
	}

	public void setDiagnostico(String diagnostico) {
		this.sintomas = diagnostico;
	}

	public Date getDataDeEntrada() {
		return dataDeEntrada;
	}

	public void setDataDeEntrada(Date dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	
	public List<String> getTratamentos() {
		return tratamentos;
	}

	public void setTratamentos(List<String> tratamentos) {
		this.tratamentos = tratamentos;
	}

	public void adicionarTratamentos(String tratamento) {
		tratamentos.add(tratamento);
	}
	
	@Override
	public String toString() {
		return "Paciente: "+ nome + "\nIdade: " + idade + "\nConvênio: " + convenio + "\nSintomas:" + sintomas
				+ "\nDataDeEntrada: " + sdf.format(dataDeEntrada);
	}

	

}
