package xadrez.pieces;

import tabuleiro.Posicao;
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
	
	@Override
	public boolean[][] movimentosPossiveis() {
		boolean[][] mat = new boolean[getTabuleiro().getLinha()][getTabuleiro().getColuna()];
		
		Posicao posicaoAux = new Posicao(0, 0);
		// Verifica posicoes acima
		posicaoAux.setValoresPosicao(posicao.getLinha() - 1, posicao.getColuna());
		
		while(getTabuleiro().positioExists(posicaoAux) && !getTabuleiro().existePieceNoTabuleiro(posicaoAux)) {
			/** Dado que não existe peças acima eu seto como True a possibilidade de ir para aquela posicao **/
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
			posicaoAux.setLinha(posicaoAux.getLinha() - 1);
		}
		
		if(getTabuleiro().positioExists(posicaoAux) && existeUmaPecaAdversariaNaPosicao(posicaoAux)) {
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
		}
		
		// Verifica posicoes abaixo
		posicaoAux.setValoresPosicao(posicao.getLinha() + 1, posicao.getColuna());
		
		while(getTabuleiro().positioExists(posicaoAux) && !getTabuleiro().existePieceNoTabuleiro(posicaoAux)) {
			/** Dado que não existe peças abaixo eu seto como True a possibilidade de ir para aquela posicao **/
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
			posicaoAux.setLinha(posicaoAux.getLinha() + 1);
		}
		
		if(getTabuleiro().positioExists(posicaoAux) && existeUmaPecaAdversariaNaPosicao(posicaoAux)) {
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
		}
		// Verifica posicoes pelo lado Esquerdo
		posicaoAux.setValoresPosicao(posicao.getLinha(), posicao.getColuna() - 1);
		
		while(getTabuleiro().positioExists(posicaoAux) && !getTabuleiro().existePieceNoTabuleiro(posicaoAux)) {
			/** Dado que não existe peças a Esquerda eu seto como True a possibilidade de ir para aquela posicao **/
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
			posicaoAux.setColuna(posicaoAux.getColuna() - 1);
		}
		
		if(getTabuleiro().positioExists(posicaoAux) && existeUmaPecaAdversariaNaPosicao(posicaoAux)) {
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
		}
		
		// Verifica posicoes pelo lado Direito
		posicaoAux.setValoresPosicao(posicao.getLinha(), posicao.getColuna() + 1);
		
		while(getTabuleiro().positioExists(posicaoAux) && !getTabuleiro().existePieceNoTabuleiro(posicaoAux)) {
			/** Dado que não existe peças a Direita eu seto como True a possibilidade de ir para aquela posicao **/
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
			posicaoAux.setColuna(posicaoAux.getColuna() + 1);
		}
		
		if(getTabuleiro().positioExists(posicaoAux) && existeUmaPecaAdversariaNaPosicao(posicaoAux)) {
			mat[posicaoAux.getLinha()][posicaoAux.getColuna()] = true;
		}
		
		
		return mat;
	}
}
