package exerciciosAnimal;

import java.util.concurrent.TimeUnit;

public class Preguica extends Animal {
	private String humor;
	private double velocidadePorHora;

	public Preguica(String humor, double velocidadePorHora) {
		super();
		this.humor = humor;
		this.velocidadePorHora = velocidadePorHora;
	}

	public Preguica(String nome, int idade, String humor, double velocidadePorHora) {
		super(nome, idade);
		this.humor = humor;
		this.velocidadePorHora = velocidadePorHora;
	}

	public String getHumor() {
		return humor;
	}

	public void setHumor(String humor) {
		this.humor = humor;
	}

	public double getVelocidadePorHora() {
		return velocidadePorHora;
	}

	public void setVelocidadePorHora(double velocidadePorHora) {
		this.velocidadePorHora = velocidadePorHora;
	}

	@Override
	public String somAnimal() {
		return "Preguiça faz barulho???";
	}
	
	@Override
	public String movimenta(){
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
		    Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		System.out.println("A preguiça se mexeu beeeeeeeeeeem devagaaaaaaaaaaaar.............");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
		    Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		System.out.println("E se mexeu novamente mais devagar ainda!");
		return " ";
				
	}
}


