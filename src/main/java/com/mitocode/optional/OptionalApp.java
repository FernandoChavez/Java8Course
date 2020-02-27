package com.mitocode.optional;

import java.util.Optional;

public class OptionalApp {
	
	public void probar(String valor) {
		//System.out.println(valor.contains("mito"));
		//El optional es un wrapp o envoltorio
		
		try {
			Optional op = Optional.empty();
			//Si queremos obtener el contenido del envoltorio, usamos get
			op.get();
		}catch(Exception e) {
			System.out.println("No hay elemento");
		}
		
	}
	
	public void orElse(String valor) {
		Optional <String> op = Optional.ofNullable(valor);
		String x = op.orElse("predeterminado");
		System.out.println(x);
	}
	
	public void orElseThrow(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		op.orElseThrow(NumberFormatException::new);	
	}
	
	public void isPresent(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		System.out.println(op.isPresent());
	}

	public static void main(String[] args) {
		OptionalApp app = new OptionalApp();
		
		
		//app.probar("Mito");
		//app.probar(null);
		
		//app.orElse(null);
		//app.orElse("Mito");
		
		//app.orElseThrow("Mito");
		
		
		//app.isPresent(null);
		app.isPresent("Mito");

	}

}
