package xadrez;

import tabuleiro.Posicao;

public class XadrezPosition {
	
	private char column;
	private int row;
	
	public XadrezPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new XadrezException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColuna() {
		return column;
	}

	public int getLinha() {
		return row;
	}

	protected Posicao toPosicao() {
		return new Posicao(8 - row, column - 'a');
	}
	
	protected static XadrezPosition fromPosicao(Posicao position) {
		return new XadrezPosition((char)('a' + position.getColuna()), 8 - position.getLinha());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
}