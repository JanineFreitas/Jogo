package jogo;

public class Main {

	public static void main(String[] args) {
		Criatura[] criaturas = new Criatura[5];
		Ecossistema ecossitema = new Ecossistema(criaturas);

		popularVetor(ecossitema);
		
		while(ecossitema.fimJogo() == false){
			andar(ecossitema);
		}
		System.out.println("Fim do jogo");
		ecossitema.verRio();
	}

	private static void popularVetor(Ecossistema ecossitema) {
		for (int i = 0; i < 5; i++) {
			Peixe p1 = new Peixe();
			Urso u1 = new Urso();
			if (ecossitema.espacoVazio() == true) {
				p1.add(ecossitema, p1.posicao);
				u1.add(ecossitema, u1.posicao);
			}
		}
		ecossitema.verRio();
	}

	private static void andar(Ecossistema ecossitema) {
		boolean isColidiu = false;
		for (int i = 0; i < ecossitema.rio.length-1; i++) {
			if (ecossitema.rio[i] != null) {
				isColidiu = ecossitema.rio[i].colidir(ecossitema, i);
				if (isColidiu == false && ecossitema.fimJogo() == false) {
					ecossitema.rio[i].mover(ecossitema);
				} 
			}
			ecossitema.verRio();
		}
	}

}
