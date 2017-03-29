package jogo;

public class Peixe extends Criatura{
	public boolean colidir(Ecossistema ecossitema, int posicaoAtual) {
		int proximaPosicao = posicaoAtual + 1;
		if (posicaoAtual < 5) {
			if (ecossitema.rio[proximaPosicao] == null) {
				return false;
			} else if (this.getClass() == ecossitema.rio[proximaPosicao].getClass()) {
				if (ecossitema.espacoVazio()) {
					this.add(ecossitema, ecossitema.posicaoVazia());
				}
				return true;
			} else if (ecossitema.rio[proximaPosicao].getClass() == Urso.class) {
				//É um peixe e o próximo é um urso
				ecossitema.rio[posicaoAtual] = null;
				System.out.println("Peixe na posicao " + posicaoAtual + " morreu");
				return true;
			}
		}
		return false;
	}
}
