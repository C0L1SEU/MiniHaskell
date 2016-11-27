package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoIgual;
import br.unb.poo.mh.ValorInteiro;
import br.unb.poo.mh.ValorBooleano;


public class TesteExpressaoIgual {

	private ValorInteiro v5 = new ValorInteiro(5);
	private ValorInteiro v10 = new ValorInteiro(10);
	private ValorBooleano vfalse = new ValorBooleano(false);
	private ValorBooleano vtrue = new ValorBooleano(true);
	private Expressao igual = new ExpressaoIgual(v5, v10);
	
	@Test

	public void testeIgualFalse() {
		Assert.assertEquals(vfalse, igual.avaliar());
	}
	
	@Test
	public void testeIgualTrue() {
		ValorInteiro vv10 = new ValorInteiro(10);
		Expressao igual2 = new ExpressaoIgual(v10, vv10);
		Assert.assertEquals(vtrue, igual2.avaliar());
	}
	
}