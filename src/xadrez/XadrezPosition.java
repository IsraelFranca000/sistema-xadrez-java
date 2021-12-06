package xadrez;

import tabuleiro.Posicao;

public class XadrezPosition {
	
	private char coluna;
	private int linha;
	
	public XadrezPosition(char coluna, int linha) {
		if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new XadrezException("Erro ao instanciar XadrezPosition: valores validos são de 'a1' até 'h8'.");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	protected Posicao toPosicao() {
		return new Posicao(8 - linha, coluna - 'a');
		// A formula para converter uma posição de linha dada é 8 (Quantidade de Posicões de linhas) - o numero informado da linha desejada
		// A formula para conveter uma posicao de coluna dada é LetraInformada - Caractere 'a' que resulta no valor da posicao de coluna desejada
	}
	
	protected static XadrezPosition fromPosicao(Posicao posicao) {
		return new XadrezPosition((char) ('a' - posicao.getColuna()), 8 - posicao.getLinha());
		// Realiza o passo inverso da funcao anterior, pois precisamos da conversão inversa também.
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}
	
	// -----------------------------------
	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}
}
