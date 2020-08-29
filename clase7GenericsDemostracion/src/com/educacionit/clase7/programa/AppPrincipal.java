package com.educacionit.clase7.programa;

import com.educacionit.clase7.Bolsa;
import com.educacionit.clase7.Chocolatina;
import com.educacionit.clase7.Golosina;

public class AppPrincipal {

	public static void main(String[] args) {
		
		Bolsa<Chocolatina> bolsa = new Bolsa<Chocolatina>(5);
		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("Ferrero");
		Chocolatina c2 = new Chocolatina("kinder");
		
		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		for (Chocolatina chocolatina : bolsa) {
			System.out.println(chocolatina.getMarca());
		}
		
		
		
//		Bolsa bolsa = new Bolsa(5);
//		Chocolatina c = new Chocolatina("milka");
//		Chocolatina c1 = new Chocolatina("Ferrero");
//		Chocolatina c2 = new Chocolatina("kinder");
//		Golosina g1 = new Golosina("gomitas");
//		Golosina g2 = new Golosina("chicle");
//		bolsa.add(c);
//		bolsa.add(c1);
//		bolsa.add(c2);
//		bolsa.add(g1);
//		bolsa.add(g2);
//		for (Object o : bolsa) {
//			if (o instanceof Chocolatina) {
//				Chocolatina chocolatina = (Chocolatina) o;
//				System.out.println(chocolatina.getMarca());
//			} else {
//				Golosina golosina = (Golosina) o;
//				System.out.println(golosina.getNombre());
//			}
//		}
		
		
		
		
		
		
		
		

	}
}