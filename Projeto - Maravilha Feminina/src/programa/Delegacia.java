package programa;

public class Delegacia extends Comunicacoes{
	//Fazer as delegacias da mulher, tentar achar elas pelo bairro e se não acontecer, gerar uma aleatoriamente.
	private int DP;
	private String bairro;
	
	public Delegacia() {
	}

	public Delegacia(int DP, String bairro) {
		this.DP = DP;
		this.bairro = bairro;
	}

	public Delegacia(String nome, String email, int dP, String bairro) {
		super(nome, email);
		this.DP = dP;
		this.bairro = bairro;
	}

	public int getDP() {
		return DP;
	}

	public void setDP(int DP) {
		this.DP = DP;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Override
	public String contato() {
		return "A policia do DPº" + DP + " chegará em " + (int)(Math.random()*20.0+(5.0)) + " minutos!";
	}

}
