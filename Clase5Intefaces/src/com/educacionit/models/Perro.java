package com.educacionit.models;

import com.educacionit.intefaces.IAcciones;

public class Perro implements IAcciones{
	@Override
	public void caminar() {
		System.out.println("estoy caminando como un Perro");
		
	}

	@Override
	public void cazar() {
		System.out.println("Estoy cazando como un Perro");
		
	}

	@Override
	public void comer() {
		System.out.println("Estoy comiendo en el Patio de mi amo ");
	}
}
