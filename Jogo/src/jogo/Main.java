package jogo;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Criatura[] criaturas = new Criatura[5];
		Ecossistema ecossitema = new Ecossistema(criaturas);

		Ecossistema.inicioJogo(ecossitema);
		
		while(ecossitema.fimJogoPeixe() == false && ecossitema.fimJogoUrso() == false){
			for (int i = 0; i < ecossitema.rio.length-1; i++) {
				if (ecossitema.rio[i] != null) {
					if(Criatura.posicaoAdjacente(ecossitema, i)==false){
						break;
					}
				} 	
				ecossitema.verRio();
			}
		}
		System.out.println("Fim do jogo");
		ecossitema.verRio();
	}

	public static int gerarNumeroAleatorio(int intervalo){
		Random gerador = new Random();
		int numero = gerador.nextInt(intervalo);
		return numero>0 ? numero : Main.gerarNumeroAleatorio(intervalo);
	}

}
