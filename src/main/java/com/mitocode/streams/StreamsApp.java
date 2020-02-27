package com.mitocode.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {

	private List<String> lista;
	private List<String> numeros;
	
	public StreamsApp() {
		lista = new ArrayList<>();
		lista.add("Mito");
		lista.add("Code");
		lista.add("Jaime");
		lista.add("MitoCode");
		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
	}
	
	public void filtrar() {
		lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
		//lista.parallelStream().filter(x -> x.startsWith("M")).forEach(x -> System.out.println(x));
		
	}
	
	public void ordenar() {
		//lista.stream().sorted().forEach(System.out::println);
		lista.stream().sorted((x, y) -> y.compareTo(x)).forEach(System.out::println);
		
	}
	
	public void transformar() {
		//SMap sirve para transformar los elementos de la coleccion 1 x 1
		// con la expresion indicada en el parametro, en este caso
		// "toUpperCase"
		
		//lista.stream().map(String::toUpperCase).forEach(System.out::println);
	
		
		//Sin stream
		/*
		for(String x : numeros) {
			int num = Integer.parseInt(x) + 1;
			System.out.println(num);
		}
		*/
		
		//Con stream
		numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
	}
	
	public void limitar() {
		lista.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar() {
		long x = lista.stream().count();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		StreamsApp app = new StreamsApp();
		//app.filtrar();
		
		//app.ordenar();
		
		//app.transformar();
		
		//app.limitar();
		
		app.contar();
	}

}
