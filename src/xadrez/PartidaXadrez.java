package xadrez;

import tabuleiro.Posicao;
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
	
	public void initialSetup() {
		tabuleiro.placePiece(new Torre(tabuleiro, Color.WHITE), new Posicao(2, 1));
		tabuleiro.placePiece(new Rei(tabuleiro, Color.BLACK), new Posicao(0, 4));
		tabuleiro.placePiece(new Rei(tabuleiro, Color.WHITE), new Posicao(7, 4));
	}
	
}
