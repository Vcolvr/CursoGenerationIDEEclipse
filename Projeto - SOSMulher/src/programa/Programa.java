package programa;

import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		/*
		 * Fazer anota��es de redes de apoio, lugares para ficar. pop-up de liga��o se
		 * p� superclasse de comunica��o. Redes de apoio para quest�es psicol�gicas.
		 * Viol�ncias psicologicas e f�sicas se diferem na comunica��o Uber vai gratuito
		 * para delegacia da Mulher.
		 * int n = (int)(Math.random()*2.0+(1.0));
		 */
		Mulher Ana = new Mulher();
		int numeroDaOcorrencia = 1;
		String tipoDeOcorrencia = "Crime";
		Date momento = new Date();

		Ocorrencia ocorrencia = new Ocorrencia(numeroDaOcorrencia, tipoDeOcorrencia, momento);
		Ana.adicionarOcorrencia(ocorrencia);

	}

}
