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
		placeNewPiece('b', 6, new Torre(tabuleiro, Color.WHITE));
		placeNewPiece('e' , 8, new Rei(tabuleiro, Color.BLACK));
		placeNewPiece('e', 1, new Rei(tabuleiro, Color.WHITE));
	}
	
}
