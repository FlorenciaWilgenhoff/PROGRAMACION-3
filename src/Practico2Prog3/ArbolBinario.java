package Practico2Prog3;

import java.util.ArrayList;

public class ArbolBinario {
	Node root;

	public void insertar(Integer valor) {
		if(root==null) {
			root = new Node(valor);
		}else{
			root.insertar(valor);
		}
	}
	

	public ArrayList<Integer> getFrontera(){
		return getHijos(root);
	}


	public ArrayList<Integer> getHijos(Node nodo) {
		ArrayList <Integer>fronteraArbol= new ArrayList<Integer>();
		if(nodo!=null){
			if(!tengoHijos(nodo)) {
				fronteraArbol.add(nodo.getValor());
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

