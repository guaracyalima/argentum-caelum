package br.com.caelum.argentum.labTestes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class TestePETR3 {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance();
		
		Negociacao n1 = new Negociacao(30, 1, hoje);
		Negociacao n2 = new Negociacao(30, 0, hoje);
		
		
		List<Negociacao> negociacoes = Arrays.asList(n1, n2);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		System.out.println(candle.getAbertura());
		System.out.println(candle.getFechamento());
		System.out.println(candle.getMinimo());
		System.out.println(candle.getMaximo());
		System.out.println(candle.getVolume());
		System.out.println(candle.isAlta());
		System.out.println(candle.isBaixa());
		
		System.out.println("Issso ta uma bosta, compila com valores negativos");
		

	}

}
