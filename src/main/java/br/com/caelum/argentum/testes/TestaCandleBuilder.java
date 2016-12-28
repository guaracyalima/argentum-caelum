package br.com.caelum.argentum.testes;

import java.util.GregorianCalendar;

import br.com.caelum.argentum.builder.CandleBuilder;
import br.com.caelum.argentum.modelo.Candlestick;

public class TestaCandleBuilder {

	public static void main(String[] args) {
		
		Candlestick candle = new CandleBuilder().comAbertura(20.34).comFechamento(32.44).comMinimo(20).comMaximo(2000).comVolume(11111).comData(new GregorianCalendar(2015, 01, 12, 0, 0, 0)).geraCandle();
		
			}

}
