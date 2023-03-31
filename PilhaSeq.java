package atividadeListas;

public class PilhaSeq {

	private int tamMax;
	private int tamAtual;
	private int[] dados;
	
	public PilhaSeq() {
		tamMax = 100;
		tamAtual = 0;
		dados = new int[tamMax];
	}
	
	public boolean vazia() {
		if(tamAtual == 0) return true; else return false;
	}
	
	public boolean cheia() {
		if(tamAtual == tamMax) return true; else return false;
	}
	
	public boolean insereTopo(int dado) {
		
		if(cheia()) return false;
		
		dados[tamAtual] = dado;
		
		tamAtual++;
		
		return true;
	}
	
	public int removeTopo() {
		int dado;
		
		if(vazia()) return -1;
		
		dado = dados[tamAtual-1];
		
		tamAtual--;
		
		return dado;
		
	}
	
	public int tamanho() {
		
		return tamAtual;
		
	}
	
	public int lerTopo() {
		
		if(vazia()) return -1;
		
		return dados[tamAtual-1];
		
	}
 	
}
