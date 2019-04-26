package Practico2Prog3;

import java.util.ArrayList;

public class ArbolBinario {
	Node root;

	public void insertar(Node nodo) {
		int valor = nodo.getValor();
		if(root==null) {
			root = new Node(valor);
		}else{
			root.insertar(valor);
		}
	}
	

	public ArrayList<Node> getFrontera(){
		return getHijos(root);
	}


	public ArrayList<Node> getHijos(Node nodo) {
		ArrayList <Node>fronteraArbol= new ArrayList<Node>();
		if(nodo!=null){
			if(!tengoHijos(nodo)) {
				fronteraArbol.add(nodo);
			} else {
				if ((nodo.getIzq()!= null)){
					fronteraArbol.addAll(getHijos(nodo.getIzq()));
				}
				if ((nodo.getDer()!= null)){
					fronteraArbol.addAll(getHijos(nodo.getDer()));
				}

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

