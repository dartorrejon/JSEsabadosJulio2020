package com.eduit.clase13;

public class Main {

	public static void main(String[] args) {
		// Creo una referencia a MiValor
		MiValor miVal;
		// se asigna una expresion lambda a la referencia de interfaz
		miVal = () -> 28.6;

		MiValor miVal2 = () -> 3.8;

		System.out.println("Un Valor constante :" + miVal.getvalor());
		System.out.println("Un Valor constante :" + miVal2.getvalor());
		
		MiValParam miValor = (n) -> 1.0 / n ;
		System.out.println("El reciproco de 4.0 es : " + miValor.getValor(4.0));
		
	}

}
