package com.educacionit.modelos;

import com.educacionit.clasepadre.SeleccionFutbol;
//Clase Hija de SeleccionFutbol
public class Masajista extends SeleccionFutbol{

	private Integer aniosDeExperiencia;
	private String titulacion;


	public Masajista(int id, String nombre, String apellido, int edad , String titulo , int aniosExperiencia) {
		super(id, nombre, apellido, edad);
		this.aniosDeExperiencia = aniosDeExperiencia;
		this.titulacion = titulo;
	}


	public void darMasaje() {

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
