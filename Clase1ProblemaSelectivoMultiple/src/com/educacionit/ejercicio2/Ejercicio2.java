package com.educacionit.ejercicio2;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcionIngresada = 0, numero1 = 0, numero2 = 0, resultado = 0;

		System.out.println("Welcome Calculadora");
		System.out.println("Ingrese la opcion Deseada :");
		System.out.println("1.SUMA \n2.RESTA \n3.MULTIPLICA");
		// capturamos la opcion ingresada
		opcionIngresada = teclado.nextInt();

		switch (opcionIngresada) {
		case 1:
			System.out.println("usted selecciono la opcion suma");
			System.out.println("Ingrese el numero 1");
			numero1 = teclado.nextInt();
			System.out.println("Ingrese el numero 2");
			numero2 = teclado.nextInt();
			resultado = numero1 + numero2;
			break;
		case 2:
			System.out.println("usted selecciono la opcion resta");
			System.out.println("Ingrese el numero 1");
			numero1 = teclado.nextInt();
			System.out.println("Ingrese el numero 2");
			numero2 = teclado.nextInt();
			resultado = numero1 - numero2;
			break;
		case 3:
			System.out.println("usted selecciono la opcion multiplica");
			System.out.println("Ingrese el numero 1");
			numero1 = teclado.nextInt();
			System.out.println("Ingrese el numero 2");
			numero2 = teclado.nextInt();
			resultado = numero1 * numero2;
			break;
		default:
			System.out.println("Usted seleccion una opcion incorrecta " + opcionIngresada);
			break;
		}
		//validamos que se muestre el resultado solamente si la opcion es valida
		if (opcionIngresada >= 1 & opcionIngresada <= 3)
			System.out.println("el resultado es " + resultado);

		System.out.println("fin de la app");

	}

}
