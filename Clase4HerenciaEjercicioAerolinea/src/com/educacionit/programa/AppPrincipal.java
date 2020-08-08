package com.educacionit.programa;

import com.educacionit.aerolinea.Passenger;

public class AppPrincipal {

	public static void main(String[] args) {

		Passenger[] listaPasajeros = new Passenger[4];
		// invocamos al constructor 2
		listaPasajeros[0] = new Passenger(3);
		listaPasajeros[1] = new Passenger(1);
		// invocamos al constructor 3
		listaPasajeros[2] = new Passenger(3, 1);
		listaPasajeros[3] = new Passenger(5, 2);
		
		
		Passenger.mostrarListaDePasajeros(listaPasajeros);
		
		
	}

}
