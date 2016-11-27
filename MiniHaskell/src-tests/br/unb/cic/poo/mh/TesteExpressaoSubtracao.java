package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoSubtracao;
import br.unb.poo.mh.ValorInteiro;


public class TesteExpressaoSubtracao {

	private ValorInteiro v5 = new ValorInteiro(5);
	private ValorInteiro v10 = new ValorInteiro(10);
	private Expressao subtracao = new ExpressaoSubtracao(v10, v5);
	
	@Test

	public void testeSubtracaoSimples() {
		ValorInteiro v5 = new ValorInteiro(5);
		
		Assert.assertEquals(v5, subtracao.avaliar());
	}
	
	@Test
	public void testeSubtracaoComplexa() {
		ValorInteiro v25 = new ValorInteiro(25);
		ValorInteiro v20 = new ValorInteiro(20);
		Expressao subtracao2 = new ExpressaoSubtracao(v25, subtracao);
		Assert.assertEquals(v20, subtracao2.avaliar());
	}
	
}