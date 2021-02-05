package programa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ocorrencia {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm");
	//Switcher, que transforma 1 ou 2 em emergencial e não emergencial
	private Integer numeroDeOcorrencia;
	private String opcaoDaOcorrencia;
	private Date momentoDaOcorrencia;
	//Se pá tentar gerar um arquivo de pré-boletim;
	//private String pré documento (método);
	
	public Ocorrencia(Integer numeroDeOcorrencia, String opcaoDaOcorrencia, Date momentoDaOcorrencia) {
		super();
		this.numeroDeOcorrencia = numeroDeOcorrencia;
		this.opcaoDaOcorrencia = opcaoDaOcorrencia;
		this.momentoDaOcorrencia = momentoDaOcorrencia;
	}

	public Integer getNumeroDeOcorrencia() {
		return numeroDeOcorrencia;
	}

	public void setNumeroDeOcorrencia(Integer numeroDeOcorrencia) {
		this.numeroDeOcorrencia = numeroDeOcorrencia;
	}

	public String getOpcaoDaOcorrencia() {
		return opcaoDaOcorrencia;
	}

	public void setOpcaoDaOcorrencia(String opcaoDaOcorrencia) {
		this.opcaoDaOcorrencia = opcaoDaOcorrencia;
	}

	public Date getMomentoDaOcorrencia() {
		return momentoDaOcorrencia;
	}

	public void setMomentoDaOcorrencia(Date momentoDaOcorrencia) {
		this.momentoDaOcorrencia = momentoDaOcorrencia;
	}
	
	//public File preOcorrencia() {
	//}
	

}
