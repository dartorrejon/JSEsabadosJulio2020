package com.educacionit.clases;

public class Domicilio {
	// defino loos atributos de la clase Domicilio
	public String calle;
	public int numero;
	public String localidad;

	public Domicilio(String calle, int numero, String localidad) {
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
	}
	
	public Domicilio() {

	}

	public String toString() {
		return "Domicilio [calle=" + calle + ", numero=" + numero + ", localidad=" + localidad + "]";
	}

	
	
}
