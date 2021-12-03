package tabuleiro;

public class Tabuleiro { // Tabuleiro ou Board
	
	private int linha;
	private int coluna;
	private Piece[][] pieces;
	
	public Tabuleiro(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		pieces = new Piece[linha][coluna];
	}

	
	public Piece piece(int linha, int coluna) {
		return pieces[linha][coluna];
	}
	
	public Piece piece(Posicao posicao) {
		return pieces[posicao.getLinha()][posicao.getColuna()];
	}
	
	// ----------------------------------------------
	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
}
