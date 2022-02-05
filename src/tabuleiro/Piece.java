package tabuleiro;

public abstract class Piece {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Piece(Tabuleiro board) {
		this.tabuleiro = board;
		posicao = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	public abstract boolean[][] movimentosPossiveis();
	
	public boolean movimentoPossivel(Posicao position) {
		return movimentosPossiveis()[position.getLinha()][position.getColuna()];
	}
	
	public boolean existePeloMenosUmMovimentoPossivel() {
		boolean[][] mat = movimentosPossiveis();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
