package jogo;

public class Main {
	

	public static void main(String[] args) {
		Criatura[] criaturas = new Criatura[10];
		Ecossistema ecossitema = new Ecossistema(criaturas);
		
		popularVetor(ecossitema);
		andar(ecossitema);
	}

	private static void popularVetor(Ecossistema ecossitema) {
		for (int i = 0; i < ecossitema.rio.length / 2; i++) {
			Peixe p1 = new Peixe();

			if (p1.colidir(ecossitema) == false) {
				System.out.println(p1.colidir(ecossitema));
				p1.mover(ecossitema);
			} else {
				p1.add(ecossitema, p1.posicao);
			}

			Urso u1 = new Urso();
			if (u1.colidir(ecossitema) == false) {
				System.out.println(u1.colidir(ecossitema));
				u1.mover(ecossitema);
			} else {
				u1.add(ecossitema, u1.posicao);
			}

		}
	}
	
	private static void andar(Ecossistema ecossitema){
		for (int i = 0; i < ecossitema.rio.length; i++) {
			if(ecossitema.rio[i]!=null && ecossitema.rio[i].colidir(ecossitema)==false){
				ecossitema.rio[i].mover(ecossitema);
			}
		}
	}

}
