package com.educacionit.errores;

public class ThrowDemostracion {

	public static void main(String[] args) {
		try {
			System.out.println("Creamos un objeto Exceptions");
			throw new ArithmeticException(); // lanzamos un exception

		} catch (ArithmeticException e) {
			System.out.println("se capturo la Exception");
		}

		System.out.println("Fin del bloque try cath");
	}

}
