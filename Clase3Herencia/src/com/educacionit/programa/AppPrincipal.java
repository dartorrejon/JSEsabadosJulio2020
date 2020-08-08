package com.educacionit.programa;

import java.util.ArrayList;
import java.util.Iterator;

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
		integrantes.add(iniesta);
		integrantes.add(delBosque);
		integrantes.add(raulMartinez);

//		 UTILIZAMOS TODOS LOS METODOS PROPIOS DE LAS CLASE PADRE
		// concentracion
		System.out.println("Todos los integranrtes comienzan una concentracion (todos ejecutan el mismo metodo)");
		for (SeleccionFutbol aux : integrantes) {
			System.out.print(aux.getNombre() + " " + aux.getApellido() + " - > ");
			aux.concentrarce();
		}

		// VIAJE
		System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellido() + " -> ");
			integrante.viajar();
		}
		System.out.println(" AHORA UTILIZAMOS TODOS LOS METODOS PROPIOS DE LAS CLASES HIJAS");
		
		// ENTRENAMIENTO
		System.out.println(
				"Entrenamiento de Futbol :Solamente el entrenador y el futbolista tiene metodos para entrenar");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellido() + " -> ");
		delBosque.dirigirEntrenamiento();
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellido() + " -> ");
		iniesta.entrenar();
		
		// MASAJE
		System.out.println("MASAJE : Solo el masajista tiene el metodo para dar un masaje");
		System.out.println(raulMartinez.getNombre() + " " + raulMartinez.getApellido() + " -> ");
		raulMartinez.darMasaje();
		
		//Partido De Futbol
		System.out.println("Partido de Futbol : Solamente el entrenador y el futbolista tienen metodos para los partidos");
		System.out.println(delBosque.getNombre() + " " + delBosque.getApellido() + " -> ");
		delBosque.dirigirPartido();
		System.out.println(iniesta.getNombre() + " " + iniesta.getApellido() + " -> ");
		iniesta.jugarPartido();
		
		
		
	}

}
