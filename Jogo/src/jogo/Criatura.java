package jogo;

import java.util.Random;

public class Criatura {
	int posicao;

	public Criatura() {
		Random gerador = new Random();
		posicao = gerador.nextInt(5);
	}

	public void mover(Ecossistema ecossitema) {
		remove(ecossitema);
		int i = posicao < 4 ? posicao + 1 : new Random().nextInt(4);
		posicao = i;
		add(ecossitema, i);
	}

	public void remove(Ecossistema ecossitema) {
		ecossitema.rio[posicao] = null;
	}

	public void add(Ecossistema ecossitema, int posicao) {
		ecossitema.rio[posicao] = this;
	}

	public boolean colidir(Ecossistema ecossitema, int posicaoAtual) {
		return false;
	}

	public static boolean posicaoAdjacente(Ecossistema ecossitema, int i) {
		boolean isColidiu = ecossitema.rio[i].colidir(ecossitema, i);
		if(ecossitema.fimJogoPeixe() == false && ecossitema.fimJogoUrso() == false){
			if (isColidiu == false) {
				ecossitema.rio[i].mover(ecossitema);
			}
			return true;
		} else {
			return false;
		}
	}
}
