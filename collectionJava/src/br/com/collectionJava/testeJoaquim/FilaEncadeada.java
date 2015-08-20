package br.com.collectionJava.testeJoaquim;

public class FilaEncadeada {
	private static Nodo topo;
	private static Nodo ultimo;
	private int size;

	public FilaEncadeada() {
		topo = new Nodo();
		topo.setLink(null);
		ultimo = new Nodo();
		ultimo.setLink(null);
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (topo == null)
			return true;
		return false;
	}

	public char front() {
		if (isEmpty()) {
			System.out.println("lista vazia");
		}
		return topo.getData();
	}

	public void store(char element) {
		Nodo v = new Nodo();
		v.setData(element);
		v.setLink(null);
		if (size() == 0) {
			topo = v;
		}

		ultimo.setLink(v);
		ultimo = v;
		size++;

	}

	public char retrivie() {
		if (isEmpty()) {
			System.out.println("Vazia");
		}
		char temp = topo.getData();
		topo = topo.getLink();
		size--;
		if (size() == 0)
			ultimo = null;
		return temp;
	}

	public void destroy() {
		topo = null;
		ultimo = null;
	}

	
	public static void main(String[] args) {
		FilaEncadeada fila = new FilaEncadeada();
		fila.store('A');
		fila.store('B');
		fila.store('C');
		fila.store('D');
		
		System.out.println("Primeiro elemento: " + fila.front());
		System.out.println("Ultimo: " + fila.ultimo.getData());

		while (!fila.isEmpty()) {
			System.out.println(fila.retrivie());
		}
		
		System.out.println(fila.isEmpty());
		
	}
}
