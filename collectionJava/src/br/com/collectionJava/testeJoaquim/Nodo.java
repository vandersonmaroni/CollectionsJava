package br.com.collectionJava.testeJoaquim;


public class Nodo {
	private char data;
	private Nodo link;

	public Nodo() {
		link = null;

	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public Nodo getLink() {
		return link;
	}

	public void setLink(Nodo link) {
		this.link = link;
	}

}
