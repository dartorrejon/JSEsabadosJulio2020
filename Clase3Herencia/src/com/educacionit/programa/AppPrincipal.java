package com.educacionit.programa;

import java.util.ArrayList;

import com.educacionit.clasepadre.SeleccionFutbol;
import com.educacionit.modelos.Entrenador;
import com.educacionit.modelos.Futbolista;
import com.educacionit.modelos.Masajista;

public class AppPrincipal {
	// array de objetos SeleccionFutbol , Independientemente de la clase hija a la
	// que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		Entrenador delBosque = new Entrenador(1, "Vicente ", "Del Bosque", 60, "25ZZ45");
		Futbolista iniesta = new Futbolista(2, "Andre", "Iniesta", 29, 6, "Interior Derecho");
		Masajista raulMartinez = new Masajista(3, "raul", "Martinez", 45, "Lic en Fisioterapia ", 20);
		// agrego los objetos al array
		integrantes.add(delBosque);
		integrantes.add(raulMartinez);
		integrantes.add(iniesta);

		// concentracion
		System.out.println("Todos los integranrtes comienzan una concentracion (todos ejecutan el mismo metodo)");
		for (SeleccionFutbol aux : integrantes) {
			System.out.print(aux.getNombre() + " " + aux.getApellido() + " - > ");
			aux.concentrarce();
		}

		// VIAJE
		System.out.println("nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.viajar();
		}
	}

}
