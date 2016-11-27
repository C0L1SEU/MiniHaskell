package br.unb.poo.mh;

public class ExpressaoAnd extends ExpressaoBinaria {

	public ExpressaoAnd(Expressao expDireita, Expressao expEsquerda) {
		super(expDireita, expEsquerda);
	}

	@Override
	public Valor avaliar() {
		ValorBooleano v1 = (ValorBooleano) expEsquerda.avaliar();
		ValorBooleano v2 = (ValorBooleano) expDireita.avaliar();

		return new ValorBooleano(v2.getValor() && v1.getValor());
	}

	@Override
	public Tipo tipo() {
		return (expEsquerda.tipo() == Tipo.Booleano && expDireita.tipo() == Tipo.Booleano) ? Tipo.Booleano : Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

}