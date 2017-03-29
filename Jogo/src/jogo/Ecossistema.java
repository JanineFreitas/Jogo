
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
	
	public boolean fimJogo(){
		for (int i = 0; i <= rio.length-1; i++) {
			if(rio[i] != null && rio[i].getClass() == Peixe.class){
				return false;
			}
		}
		return true;
	}
}
