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
		int proximaPosicao = posicaoAtual+1;
		if (posicaoAtual < 5) {
			if(ecossitema.rio[proximaPosicao] == null){
				return false;
			}else if(this.getClass() == ecossitema.rio[proximaPosicao].getClass()) {
				if (ecossitema.fimJogo() == false && ecossitema.espacoVazio()){
					this.add(ecossitema, ecossitema.posicaoVazia());
				}
				return true;
			} else if (ecossitema.fimJogo() == false && this.getClass() == Urso.class && ecossitema.rio[proximaPosicao].getClass() == Peixe.class) {
				mover(ecossitema);
				System.out.println("Peixe na posicao " + proximaPosicao + " morreu");
				return true;
			} else if (ecossitema.fimJogo() == false && this.getClass() == Peixe.class && ecossitema.rio[proximaPosicao].getClass() == Urso.class){
				ecossitema.rio[posicaoAtual] = null;
				System.out.println("Peixe na posicao " + posicaoAtual + " morreu");
				return true;
			}
		}
		return false;
	}
}
