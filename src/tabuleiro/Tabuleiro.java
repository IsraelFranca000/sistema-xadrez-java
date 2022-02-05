package tabuleiro;

public class Tabuleiro { // Tabuleiro ou Board

	private int linhas;
	private int colunas;
	private Piece[][] pieces;

	public Tabuleiro(int linha, int coluna) {
		if(linha < 1 || coluna < 1)
			throw new TabuleiroException("Erro criando tabuleiro: e necessario que haja pelo menos 1 linha e 1 coluna.");
		this.linhas = linha;
		this.colunas = coluna;
		pieces = new Piece[linha][coluna];
	}


	public Piece piece(int linha, int coluna) {
		if(!positioExists(linha, coluna))
			throw new TabuleiroException("Posicao nao existe no tabuleiro");
		return pieces[linha][coluna];
	}

	public Piece piece(Posicao posicao) {
		if(!positioExists(posicao))
			throw new TabuleiroException("Posicao nao existe no tabuleiro");
		return pieces[posicao.getLinha()][posicao.getColuna()];
	}

	public void placePiece(Piece piece, Posicao posicao) {
		if(existePieceNoTabuleiro(posicao))
			throw new TabuleiroException("ja existe uma peca nessa posicao: " + posicao);
		pieces[posicao.getLinha()][posicao.getColuna()] = piece;
		piece.posicao = posicao;
	}
	
	public Piece removePiece(Posicao posicao) {
		
		if(!positioExists(posicao)) {
			throw new TabuleiroException("Posicao nao existe no tabuleiro");
		}
		
		if(piece(posicao) == null) {
			return null;
		}
		
		Piece aux = piece(posicao);
		aux.posicao = null;
		pieces[posicao.getLinha()][posicao.getColuna()] = null;
		
		return aux;
	}

	public boolean positioExists (int linha, int coluna) {
		return linha >= 0 && linha < this.linhas && coluna >= 0 && coluna < this.colunas;
	}

	public boolean positioExists (Posicao posicao) {
		return positioExists(posicao.getLinha(), posicao.getColuna());
	}

	public boolean existePieceNoTabuleiro(Posicao posicao) {
		if(!positioExists(posicao))
			throw new TabuleiroException("Posicao nao existe no tabuleiro");
		return piece(posicao) != null;
	}
	
	// ----------------------------------------------
	public int getLinha() {
		return linhas;
	}

	public int getColuna() {
		return colunas;
	}

}
