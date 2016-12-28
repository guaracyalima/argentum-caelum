/*
 * A classe Cadlestick informa o resumo diario das operações na bolsa
 * Informa o estado das ações.
 * */
package br.com.caelum.argentum.modelo;

import java.util.Calendar;

public final class Candlestick {
	
	private final double abertura;
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final double volume;
	private final Calendar data;
	public Candlestick(double abertura, double fechamento, double minimo, double maximo, double volume, Calendar data) {
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}
	public double getAbertura() {
		return abertura;
	}
	public double getFechamento() {
		return fechamento;
	}
	public double getMinimo() {
		return minimo;
	}
	public double getMaximo() {
		return maximo;
	}
	public double getVolume() {
		return volume;
	}
	public Calendar getData() {
		return data;
	}
	
	/*
	 * Os metodos a seguir informam se o candlestick é de alta ou baixa
	 * 
	 * */
	
	public boolean isAlta(){		
		//se a abertura é menor que o fehcamento, etnão esta em alta
		return this.abertura < this.fechamento;
	}
	
	public boolean isBaixa(){
		//se o fechamento é menor que a abertura, então é baixa
		return this.abertura > this.fechamento;
	}

	
	
}
