package jogo;

import java.util.Random;

public class Criatura {
	int posicao;

	protected int novaPosicao() {
		Random gerador = new Random();
		posicao = gerador.nextInt(100);
		return posicao;
	}

}
