package com.eduit.clase13.NovedadesJava8;

import java.util.stream.Stream;
import java.util.*;
import java.util.function.Predicate;

public class MapFilterReduce {
	public static void main(String[] args) {
		// MAP
		String[] myVector = new String[] { "bob", "alice", "paul", "ellie" };

		for (int i = 0; i < myVector.length; i++) {
			System.out.println(myVector[i]);
		}
		// comvierto en un stream el vector
		Stream<String> myStream = Arrays.stream(myVector);
		Stream<String> myNewStream = myStream.map(s -> s.toUpperCase());
		// vuelvo0 a comvertirlo en un array
		String[] myNewArray = myNewStream.toArray(String[]::new);

//		public String[] crete (int size) {
//			return new Strring[size];
//		}
		System.out.println("Mostramos el nuevo array ");
		for (int i = 0; i < myNewArray.length; i++) {
			System.out.println(myNewArray[i]);
		}
		/** ######################## FILTER ###################33 */
		List<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(44);
		listaNumeros.add(66);
		listaNumeros.add(5);
		listaNumeros.add(5);
		listaNumeros.add(55);
		listaNumeros.add(67);
		listaNumeros.add(23);
		listaNumeros.add(23);
		listaNumeros.add(5);
		listaNumeros.add(5);

		Stream st = listaNumeros.stream();

		// contamos cuantas veces aparece el numero 5
		System.out.println("hallazgos del numero buscado");
		System.out.println(st.filter(Predicate.isEqual(5)).count());

		/** ######################## REDUCE ################### */
		int myArray[] = { 1, 5, 8 };
		int sum = Arrays.stream(myArray).sum();

		System.out.println("La suma es : " + sum);

		String[] myArray2 = { "Soy ", "una", "de", "las", "ultimas", "Lineas", "del", "profe" };

		for (String aux : myArray2) {
			System.out.println(aux);
		}
		String result = Arrays.stream(myArray2).reduce("", (a, b) -> a + b);

		System.out.println("REsultado de REDUCE:" + result);
		for (String aux : myArray2) {
			System.out.println(aux);
		}

	}
}
