package com.educacionit.clases;

//definimos la clase Alumno 

public class Alumno {
	// Definimos los atributos de la clase Alumno
	public String apellido;
	public String nombre;
	public int edad;

	// Definimos constructor 1 Explicito
	public Alumno(String apellido, String nombre, int edad) {
		this.apellido = apellido;
		this.edad = edad;
		this.nombre = nombre;

	}

	// Definimos constructor 2 Explicito
	public Alumno(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;

	}

	// Defino el constructor 3 (VACIO Explicitamente)
	public Alumno() {
	}

	// definimos los metodos (funcion : retorna un valor , Prodecimiento : noretona
	// nada es void)
//	public String muestraEstadoDeAtributos() {
//		return " apellido: " + apellido + " nombre: " + nombre + 
//				" edad: " + edad;
//	}

	public String toString() {
		return "Alumno [apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

}
