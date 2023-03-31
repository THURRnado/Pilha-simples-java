package atividadeListas;

public class PilhaEncadeada extends No{
	
	//definindo os atributos
		private No cabeca;
		private int tamanho;
		
		//fazendo com que a variavel No cabeca aponte para null e que a pilha receba tamanho 0
		public PilhaEncadeada() {
			
			this.cabeca = null;
			this.tamanho = 0;
			
		}
		
		//retorna se a pilha está vazia
		public boolean vazia() {
			if(this.tamanho == 0) return true; else return false;
		}
		
		//retorna o tamanho da pilha
		public int tamanho() {
			return this.tamanho;
		}
		
		//retorna o valor no topo da pilha
		public int lerTopo() {
			
			if(vazia()) return -1;
			
			No aux = cabeca;
			
			return aux.getConteudo();
			
		}
		
		//insere um valor no tpo da pilha
		public boolean insereTopo(int dado) {
			
			No novoNo = new No();
			
			novoNo.setConteudo(dado);
			
			if(vazia()) {
				
				novoNo = this.cabeca;
				
				this.tamanho++;
				
				return true;
				
			}else {
			
				novoNo.setProximo(this.cabeca);
				
				this.cabeca = novoNo;
				
				this.tamanho++;
			
			return true;
			}
			
		}
		
		//remove o elemento que está no topo da pilha
		public int removeTopo() {
			
			if(vazia()) return -1;
			
			No p = this.cabeca;
			int dado = p.getConteudo();
			
			
			this.cabeca = p.getProximo();
			this.tamanho--;
			
			p = null;
			
			return dado;
			
		}

}
