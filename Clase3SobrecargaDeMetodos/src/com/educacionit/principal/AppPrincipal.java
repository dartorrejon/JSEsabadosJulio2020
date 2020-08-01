package com.educacionit.principal;

import com.educacionit.clase3.Fecha;

public class AppPrincipal {
	public static void main(String[] args) {
		
		Fecha miFecha = new Fecha(9, 2, 2008);
		
		System.out.println(miFecha);
		
		miFecha.asignarFecha(5, 6);
		System.out.println(miFecha);
		
	}

}
