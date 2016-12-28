package br.com.caelum.argentum.modelo;

import java.util.Calendar;

public final class Negociacao {
	
	private final double preco;
		
	private final int quantidade;
	
	private final Calendar data;
	
	public Negociacao(double preco, int quantidade, Calendar data) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Calendar getData() {
		return data;
	}
	
	/*
	 * metodo que retorna o volume das negocia��es
	 * ou seja, a quantidade de dinheiro empregada na transa��o.
	 * */
	public double getVolume(){
		return preco * quantidade;
	}
	

}
