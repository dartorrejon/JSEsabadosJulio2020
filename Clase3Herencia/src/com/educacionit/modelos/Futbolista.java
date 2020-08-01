package com.educacionit.modelos;

import com.educacionit.clasepadre.SeleccionFutbol;

//Clase Hija de SeleccionFutbol
public class Futbolista extends SeleccionFutbol {

	private Integer dorsal;
	private String demarcacion;

	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		super(id,nombre,apellido,edad );//invocamos al constructor de la clase padre 
		this.demarcacion = demarcacion;
		this.dorsal = dorsal;
	}

	public void jugarPartido() {

	}

	public void entrenar() {

	}

	public Integer getDorsal() {
		return dorsal;
	}

	public void setDorsal(Integer dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	
}
