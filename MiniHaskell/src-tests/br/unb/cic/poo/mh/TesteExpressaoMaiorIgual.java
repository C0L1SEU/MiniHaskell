package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoMaiorIgual;
import br.unb.poo.mh.ValorInteiro;
import br.unb.poo.mh.ValorBooleano;


public class TesteExpressaoMaiorIgual {

	private ValorInteiro v5 = new ValorInteiro(5);
	private ValorInteiro v10 = new ValorInteiro(10);
	private ValorBooleano vfalse = new ValorBooleano(false);
	private ValorBooleano vtrue = new ValorBooleano(true);
	private Expressao maior = new ExpressaoMaiorIgual(v5, v10);
	
	@Test

	public void testeIgualFalse() {
		Assert.assertEquals(vfalse, maior.avaliar());
	}
	
	@Test
	public void testeIgualTrue() {
		ValorInteiro vv10 = new ValorInteiro(10);
		Expressao maior2 = new ExpressaoMaiorIgual(vv10, v10);
		Assert.assertEquals(vtrue, maior2.avaliar());
	}
	
}
