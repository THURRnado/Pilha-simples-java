package atividadeListas;

public class MainPilha {

	public static void main(String[] args) {

		Pilha p = new Pilha();
		
		p.insereTopo(1);
		p.insereTopo(2);
		p.insereTopo(3);
		
		System.out.println("Valor no topo da lista(antes da remoção): " + p.lerTopo());
		
		p.removeTopo();
		
		System.out.println("Valor no topo da lista(após a remoção): " + p.lerTopo());
		
		System.out.println("A pilha está vazia?: " + p.vazia());
		
		System.out.println("Tamanho da pilha: " + p.tamanho());
	}

}
