package xadrez.pieces;

import tabuleiro.Posicao;
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
	
	public boolean podeMover(Posicao posicao) {
		XadrezPiece piece = (XadrezPiece) getTabuleiro().piece(posicao);
		return piece != null && piece.getColor() != getColor();
	}



	@Override
	public boolean[][] movimentosPossiveis() {
		boolean[][] mat = new boolean[getTabuleiro().getLinha()][getTabuleiro().getColuna()];
		Posicao posicaoAux = new Posicao(0, 0);
		
		// Posicao Acima
		posicaoAux.setValoresPosicao(posicao.getLinha() - 1, posicao.getColuna());
		if(getTabuleiro().existePieceNoTabuleiro(posicaoAux) && podeMover(posicaoAux)) {
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
		}
		// Posicao Abaixo
		posicaoAux.setValoresPosicao(posicao.getLinha() + 1, posicao.getColuna());
		if(getTabuleiro().existePieceNoTabuleiro(posicaoAux) && podeMover(posicaoAux)) {
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
		}
		// Posicao a Esquerda
		posicaoAux.setValoresPosicao(posicao.getLinha(), posicao.getColuna() - 1);
		if(getTabuleiro().existePieceNoTabuleiro(posicaoAux) && podeMover(posicaoAux)) {
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
		}
		// Posicao a Direita
		posicaoAux.setValoresPosicao(posicao.getLinha(), posicao.getColuna() + 1);
		if(getTabuleiro().existePieceNoTabuleiro(posicaoAux) && podeMover(posicaoAux)) {
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
		}
		// Posicao Acima + Esquerda (NOROESTE)
		posicaoAux.setValoresPosicao(posicao.getLinha() - 1, posicao.getColuna() - 1);
		if(getTabuleiro().existePieceNoTabuleiro(posicaoAux) && podeMover(posicaoAux)) {
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
		}
		// Posicao Acima + Direita (NORDESTE)
		posicaoAux.setValoresPosicao(posicao.getLinha() - 1, posicao.getColuna() + 1);
		if(getTabuleiro().existePieceNoTabuleiro(posicaoAux) && podeMover(posicaoAux)) {
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
		}
		// Posicao Abaixo + Esquerda (SUDOESTE)
		posicaoAux.setValoresPosicao(posicao.getLinha() + 1, posicao.getColuna() - 1);
		if(getTabuleiro().existePieceNoTabuleiro(posicaoAux) && podeMover(posicaoAux)) {
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
		}
		// Posicao Abaixo + Direita (SUDESTE)
		posicaoAux.setValoresPosicao(posicao.getLinha() + 1, posicao.getColuna() + 1);
		if(getTabuleiro().existePieceNoTabuleiro(posicaoAux) && podeMover(posicaoAux)) {
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
		}
		
		return mat;
	}
	
}
