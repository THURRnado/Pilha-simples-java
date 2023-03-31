package atividadeListas;

public class MainPilha {

	public static void main(String[] args) {

		PilhaSeq p1 = new PilhaSeq();
		PilhaEncadeada p2 = new PilhaEncadeada();
		
		p1.insereTopo(1);
		p1.insereTopo(2);
		p1.insereTopo(3);
		
		System.out.println("(sequencial)Valor no topo da lista(antes da remoção): " + p1.lerTopo());
		
		p1.removeTopo();
		
		System.out.println("(sequencial)Valor no topo da lista(após a remoção): " + p1.lerTopo());
		
		System.out.println("(sequencial)A pilha está vazia?: " + p1.vazia());
		
		System.out.println("(sequencial)Tamanho da pilha: " + p1.tamanho());
		
		System.out.println();
		System.out.println();

		
		p2.insereTopo(4);
		p2.insereTopo(5);
		p2.insereTopo(6);
		
		System.out.println("(encadeada)Valor no topo da lista(antes da remoção): " + p2.lerTopo());
		
		p2.removeTopo();
		
		System.out.println("(encadeada)Valor no topo da lista(após a remoção): " + p2.lerTopo());
		
		System.out.println("(encadeada)A pilha está vazia?: " + p2.vazia());
		
		System.out.println("(encadeada)Tamanho da pilha: " + p2.tamanho());
		
	}

}
