package com.mitocode.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionApp {
	
	private List<String> lista;
	
	public void llenarLista() {
		lista = new ArrayList<>();
		
		lista.add("MitoCode");
		lista.add("Mito");
		lista.add("Code");
		
	}
	
	public void usarForEach() {
		//old way
		/*
		for(String elemento : lista) {
			System.out.println(elemento);
		}
		*/
		
		
		//lista.forEach(x -> System.out.println(x));
		
		
		lista.forEach(System.out::println);
		
	}
	
	public void usarRemoverIf() {
		/*
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			if(it.next().equalsIgnoreCase("Code")) {
				it.remove();
			}
		}
		*/
		
		lista.removeIf(x -> x.equalsIgnoreCase("Code"));
		
	}
	
	public void usarSort() {
		lista.sort((x,y) -> x.compareTo(y));
	}

	public static void main(String[] args) {
		ColeccionApp app = new ColeccionApp();
		app.llenarLista();
		
		//For each
		//app.usarForEach();
		
		//RemoveIf
		/*
		app.usarRemoverIf();
		app.usarForEach();
		*/

		
		//sort
		app.usarSort();
		app.usarForEach();
	}

}
