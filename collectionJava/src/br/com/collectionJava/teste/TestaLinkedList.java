package br.com.collectionJava.teste;

import java.util.Iterator;
import java.util.LinkedList;

public class TestaLinkedList {

	public static void main(String[] args) {

		LinkedList<String> linkedListString = new LinkedList<>();
		
		linkedListString.add("BLAS");
		linkedListString.add("dsada");
		linkedListString.add("weqewqS");
		linkedListString.add("fgewfSFA");
		linkedListString.add("qew1wda");
		linkedListString.add("zsdqwrq");
		linkedListString.add("adeqwrfd");

		System.out.println("Imprimento o LinkedList");
		System.out.println(linkedListString);
		
		Iterator<String> aux = linkedListString.descendingIterator();
		
		while(aux.hasNext()){
			System.out.println(aux.next());
		}
		
		
		System.out.println("-------------------");
		System.out.println("");
		
		
		System.out.println(linkedListString.element());

		
		System.out.println("-------------------");
		System.out.println("");
		
		System.out.println(linkedListString.getFirst());
		System.out.println(linkedListString.getLast());
		
		System.out.println("Posição do fgewfSFA: "+linkedListString.indexOf("fgewfSFA"));
		
	}

}
