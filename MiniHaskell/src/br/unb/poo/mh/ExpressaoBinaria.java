package br.unb.poo.mh;

public abstract class ExpressaoBinaria implements Expressao {
	protected Expressao expDireita;
	protected Expressao expEsquerda; 
	
	public ExpressaoBinaria(Expressao expDireita, Expressao expEsquerda) {
		this.expDireita = expDireita;
		this.expEsquerda = expEsquerda;
	}
	
	public ExpressaoBinaria(Expressao expEsquerda) {
		this.expEsquerda = expEsquerda;
	}
	
}
