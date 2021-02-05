package programa;

import java.util.ArrayList;
import java.util.List;

public class Mulher {

	protected String nome;
	protected Integer idade;
	protected String CPF;
	protected String endereco;
	protected String telefone;
	protected String email;
	private List<PessoaProxima> pessoas = new ArrayList<>();
	private List<Ocorrencia> ocorrencias = new ArrayList<>();
	
	public Mulher() {
	}

	public Mulher(String nome, int idade, String CPF, String endereco, String telefone, String email) {
		this.nome = nome;
		this.idade = idade;
		this.CPF = CPF;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
	
	// criar pergunta se tem pessoa proxima.
	public Mulher(String nome, Integer idade, String CPF, String endereco, String telefone, String email,
			List<PessoaProxima> pessoas) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.CPF = CPF;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.pessoas = pessoas;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<PessoaProxima> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<PessoaProxima> pessoas) {
		this.pessoas = pessoas;
	}

	public List<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(List<Ocorrencia> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public void adicionarOcorrencia(Ocorrencia ocorrencia) {
		ocorrencias.add(ocorrencia);
	}
	
	public void removerOcorrencia(Ocorrencia ocorrencia) {
		ocorrencias.remove(ocorrencia);
	}
	
	public void adicionarPessoaProxima(PessoaProxima pessoa) {
		pessoas.add(pessoa);
	}
	
	public void removerPessoaProxima(PessoaProxima pessoa) {
		pessoas.remove(pessoa);
	}
}
