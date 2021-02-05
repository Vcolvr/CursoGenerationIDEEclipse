package programa;

public class Delegacia extends Comunicacoes{
	//Fazer as delegacias da mulher, tentar achar elas pelo bairro e se não acontecer, gerar uma aleatoriamente.
	public int DP;
	public String bairro;
	
	public Delegacia() {
	}

	public Delegacia(int DP, String bairro) {
		this.DP = DP;
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
		return "";
	}

}
