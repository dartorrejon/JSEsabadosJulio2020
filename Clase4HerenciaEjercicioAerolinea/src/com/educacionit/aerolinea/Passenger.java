package com.educacionit.aerolinea;

import javax.sound.midi.Soundbank;

public class Passenger {
	private int bolsos;
	private int bolsosPagos;
	private double tarifaXbolso;
	private double totalAPagar;
	private int totalEquipaje;

	// constructor 1 vacio
	public Passenger() {
	};
	// constructor 2 con un parametro (llama al constructor private)
	public Passenger(int bolsos) {		
		this( bolsos > 1 ? 50.0d : 25.0d );		
		this.bolsos = bolsos;
		totalAPagar = bolsos * tarifaXbolso;
		totalEquipaje = bolsos;
	};
	// constructor 3 con dos parametro (llama al constructor 2)
	public Passenger(int bolsos, int bolsosPagos) {
		this(bolsos);
		this.bolsosPagos = bolsosPagos;
		totalEquipaje = bolsos + bolsosPagos;
		totalAPagar = bolsos * tarifaXbolso;
	};

	private Passenger(double tarifaXbolso) {
		this.tarifaXbolso = tarifaXbolso;
	};

	public int getBolsosGratis() {
		return bolsos;
	}

	public int getBolsosPagos() {
		return bolsosPagos;
	}

	public double getTarifaXbolso() {
		return tarifaXbolso;
	}

	public int getTotalEquipaje() {
		return totalEquipaje;
	}

	public double getTotalaPagar() {
		return totalAPagar;
	}
	
	public static void mostrarListaDePasajeros(Passenger listaPasajeros[]) {
		for(Passenger p1 : listaPasajeros) {
			System.out.println( "**************************************" );
			System.out.println("Pasajero  Tarifa por bolso " + p1.getTarifaXbolso());
			System.out.println("Pasajero  total a pagar $ " + p1.getTotalaPagar());
			System.out.println("Pasajero  Total de bolsos " + p1.getTotalEquipaje());
			
		}
	}

}
