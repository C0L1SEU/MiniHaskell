package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoMenor;
import br.unb.poo.mh.ValorInteiro;
import br.unb.poo.mh.ValorBooleano;


public class TesteExpressaoMenor {

	private ValorInteiro v5 = new ValorInteiro(5);
	private ValorInteiro v10 = new ValorInteiro(10);
	private ValorBooleano vfalse = new ValorBooleano(false);
	private ValorBooleano vtrue = new ValorBooleano(true);
	private Expressao menor = new ExpressaoMenor(v10, v5);
	
	@Test

	public void testeMenorFalse() {
		Assert.assertEquals(vfalse, menor.avaliar());
	}
	
	@Test
	public void testeMenorTrue() {
		ValorInteiro v25 = new ValorInteiro(25);
		Expressao menor2 = new ExpressaoMenor(v10, v25);
		Assert.assertEquals(vtrue, menor2.avaliar());
	}
	
}