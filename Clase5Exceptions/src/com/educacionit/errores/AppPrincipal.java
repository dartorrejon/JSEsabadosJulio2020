package com.educacionit.errores;

public class AppPrincipal {

	public static int numerador = 10;
	public static Integer denominador = null;
	public static float division;
	public static void main(String[] args) {
		System.out.println("Antes de la divison ");
		try {
			// Instrucciones que pueden generar una Exception
			division = numerador / denominador;
		} catch (ArithmeticException ex) {
			// instruccion a ejecutar cuando se capture un objeto exception
			System.out.println("getMessage():" + ex.getMessage());
			System.out.println("getCause():" + ex.getCause());
			division = 0;// si hay una exception doy valor '0' al atributo 'division'
		} catch (NullPointerException e) {
			division = 1;//si la excetion es de un null doy valor '1' ak atributo 'division'
			System.out.println("Error: " +e.getMessage());
		} finally {
			// instrucciones que se ejecutan , tanto si hay como sino hay una exception
			System.out.println("Division :" + division);
			System.out.println("soy el finally y me ejecuto siempre pase o no una Exception ");
			System.out.println("despues de la divison ");
		}

	}

}
