package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoNot;
import br.unb.poo.mh.ValorBooleano;


public class TesteExpressaoNot {

	private ValorBooleano vfalse = new ValorBooleano(false);
	private ValorBooleano vtrue = new ValorBooleano(true);
	private Expressao not = new ExpressaoNot(vfalse);
	private Expressao not2 = new ExpressaoNot(vtrue);
	
	@Test

	public void testeNotFalse() {
		Assert.assertEquals(vtrue, not.avaliar());
	}
	
	@Test
	public void testeNotTrue() {
		Assert.assertEquals(vfalse, not2.avaliar());
	}
	
}
