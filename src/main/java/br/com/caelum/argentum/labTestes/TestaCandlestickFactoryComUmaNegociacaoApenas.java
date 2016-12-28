package br.com.caelum.argentum.labTestes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class TestaCandlestickFactoryComUmaNegociacaoApenas {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		
		Negociacao n1 = new Negociacao(40.5, 100, hoje);
		Negociacao n2 = new Negociacao(30.5, 100, hoje);
		Negociacao n3 = new Negociacao(20.5, 100, hoje);
		Negociacao n4 = new Negociacao(10.5, 100, hoje);
		Negociacao n5 = new Negociacao(3.5, 100, hoje);
		Negociacao n6 = new Negociacao(2.5, 100, hoje);
		Negociacao n7 = new Negociacao(1.5, 100, hoje);
		Negociacao n8 = new Negociacao(3400.95, 100, hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(n1, n2, n3, n4, n5, n6, n7, n8);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		
		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		
		System.out.println(candle.getAbertura());
		System.out.println(candle.getFechamento());
		System.out.println(candle.getMinimo());
		System.out.println(candle.getMaximo());
		System.out.println(candle.getVolume());

	}

}
