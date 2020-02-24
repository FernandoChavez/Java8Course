package com.mitocode.defaultMethod;

public interface PersonaB {
	public void caminar();
	
	default public void hablar() {
		System.out.println("Saludos Coders - persona B");
	}
}
