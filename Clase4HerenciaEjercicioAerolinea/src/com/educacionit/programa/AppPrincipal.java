package com.educacionit.programa;

import com.educacionit.aerolinea.Passenger;
import com.educacionit.aerolinea.Vuelo;
import com.educacionit.aerolinea.VueloCarga;

public class AppPrincipal {

	public static void main(String[] args) {

		
		Passenger[] listaPasajeros = new Passenger[4];
		// invocamos al constructor 2
		listaPasajeros[0] = new Passenger(3);
		listaPasajeros[1] = new Passenger(1);
		// invocamos al constructor 3
		listaPasajeros[2] = new Passenger(3, 1);
		listaPasajeros[3] = new Passenger(5, 2);
		
		
		//Passenger.mostrarListaDePasajeros(listaPasajeros);
		
		Passenger matias = new Passenger(5);
		//VueloCarga vc = new VueloCarga();
		//vc.agregarPasajero(matias);
	
		Vuelo f = new VueloCarga();
		f.agregarPasajero(matias);
		//ESTO NO SE PUEDE
//		f.agregarPaquete (5,6,58);
		
		Vuelo [] flota = new Vuelo[4];
		flota[0] = new Vuelo();
		flota[1] = new VueloCarga();
		flota[2] = new Vuelo();
		flota[3] = new VueloCarga();
		
		Vuelo f2 = new Vuelo();
		System.out.println(f2.getAsientos());
		
		VueloCarga f3 = new VueloCarga();
		System.out.println(f3.getAsientos());
		
		f3.agregarPaquete(10, 10, 2);
		f3.agregarPaquete(10, 10, 2);
		f3.agregarPaquete(10, 10, 200);
		
		f2.agregarPasajero(matias);
	
		Object obj = new Vuelo();
		
		Object[] o1 = new Object[3];
		o1[0] = new Vuelo();
		o1[1] = new Passenger();
		o1[2] = new VueloCarga();
		
		
		
		
		o1[1]  = matias;
		
		System.out.println("probamos el inicializador de bloque ");
		Vuelo v5 = new Vuelo('A');
		Vuelo v6 = new Vuelo(56);
		
		
		
		
		
		
	}

}
