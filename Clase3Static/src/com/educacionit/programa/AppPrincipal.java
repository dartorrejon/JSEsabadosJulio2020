package com.educacionit.programa;

import java.util.Scanner;

import com.educacionit.modelos.Calculadora;
import com.educacionit.modelos.Estudiante;

public class AppPrincipal {

	public static void main(String[] args) {

		/*
		 * Estudiante e1 = new Estudiante(); e1.mostrarInfo(); Estudiante e2 = new
		 * Estudiante(); e2.mostrarInfo(); //accedemos a la variable static "b" de la
		 * clase //y la incrementamos en uno e1.b++; //accedemos directamente a la
		 * variable static "b" desde //la clase (sin instanciar un objeto )
		 * Estudiante.b++;//incrementamos en 1
		 * 
		 * e1.mostrarInfo();
		 * 
		 * Estudiante.mostrarInfoStatico();
		 * 
		 * Estudiante.incrementar(e1.getA());
		 */
		Calculadora c1 = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese el numero 1 ");
		int n1Ingresado = teclado.nextInt();
		System.out.println("ingrese el numero 2 ");
		int n2Ingresado = teclado.nextInt();

		int resultadoSuma = c1.sumar(n1Ingresado, n2Ingresado);
		int resultadoResta = c1.restar(n1Ingresado, n2Ingresado);

		System.out.println("Resultados :");
		System.out.print("SUMA : " + resultadoSuma + "\nRESTA:" + resultadoResta);

	}

}
