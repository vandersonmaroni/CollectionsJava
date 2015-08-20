package br.com.collectionJava.teste;

import java.util.ArrayList;

public class TestaArrayList {

	public static void main(String[] args) {

		ArrayList<String> listaDeString = new ArrayList<String>();
		
		
		listaDeString.add("Tdsadsad");
		listaDeString.add("Fdsfsdfasasd");
		listaDeString.add("Agwetgrfdfv");
		listaDeString.add("Maria");
		listaDeString.add("José");
		listaDeString.add("ghrtegvrefvd");
		
		System.out.println(listaDeString);
		
		ArrayList<String> listaAux = (ArrayList<String>) listaDeString.clone();
		
		if(listaDeString.contains("Maria")){
			System.out.println("Contém");
		}else{
			System.out.println("Não Contem");
		}
		
		System.out.println(listaAux);
		listaAux.clear();
		System.out.println("Listas");
		System.out.println(listaAux);
		System.out.println(listaDeString);
		
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		
		System.out.println(listaDeString.get(3)); //Pegar a Maria
		
		
		if(listaAux.isEmpty()){
			System.out.println("Vazio");
		}else{
			System.out.println("Não Vazio");
		}
		
		listaDeString.set(3,"Isadora");
		
		listaDeString.add(0,"Vanderson");
		
		System.out.println(listaDeString.size());
		listaDeString.remove(3);
		listaDeString.add(3,"");
		System.out.println(listaDeString);
		
		System.out.println(listaDeString.size());
		
		System.out.println("---------------------------");
		
		listaDeString.trimToSize();
		System.out.println(listaDeString);
		
		System.out.println("---------------------------");
		
		
		
		
	}

}
