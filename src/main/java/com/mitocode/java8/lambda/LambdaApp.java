package com.mitocode.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {
	
	public void ordenar() {
		List<String> lista = new ArrayList<>();
		lista.add("Mitocode");
		lista.add("Code");
		lista.add("Mito");
		
		// jdk <1.7
		/*
		Collections.sort(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		});
		*/
		
		//Lambda with Java 8
		Collections.sort(lista,(String p1, String p2) -> p1.compareTo(p2));
		
		for(String elemento: lista) {
			System.out.println(elemento);
		}
	}

	public void calcular() {
		//Una interfaz no se pueden instanciar
		//por lo tanto se tiene que escribir una clase anonima
		
		
		//IMPERATIVO
		/*
		Operacion operacion = new Operacion() {

			@Override
			public double calcularPromedio(double n1, double n2) {
				// TODO Auto-generated method stub
				return (n1+n2)/2;
			}
			
		};
		
		System.out.println(operacion.calcularPromedio(2, 3));
		*/
		
		
		//DECLARATIVO
		Operacion operacion = (double x, double y) -> (x+y)/2;
		System.out.println(operacion.calcular(2, 3));
	}
	
	public static void main(String[] args) {
		LambdaApp app = new LambdaApp();
		app.ordenar();
		app.calcular();
	}
}
