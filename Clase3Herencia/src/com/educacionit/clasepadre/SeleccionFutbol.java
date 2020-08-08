package com.educacionit.clasepadre;

//Clase padre!
public class SeleccionFutbol {

	protected static Integer id;
	protected String nombre;
	protected String apellido;
	protected Integer edad;

	public SeleccionFutbol() {
	}

	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {

		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public void concentrarce() {
		System.out.println("Seleccion Futbol, " + "estoy concentrando ");
	}

	public void viajar() {
		System.out.println("Seleccion Futbol," + " estoy en viaje ");
	}

	public static Integer getId() {
		return id;
	}

	public static void setId(Integer id) {
		SeleccionFutbol.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
