package com.educacionit.aerolinea;

public class Vuelo {
	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;
	// inicializador de bloque
	{
		asientosDisponibles = new boolean[150];
		for (int i = 0; i < getAsiento(); i++) {
			asientosDisponibles[i] = true;
			System.out.println("inicializando butaca " + i);
		}
	}
	public int getAsientos() {
		return getAsiento();
	}
	public int getAsiento() {
		return 150;
	}
	public Vuelo() {
	}
	public Vuelo(char claseVuelo) {
		this.claseVuelo = claseVuelo;
	}
	public Vuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}

	public void agregarPasajero(Passenger p1) {
		if (asientoDisponible()) {
			pasajeros += 1;
			System.out.println("ya estas arriba del avion con tus " + p1.getTotalEquipaje() + " bolsos");
		} else {
			faltaAsiento();
		}
	}

	private boolean asientoDisponible() {
		return pasajeros < getAsiento();
	}

	private void faltaAsiento() {
		System.out.println("YA NO QUEDAN ASIENTOS , busque otra aerolinea please ");
	}

}
