package br.unb.poo.mh;

public class ExpressaoNot extends ExpressaoBinaria {

	public ExpressaoNot(Expressao expEsquerda) {
		super(expEsquerda);
	}

	@Override
	public Valor avaliar() {
		ValorBooleano v1 = (ValorBooleano) expEsquerda.avaliar();

		return new ValorBooleano(!v1.getValor());
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