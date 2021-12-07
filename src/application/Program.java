package application;

import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.XadrezPiece;
import xadrez.XadrezPosition;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		
		while(true) {
			UI.printTabuleiro(partidaXadrez.getPieces());
			System.out.println();
			System.out.print("Posicao Origem: ");
			XadrezPosition origem = UI.lendoPosicaoXadrez(scan);
			System.out.println();
			System.out.print("Posicao Destino: ");
			XadrezPosition destino = UI.lendoPosicaoXadrez(scan);
			
			XadrezPiece pieceCapturada = partidaXadrez.performXadrezMove(origem, destino);
		}
	}
}
