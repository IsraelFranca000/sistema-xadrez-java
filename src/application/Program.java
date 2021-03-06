package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.XadrezException;
import xadrez.XadrezPiece;
import xadrez.XadrezPosition;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		
		while(true) { // Com tratamento de Exce??o
			try {
				UI.clearScreen();
				
				UI.printTabuleiro(partidaXadrez.getPieces());
				System.out.println();
				System.out.print("Posicao Origem: ");
				XadrezPosition origem = UI.lendoPosicaoXadrez(scan);
				
				boolean[][] movimentosPossiveis = partidaXadrez.movimentosPossiveis(origem);
				UI.clearScreen();
				UI.printTabuleiro(partidaXadrez.getPieces(), movimentosPossiveis);
				
				System.out.println();
				System.out.print("Posicao Destino: ");
				XadrezPosition destino = UI.lendoPosicaoXadrez(scan);
				
				
				XadrezPiece pieceCapturada = partidaXadrez.performXadrezMove(origem, destino);
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				scan.nextLine();
			}
		}
	}
}
