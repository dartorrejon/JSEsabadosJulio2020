package com.educacionit.modelos;

import com.educacionit.erroresPersonalizados.MiPropiaException;

public class TestMiPropiaExceptionThrows {

	public static void main(String[] args) {

		Persona p = new Persona(23, "Alex");
		System.out.println(p.toString());

		try {
			p.metodoQuePuedeLanzarmeUnError();
		} catch (MiPropiaException e) {
			System.out.println(e.getMessage());
		}

	}

}
