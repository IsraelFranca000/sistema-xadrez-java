package xadrez.pieces;

import tabuleiro.Tabuleiro;
import xadrez.Color;
import xadrez.XadrezPiece;

public class Torre extends XadrezPiece{

	public Torre(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
	}
	
	
	@Override
	public String toString() {
		return "T";
	}
	
}
