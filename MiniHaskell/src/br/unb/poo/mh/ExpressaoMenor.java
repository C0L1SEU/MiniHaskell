package br.unb.poo.mh;

public class ExpressaoMenor extends ExpressaoBinaria {

	public ExpressaoMenor(Expressao expDireita, Expressao expEsquerda) {
		super(expDireita, expEsquerda);
	}

	@Override
	public Valor avaliar() {
		ValorInteiro v1 = (ValorInteiro) expEsquerda.avaliar();
		ValorInteiro v2 = (ValorInteiro) expDireita.avaliar();

		return new ValorBooleano(v2.getValor() < v1.getValor());
	}

	@Override
	public Tipo tipo() {
		return (expEsquerda.tipo() == Tipo.Inteiro && expDireita.tipo() == Tipo.Inteiro) ? Tipo.Inteiro : Tipo.Error;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

}