package jogo;

public class Ecossistema {
	Criatura[] vetor = new Criatura[100];
	
	public Ecossistema(Criatura[] criaturas){
		this.vetor = criaturas;
	}
	
	public void addCriatura(Criatura c, int posicao){
		System.out.println("Adicionando " +c.getClass()+ " na posicao: "+posicao);
		vetor[posicao] = c;
	}
	
	private void removerCriatura(Criatura c, int posicao){
		System.out.println("\nRemovendo " +c.getClass()+ " na posicao: "+posicao);
		vetor[posicao] = null;
	}
	
	public void atualizarVetor(Criatura c, int posicao){
		removerCriatura(c, posicao);
		addCriatura(c, c.novaPosicao());
	}
}
