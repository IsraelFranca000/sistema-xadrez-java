package xadrez;

import tabuleiro.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
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
	
}
