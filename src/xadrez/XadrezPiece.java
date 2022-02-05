package xadrez;

import tabuleiro.Piece;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

/*public abstract class XadrezPiece extends Piece{
	
	private Color color;

	public XadrezPiece(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	protected boolean existeUmaPecaAdversariaNaPosicao(Posicao posicao) {
		XadrezPiece piece = (XadrezPiece) getTabuleiro().piece(posicao);
		return piece != null && piece.getColor() != this.color;
	}
}
*/

public abstract class XadrezPiece extends Piece {

	private Color color;
	private int moveCount;

	public XadrezPiece(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	protected void increaseMoveCount() {
		moveCount++;
	}

	protected void decreaseMoveCount() {
		moveCount--;
	}

	public XadrezPosition getXadrezPosition() {
		return XadrezPosition.fromPosicao(posicao);
	}
	
	protected boolean existeUmaPecaAdversariaNaPosicao(Posicao posicao) {
		XadrezPiece p = (XadrezPiece)getTabuleiro().piece(posicao);
		return p != null && p.getColor() != color;
	}
}