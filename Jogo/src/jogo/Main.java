package jogo;

public class Main {

	public static void main(String[] args) {
		Peixe p1 = new Peixe();
		Urso u1 = new Urso();
		
		Criatura[] criaturas = new Criatura[100];
		
		Ecossistema ecosistema = new Ecossistema(criaturas);
		ecosistema.addCriatura(p1, p1.posicao);
		ecosistema.addCriatura(u1, u1.posicao);
		
		for (int i = 0; i < criaturas.length; i++) {
			ecosistema.addCriatura(p1, p1.posicao);
			ecosistema.addCriatura(u1, u1.posicao);			
		}
	}

}
