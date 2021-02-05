package programa;

import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		/*
		 * Fazer anotações de redes de apoio, lugares para ficar. pop-up de ligação se
		 * pá superclasse de comunicação. Redes de apoio para questões psicológicas.
		 * Violências psicologicas e físicas se diferem na comunicação Uber vai gratuito
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
