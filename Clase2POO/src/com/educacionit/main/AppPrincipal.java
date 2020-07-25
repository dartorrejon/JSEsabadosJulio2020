package com.educacionit.main;

import com.educacionit.clases.Alumno;

public class AppPrincipal {

	public static void main(String[] args) {
		// Creamos 3 objetos de la clase Alumno (Intancias)
		//invocamos al constructor vacio
		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno("Marcelo" , "Machado");
		Alumno a3 = new Alumno("Monica" ,"Anaya" ,21);

		// mostramos por consola el estado de los atributos de el objeto a1
		System.out.println("a1 :"+a1.toString());
		// mostramos por consola el estado de los atributos de el objeto a2
		System.out.println("a2 :"+a2.toString());
		// mostramos por consola el estado de los atributos de el objeto a3
		System.out.println("a3 :"+a3.toString());

		// seteamos estados a los atributos de los objetos
		a1.nombre = "Mikhael";
		a1.apellido = "Remboski";
		
		System.out.println("       Estados modificados :");

		// mostramos por consola el estado de los atributos de el objeto a1
		System.out.println("a1 :"+a1.toString());
		// mostramos por consola el estado de los atributos de el objeto a2
		System.out.println("a2 :"+a2.toString());
		// mostramos por consola el estado de los atributos de el objeto a3
		System.out.println("a3 :"+a3.toString());

	}

}
