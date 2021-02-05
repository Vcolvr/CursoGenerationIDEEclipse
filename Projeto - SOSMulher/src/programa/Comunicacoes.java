package programa;

public abstract class Comunicacoes {
	private String nome;
	private String endereco;
	private String telefoneParaRedes;
	private String email;
	
	public Comunicacoes() {
	}

	public Comunicacoes(String nome, String endereco, String telefoneParaRedes, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefoneParaRedes = telefoneParaRedes;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefoneParaRedes() {
		return telefoneParaRedes;
	}

	public void setTelefoneParaRedes(String telefoneParaRedes) {
		this.telefoneParaRedes = telefoneParaRedes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract String contato();

}
