package xadrez.pieces;

import tabuleiro.Tabuleiro;
import xadrez.Color;
import xadrez.XadrezPiece;

public class Rei extends XadrezPiece {

	public Rei(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
	}

	@Override
	public String toString() {
		return "R";
	}
	
}
