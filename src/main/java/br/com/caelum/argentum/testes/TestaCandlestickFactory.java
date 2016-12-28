package br.com.caelum.argentum.testes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class TestaCandlestickFactory {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance();
		
		Negociacao negociacao1 = new Negociacao(40.5, 100, hoje);
		Negociacao negociacao2 = new Negociacao(440.5, 100, hoje);
		Negociacao negociacao3 = new Negociacao(4.34, 100, hoje);
		Negociacao negociacao4 = new Negociacao(42.4, 100, hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(negociacao1,  negociacao2, negociacao3, negociacao4);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		
		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		
		System.out.println("\nValor de abertura "+candle.getAbertura());
		System.err.println("\nValor de fechamento "+candle.getFechamento());
		System.out.println("\nMaior valor negociado "+candle.getMaximo());
		System.err.println("\nMenor valor negociado "+candle.getMinimo());
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Valor negociado em moeda corrente  R$"+candle.getVolume());
		
		
		

	}

}
