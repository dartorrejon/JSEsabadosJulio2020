package com.educacionit.modelos;

import com.educacionit.clasepadre.SeleccionFutbol;

//Clase Hija de SeleccionFutbol
public class Entrenador extends SeleccionFutbol {

	@Override
	public void entrenamiento() {
		System.out.println("ENTRENADOR :estoy entrenando e implemento el metodo abstracto");
		
	}
	
	
	private String idFederacion;

	public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	public void dirigirPartido() {
		System.out.println("estoy dirigiendo un Partido De Futbol(Clase Entrenador)");
	}

	public void dirigirEntrenamiento() {
		System.out.println("estoy dirigiendo un entrenamiento (Clase Entrenador)");
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}



}
