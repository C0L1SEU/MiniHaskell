package br.unb.cic.poo.mh;

import org.junit.Assert;
import org.junit.Test;

import br.unb.poo.mh.Expressao;
import br.unb.poo.mh.ExpressaoMenorIgual;
import br.unb.poo.mh.ValorInteiro;
import br.unb.poo.mh.ValorBooleano;


public class TesteExpressaoMenorIgual {

	private ValorInteiro v5 = new ValorInteiro(5);
	private ValorInteiro v10 = new ValorInteiro(10);
	private ValorBooleano vfalse = new ValorBooleano(false);
	private ValorBooleano vtrue = new ValorBooleano(true);
	private Expressao menor = new ExpressaoMenorIgual(v10, v5);
	
	@Test

	public void testeMenorFalse() {
		Assert.assertEquals(vfalse, menor.avaliar());
	}
	
	@Test
	public void testeMenorTrue() {
		ValorInteiro vv10 = new ValorInteiro(10);
		Expressao menor2 = new ExpressaoMenorIgual(v10, vv10);
		Assert.assertEquals(vtrue, menor2.avaliar());
	}
	
}