package Practico2Prog3;


public class Main {
	public static void main(String[] args) {
		ArbolBinario abb = new ArbolBinario();
		Node nodo = new Node(10);
		Node nodo1 = new Node(15);
		Node nodo2 = new Node(3);
		Node nodo3 = new Node(7);
		Node nodo4 = new Node(12);
		Node nodo5 = new Node(20);
		Node nodo6 = new Node(5);
		abb.insertar(nodo);
		abb.insertar(nodo1);
		abb.insertar(nodo2);
		abb.insertar(nodo3);
		abb.insertar(nodo4);
		abb.insertar(nodo5);
		abb.insertar(nodo6);

		abb.getFrontera();
		

	}

}
