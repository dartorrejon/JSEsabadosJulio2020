package com.educacionit.modelos;

public class Estudiante {
	private int a;// se inicializa en cero por cada objeto creado
	/*
	 * static : - pertenece a la clase y no al objeto - se inicializan una sola vez
	 * al inicio del programa
	 */
	public static int b;// se inicializa en cero cuando la clase es cargada
	// y no por cada objeto creado

	// constructor vacio
	public Estudiante() {
		// incrementamos en 1 la variable static b
		b++;
	}

	public void mostrarInfo() {
		System.out.println("metodo mostrar info");
		System.out.println("Valor de a = " + a);
		System.out.println("Valor de b = " + b);
	}
	//Metodo Estatico : 
	/*pertenece a la clase y no a los objetos
	 *SOLO PUEDE ACCEDER A LAS VARIABLES ESTATICAS DE LA CLASE
		se puede acceder al metotod directamente mediante el nombre de la clase 
	*/
	
	public static void mostrarInfoStatico() {
		System.out.println("metodo mostrar infoStatico ");
		//System.out.println("Valor de a = " + a);
		System.out.println("Valor de b = " + b);
	}
	

	public static void incrementar(int parametro) {
		
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
