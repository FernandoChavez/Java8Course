package com.mitocode.defaultMethod;

public class DefaultMethod implements PersonaA, PersonaB{

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		System.out.println("Hola coders");
	}
	
	
	//Cuando implementas 2 o ams interfaces con el mismo metodo
	// se puede sobreescribir el metodo haciendo referencia 
	//a una de esas interfaces, para implementar dicho metodo
	//por medio del Super
	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		//PersonaB.super.hablar();
		System.out.println("Suscribance todos");
	}
	
	
	/*
	 
	 @Override
	public void hablar() {
		//PersonaB.super.hablar();
	 */

	public static void main (String[] args) {
		DefaultMethod app = new DefaultMethod();
		//app.caminar();
		app.hablar();
	}
}
