package com.educacionit.programa;

import com.educacionit.models.Camello;
import com.educacionit.models.Elefante;
import com.educacionit.models.Perro;

public class AppPrincipal {
	public static void main(String[] args) {

		Elefante el = new Elefante();
		Perro pr = new Perro();
		Camello cm = new Camello();
		
		System.out.println("Camello");
		cm.caminar();
		cm.cazar();
		cm.comer();
		cm.dormir();//METODO DEFAULT
		System.out.println("Perro");
		pr.caminar();
		pr.cazar();
		pr.comer();
		pr.dormir();//METODO DEFAULT
		System.out.println("Elefante");
		el.caminar();
		el.cazar();
		el.comer();
		el.dormir();//METODO DEFAULT
		
		
	}
}
