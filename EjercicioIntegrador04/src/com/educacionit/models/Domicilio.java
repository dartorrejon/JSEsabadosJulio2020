package com.educacionit.models;

/*3) Clase Domicilio
id;int
Calle, localidad: string
numero: int*/

public class Domicilio {
	private int id, numero;
	private String calle, localidad;
	
	public Domicilio() {
		
	}
	
	public Domicilio(int id, int numero, String calle, String localidad) {
		this.id = id;
		this.numero = numero;
		this.calle = calle;
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Domicilio [id=" + id + ", numero=" + numero + ", calle=" + calle + ", localidad=" + localidad + "]";
	}
	
	
	

}
