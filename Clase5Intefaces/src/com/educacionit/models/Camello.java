package com.educacionit.models;

import com.educacionit.intefaces.IAcciones;

public class Camello implements IAcciones  {

	@Override
	public void caminar() {
		System.out.println("estoy caminando como un camello");
		
	}

	@Override
	public void cazar() {
		System.out.println("Estoy cazando como un Camello");
		
	}

	@Override
	public void comer() {
		System.out.println("Estoy comiendo en el desierto ");
	}

	
}
