package tabuleiro;

public class Piece {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Piece (Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		this.posicao = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
}
