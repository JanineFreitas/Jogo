package jogo;

public class Urso extends Criatura{
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
			} else if (ecossitema.rio[proximaPosicao].getClass() == Peixe.class) {
				//É um urso e o próximo é um peixe
				mover(ecossitema);
				System.out.println("Peixe na posicao " + proximaPosicao + " morreu");
				return true;
			}
		}
		return false;
	}
}
