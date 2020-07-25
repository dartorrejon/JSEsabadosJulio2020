package com.educacioit.clases;

import javax.swing.JOptionPane;

public class Persona {
	 // atributos encapsulados 
	private int edad;
	private String nombre;

	//Gets and Sets
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Funcion que me sirve para ver el estado de un atributo PRIVATE
	public int getEdad() {
		return edad;
	}

	// Procedimiento que me sirve para modificar el estado de un atributo private
	public void setEdad(int edad) {
		if (edad <= 0)
			JOptionPane.showMessageDialog(null, "No se puede setear valor menor a 1 en la edad");
		else
			this.edad = edad;
	}

	public String toString() {
		return "Persona [Edad=" + getEdad() + ", Nombre=" + nombre + "]";
	}

}
