package Diferencia;


public class MiLista implements Iterable<Object> {

	private MiNodo first;
	private int size;

	public MiLista() {
		this.first = null;
		this.size = 0;
	}

	/**
	* Agrega la información recibida por parametro al principio de la lista.
	* @param info Objeto que se quiere almacenar.
	*/
	public void addFront(Object info) {
		MiNodo nuevoNodo = new MiNodo(info,this.first);
		this.first = nuevoNodo;
		this.size++;
	}

	/**
	* Elimina el primer elemento de la lista y retorna el valor que tenia almacenado.
	* @return El valor que habia almacenado en el primer elemento de la lista.
	*/
	public Object removeFront() {
		Object info = this.first.getInfo();
		this.first = this.first.getNext();
		this.size--;
		return info;
	}

	/**
	* Retorna la informacion almacenada en la posicion determinada por index.
	* El primer elemento de la lista es la posicion 0.
	* @param index Posicion del elemento que se quiere.
	* @return Valor almacenado en la posicion index.
	*/
	public Object get(int index) {
		int contador = 0; // Si se quiere que la primer posicion sea la 1 (y no la 0) inicializar el contador en 1.

		MiNodo temporal = this.first;
		while (contador < index) {
			contador++;
			temporal = temporal.getNext();
		}

		return temporal.getInfo();
	}

	/**
	* Retorna el tamaño de la lista recorriendola desde inicio a fin.
	* Complejidad O(n) siendo n la cantidad de nodos en la lista.
	* @return Tamaño de la lista.
	*/
	public int count() {
		int contador = 0;

		MiNodo temporal = this.first;
		while (temporal != null) {
			contador++;
			temporal = temporal.getNext();
		}

		return contador;
	}

	/**
	* Retorna el tamaño de la lista retornando el valor de la variable size. 
	* Complejidad O(1).
	* @return Tamaño de la lista.
	*/
	public int size() {
		return size;
	}

	/**
	* Retorna true si la lista esta vacia, o false si la lista tiene al menos un elemento.
	* @return Boolean que responde a la pregunta ¿Esta vacia la lista?
	*/
	public boolean isEmpty() {
		return this.first == null;
		// Alternativa: return this.size == 0;
	}

	@Override
	public MiIterador iterator() {
		// Creo un iterador para recorrer mi lista. Para eso le doy una referencia a mi primer nodo.
		// ¿Porque no es ruptura de encapsulamiento?
		// Porque nadie esta accediendo a mi nodo desde afuera.
		// YO (como lista) se lo doy a la clase MiIterador (clase en la cual confio que no va a hacer nada indebido)
		return new MiIterador(this.first);
	}

	public boolean noExists(Object e){
		MiIterador iterador = this.iterator();
		while(iterador.hasNext()){
			Object elemento = iterador.next();
			if(e.equals(elemento)){
				return false;
			}
		}
		return true;
	}

}