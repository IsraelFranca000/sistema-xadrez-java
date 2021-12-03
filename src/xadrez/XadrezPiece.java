package xadrez;

import tabuleiro.Piece;
import tabuleiro.Tabuleiro;

public class XadrezPiece extends Piece{
	
	private Color color;

	public XadrezPiece(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
}
