package com.educacionit.models;

/*1) Crear la clase Persona con los siguientes atributos:
Es una clase abstracta
id: int
nombre, apellido: String
telefono: Telefono
domicilio: Domicilio*/
public abstract class Persona {
	public int id;
	public String nombre;
	public Telefono telefono;
	public Domicilio domicilio;

	public Persona() {
	}

	public Persona(int id, String nombre, Telefono telefono, Domicilio domicilio) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", domicilio=" + domicilio + "]";
	}

}
