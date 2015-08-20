package br.com.collectionJava.teste;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestandoQueue {

	public static void main(String[] args) {

		Queue<String> listaDeFila = new ArrayDeque<String>();
		String primerio;
		
		listaDeFila.add("QWEWEWQ");
		listaDeFila.add("QWEWEWQ1");
		listaDeFila.add("QWEWEWQ2");
		listaDeFila.add("QWEWEWQ3");
		listaDeFila.add("QWEWEWQ4");
		listaDeFila.add("QWEWEWQ5");
		listaDeFila.add("QWEWEWQ6");
		listaDeFila.add("QWEWEWQ7");
		listaDeFila.add("QWEWEWQ8");
		listaDeFila.add("QWEWEWQ9");
		
		
		listaDeFila.offer("TESTE");
		
		listaDeFila.add("dsadasdasdas");
		
		System.out.println("=====================================\n");
		
		System.out.println(listaDeFila);
		
		System.out.println("=====================================\n");
	
		
		primerio = listaDeFila.poll();
		
		System.out.println(listaDeFila);
		
		System.out.println("=====================================\n");
	
		
		System.out.println(primerio);
		
		
	}

}
