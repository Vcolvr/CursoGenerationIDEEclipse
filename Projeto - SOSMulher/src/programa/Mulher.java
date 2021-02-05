package programa;

public class Mulher {

	protected String nome;
	protected int idade;
	protected String CPF;
	protected String endereco;
	protected String telefone;
	
	public Mulher() {
	}

	public Mulher(String nome, int idade, String CPF, String endereco, String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.CPF = CPF;
		this.endereco = endereco;
		this.telefone = telefone;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCPF() {
		return CPF;
	}

	
}
