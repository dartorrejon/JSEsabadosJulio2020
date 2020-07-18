package com.educacionit.ejercicioRepetitivo;

public class EjericicioRepetitivo {

	public static void main(String[] args) {
		/* Moistramos los numero pares del 0 al 100 */

		int contador = 0;
		while (contador <= 100) {
			System.out.println(contador);
			contador += 2;
			// contador = contador + 1 ;
		}
		contador = 0;

		System.out.println("Ahora con Do while");

		do {
			System.out.println(contador);
			contador += 2; // contador = contador + 2 ;
		} while (contador <= 100);

		//definimo un array de enteros 
		int[] notas = {8,6,7,5,4,7,8,9};
		float promedio = 0 ,acumulador = 0 ;
		
		
		for (int i = 0; i < notas.length; i++) {
			acumulador += notas[i];
		}
		System.out.println("acumulador : " + acumulador);
		promedio = acumulador /notas.length;
		
		System.out.println("el promedio de todas las notas del array es :" +promedio );
		
		System.out.println(".length :" +notas.length);
		
		
		
	}

}
