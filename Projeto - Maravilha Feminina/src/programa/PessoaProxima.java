package programa;

public class PessoaProxima {
	private String nome;
	private String telefone;
	private String relacao;
	
	public PessoaProxima() {
	}

	public PessoaProxima(String nome, String telefone, String relacao) {
		this.nome = nome;
		this.telefone = telefone;
		this.relacao = relacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRelacao() {
		return relacao;
	}

	public void setRelacao(String relacao) {
		this.relacao = relacao;
	}
	
	
	
	
}
