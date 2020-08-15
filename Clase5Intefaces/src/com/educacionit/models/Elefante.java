package com.educacionit.models;

import com.educacionit.intefaces.IAcciones;

public class Elefante implements IAcciones  {
	
	@Override
	public void caminar() {
		System.out.println("estoy caminando como un Elefante");
		
	}

	@Override
	public void cazar() {
		System.out.println("Estoy cazando como un Elefante");
		
	}

	@Override
	public void comer() {
		System.out.println("Estoy comiendo en la Selva ");
		
	}
	
	


}
