package atividadeListas;

public class MainPilha {

	public static void main(String[] args) {

		//instanciando o objeto Pilha
		Pilha p = new Pilha();
		
		//inserindo três elementos na pilha
		p.insereTopo(1);
		p.insereTopo(2);
		p.insereTopo(3);
		
		//mostrando o valor presente no topo da lista 
		System.out.println("Valor no topo da lista(antes da remoção): " + p.lerTopo());
		
		//removendo o valor qu está no topo
		p.removeTopo();
		
		//mostrando novamente o valor presente no topo da lista
		System.out.println("Valor no topo da lista(após a remoção): " + p.lerTopo());
		
		//mostrando se a lista está vazia
		System.out.println("A pilha está vazia?: " + p.vazia());
		
		//retornando o tamanho da pilha
		System.out.println("Tamanho da pilha: " + p.tamanho());
	}

}
