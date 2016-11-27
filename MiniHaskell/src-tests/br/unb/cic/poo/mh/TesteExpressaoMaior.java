package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoMaior;
import br.unb.poo.mh.ValorInteiro;
import br.unb.poo.mh.ValorBooleano;


public class TesteExpressaoMaior {

	private ValorInteiro v5 = new ValorInteiro(5);
	private ValorInteiro v10 = new ValorInteiro(10);
	private ValorBooleano vfalse = new ValorBooleano(false);
	private ValorBooleano vtrue = new ValorBooleano(true);
	private Expressao maior = new ExpressaoMaior(v5, v10);
	
	@Test

	public void testeMaiorFalse() {
		Assert.assertEquals(vfalse, maior.avaliar());
	}
	
	@Test
	public void testeMaiorTrue() {
		ValorInteiro v25 = new ValorInteiro(25);
		Expressao maior2 = new ExpressaoMaior(v25, v10);
		Assert.assertEquals(vtrue, maior2.avaliar());
	}
	
}