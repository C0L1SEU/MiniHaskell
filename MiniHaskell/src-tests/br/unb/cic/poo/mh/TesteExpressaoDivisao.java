package br.unb.cic.poo.mh;

import org.junit.Assert;

import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoDivisao;
import br.unb.poo.mh.ValorInteiro;

public class TesteExpressaoDivisao {

	@Test
	public void testeExpressaoOk() {
		ValorInteiro v10 = new ValorInteiro(10);
		ValorInteiro v5 = new ValorInteiro(5);
		Expressao m = new ExpressaoDivisao(v10, v5);
		
		Assert.assertEquals(new ValorInteiro(2), m.avaliar());
	}
}