package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoOr;
import br.unb.poo.mh.ValorBooleano;


public class TesteExpressaoOr {

	private ValorBooleano vfalse = new ValorBooleano(false);
	private ValorBooleano vtrue = new ValorBooleano(true);
	private ValorBooleano vtrue2 = new ValorBooleano(true);
	private ValorBooleano vfalse2 = new ValorBooleano(false);
	private Expressao or1 = new ExpressaoOr(vtrue, vfalse);
	private Expressao or2 = new ExpressaoOr(vtrue, vtrue2);
	private Expressao or3 = new ExpressaoOr(vfalse, vfalse2);
	
	@Test

	public void testeOrFalse() {
		Assert.assertEquals(vfalse, or3.avaliar());
	}
	
	@Test
	public void testeOrTrue() {
		Assert.assertEquals(vtrue, or2.avaliar());
		Assert.assertEquals(vtrue, or1.avaliar());
	}
	
}