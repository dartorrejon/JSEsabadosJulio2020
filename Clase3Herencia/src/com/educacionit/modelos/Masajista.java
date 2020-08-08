package com.educacionit.modelos;

import com.educacionit.clasepadre.SeleccionFutbol;

//Clase Hija de SeleccionFutbol
public class Masajista extends SeleccionFutbol {

	private Integer aniosDeExperiencia;
	private String titulacion;

	public Masajista(int id, String nombre, String apellido, int edad, String titulo, int aniosExperiencia) {
		super(id, nombre, apellido, edad);
		this.aniosDeExperiencia = aniosExperiencia;
		this.titulacion = titulo;
	}

	public void darMasaje() {
		System.out.println("Estoy dando un masaje antes que arranque el partido de futbol (Clase Masajista)");
	}

	public Integer getAniosDeExperiencia() {
		return aniosDeExperiencia;
	}

	public void setAniosDeExperiencia(Integer aniosDeExperiencia) {
		this.aniosDeExperiencia = aniosDeExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	
}
