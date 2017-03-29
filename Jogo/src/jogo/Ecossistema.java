
package jogo;

public class Ecossistema {
	Criatura[] rio = new Criatura[5];
	
	public Ecossistema(Criatura[] criaturas){
		this.rio = criaturas;
	}
	
	public boolean espacoVazio(){
		for (int i = 0; i <= rio.length-1; i++) {
			if(rio[i] == null){
				return true;
			}
		}
		return false;
	}
	
	public int posicaoVazia(){
		for (int i = rio.length-1; i >= 0; i--) {
			if(rio[i] == null){
				return i;
			}
		}
		return 0;
	}
	
	public void verRio(){
		for (int i = 0; i <= rio.length-1; i++) {
			System.out.print(i+"-"+rio[i]+", ");
		}
		System.out.println();
	}
	
	public static void inicioJogo(Ecossistema ecossitema) {
		for (int i = 0; i < Main.gerarNumeroAleatorio(5); i++) {
			Peixe p1 = new Peixe();
			p1.add(ecossitema, p1.posicao);
			Urso u1 = new Urso();
			u1.add(ecossitema, u1.posicao);
		}
		ecossitema.verRio();
	}
	
	public boolean fimJogoPeixe(){
		for (int i = 0; i <= rio.length-1; i++) {
			if(rio[i] != null){
				if(rio[i].getClass() == Peixe.class){
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean fimJogoUrso(){
		for (int i = 0; i <= rio.length-1; i++) {
			if(rio[i] != null){
				if(rio[i].getClass() == Urso.class){
					return false;
				}
			}
		}
		return true;
	}
	

}
