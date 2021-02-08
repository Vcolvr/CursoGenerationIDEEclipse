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
		if (tipoDeAcolhimento.equals("Psicológico")) {
			return "Sua solicitação de auxilio psicológico será respondida em até 3 dias úteis.";
		}
		else if (tipoDeAcolhimento.equals("Jurídico")) {
			return "Sua solicitação de auxilio jurídico será respondida em até 3 dias úteis."
					+ "\nA Casa das Advogadas não deixa nenhuma mulher na mão.";
		}
		else {
			return "Sua solicitação de auxilio psicológico e jurídico será respondida em até 3 dias úteis. ";
		}
	}

}
