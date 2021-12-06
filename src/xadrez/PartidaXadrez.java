package xadrez;

import tabuleiro.Tabuleiro;
import xadrez.pieces.Rei;
import xadrez.pieces.Torre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		initialSetup();
	}
	
	public XadrezPiece[][] getPieces(){
		XadrezPiece[][] mat = new XadrezPiece[tabuleiro.getLinha()][tabuleiro.getColuna()];
		
		for(int i = 0; i < tabuleiro.getLinha(); i++) {
			for(int j = 0; j < tabuleiro.getColuna(); j++) {
				mat[i][j] = (XadrezPiece) tabuleiro.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char coluna, int linha, XadrezPiece piece) {
		tabuleiro.placePiece(piece, new XadrezPosition(coluna, linha).toPosicao());
	}
	
	private void initialSetup() {
		
		placeNewPiece('c', 1, new Torre(tabuleiro, Color.WHITE));
		placeNewPiece('c', 2, new Torre(tabuleiro, Color.WHITE));
		placeNewPiece('d', 2, new Torre(tabuleiro, Color.WHITE));
		placeNewPiece('e', 2, new Torre(tabuleiro, Color.WHITE));
		placeNewPiece('e', 1, new Torre(tabuleiro, Color.WHITE));
		placeNewPiece('d', 1, new Rei(tabuleiro, Color.WHITE));

		placeNewPiece('c', 7, new Torre(tabuleiro, Color.BLACK));
		placeNewPiece('c', 8, new Torre(tabuleiro, Color.BLACK));
		placeNewPiece('d', 7, new Torre(tabuleiro, Color.BLACK));
		placeNewPiece('e', 7, new Torre(tabuleiro, Color.BLACK));
		placeNewPiece('e', 8, new Torre(tabuleiro, Color.BLACK));
		placeNewPiece('d', 8, new Rei(tabuleiro, Color.BLACK));
	}
	
}
