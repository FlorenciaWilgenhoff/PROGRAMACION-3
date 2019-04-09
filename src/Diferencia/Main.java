package Diferencia;

import Diferencia.MiIterador;
import Diferencia.MiLista;

public class Main {

	public static void main(String[] args) {

		MiLista l1 = new MiLista();
		MiLista l2 = new MiLista();
		
		l1.addFront(1);
		l1.addFront(2);
		l1.addFront(4);
		l1.addFront(6);
		l1.addFront(8);
		l1.addFront(9);
		
		l2.addFront(1);
		l2.addFront(7);
		l2.addFront(5);
		l2.addFront(6);
		l2.addFront(3);
		l2.addFront(2);
		
		MiLista l3 = diferencia(l1,l2); 
		
		
		System.out.println("Recorro la tercer lista");
		for (Object info: l3) {
			System.out.println("Elemento: " + info);
		}

	}
	public static MiLista diferencia(MiLista l1, MiLista l2) {
		MiIterador iterador = l1.iterator();
		MiLista aux = new MiLista();
		
		while(iterador.hasNext()){
			Object e = iterador.next();
			if(l2.noExists(e)){
				aux.addFront(e);
			}
		}
		return aux;
	}
}