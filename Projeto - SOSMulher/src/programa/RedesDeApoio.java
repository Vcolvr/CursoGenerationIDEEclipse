package programa;

public class RedesDeApoio extends Comunicacoes {
	private String tipoDeAcolhimento;

	public RedesDeApoio(String tipoDeAcolhimento) {
		super();
		this.tipoDeAcolhimento = tipoDeAcolhimento;
	}

	public RedesDeApoio(String nome, String email, String tipoDeAcolhimento) {
		super(nome, email);
		this.tipoDeAcolhimento = tipoDeAcolhimento;
	}

	public String getTipoDeAcolhimento() {
		return tipoDeAcolhimento;
	}

	public void setTipoDeAcolhimento(String tipoDeAcolhimento) {
		this.tipoDeAcolhimento = tipoDeAcolhimento;
	}

	@Override
	public String contato() {
		if (tipoDeAcolhimento.equals("Psicol�gico")) {
			return "Sua solicita��o de auxilio psicol�gico ser� respondida em at� 3 dias �teis."
					+"\nFique tranquila, " + Mulher.class.getName() + ", estamos juntos com voc� nesta.";
		}
		else if (tipoDeAcolhimento.equals("Psicol�gico e Jur�dico")) {
			return "Sua solicita��o de auxilio psicol�gico e jur�dico ser� respondida em at� 3 dias �teis. "
					+"\nFique tranquila, " + Mulher.class.getName() + ", estamos juntos com voc� nesta.";
		}
		else {
			return "Sua solicita��o de auxilio jur�dico ser� respondida em at� 3 dias �teis."
					+ "\nA Casa das Advogadas n�o deixa nenhuma mulher na m�o.";
		}
	}

}
