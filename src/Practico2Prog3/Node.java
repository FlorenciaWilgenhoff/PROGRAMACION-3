package Practico2Prog3;

public class Node {
	protected Node izq;
	protected Node der;
	protected int valor; 

	public Node(Node izq, Node der, int valor) {
		this.izq = izq;
		this.der = der;
		this.valor = valor;
	}
	public Node (int valor){
		this.valor =  valor;
	}
	
	public void insertar( int valorInsertar) {
		if(valorInsertar<valor) {
			if(this.izq==null) {
				this.izq = new Node(valorInsertar);	
			}else {
				izq.insertar(valorInsertar);
			}
			
		}else {
			if(this.der==null) {
				this.der =new Node(valorInsertar); 	
			}else {
				der.insertar(valorInsertar);
			}
			
		}
	}
	
	public Node getIzq() {
		return this.izq;
	}
	public Node getDer() {
		return this.der;
	}
	public int getValor() {
		return this.valor;
	}
}
