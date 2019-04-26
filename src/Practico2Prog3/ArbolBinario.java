package Practico2Prog3;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinario {
	Node root;
	ArrayList <Node>fronteraArbol= new ArrayList<Node>();


	public void insertar(Node nodo) {
		int valor = nodo.getValor();
		if(root==null) {
			root = new Node(valor);
		}else{
			root.insertar(valor);
		}
	}
	public void add(Node nodo){
		fronteraArbol.add(nodo);
	}
	public ArrayList<Node> getFrontera(Node nodo) {
		if(nodo!=null){
			if(tengoHijos(nodo)) {
				fronteraArbol.add(nodo);
			}
		}
			if ((nodo.getIzq()!= null)){
				getFrontera(nodo.getIzq());
			}else{
				if ((nodo.getDer()!= null)){
					getFrontera(nodo.getDer());
				}
			}
			

		return fronteraArbol;
	}

	public boolean tengoHijos(Node nodo) {
		if ((nodo.getIzq()==null)&&(nodo.getDer()==null)){
			return false;
		}else {
			return true;
		}
	}

}