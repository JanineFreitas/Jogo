package jogo;

import java.util.Random;

public class Criatura {
	int posicao;
	
	public Criatura(){
		Random gerador = new Random();
		posicao = gerador.nextInt(9);
	}

	public void mover(Ecossistema ecossitema){
		remove(ecossitema);
		int i = posicao < 9 ? posicao+1 : new Random().nextInt(8);
		posicao = i;
		add(ecossitema, i);
	}

	public void remove(Ecossistema ecossitema){
		System.out.println("\nRemovendo " +this+ " na posicao: "+posicao);
		ecossitema.rio[posicao]=null;
	}
	
	public void add(Ecossistema ecossitema, int posicao){
		System.out.println("Adicionando " +this+ " na posicao: "+posicao);
		ecossitema.rio[posicao]=this;
	}
	
	public boolean colidir(Ecossistema ecossitema){
		int i = posicao+1;
		if(posicao < 9 && ecossitema.rio[i]!= null && this.getClass() == ecossitema.rio[i].getClass()){
			return true;
		}
		return false;
	}
}
