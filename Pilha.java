package atividadeListas;

public class Pilha {

	private int tamMax;
	private int tamAtual;
	private int[] dados;
	
	public Pilha() {
		tamMax = 100;
		tamAtual = 0;
		dados = new int[tamMax];
	}
	
	//verifica se a pilha está vazia
	public boolean vazia() {
		if(tamAtual == 0) return true; else return false;
	}
	
	//verifica se a pilha está cheia
	public boolean cheia() {
		if(tamAtual == tamMax) return true; else return false;
	}
	
	//insere o dado apontando no topo da pilha
	public boolean insereTopo(int dado) {
		
		if(cheia()) return false;
		
		dados[tamAtual] = dado;
		
		tamAtual++;
		
		return true;
	}
	
	//remove o dado do topo da pilha
	public int removeTopo() {
		int dado;
		
		if(vazia()) return -1;
		
		dado = dados[tamAtual];
		
		tamAtual--;
		
		return dado;
		
	}
	
	//retorna o tamanho atual da pilha
	public int tamanho() {
		
		return tamAtual;
		
	}
	
	//retorna o valor presente no topo da pilha
	public int lerTopo() {
		
		if(vazia()) return -1;
		
		return dados[tamAtual-1];
		
	}
 	
}
