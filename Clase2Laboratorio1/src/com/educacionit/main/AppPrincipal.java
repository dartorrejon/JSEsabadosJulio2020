package com.educacionit.main;

import com.educacionit.clases.Domicilio;
import com.educacionit.clases.Persona;

public class AppPrincipal {

	public static void main(String[] args) {
		Domicilio d1 = new Domicilio("Av Santa fe", 5055, "CABA");
		// instanciamos una persona
		Persona p1 = new Persona("Alex", "De Assis", 28, d1);

		System.out.println(p1.toString());
		System.out.println(p1);
	}

}
