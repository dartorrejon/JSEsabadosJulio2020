package com.educacionit.modelos;

import com.educacionit.erroresPersonalizados.MiPropiaException;

public class Persona {
	private int id;
	private String nombre;
	
	public void metodoQuePuedeLanzarmeUnError() throws MiPropiaException {
		throw new MiPropiaException();
		
	}
	
	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}

	
}
