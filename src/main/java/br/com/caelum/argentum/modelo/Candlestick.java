/*
 * A classe Cadlestick informa o resumo diario das opera��es na bolsa
 * Informa o estado das a��es.
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
	 * Os metodos a seguir informam se o candlestick � de alta ou baixa
	 * 
	 * */
	
	public boolean isAlta(){		
		//se a abertura � menor que o fehcamento, etn�o esta em alta
		return this.abertura < this.fechamento;
	}
	
	public boolean isBaixa(){
		//se o fechamento � menor que a abertura, ent�o � baixa
		return this.abertura > this.fechamento;
	}

	
	
}
