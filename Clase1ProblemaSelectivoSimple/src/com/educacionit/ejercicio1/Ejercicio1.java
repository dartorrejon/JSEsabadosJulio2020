package com.educacionit.ejercicio1;

import java.util.Scanner;//importamos la libreria para poder tomar datos del teclado 

/*1) Determinar si un alumno aprueba un curso de programación, 
sabiendo que aprobara si su promedio de tres calificaciones
es mayor o igual a 7; reprueba en caso contrario.*/
public class Ejercicio1 {

	public static void main(String[] args) {
		// definimos las variables de trabajo
		float nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
		Scanner teclado = new Scanner(System.in);
		// Que entra??
		System.out.println("Ingrese la nota 1");
		nota1 = teclado.nextFloat();
		
		System.out.println("Ingrese la nota 2");
		nota2 = teclado.nextFloat();
		
		System.out.println("Ingrese la nota 3");
		nota3 = teclado.nextFloat();
		// Que se procesa ????
		promedio = (nota1 + nota2 + nota3 )/ 3; // calculamos el promedio 
//		System.out.println("Promedio " + promedio);
		//Que sale?
		if(promedio >= 7 ) {
			System.out.println("el alumno esta aprobado");
		}else {
			System.out.println("el alumno esta reprobado ");
		}

	}

}
